// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class ListModelLimitsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The model throttling information.</p>
     */
    @NameInMap("limits")
    public java.util.List<ListModelLimitsResponseBodyLimits> limits;

    /**
     * <p>The maximum number of records returned in a single request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Long maxResults;

    /**
     * <p>The token for the next request.</p>
     * 
     * <strong>example:</strong>
     * <p>lwytFRtLdNk=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36045E0A-551D-592D-B1BC-4C56596CE59E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListModelLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelLimitsResponseBody self = new ListModelLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelLimitsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListModelLimitsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListModelLimitsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListModelLimitsResponseBody setLimits(java.util.List<ListModelLimitsResponseBodyLimits> limits) {
        this.limits = limits;
        return this;
    }
    public java.util.List<ListModelLimitsResponseBodyLimits> getLimits() {
        return this.limits;
    }

    public ListModelLimitsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListModelLimitsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListModelLimitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelLimitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListModelLimitsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelLimitsResponseBodyLimitsModelLimit extends TeaModel {
        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("asyncUserConcurrencyLimit")
        public Long asyncUserConcurrencyLimit;

        /**
         * <p>The queue size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("asyncUserQueueLimit")
        public Long asyncUserQueueLimit;

        /**
         * <p>The request throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("requestLimit")
        public Long requestLimit;

        /**
         * <p>The time period for request throttling, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("requestLimitPeriod")
        public Integer requestLimitPeriod;

        /**
         * <p>The usage throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The usage throttling unit.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("usageLimitField")
        public String usageLimitField;

        /**
         * <p>The time period for usage throttling, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("usageLimitPeriod")
        public Integer usageLimitPeriod;

        public static ListModelLimitsResponseBodyLimitsModelLimit build(java.util.Map<String, ?> map) throws Exception {
            ListModelLimitsResponseBodyLimitsModelLimit self = new ListModelLimitsResponseBodyLimitsModelLimit();
            return TeaModel.build(map, self);
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setAsyncUserConcurrencyLimit(Long asyncUserConcurrencyLimit) {
            this.asyncUserConcurrencyLimit = asyncUserConcurrencyLimit;
            return this;
        }
        public Long getAsyncUserConcurrencyLimit() {
            return this.asyncUserConcurrencyLimit;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setAsyncUserQueueLimit(Long asyncUserQueueLimit) {
            this.asyncUserQueueLimit = asyncUserQueueLimit;
            return this;
        }
        public Long getAsyncUserQueueLimit() {
            return this.asyncUserQueueLimit;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setRequestLimit(Long requestLimit) {
            this.requestLimit = requestLimit;
            return this;
        }
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setRequestLimitPeriod(Integer requestLimitPeriod) {
            this.requestLimitPeriod = requestLimitPeriod;
            return this;
        }
        public Integer getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setUsageLimitField(String usageLimitField) {
            this.usageLimitField = usageLimitField;
            return this;
        }
        public String getUsageLimitField() {
            return this.usageLimitField;
        }

        public ListModelLimitsResponseBodyLimitsModelLimit setUsageLimitPeriod(Integer usageLimitPeriod) {
            this.usageLimitPeriod = usageLimitPeriod;
            return this;
        }
        public Integer getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

    }

    public static class ListModelLimitsResponseBodyLimitsWorkspaceLimit extends TeaModel {
        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("asyncUserConcurrencyLimit")
        public Long asyncUserConcurrencyLimit;

        /**
         * <p>The queue size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("asyncUserQueueLimit")
        public Long asyncUserQueueLimit;

        /**
         * <p>The request throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("requestLimit")
        public Long requestLimit;

        /**
         * <p>The time period for request throttling, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("requestLimitPeriod")
        public Integer requestLimitPeriod;

        /**
         * <p>The usage throttling value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The usage throttling unit.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("usageLimitField")
        public String usageLimitField;

        /**
         * <p>The time period for usage throttling, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("usageLimitPeriod")
        public Integer usageLimitPeriod;

        public static ListModelLimitsResponseBodyLimitsWorkspaceLimit build(java.util.Map<String, ?> map) throws Exception {
            ListModelLimitsResponseBodyLimitsWorkspaceLimit self = new ListModelLimitsResponseBodyLimitsWorkspaceLimit();
            return TeaModel.build(map, self);
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setAsyncUserConcurrencyLimit(Long asyncUserConcurrencyLimit) {
            this.asyncUserConcurrencyLimit = asyncUserConcurrencyLimit;
            return this;
        }
        public Long getAsyncUserConcurrencyLimit() {
            return this.asyncUserConcurrencyLimit;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setAsyncUserQueueLimit(Long asyncUserQueueLimit) {
            this.asyncUserQueueLimit = asyncUserQueueLimit;
            return this;
        }
        public Long getAsyncUserQueueLimit() {
            return this.asyncUserQueueLimit;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setRequestLimit(Long requestLimit) {
            this.requestLimit = requestLimit;
            return this;
        }
        public Long getRequestLimit() {
            return this.requestLimit;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setRequestLimitPeriod(Integer requestLimitPeriod) {
            this.requestLimitPeriod = requestLimitPeriod;
            return this;
        }
        public Integer getRequestLimitPeriod() {
            return this.requestLimitPeriod;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setUsageLimitField(String usageLimitField) {
            this.usageLimitField = usageLimitField;
            return this;
        }
        public String getUsageLimitField() {
            return this.usageLimitField;
        }

        public ListModelLimitsResponseBodyLimitsWorkspaceLimit setUsageLimitPeriod(Integer usageLimitPeriod) {
            this.usageLimitPeriod = usageLimitPeriod;
            return this;
        }
        public Integer getUsageLimitPeriod() {
            return this.usageLimitPeriod;
        }

    }

    public static class ListModelLimitsResponseBodyLimits extends TeaModel {
        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The model throttling configuration for the current user account.</p>
         */
        @NameInMap("modelLimit")
        public ListModelLimitsResponseBodyLimitsModelLimit modelLimit;

        /**
         * <p>The model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The custom model throttling configuration for the current workspace.</p>
         */
        @NameInMap("workspaceLimit")
        public ListModelLimitsResponseBodyLimitsWorkspaceLimit workspaceLimit;

        public static ListModelLimitsResponseBodyLimits build(java.util.Map<String, ?> map) throws Exception {
            ListModelLimitsResponseBodyLimits self = new ListModelLimitsResponseBodyLimits();
            return TeaModel.build(map, self);
        }

        public ListModelLimitsResponseBodyLimits setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListModelLimitsResponseBodyLimits setModelLimit(ListModelLimitsResponseBodyLimitsModelLimit modelLimit) {
            this.modelLimit = modelLimit;
            return this;
        }
        public ListModelLimitsResponseBodyLimitsModelLimit getModelLimit() {
            return this.modelLimit;
        }

        public ListModelLimitsResponseBodyLimits setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListModelLimitsResponseBodyLimits setWorkspaceLimit(ListModelLimitsResponseBodyLimitsWorkspaceLimit workspaceLimit) {
            this.workspaceLimit = workspaceLimit;
            return this;
        }
        public ListModelLimitsResponseBodyLimitsWorkspaceLimit getWorkspaceLimit() {
            return this.workspaceLimit;
        }

    }

}
