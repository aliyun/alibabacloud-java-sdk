// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateUserResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;userId&quot;: 30001 }</p>
     */
    @NameInMap("data")
    public ModelRouterCreateUserResponseBodyData data;

    /**
     * <p>The fault code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
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
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterCreateUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateUserResponseBody self = new ModelRouterCreateUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateUserResponseBody setData(ModelRouterCreateUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterCreateUserResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterCreateUserResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterCreateUserResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterCreateUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterCreateUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterCreateUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterCreateUserResponseBodyData extends TeaModel {
        /**
         * <p>The user ID. This ID is used as the userId addressing key for subsequent member API operations.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        @NameInMap("userId")
        public Long userId;

        public static ModelRouterCreateUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterCreateUserResponseBodyData self = new ModelRouterCreateUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterCreateUserResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
