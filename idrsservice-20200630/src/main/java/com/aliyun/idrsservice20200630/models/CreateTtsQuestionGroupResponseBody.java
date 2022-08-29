// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTtsQuestionGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateTtsQuestionGroupResponseBodyData data;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTtsQuestionGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTtsQuestionGroupResponseBody self = new CreateTtsQuestionGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTtsQuestionGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateTtsQuestionGroupResponseBody setData(CreateTtsQuestionGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTtsQuestionGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateTtsQuestionGroupResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public CreateTtsQuestionGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTtsQuestionGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTtsQuestionGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTtsQuestionGroupResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static CreateTtsQuestionGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTtsQuestionGroupResponseBodyData self = new CreateTtsQuestionGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTtsQuestionGroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
