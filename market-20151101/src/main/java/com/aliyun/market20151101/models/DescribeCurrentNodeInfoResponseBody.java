// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCurrentNodeInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00eb4de1-6cff-4f56-833e-7b1e070e398d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeCurrentNodeInfoResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCurrentNodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCurrentNodeInfoResponseBody self = new DescribeCurrentNodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCurrentNodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCurrentNodeInfoResponseBody setResult(DescribeCurrentNodeInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeCurrentNodeInfoResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeCurrentNodeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCurrentNodeInfoResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowRollbackNode")
        public Boolean allowRollbackNode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoFinishNode")
        public Boolean autoFinishNode;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        /**
         * <strong>example:</strong>
         * <p>1588920725000</p>
         */
        @NameInMap("GmtExpired")
        public Long gmtExpired;

        /**
         * <strong>example:</strong>
         * <p>1588920725000</p>
         */
        @NameInMap("GmtFinished")
        public Long gmtFinished;

        /**
         * <strong>example:</strong>
         * <p>1588834325000</p>
         */
        @NameInMap("GmtStart")
        public Long gmtStart;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedAttachment")
        public Boolean needAttachment;

        /**
         * <strong>example:</strong>
         * <p>8473</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <strong>example:</strong>
         * <p>8472</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>Starting</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <strong>example:</strong>
         * <p>Provider</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentNodeId")
        public Long parentNodeId;

        /**
         * <strong>example:</strong>
         * <p>8471</p>
         */
        @NameInMap("PreviousNodeId")
        public Long previousNodeId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StepNo")
        public Integer stepNo;

        @NameInMap("TemplateForm")
        public String templateForm;

        public static DescribeCurrentNodeInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCurrentNodeInfoResponseBodyResult self = new DescribeCurrentNodeInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCurrentNodeInfoResponseBodyResult setAllowRollbackNode(Boolean allowRollbackNode) {
            this.allowRollbackNode = allowRollbackNode;
            return this;
        }
        public Boolean getAllowRollbackNode() {
            return this.allowRollbackNode;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setAutoFinishNode(Boolean autoFinishNode) {
            this.autoFinishNode = autoFinishNode;
            return this;
        }
        public Boolean getAutoFinishNode() {
            return this.autoFinishNode;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setFinalStepNo(Integer finalStepNo) {
            this.finalStepNo = finalStepNo;
            return this;
        }
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setGmtExpired(Long gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public Long getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setGmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setNeedAttachment(Boolean needAttachment) {
            this.needAttachment = needAttachment;
            return this;
        }
        public Boolean getNeedAttachment() {
            return this.needAttachment;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setNextNodeId(Long nextNodeId) {
            this.nextNodeId = nextNodeId;
            return this;
        }
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setParentNodeId(Long parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }
        public Long getParentNodeId() {
            return this.parentNodeId;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setPreviousNodeId(Long previousNodeId) {
            this.previousNodeId = previousNodeId;
            return this;
        }
        public Long getPreviousNodeId() {
            return this.previousNodeId;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setStepNo(Integer stepNo) {
            this.stepNo = stepNo;
            return this;
        }
        public Integer getStepNo() {
            return this.stepNo;
        }

        public DescribeCurrentNodeInfoResponseBodyResult setTemplateForm(String templateForm) {
            this.templateForm = templateForm;
            return this;
        }
        public String getTemplateForm() {
            return this.templateForm;
        }

    }

}
