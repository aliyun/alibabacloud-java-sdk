// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetTranslateImageBatchResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetTranslateImageBatchResultResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTranslateImageBatchResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTranslateImageBatchResultResponseBody self = new GetTranslateImageBatchResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTranslateImageBatchResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetTranslateImageBatchResultResponseBody setData(GetTranslateImageBatchResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTranslateImageBatchResultResponseBodyData getData() {
        return this.data;
    }

    public GetTranslateImageBatchResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTranslateImageBatchResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTranslateImageBatchResultResponseBodyDataResult extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        @NameInMap("FinalImageUrl")
        public String finalImageUrl;

        @NameInMap("InPaintingUrl")
        public String inPaintingUrl;

        @NameInMap("Message")
        public String message;

        @NameInMap("SourceImageUrl")
        public String sourceImageUrl;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("TemplateJson")
        public String templateJson;

        public static GetTranslateImageBatchResultResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetTranslateImageBatchResultResponseBodyDataResult self = new GetTranslateImageBatchResultResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setFinalImageUrl(String finalImageUrl) {
            this.finalImageUrl = finalImageUrl;
            return this;
        }
        public String getFinalImageUrl() {
            return this.finalImageUrl;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setInPaintingUrl(String inPaintingUrl) {
            this.inPaintingUrl = inPaintingUrl;
            return this;
        }
        public String getInPaintingUrl() {
            return this.inPaintingUrl;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setSourceImageUrl(String sourceImageUrl) {
            this.sourceImageUrl = sourceImageUrl;
            return this;
        }
        public String getSourceImageUrl() {
            return this.sourceImageUrl;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetTranslateImageBatchResultResponseBodyDataResult setTemplateJson(String templateJson) {
            this.templateJson = templateJson;
            return this;
        }
        public String getTemplateJson() {
            return this.templateJson;
        }

    }

    public static class GetTranslateImageBatchResultResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetTranslateImageBatchResultResponseBodyDataResult> result;

        @NameInMap("Status")
        public String status;

        public static GetTranslateImageBatchResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTranslateImageBatchResultResponseBodyData self = new GetTranslateImageBatchResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTranslateImageBatchResultResponseBodyData setResult(java.util.List<GetTranslateImageBatchResultResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetTranslateImageBatchResultResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetTranslateImageBatchResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
