// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCurrentNodeInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeCurrentNodeInfoResponseBodyResult result;

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
