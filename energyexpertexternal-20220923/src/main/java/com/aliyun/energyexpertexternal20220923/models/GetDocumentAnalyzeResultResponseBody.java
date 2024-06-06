// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetDocumentAnalyzeResultResponseBody extends TeaModel {
    @NameInMap("data")
    public GetDocumentAnalyzeResultResponseBodyData data;

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
        @NameInMap("keyConfidence")
        public Double keyConfidence;

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
        @NameInMap("confidence")
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContextConfidence confidence;

        @NameInMap("key")
        public java.util.List<ContentItem> key;

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
        @NameInMap("context")
        public GetDocumentAnalyzeResultResponseBodyDataKvListInfoContext context;

        @NameInMap("keyName")
        public String keyName;

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
