// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectNodesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeProjectNodesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeProjectNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectNodesResponseBody self = new DescribeProjectNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectNodesResponseBody setResult(java.util.List<DescribeProjectNodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeProjectNodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeProjectNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeProjectNodesResponseBodyResult extends TeaModel {
        @NameInMap("AllowRollbackNode")
        public Boolean allowRollbackNode;

        @NameInMap("AutoFinishNode")
        public Boolean autoFinishNode;

        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        @NameInMap("GmtExpired")
        public Long gmtExpired;

        @NameInMap("GmtFinished")
        public Long gmtFinished;

        @NameInMap("GmtStart")
        public Long gmtStart;

        @NameInMap("NeedAttachment")
        public Boolean needAttachment;

        @NameInMap("NextNodeId")
        public Long nextNodeId;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeStatus")
        public String nodeStatus;

        @NameInMap("OperatorRole")
        public String operatorRole;

        @NameInMap("ParentNodeId")
        public Long parentNodeId;

        @NameInMap("PreviousNodeId")
        public Long previousNodeId;

        @NameInMap("StepNo")
        public Integer stepNo;

        @NameInMap("TemplateForm")
        public String templateForm;

        public static DescribeProjectNodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectNodesResponseBodyResult self = new DescribeProjectNodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeProjectNodesResponseBodyResult setAllowRollbackNode(Boolean allowRollbackNode) {
            this.allowRollbackNode = allowRollbackNode;
            return this;
        }
        public Boolean getAllowRollbackNode() {
            return this.allowRollbackNode;
        }

        public DescribeProjectNodesResponseBodyResult setAutoFinishNode(Boolean autoFinishNode) {
            this.autoFinishNode = autoFinishNode;
            return this;
        }
        public Boolean getAutoFinishNode() {
            return this.autoFinishNode;
        }

        public DescribeProjectNodesResponseBodyResult setFinalStepNo(Integer finalStepNo) {
            this.finalStepNo = finalStepNo;
            return this;
        }
        public Integer getFinalStepNo() {
            return this.finalStepNo;
        }

        public DescribeProjectNodesResponseBodyResult setGmtExpired(Long gmtExpired) {
            this.gmtExpired = gmtExpired;
            return this;
        }
        public Long getGmtExpired() {
            return this.gmtExpired;
        }

        public DescribeProjectNodesResponseBodyResult setGmtFinished(Long gmtFinished) {
            this.gmtFinished = gmtFinished;
            return this;
        }
        public Long getGmtFinished() {
            return this.gmtFinished;
        }

        public DescribeProjectNodesResponseBodyResult setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public DescribeProjectNodesResponseBodyResult setNeedAttachment(Boolean needAttachment) {
            this.needAttachment = needAttachment;
            return this;
        }
        public Boolean getNeedAttachment() {
            return this.needAttachment;
        }

        public DescribeProjectNodesResponseBodyResult setNextNodeId(Long nextNodeId) {
            this.nextNodeId = nextNodeId;
            return this;
        }
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        public DescribeProjectNodesResponseBodyResult setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public DescribeProjectNodesResponseBodyResult setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeProjectNodesResponseBodyResult setNodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public String getNodeStatus() {
            return this.nodeStatus;
        }

        public DescribeProjectNodesResponseBodyResult setOperatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }
        public String getOperatorRole() {
            return this.operatorRole;
        }

        public DescribeProjectNodesResponseBodyResult setParentNodeId(Long parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }
        public Long getParentNodeId() {
            return this.parentNodeId;
        }

        public DescribeProjectNodesResponseBodyResult setPreviousNodeId(Long previousNodeId) {
            this.previousNodeId = previousNodeId;
            return this;
        }
        public Long getPreviousNodeId() {
            return this.previousNodeId;
        }

        public DescribeProjectNodesResponseBodyResult setStepNo(Integer stepNo) {
            this.stepNo = stepNo;
            return this;
        }
        public Integer getStepNo() {
            return this.stepNo;
        }

        public DescribeProjectNodesResponseBodyResult setTemplateForm(String templateForm) {
            this.templateForm = templateForm;
            return this;
        }
        public String getTemplateForm() {
            return this.templateForm;
        }

    }

}
