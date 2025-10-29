// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateBackgroundPicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateBackgroundPicResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateBackgroundPicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackgroundPicResponseBody self = new CreateBackgroundPicResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackgroundPicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateBackgroundPicResponseBody setData(CreateBackgroundPicResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateBackgroundPicResponseBodyData getData() {
        return this.data;
    }

    public CreateBackgroundPicResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateBackgroundPicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateBackgroundPicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackgroundPicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBackgroundPicResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M1lhKArheOyYdeYybDFqS1-Q</p>
         */
        @NameInMap("id")
        public String id;

        public static CreateBackgroundPicResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateBackgroundPicResponseBodyData self = new CreateBackgroundPicResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateBackgroundPicResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
