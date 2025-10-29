// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateChatConfigResponseBodyData data;

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
     * <p>0EC3BA89-13F5-5766-A0BA-85096092A032</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateChatConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigResponseBody self = new CreateChatConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatConfigResponseBody setData(CreateChatConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateChatConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateChatConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChatConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateChatConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>C1RznvtlM-JO6HuPHqNC-Xxg</p>
         */
        @NameInMap("id")
        public String id;

        public static CreateChatConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatConfigResponseBodyData self = new CreateChatConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatConfigResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
