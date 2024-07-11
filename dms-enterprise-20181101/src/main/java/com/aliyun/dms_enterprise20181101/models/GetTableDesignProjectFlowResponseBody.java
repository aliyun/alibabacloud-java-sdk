// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectFlowResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the schema design process.</p>
     */
    @NameInMap("ProjectFlow")
    public GetTableDesignProjectFlowResponseBodyProjectFlow projectFlow;

    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>B5FD0BC8-2D90-4478-B8EC-A0E92E0B1773</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether the ticket can be returned to the schema design node. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The ticket can be returned to the schema design node.</li>
         * <li><strong>0</strong>: The ticket cannot be returned to the schema design node. This value can be returned only for the PUBLISH node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BackToDesign")
        public Boolean backToDesign;

        /**
         * <p>Indicates whether the current node can be skipped. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The current node can be skipped.</li>
         * <li><strong>0</strong>: The current node cannot be skipped. This value can be returned only for the PUBLISH node.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CanSkip")
        public Boolean canSkip;

        /**
         * <p>The role of the node in the process.</p>
         * <ul>
         * <li>START: The ticket was created.</li>
         * <li>DESIGN: The schema is being created.</li>
         * <li>PUBLISH: The schema is published.</li>
         * <li>END: The ticket is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESIGN</p>
         */
        @NameInMap("NodeRole")
        public String nodeRole;

        /**
         * <p>The title of the node.</p>
         */
        @NameInMap("NodeTitle")
        public String nodeTitle;

        /**
         * <p>The position of the node in the process. The value starts from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Position")
        public Integer position;

        /**
         * <p>Indicates whether the node is the anchor node. A schema design process has only one anchor node, on which the schema is published. After the schema is published on the anchor node, a post-publish image is generated and the DDL metadata lock is released.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PublishAnchor")
        public Boolean publishAnchor;

        /**
         * <p>The available publishing strategies.</p>
         */
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
        /**
         * <p>The position of the current node in the process.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentPosition")
        public Integer currentPosition;

        /**
         * <p>The nodes in the process.</p>
         */
        @NameInMap("FlowNodeArray")
        public java.util.List<GetTableDesignProjectFlowResponseBodyProjectFlowFlowNodeArray> flowNodeArray;

        /**
         * <p>The description of the security rule set that is applied to the schema design ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>mysq_test</p>
         */
        @NameInMap("RuleComment")
        public String ruleComment;

        /**
         * <p>The name of the security rule set that is applied to the schema design ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql default</p>
         */
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
