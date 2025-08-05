// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListWorkflowsResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowsResponseBody self = new ListWorkflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowsResponseBody setPagingInfo(ListWorkflowsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListWorkflowsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListWorkflowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger extends TeaModel {
        @NameInMap("Cron")
        public String cron;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Recurrence")
        public String recurrence;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Type")
        public String type;

        public static ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger self = new ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger setRecurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }
        public String getRecurrence() {
            return this.recurrence;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListWorkflowsResponseBodyPagingInfoWorkflows extends TeaModel {
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("ModifyUser")
        public String modifyUser;

        @NameInMap("Name")
        public String name;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("Parameters")
        public String parameters;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Trigger")
        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger trigger;

        public static ListWorkflowsResponseBodyPagingInfoWorkflows build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyPagingInfoWorkflows self = new ListWorkflowsResponseBodyPagingInfoWorkflows();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setClientUniqueCode(String clientUniqueCode) {
            this.clientUniqueCode = clientUniqueCode;
            return this;
        }
        public String getClientUniqueCode() {
            return this.clientUniqueCode;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflows setTrigger(ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger getTrigger() {
            return this.trigger;
        }

    }

    public static class ListWorkflowsResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Workflows")
        public java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflows> workflows;

        public static ListWorkflowsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyPagingInfo self = new ListWorkflowsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkflowsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListWorkflowsResponseBodyPagingInfo setWorkflows(java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflows> workflows) {
            this.workflows = workflows;
            return this;
        }
        public java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflows> getWorkflows() {
            return this.workflows;
        }

    }

}
