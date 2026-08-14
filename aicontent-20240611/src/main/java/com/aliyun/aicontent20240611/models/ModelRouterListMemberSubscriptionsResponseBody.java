// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListMemberSubscriptionsResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public ModelRouterListMemberSubscriptionsResponseBodyData data;

    /**
     * <p>The fault information code.</p>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterListMemberSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListMemberSubscriptionsResponseBody self = new ModelRouterListMemberSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterListMemberSubscriptionsResponseBody setData(ModelRouterListMemberSubscriptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterListMemberSubscriptionsResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterListMemberSubscriptionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterListMemberSubscriptionsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterListMemberSubscriptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterListMemberSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterListMemberSubscriptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterListMemberSubscriptionsResponseBodyData extends TeaModel {
        /**
         * <p>The response data list.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("list")
        public java.util.List<SubscriptionDTO> list;

        public static ModelRouterListMemberSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterListMemberSubscriptionsResponseBodyData self = new ModelRouterListMemberSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterListMemberSubscriptionsResponseBodyData setList(java.util.List<SubscriptionDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SubscriptionDTO> getList() {
            return this.list;
        }

    }

}
