// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class CreateTokenResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public CreateTokenResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success and \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTokenResponseBody self = new CreateTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTokenResponseBody setData(CreateTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTokenResponseBodyData extends TeaModel {
        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1705388704855</p>
         */
        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>The access token.</p>
         * 
         * <strong>example:</strong>
         * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
         */
        @NameInMap("Token")
        public String token;

        public static CreateTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTokenResponseBodyData self = new CreateTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTokenResponseBodyData setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public CreateTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
