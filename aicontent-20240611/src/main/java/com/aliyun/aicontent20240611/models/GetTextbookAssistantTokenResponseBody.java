// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetTextbookAssistantTokenResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     */
    @NameInMap("data")
    public GetTextbookAssistantTokenResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>未知错误</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0A5E9849-A2F0-551D-A7D8-1A8118557BAB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The API call succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The API call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTextbookAssistantTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextbookAssistantTokenResponseBody self = new GetTextbookAssistantTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextbookAssistantTokenResponseBody setData(GetTextbookAssistantTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTextbookAssistantTokenResponseBodyData getData() {
        return this.data;
    }

    public GetTextbookAssistantTokenResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetTextbookAssistantTokenResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetTextbookAssistantTokenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTextbookAssistantTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextbookAssistantTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTextbookAssistantTokenResponseBodyData extends TeaModel {
        /**
         * <p>The authorization token. Use this token to make API calls to the English textbook-style AI teacher service.</p>
         * 
         * <strong>example:</strong>
         * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
         * <p>The expiration time of the authorization token, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5400</p>
         */
        @NameInMap("expire")
        public Integer expire;

        public static GetTextbookAssistantTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTextbookAssistantTokenResponseBodyData self = new GetTextbookAssistantTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTextbookAssistantTokenResponseBodyData setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public GetTextbookAssistantTokenResponseBodyData setExpire(Integer expire) {
            this.expire = expire;
            return this;
        }
        public Integer getExpire() {
            return this.expire;
        }

    }

}
