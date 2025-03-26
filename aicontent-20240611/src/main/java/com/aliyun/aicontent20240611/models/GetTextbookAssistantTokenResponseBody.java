// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class GetTextbookAssistantTokenResponseBody extends TeaModel {
    @NameInMap("data")
    public GetTextbookAssistantTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0A5E9849-A2F0-551D-A7D8-1A8118557BAB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>tc_197bf5bb81889cc79eb51ae9b8c0cea3</p>
         */
        @NameInMap("authToken")
        public String authToken;

        /**
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
