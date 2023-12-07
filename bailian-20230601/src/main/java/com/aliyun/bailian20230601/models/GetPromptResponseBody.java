// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetPromptResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetPromptResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetPromptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptResponseBody self = new GetPromptResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPromptResponseBody setData(GetPromptResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPromptResponseBodyData getData() {
        return this.data;
    }

    public GetPromptResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPromptResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPromptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPromptResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPromptResponseBodyData extends TeaModel {
        @NameInMap("PromptContent")
        public String promptContent;

        @NameInMap("PromptId")
        public String promptId;

        public static GetPromptResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPromptResponseBodyData self = new GetPromptResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPromptResponseBodyData setPromptContent(String promptContent) {
            this.promptContent = promptContent;
            return this;
        }
        public String getPromptContent() {
            return this.promptContent;
        }

        public GetPromptResponseBodyData setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

    }

}
