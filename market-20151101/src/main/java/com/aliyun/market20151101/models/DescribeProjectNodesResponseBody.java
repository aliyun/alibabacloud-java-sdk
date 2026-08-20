// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectNodesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>937fee1f-26bb-4b6e-8def-977a6bdaa1e5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>None.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeProjectNodesResponseBodyResult> result;

    /**
     * <p>The success status identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Indicates whether rollback to the previous flow node is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowRollbackNode")
        public Boolean allowRollbackNode;

        /**
         * <p>Indicates whether the node automatically completes upon timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoFinishNode")
        public Boolean autoFinishNode;

        /**
         * <p>The sequence number of the final flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        /**
         * <p>The timeout time of the flow node (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1588834325000</p>
         */
        @NameInMap("GmtExpired")
        public Long gmtExpired;

        /**
         * <p>The completion time of the flow node (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1588834325000</p>
         */
        @NameInMap("GmtFinished")
        public Long gmtFinished;

        /**
         * <p>The start time of the flow node (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1588834325000</p>
         */
        @NameInMap("GmtStart")
        public Long gmtStart;

        /**
         * <p>Indicates whether uploading an attachment is mandatory.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedAttachment")
        public Boolean needAttachment;

        /**
         * <p>The ID of the next flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>8472</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <p>The flow node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8471</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>分配服务商节点</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The execution status of the node. Valid values:</p>
         * <ul>
         * <li>NotStart: not started.</li>
         * <li>Starting: in progress.</li>
         * <li>Cancel: canceled.</li>
         * <li>Finish: completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Finish</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <p>The role of the operator. Valid values:</p>
         * <ul>
         * <li>System: system.</li>
         * <li>Custom: customer.</li>
         * <li>Provider: service provider.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        /**
         * <p>The ID of the parent flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentNodeId")
        public Long parentNodeId;

        /**
         * <p>The ID of the previous flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>8470</p>
         */
        @NameInMap("PreviousNodeId")
        public Long previousNodeId;

        /**
         * <p>The sequence number of the flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StepNo")
        public Integer stepNo;

        /**
         * <p>The form content of the flow node.</p>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;fieldKey&quot;: &quot;TFD0&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;姓名&quot;,&quot;stepNum&quot;: 0,&quot;title&quot;: &quot;收货人姓名&quot;,&quot;type&quot;: &quot;text&quot; },{ &quot;fieldKey&quot;: &quot;TFD1&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;手机号码&quot;,&quot;stepNum&quot;: 1,&quot;title&quot;: &quot;收货人电话&quot;,&quot;type&quot;: &quot;text&quot;},{&quot;fieldKey&quot;: &quot;TFD2&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;省市区街道门牌号码&quot;,&quot;stepNum&quot;: 2,&quot;title&quot;: &quot;详细收货地址&quot;,&quot;type&quot;: &quot;textarea&quot;}]</p>
         */
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
