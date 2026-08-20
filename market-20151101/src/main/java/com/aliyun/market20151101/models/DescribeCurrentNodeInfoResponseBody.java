// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCurrentNodeInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00eb4de1-6cff-4f56-833e-7b1e070e398d</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The process node information returned upon success.</p>
     */
    @NameInMap("Result")
    public DescribeCurrentNodeInfoResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
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
         * <p>Indicates whether rollback to the previous process node is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AllowRollbackNode")
        public Boolean allowRollbackNode;

        /**
         * <p>Indicates whether the node is automatically completed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoFinishNode")
        public Boolean autoFinishNode;

        /**
         * <p>The sequence number of the last node.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FinalStepNo")
        public Integer finalStepNo;

        /**
         * <p>The timeout of the process node. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1588920725000</p>
         */
        @NameInMap("GmtExpired")
        public Long gmtExpired;

        /**
         * <p>The completion time of the process node. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1588920725000</p>
         */
        @NameInMap("GmtFinished")
        public Long gmtFinished;

        /**
         * <p>The start time of the process node. The value is a UNIX timestamp.</p>
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
         * <p>The ID of the next process node.</p>
         * 
         * <strong>example:</strong>
         * <p>8473</p>
         */
        @NameInMap("NextNodeId")
        public Long nextNodeId;

        /**
         * <p>The ID of the process node.</p>
         * 
         * <strong>example:</strong>
         * <p>8472</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>等待服务开通</p>
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
         * <p>Starting</p>
         */
        @NameInMap("NodeStatus")
        public String nodeStatus;

        /**
         * <p>The role of the operator for the process node. Valid values:</p>
         * <ul>
         * <li>system: system.</li>
         * <li>custom: user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Provider</p>
         */
        @NameInMap("OperatorRole")
        public String operatorRole;

        /**
         * <p>The ID of the parent process node.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ParentNodeId")
        public Long parentNodeId;

        /**
         * <p>The ID of the previous process node.</p>
         * 
         * <strong>example:</strong>
         * <p>8471</p>
         */
        @NameInMap("PreviousNodeId")
        public Long previousNodeId;

        /**
         * <p>The sequence number of the process node.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("StepNo")
        public Integer stepNo;

        /**
         * <p>The form content of the process node in JSON format.
         * Sample code:
         * <code>[ { &quot;fieldKey&quot;: &quot;TFD0&quot;, //form key &quot;isRequired&quot;: true, //whether the field is required &quot;maxLength&quot;: 50, //maximum length &quot;placeHolder&quot;: &quot;姓名&quot;, //form value description &quot;stepNum&quot;: 0, //sort value (ascending) &quot;title&quot;: &quot;收货人姓名&quot;, //form title &quot;type&quot;: &quot;text&quot; //form type }, { &quot;fieldKey&quot;: &quot;TFD1&quot;, &quot;isRequired&quot;: true, &quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;手机号码&quot;, &quot;stepNum&quot;: 1, &quot;title&quot;: &quot;收货人电话&quot;, &quot;type&quot;: &quot;text&quot; }, { &quot;fieldKey&quot;: &quot;TFD2&quot;, &quot;isRequired&quot;: true, &quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;省市区街道门牌号码&quot;, &quot;stepNum&quot;: 2, &quot;title&quot;: &quot;详细收货地址&quot;, &quot;type&quot;: &quot;textarea&quot; } ]</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>[ {&quot;fieldKey&quot;: &quot;TFD0&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50, &quot;placeHolder&quot;: &quot;姓名&quot;,&quot;stepNum&quot;: 0,&quot;title&quot;: &quot;收货人姓名&quot;,&quot;type&quot;: &quot;text&quot; },{ &quot;fieldKey&quot;: &quot;TFD1&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;手机号码&quot;,&quot;stepNum&quot;: 1,&quot;title&quot;: &quot;收货人电话&quot;,&quot;type&quot;: &quot;text&quot;},{&quot;fieldKey&quot;: &quot;TFD2&quot;,&quot;isRequired&quot;: true,&quot;maxLength&quot;: 50,&quot;placeHolder&quot;: &quot;省市区街道门牌号码&quot;,&quot;stepNum&quot;: 2,&quot;title&quot;: &quot;详细收货地址&quot;,&quot;type&quot;: &quot;textarea&quot;}]</p>
         */
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
