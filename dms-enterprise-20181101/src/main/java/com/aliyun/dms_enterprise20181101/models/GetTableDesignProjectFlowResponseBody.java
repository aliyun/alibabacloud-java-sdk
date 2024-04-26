// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectFlowResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProjectFlow")
    public GetTableDesignProjectFlowResponseBodyProjectFlow projectFlow;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTableDesignProjectFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableDesignProjectFlowResponseBody self = new GetTableDesignProjectFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableDesignProjectFlowResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableDesignProjectFlowResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableDesignProjectFlowResponseBody setProjectFlow(GetTableDesignProjectFlowResponseBodyProjectFlow projectFlow) {
        this.projectFlow = projectFlow;
        return this;
    }
    public GetTableDesignProjectFlowResponseBodyProjectFlow getProjectFlow() {
        return this.projectFlow;
    }

    public GetTableDesignProjectFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableDesignProjectFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray extends TeaModel {
        @NameInMap("BackToDesign")
        public Boolean backToDesign;

        @NameInMap("CanSkip")
        public Boolean canSkip;

        @NameInMap("NodeRole")
        public String nodeRole;

        @NameInMap("NodeTitle")
        public String nodeTitle;

        @NameInMap("Position")
        public Integer position;

        @NameInMap("PublishAnchor")
        public Boolean publishAnchor;

        @NameInMap("PublishStrategies")
        public java.util.List<String> publishStrategies;

        public static GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray build(java.util.Map<String, ?> map) throws Exception {
            GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray self = new GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray();
            return TeaModel.build(map, self);
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setBackToDesign(Boolean backToDesign) {
            this.backToDesign = backToDesign;
            return this;
        }
        public Boolean getBackToDesign() {
            return this.backToDesign;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setCanSkip(Boolean canSkip) {
            this.canSkip = canSkip;
            return this;
        }
        public Boolean getCanSkip() {
            return this.canSkip;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setNodeRole(String nodeRole) {
            this.nodeRole = nodeRole;
            return this;
        }
        public String getNodeRole() {
            return this.nodeRole;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setNodeTitle(String nodeTitle) {
            this.nodeTitle = nodeTitle;
            return this;
        }
        public String getNodeTitle() {
            return this.nodeTitle;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setPublishAnchor(Boolean publishAnchor) {
            this.publishAnchor = publishAnchor;
            return this;
        }
        public Boolean getPublishAnchor() {
            return this.publishAnchor;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray setPublishStrategies(java.util.List<String> publishStrategies) {
            this.publishStrategies = publishStrategies;
            return this;
        }
        public java.util.List<String> getPublishStrategies() {
            return this.publishStrategies;
        }

    }

    public static class GetTableDesignProjectFlowResponseBodyProjectFlow extends TeaModel {
        @NameInMap("CurrentPosition")
        public Integer currentPosition;

        @NameInMap("FlowNodeArray")
        public java.util.List<GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray> flowNodeArray;

        @NameInMap("RuleComment")
        public String ruleComment;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetTableDesignProjectFlowResponseBodyProjectFlow build(java.util.Map<String, ?> map) throws Exception {
            GetTableDesignProjectFlowResponseBodyProjectFlow self = new GetTableDesignProjectFlowResponseBodyProjectFlow();
            return TeaModel.build(map, self);
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlow setCurrentPosition(Integer currentPosition) {
            this.currentPosition = currentPosition;
            return this;
        }
        public Integer getCurrentPosition() {
            return this.currentPosition;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlow setFlowNodeArray(java.util.List<GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray> flowNodeArray) {
            this.flowNodeArray = flowNodeArray;
            return this;
        }
        public java.util.List<GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray> getFlowNodeArray() {
            return this.flowNodeArray;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlow setRuleComment(String ruleComment) {
            this.ruleComment = ruleComment;
            return this;
        }
        public String getRuleComment() {
            return this.ruleComment;
        }

        public GetTableDesignProjectFlowResponseBodyProjectFlow setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
