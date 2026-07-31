// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterListSubscriptionsResponseBody extends TeaModel {
    /**
     * <p>The subscription information.</p>
     */
    @NameInMap("data")
    public ModelRouterListSubscriptionsResponseBodyData data;

    /**
     * <p>The fault error message encoding.</p>
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
     * <p>Unknown error.</p>
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

    public static ModelRouterListSubscriptionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterListSubscriptionsResponseBody self = new ModelRouterListSubscriptionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterListSubscriptionsResponseBody setData(ModelRouterListSubscriptionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModelRouterListSubscriptionsResponseBodyData getData() {
        return this.data;
    }

    public ModelRouterListSubscriptionsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterListSubscriptionsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterListSubscriptionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterListSubscriptionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterListSubscriptionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModelRouterListSubscriptionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of subscription information.</p>
         */
        @NameInMap("list")
        public java.util.List<SubscriptionDTO> list;

        /**
         * <p>The maximum number of results per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, specify the value returned from the previous query. Set to &quot;&quot; when no more data is available. Set to &quot;5&quot; when there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>5&quot; or &quot;&quot;</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        public static ModelRouterListSubscriptionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModelRouterListSubscriptionsResponseBodyData self = new ModelRouterListSubscriptionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModelRouterListSubscriptionsResponseBodyData setList(java.util.List<SubscriptionDTO> list) {
            this.list = list;
            return this;
        }
        public java.util.List<SubscriptionDTO> getList() {
            return this.list;
        }

        public ModelRouterListSubscriptionsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ModelRouterListSubscriptionsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
