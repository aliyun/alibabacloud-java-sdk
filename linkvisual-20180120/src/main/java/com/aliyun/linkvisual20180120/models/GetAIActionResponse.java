// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionResponse extends TeaModel {
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
    public GetAIActionResponseData data;

    public static GetAIActionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionResponse self = new GetAIActionResponse();
        return TeaModel.build(map, self);
    }

    public GetAIActionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAIActionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAIActionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAIActionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIActionResponse setData(GetAIActionResponseData data) {
        this.data = data;
        return this;
    }
    public GetAIActionResponseData getData() {
        return this.data;
    }

    public static class GetAIActionResponseData extends TeaModel {
        @NameInMap("ActionId")
        @Validation(required = true)
        public String actionId;

        @NameInMap("PlanId")
        @Validation(required = true)
        public String planId;

        @NameInMap("Action")
        @Validation(required = true)
        public String action;

        @NameInMap("ActionTemplateId")
        @Validation(required = true)
        public String actionTemplateId;

        @NameInMap("ActionIndex")
        @Validation(required = true)
        public Integer actionIndex;

        @NameInMap("Alog")
        @Validation(required = true)
        public String alog;

        @NameInMap("AlgoConfig")
        @Validation(required = true)
        public String algoConfig;

        @NameInMap("ActionConfig")
        @Validation(required = true)
        public String actionConfig;

        public static GetAIActionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAIActionResponseData self = new GetAIActionResponseData();
            return TeaModel.build(map, self);
        }

        public GetAIActionResponseData setActionId(String actionId) {
            this.actionId = actionId;
            return this;
        }
        public String getActionId() {
            return this.actionId;
        }

        public GetAIActionResponseData setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public GetAIActionResponseData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAIActionResponseData setActionTemplateId(String actionTemplateId) {
            this.actionTemplateId = actionTemplateId;
            return this;
        }
        public String getActionTemplateId() {
            return this.actionTemplateId;
        }

        public GetAIActionResponseData setActionIndex(Integer actionIndex) {
            this.actionIndex = actionIndex;
            return this;
        }
        public Integer getActionIndex() {
            return this.actionIndex;
        }

        public GetAIActionResponseData setAlog(String alog) {
            this.alog = alog;
            return this;
        }
        public String getAlog() {
            return this.alog;
        }

        public GetAIActionResponseData setAlgoConfig(String algoConfig) {
            this.algoConfig = algoConfig;
            return this;
        }
        public String getAlgoConfig() {
            return this.algoConfig;
        }

        public GetAIActionResponseData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

    }

}
