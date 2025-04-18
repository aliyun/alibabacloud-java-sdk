// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeResultResponseBody extends TeaModel {
    /**
     * <p>Returned Data</p>
     */
    @NameInMap("data")
    public GetDocumentAnalyzeResultResponseBodyData data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDocumentAnalyzeResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentAnalyzeResultResponseBody self = new GetDocumentAnalyzeResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentAnalyzeResultResponseBody setData(GetDocumentAnalyzeResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocumentAnalyzeResultResponseBodyData getData() {
        return this.data;
    }

    public GetDocumentAnalyzeResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence extends TeaModel {
        /**
         * <p>Confidence of Key</p>
         * 
         * <strong>example:</strong>
         * <p>0.9994202852249146</p>
         */
        @NameInMap("keyConfidence")
        public Double keyConfidence;

        /**
         * <p>Confidence of Value</p>
         * 
         * <strong>example:</strong>
         * <p>0.9794202852249146</p>
         */
        @NameInMap("valueConfidence")
        public Double valueConfidence;

        public static GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence self = new GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence setKeyConfidence(Double keyConfidence) {
            this.keyConfidence = keyConfidence;
            return this;
        }
        public Double getKeyConfidence() {
            return this.keyConfidence;
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence setValueConfidence(Double valueConfidence) {
            this.valueConfidence = valueConfidence;
            return this;
        }
        public Double getValueConfidence() {
            return this.valueConfidence;
        }

    }

    public static class GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext extends TeaModel {
        /**
         * <p>Confidence</p>
         */
        @NameInMap("confidence")
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence confidence;

        /**
         * <p>Key Recall Information</p>
         */
        @NameInMap("key")
        public java.util.List<ContentItem> key;

        /**
         * <p>Value Recall Information</p>
         */
        @NameInMap("value")
        public java.util.List<ContentItem> value;

        public static GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext self = new GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext setConfidence(GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence confidence) {
            this.confidence = confidence;
            return this;
        }
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence getConfidence() {
            return this.confidence;
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext setKey(java.util.List<ContentItem> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ContentItem> getKey() {
            return this.key;
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext setValue(java.util.List<ContentItem> value) {
            this.value = value;
            return this;
        }
        public java.util.List<ContentItem> getValue() {
            return this.value;
        }

    }

    public static class GetDocumentAnalyzeResultResponseBodyDataKvListInfo extends TeaModel {
        /**
         * <p>Recalled Content</p>
         */
        @NameInMap("context")
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext context;

        /**
         * <p>Field Key Name</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("keyName")
        public String keyName;

        /**
         * <p>Field Key Value</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun XXX Co., Ltd.</p>
         */
        @NameInMap("keyValue")
        public String keyValue;

        public static GetDocumentAnalyzeResultResponseBodyDataKvListInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeResultResponseBodyDataKvListInfo self = new GetDocumentAnalyzeResultResponseBodyDataKvListInfo();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfo setContext(GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext context) {
            this.context = context;
            return this;
        }
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext getContext() {
            return this.context;
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetDocumentAnalyzeResultResponseBodyDataKvListInfo setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        public String getKeyValue() {
            return this.keyValue;
        }

    }

    public static class GetDocumentAnalyzeResultResponseBodyData extends TeaModel {
        /**
         * <p>Document Parsing Result</p>
         */
        @NameInMap("kvListInfo")
        public java.util.List<GetDocumentAnalyzeResultResponseBodyDataKvListInfo> kvListInfo;

        public static GetDocumentAnalyzeResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentAnalyzeResultResponseBodyData self = new GetDocumentAnalyzeResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocumentAnalyzeResultResponseBodyData setKvListInfo(java.util.List<GetDocumentAnalyzeResultResponseBodyDataKvListInfo> kvListInfo) {
            this.kvListInfo = kvListInfo;
            return this;
        }
        public java.util.List<GetDocumentAnalyzeResultResponseBodyDataKvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

    }

}
