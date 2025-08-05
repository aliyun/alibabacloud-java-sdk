// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkflowInstance")
    public GetWorkflowInstanceResponseBodyWorkflowInstance workflowInstance;

    public static GetWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceResponseBody self = new GetWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkflowInstanceResponseBody setWorkflowInstance(GetWorkflowInstanceResponseBodyWorkflowInstance workflowInstance) {
        this.workflowInstance = workflowInstance;
        return this;
    }
    public GetWorkflowInstanceResponseBodyWorkflowInstance getWorkflowInstance() {
        return this.workflowInstance;
    }

    public static class GetWorkflowInstanceResponseBodyWorkflowInstance extends TeaModel {
        @NameInMap("BizDate")
        public Long bizDate;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("StartedTime")
        public Long startedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("WaitingResourceTime")
        public Long waitingResourceTime;

        @NameInMap("WaitingTriggerTime")
        public Long waitingTriggerTime;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static GetWorkflowInstanceResponseBodyWorkflowInstance build(java.util.Map<String, ?> map) throws Exception {
            GetWorkflowInstanceResponseBodyWorkflowInstance self = new GetWorkflowInstanceResponseBodyWorkflowInstance();
            return TeaModel.build(map, self);
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWaitingResourceTime(Long waitingResourceTime) {
            this.waitingResourceTime = waitingResourceTime;
            return this;
        }
        public Long getWaitingResourceTime() {
            return this.waitingResourceTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWaitingTriggerTime(Long waitingTriggerTime) {
            this.waitingTriggerTime = waitingTriggerTime;
            return this;
        }
        public Long getWaitingTriggerTime() {
            return this.waitingTriggerTime;
        }

        public GetWorkflowInstanceResponseBodyWorkflowInstance setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

}
