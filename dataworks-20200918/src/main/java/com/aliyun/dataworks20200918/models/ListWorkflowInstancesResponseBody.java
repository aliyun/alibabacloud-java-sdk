// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesResponseBody extends TeaModel {
    @NameInMap("PagingInfo")
    public ListWorkflowInstancesResponseBodyPagingInfo pagingInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListWorkflowInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstancesResponseBody self = new ListWorkflowInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstancesResponseBody setPagingInfo(ListWorkflowInstancesResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListWorkflowInstancesResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListWorkflowInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances extends TeaModel {
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

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances self = new ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setBizDate(Long bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public Long getBizDate() {
            return this.bizDate;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListWorkflowInstancesResponseBodyPagingInfo extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("WorkflowInstances")
        public java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances> workflowInstances;

        public static ListWorkflowInstancesResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyPagingInfo self = new ListWorkflowInstancesResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkflowInstancesResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowInstancesResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListWorkflowInstancesResponseBodyPagingInfo setWorkflowInstances(java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances> workflowInstances) {
            this.workflowInstances = workflowInstances;
            return this;
        }
        public java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances> getWorkflowInstances() {
            return this.workflowInstances;
        }

    }

}
