// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocExtractionResultResponseBody extends TeaModel {
    /**
     * <p>Returned data structure.</p>
     */
    @NameInMap("data")
    public GetDocExtractionResultResponseBodyData data;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDocExtractionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocExtractionResultResponseBody self = new GetDocExtractionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocExtractionResultResponseBody setData(GetDocExtractionResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDocExtractionResultResponseBodyData getData() {
        return this.data;
    }

    public GetDocExtractionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence extends TeaModel {
        /**
         * <p>Key confidence level</p>
         * 
         * <strong>example:</strong>
         * <p>0.9994202852249146</p>
         */
        @NameInMap("keyConfidence")
        public Double keyConfidence;

        /**
         * <p>value confidence level</p>
         * 
         * <strong>example:</strong>
         * <p>0.9794202852249146</p>
         */
        @NameInMap("valueConfidence")
        public Double valueConfidence;

        public static GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence build(java.util.Map<String, ?> map) throws Exception {
            GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence self = new GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence();
            return TeaModel.build(map, self);
        }

        public GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence setKeyConfidence(Double keyConfidence) {
            this.keyConfidence = keyConfidence;
            return this;
        }
        public Double getKeyConfidence() {
            return this.keyConfidence;
        }

        public GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence setValueConfidence(Double valueConfidence) {
            this.valueConfidence = valueConfidence;
            return this;
        }
        public Double getValueConfidence() {
            return this.valueConfidence;
        }

    }

    public static class GetDocExtractionResultResponseBodyDataKvListInfoContext extends TeaModel {
        /**
         * <p>Confidence level</p>
         */
        @NameInMap("confidence")
        public GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence confidence;

        /**
         * <p>Details of key recall information</p>
         */
        @NameInMap("key")
        public java.util.List<ContentItem> key;

        /**
         * <p>Details of value recall information</p>
         */
        @NameInMap("value")
        public java.util.List<ContentItem> value;

        public static GetDocExtractionResultResponseBodyDataKvListInfoContext build(java.util.Map<String, ?> map) throws Exception {
            GetDocExtractionResultResponseBodyDataKvListInfoContext self = new GetDocExtractionResultResponseBodyDataKvListInfoContext();
            return TeaModel.build(map, self);
        }

        public GetDocExtractionResultResponseBodyDataKvListInfoContext setConfidence(GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence confidence) {
            this.confidence = confidence;
            return this;
        }
        public GetDocExtractionResultResponseBodyDataKvListInfoContextConfidence getConfidence() {
            return this.confidence;
        }

        public GetDocExtractionResultResponseBodyDataKvListInfoContext setKey(java.util.List<ContentItem> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ContentItem> getKey() {
            return this.key;
        }

        public GetDocExtractionResultResponseBodyDataKvListInfoContext setValue(java.util.List<ContentItem> value) {
            this.value = value;
            return this;
        }
        public java.util.List<ContentItem> getValue() {
            return this.value;
        }

    }

    public static class GetDocExtractionResultResponseBodyDataKvListInfo extends TeaModel {
        /**
         * <p>Recalled content</p>
         */
        @NameInMap("context")
        public GetDocExtractionResultResponseBodyDataKvListInfoContext context;

        /**
         * <p>Field key name</p>
         * 
         * <strong>example:</strong>
         * <p>Tenant</p>
         */
        @NameInMap("keyName")
        public String keyName;

        /**
         * <p>Field key value</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud XXX Co., Ltd.</p>
         */
        @NameInMap("keyValue")
        public String keyValue;

        public static GetDocExtractionResultResponseBodyDataKvListInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDocExtractionResultResponseBodyDataKvListInfo self = new GetDocExtractionResultResponseBodyDataKvListInfo();
            return TeaModel.build(map, self);
        }

        public GetDocExtractionResultResponseBodyDataKvListInfo setContext(GetDocExtractionResultResponseBodyDataKvListInfoContext context) {
            this.context = context;
            return this;
        }
        public GetDocExtractionResultResponseBodyDataKvListInfoContext getContext() {
            return this.context;
        }

        public GetDocExtractionResultResponseBodyDataKvListInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetDocExtractionResultResponseBodyDataKvListInfo setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        public String getKeyValue() {
            return this.keyValue;
        }

    }

    public static class GetDocExtractionResultResponseBodyData extends TeaModel {
        /**
         * <p>Details of document parsing results</p>
         */
        @NameInMap("kvListInfo")
        public java.util.List<GetDocExtractionResultResponseBodyDataKvListInfo> kvListInfo;

        public static GetDocExtractionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDocExtractionResultResponseBodyData self = new GetDocExtractionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDocExtractionResultResponseBodyData setKvListInfo(java.util.List<GetDocExtractionResultResponseBodyDataKvListInfo> kvListInfo) {
            this.kvListInfo = kvListInfo;
            return this;
        }
        public java.util.List<GetDocExtractionResultResponseBodyDataKvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

    }

}
