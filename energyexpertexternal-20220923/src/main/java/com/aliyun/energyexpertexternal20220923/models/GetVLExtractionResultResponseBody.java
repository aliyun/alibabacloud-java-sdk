// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetVLExtractionResultResponseBody extends TeaModel {
    /**
     * <p>Returned Data</p>
     */
    @NameInMap("data")
    public GetVLExtractionResultResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetVLExtractionResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVLExtractionResultResponseBody self = new GetVLExtractionResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVLExtractionResultResponseBody setData(GetVLExtractionResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVLExtractionResultResponseBodyData getData() {
        return this.data;
    }

    public GetVLExtractionResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence extends TeaModel {
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

        public static GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence build(java.util.Map<String, ?> map) throws Exception {
            GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence self = new GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence();
            return TeaModel.build(map, self);
        }

        public GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence setKeyConfidence(Double keyConfidence) {
            this.keyConfidence = keyConfidence;
            return this;
        }
        public Double getKeyConfidence() {
            return this.keyConfidence;
        }

        public GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence setValueConfidence(Double valueConfidence) {
            this.valueConfidence = valueConfidence;
            return this;
        }
        public Double getValueConfidence() {
            return this.valueConfidence;
        }

    }

    public static class GetVLExtractionResultResponseBodyDataKvListInfoContext extends TeaModel {
        /**
         * <p>Confidence</p>
         */
        @NameInMap("confidence")
        public GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence confidence;

        /**
         * <p>Key recall information details</p>
         */
        @NameInMap("key")
        public java.util.List<ContentItem> key;

        /**
         * <p>Value Recall Information</p>
         */
        @NameInMap("value")
        public java.util.List<ContentItem> value;

        public static GetVLExtractionResultResponseBodyDataKvListInfoContext build(java.util.Map<String, ?> map) throws Exception {
            GetVLExtractionResultResponseBodyDataKvListInfoContext self = new GetVLExtractionResultResponseBodyDataKvListInfoContext();
            return TeaModel.build(map, self);
        }

        public GetVLExtractionResultResponseBodyDataKvListInfoContext setConfidence(GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence confidence) {
            this.confidence = confidence;
            return this;
        }
        public GetVLExtractionResultResponseBodyDataKvListInfoContextConfidence getConfidence() {
            return this.confidence;
        }

        public GetVLExtractionResultResponseBodyDataKvListInfoContext setKey(java.util.List<ContentItem> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ContentItem> getKey() {
            return this.key;
        }

        public GetVLExtractionResultResponseBodyDataKvListInfoContext setValue(java.util.List<ContentItem> value) {
            this.value = value;
            return this;
        }
        public java.util.List<ContentItem> getValue() {
            return this.value;
        }

    }

    public static class GetVLExtractionResultResponseBodyDataKvListInfo extends TeaModel {
        /**
         * <p>Recall content</p>
         */
        @NameInMap("context")
        public GetVLExtractionResultResponseBodyDataKvListInfoContext context;

        /**
         * <p>Field Key name</p>
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

        public static GetVLExtractionResultResponseBodyDataKvListInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVLExtractionResultResponseBodyDataKvListInfo self = new GetVLExtractionResultResponseBodyDataKvListInfo();
            return TeaModel.build(map, self);
        }

        public GetVLExtractionResultResponseBodyDataKvListInfo setContext(GetVLExtractionResultResponseBodyDataKvListInfoContext context) {
            this.context = context;
            return this;
        }
        public GetVLExtractionResultResponseBodyDataKvListInfoContext getContext() {
            return this.context;
        }

        public GetVLExtractionResultResponseBodyDataKvListInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public GetVLExtractionResultResponseBodyDataKvListInfo setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        public String getKeyValue() {
            return this.keyValue;
        }

    }

    public static class GetVLExtractionResultResponseBodyData extends TeaModel {
        /**
         * <p>Document Parsing Result</p>
         */
        @NameInMap("kvListInfo")
        public java.util.List<GetVLExtractionResultResponseBodyDataKvListInfo> kvListInfo;

        public static GetVLExtractionResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVLExtractionResultResponseBodyData self = new GetVLExtractionResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVLExtractionResultResponseBodyData setKvListInfo(java.util.List<GetVLExtractionResultResponseBodyDataKvListInfo> kvListInfo) {
            this.kvListInfo = kvListInfo;
            return this;
        }
        public java.util.List<GetVLExtractionResultResponseBodyDataKvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

    }

}
