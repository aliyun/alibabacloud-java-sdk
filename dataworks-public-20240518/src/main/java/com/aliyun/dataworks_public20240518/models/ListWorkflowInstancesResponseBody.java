// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowInstancesResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListWorkflowInstancesResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("BizDate")
        public Long bizDate;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The environment of the workspace. Valid values:</p>
         * <ul>
         * <li>Prod</li>
         * <li>Dev</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The time when the instance finished running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The workflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name of the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowInstance1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The time when the instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The status of the workflow instance. Valid values:</p>
         * <ul>
         * <li>NotRun: The instance is not run.</li>
         * <li>Running: The instance is running.</li>
         * <li>WaitTime: The instance is waiting for the scheduling time to arrive.</li>
         * <li>CheckingCondition: Branch conditions are being checked for the instance.</li>
         * <li>WaitResource: The instance is waiting for resources.</li>
         * <li>Failure: The instance fails to be run.</li>
         * <li>Success: The instance is successfully run.</li>
         * <li>Checking: Data quality is being checked for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("WorkflowParameters")
        public String workflowParameters;

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

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setWorkflowParameters(String workflowParameters) {
            this.workflowParameters = workflowParameters;
            return this;
        }
        public String getWorkflowParameters() {
            return this.workflowParameters;
        }

    }

    public static class ListWorkflowInstancesResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The workflow instances.</p>
         */
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
