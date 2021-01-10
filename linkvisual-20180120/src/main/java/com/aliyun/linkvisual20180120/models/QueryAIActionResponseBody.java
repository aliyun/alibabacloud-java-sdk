// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAIActionResponseBodyData> data;

    public static QueryAIActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAIActionResponseBody self = new QueryAIActionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAIActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAIActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAIActionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAIActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAIActionResponseBody setData(java.util.List<QueryAIActionResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAIActionResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryAIActionResponseBodyData extends TeaModel {
        @NameInMap("ActionId")
        public String actionId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("ActionTemplateId")
        public String actionTemplateId;

        @NameInMap("ActionIndex")
        public Integer actionIndex;

        @NameInMap("Algo")
        public String algo;

        @NameInMap("Action")
        public String action;

        @NameInMap("AlgoConfig")
        public String algoConfig;

        @NameInMap("ActionConfig")
        public String actionConfig;

        public static QueryAIActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAIActionResponseBodyData self = new QueryAIActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAIActionResponseBodyData setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public QueryAIActionResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public QueryAIActionResponseBodyData setActionTemplateId(String actionTemplateId) {
            this.actionTemplateId = actionTemplateId;
            return this;
        }
        public String getActionTemplateId() {
            return this.actionTemplateId;
        }

        public QueryAIActionResponseBodyData setActionIndex(Integer actionIndex) {
            this.actionIndex = actionIndex;
            return this;
        }
        public Integer getActionIndex() {
            return this.actionIndex;
        }

        public QueryAIActionResponseBodyData setAlgo(String algo) {
            this.algo = algo;
            return this;
        }
        public String getAlgo() {
            return this.algo;
        }

        public QueryAIActionResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public QueryAIActionResponseBodyData setAlgoConfig(String algoConfig) {
            this.algoConfig = algoConfig;
            return this;
        }
        public String getAlgoConfig() {
            return this.algoConfig;
        }

        public QueryAIActionResponseBodyData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

    }

}
