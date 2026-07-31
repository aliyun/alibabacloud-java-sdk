// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The subscription information.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("data")
    public SubscriptionDTO data;

    /**
     * <p>The fault encoding for the error message.</p>
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
     * <p>null</p>
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

    public static ModelRouterCreateSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateSubscriptionResponseBody self = new ModelRouterCreateSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateSubscriptionResponseBody setData(SubscriptionDTO data) {
        this.data = data;
        return this;
    }
    public SubscriptionDTO getData() {
        return this.data;
    }

    public ModelRouterCreateSubscriptionResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterCreateSubscriptionResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterCreateSubscriptionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterCreateSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterCreateSubscriptionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
