// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AnalyzeVlRealtimeResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public AnalyzeVlRealtimeResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static AnalyzeVlRealtimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeVlRealtimeResponseBody self = new AnalyzeVlRealtimeResponseBody();
        return TeaModel.build(map, self);
    }

    public AnalyzeVlRealtimeResponseBody setData(AnalyzeVlRealtimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AnalyzeVlRealtimeResponseBodyData getData() {
        return this.data;
    }

    public AnalyzeVlRealtimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence extends TeaModel {
        /**
         * <p>The confidence level of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9994202852249146</p>
         */
        @NameInMap("keyConfidence")
        public Double keyConfidence;

        /**
         * <p>The confidence level of the value.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9794202852249146</p>
         */
        @NameInMap("valueConfidence")
        public Double valueConfidence;

        public static AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence self = new AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence();
            return TeaModel.build(map, self);
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence setKeyConfidence(Double keyConfidence) {
            this.keyConfidence = keyConfidence;
            return this;
        }
        public Double getKeyConfidence() {
            return this.keyConfidence;
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence setValueConfidence(Double valueConfidence) {
            this.valueConfidence = valueConfidence;
            return this;
        }
        public Double getValueConfidence() {
            return this.valueConfidence;
        }

    }

    public static class AnalyzeVlRealtimeResponseBodyDataKvListInfoContext extends TeaModel {
        /**
         * <p>The confidence level.</p>
         */
        @NameInMap("confidence")
        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence confidence;

        /**
         * <p>The details of the recalled key information.</p>
         */
        @NameInMap("key")
        public java.util.List<ContentItem> key;

        /**
         * <p>The details of the recalled value information.</p>
         */
        @NameInMap("value")
        public java.util.List<ContentItem> value;

        public static AnalyzeVlRealtimeResponseBodyDataKvListInfoContext build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeVlRealtimeResponseBodyDataKvListInfoContext self = new AnalyzeVlRealtimeResponseBodyDataKvListInfoContext();
            return TeaModel.build(map, self);
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContext setConfidence(AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence confidence) {
            this.confidence = confidence;
            return this;
        }
        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContextConfidence getConfidence() {
            return this.confidence;
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContext setKey(java.util.List<ContentItem> key) {
            this.key = key;
            return this;
        }
        public java.util.List<ContentItem> getKey() {
            return this.key;
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContext setValue(java.util.List<ContentItem> value) {
            this.value = value;
            return this;
        }
        public java.util.List<ContentItem> getValue() {
            return this.value;
        }

    }

    public static class AnalyzeVlRealtimeResponseBodyDataKvListInfo extends TeaModel {
        /**
         * <p>The recalled content.</p>
         */
        @NameInMap("context")
        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContext context;

        /**
         * <p>The name of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>username</p>
         */
        @NameInMap("keyName")
        public String keyName;

        /**
         * <p>The value of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>bob</p>
         */
        @NameInMap("keyValue")
        public String keyValue;

        public static AnalyzeVlRealtimeResponseBodyDataKvListInfo build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeVlRealtimeResponseBodyDataKvListInfo self = new AnalyzeVlRealtimeResponseBodyDataKvListInfo();
            return TeaModel.build(map, self);
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfo setContext(AnalyzeVlRealtimeResponseBodyDataKvListInfoContext context) {
            this.context = context;
            return this;
        }
        public AnalyzeVlRealtimeResponseBodyDataKvListInfoContext getContext() {
            return this.context;
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfo setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public AnalyzeVlRealtimeResponseBodyDataKvListInfo setKeyValue(String keyValue) {
            this.keyValue = keyValue;
            return this;
        }
        public String getKeyValue() {
            return this.keyValue;
        }

    }

    public static class AnalyzeVlRealtimeResponseBodyData extends TeaModel {
        /**
         * <p>The details of the document extraction result.</p>
         */
        @NameInMap("kvListInfo")
        public java.util.List<AnalyzeVlRealtimeResponseBodyDataKvListInfo> kvListInfo;

        public static AnalyzeVlRealtimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeVlRealtimeResponseBodyData self = new AnalyzeVlRealtimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AnalyzeVlRealtimeResponseBodyData setKvListInfo(java.util.List<AnalyzeVlRealtimeResponseBodyDataKvListInfo> kvListInfo) {
            this.kvListInfo = kvListInfo;
            return this;
        }
        public java.util.List<AnalyzeVlRealtimeResponseBodyDataKvListInfo> getKvListInfo() {
            return this.kvListInfo;
        }

    }

}
