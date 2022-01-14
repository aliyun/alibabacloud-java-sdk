// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMsacStageAppMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateMsacStageAppMappingResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateMsacStageAppMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMsacStageAppMappingResponseBody self = new CreateMsacStageAppMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMsacStageAppMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMsacStageAppMappingResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateMsacStageAppMappingResponseBody setResultContent(CreateMsacStageAppMappingResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateMsacStageAppMappingResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateMsacStageAppMappingResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateMsacStageAppMappingResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Data")
        public String data;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        public static CreateMsacStageAppMappingResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateMsacStageAppMappingResponseBodyResultContent self = new CreateMsacStageAppMappingResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateMsacStageAppMappingResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateMsacStageAppMappingResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateMsacStageAppMappingResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateMsacStageAppMappingResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
