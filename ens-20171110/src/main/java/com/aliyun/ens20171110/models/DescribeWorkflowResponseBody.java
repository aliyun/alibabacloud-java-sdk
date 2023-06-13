// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeWorkflowResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkFlowInfo")
    public java.util.List<DescribeWorkflowResponseBodyWorkFlowInfo> workFlowInfo;

    public static DescribeWorkflowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWorkflowResponseBody self = new DescribeWorkflowResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWorkflowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWorkflowResponseBody setWorkFlowInfo(java.util.List<DescribeWorkflowResponseBodyWorkFlowInfo> workFlowInfo) {
        this.workFlowInfo = workFlowInfo;
        return this;
    }
    public java.util.List<DescribeWorkflowResponseBodyWorkFlowInfo> getWorkFlowInfo() {
        return this.workFlowInfo;
    }

    public static class DescribeWorkflowResponseBodyWorkFlowInfo extends TeaModel {
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BussinessId")
        public String bussinessId;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtEnd")
        public String gmtEnd;

        @NameInMap("GmtExpire")
        public String gmtExpire;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("GmtStart")
        public String gmtStart;

        @NameInMap("Id")
        public String id;

        @NameInMap("InitAttributes")
        public String initAttributes;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("WorkerNode")
        public String workerNode;

        @NameInMap("WorkflowId")
        public String workflowId;

        public static DescribeWorkflowResponseBodyWorkFlowInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeWorkflowResponseBodyWorkFlowInfo self = new DescribeWorkflowResponseBodyWorkFlowInfo();
            return TeaModel.build(map, self);
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setBussinessId(String bussinessId) {
            this.bussinessId = bussinessId;
            return this;
        }
        public String getBussinessId() {
            return this.bussinessId;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setGmtEnd(String gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public String getGmtEnd() {
            return this.gmtEnd;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setGmtExpire(String gmtExpire) {
            this.gmtExpire = gmtExpire;
            return this;
        }
        public String getGmtExpire() {
            return this.gmtExpire;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setGmtStart(String gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public String getGmtStart() {
            return this.gmtStart;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setInitAttributes(String initAttributes) {
            this.initAttributes = initAttributes;
            return this;
        }
        public String getInitAttributes() {
            return this.initAttributes;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setWorkerNode(String workerNode) {
            this.workerNode = workerNode;
            return this;
        }
        public String getWorkerNode() {
            return this.workerNode;
        }

        public DescribeWorkflowResponseBodyWorkFlowInfo setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
