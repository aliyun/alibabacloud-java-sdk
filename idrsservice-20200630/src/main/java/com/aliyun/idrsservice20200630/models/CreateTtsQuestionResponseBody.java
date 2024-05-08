// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateTtsQuestionResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTtsQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionResponseBody self = new CreateTtsQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateTtsQuestionResponseBody setData(CreateTtsQuestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTtsQuestionResponseBodyData getData() {
        return this.data;
    }

    public CreateTtsQuestionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateTtsQuestionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTtsQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTtsQuestionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTtsQuestionResponseBodyData extends TeaModel {
        /**
         * <p>ID</p>
         */
        @NameInMap("Id")
        public String id;

        public static CreateTtsQuestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTtsQuestionResponseBodyData self = new CreateTtsQuestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTtsQuestionResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
