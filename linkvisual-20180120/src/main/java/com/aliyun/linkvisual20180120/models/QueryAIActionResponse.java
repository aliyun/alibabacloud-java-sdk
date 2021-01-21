// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIActionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<QueryAIActionResponseData> data;

    public static QueryAIActionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAIActionResponse self = new QueryAIActionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAIActionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIActionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIActionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIActionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIActionResponse setData(java.util.List<QueryAIActionResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAIActionResponseData> getData() {
        return this.data;
    }

    public static class QueryAIActionResponseData extends TeaModel {
        @NameInMap("ActionId")
        @Validation(required = true)
        public String actionId;

        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("ActionTemplateId")
        @Validation(required = true)
        public String actionTemplateId;

        @NameInMap("ActionIndex")
        @Validation(required = true)
        public Integer actionIndex;

        @NameInMap("Algo")
        @Validation(required = true)
        public String algo;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("AlgoConfig")
        @Validation(required = true)
        public String algoConfig;

        @NameInMap("ActionConfig")
        @Validation(required = true)
        public String actionConfig;

        public static QueryAIActionResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIActionResponseData self = new QueryAIActionResponseData();
            return TeaModel.build(map, self);
        }

        public QueryAIActionResponseData setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public QueryAIActionResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryAIActionResponseData setActionTemplateId(String actionTemplateId) {
            this.actionTemplateId = actionTemplateId;
            return this;
        }
        public String getActionTemplateId() {
            return this.actionTemplateId;
        }

        public QueryAIActionResponseData setActionIndex(Integer actionIndex) {
            this.actionIndex = actionIndex;
            return this;
        }
        public Integer getActionIndex() {
            return this.actionIndex;
        }

        public QueryAIActionResponseData setAlgo(String algo) {
            this.algo = algo;
            return this;
        }
        public String getAlgo() {
            return this.algo;
        }

        public QueryAIActionResponseData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryAIActionResponseData setAlgoConfig(String algoConfig) {
            this.algoConfig = algoConfig;
            return this;
        }
        public String getAlgoConfig() {
            return this.algoConfig;
        }

        public QueryAIActionResponseData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

    }

}
