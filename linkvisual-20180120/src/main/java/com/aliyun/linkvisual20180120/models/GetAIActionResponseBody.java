// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAIActionResponseBodyData data;

    public static GetAIActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionResponseBody self = new GetAIActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIActionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIActionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIActionResponseBody setData(GetAIActionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAIActionResponseBodyData getData() {
        return this.data;
    }

    public static class GetAIActionResponseBodyData extends TeaModel {
        @NameInMap("ActionId")
        public String actionId;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("Action")
        public String action;

        @NameInMap("ActionTemplateId")
        public String actionTemplateId;

        @NameInMap("ActionIndex")
        public Integer actionIndex;

        @NameInMap("Alog")
        public String alog;

        @NameInMap("AlgoConfig")
        public String algoConfig;

        @NameInMap("ActionConfig")
        public String actionConfig;

        public static GetAIActionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionResponseBodyData self = new GetAIActionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAIActionResponseBodyData setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public GetAIActionResponseBodyData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetAIActionResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAIActionResponseBodyData setActionTemplateId(String actionTemplateId) {
            this.actionTemplateId = actionTemplateId;
            return this;
        }
        public String getActionTemplateId() {
            return this.actionTemplateId;
        }

        public GetAIActionResponseBodyData setActionIndex(Integer actionIndex) {
            this.actionIndex = actionIndex;
            return this;
        }
        public Integer getActionIndex() {
            return this.actionIndex;
        }

        public GetAIActionResponseBodyData setAlog(String alog) {
            this.alog = alog;
            return this;
        }
        public String getAlog() {
            return this.alog;
        }

        public GetAIActionResponseBodyData setAlgoConfig(String algoConfig) {
            this.algoConfig = algoConfig;
            return this;
        }
        public String getAlgoConfig() {
            return this.algoConfig;
        }

        public GetAIActionResponseBodyData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

    }

}
