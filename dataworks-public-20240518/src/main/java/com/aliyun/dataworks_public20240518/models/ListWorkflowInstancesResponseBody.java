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
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
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

    public static class ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags self = new ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances extends TeaModel {
        /**
         * <p>The business date.</p>
         * 
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
         * <p>The account ID of the user who created the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The project environment.</p>
         * <ul>
         * <li><p>Prod (production)</p>
         * </li>
         * <li><p>Dev (development)</p>
         * </li>
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
         * <p>The unique identifier of the workflow instance.</p>
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
         * <p>The account ID of the user who last modified the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>WorkflowInstance1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account ID of the workflow owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The time when the instance started running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The running status of the workflow instance.</p>
         * <ul>
         * <li><p>NotRun: Not run</p>
         * </li>
         * <li><p>Running: Running</p>
         * </li>
         * <li><p>WaitTime: Waiting for TriggerTime</p>
         * </li>
         * <li><p>CheckingCondition: Checking branch conditions</p>
         * </li>
         * <li><p>WaitResource: Waiting for resources</p>
         * </li>
         * <li><p>Failure: Failed</p>
         * </li>
         * <li><p>Success: Succeeded</p>
         * </li>
         * <li><p>Checking: Submitted for Data Quality check</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags> tags;

        /**
         * <p>The type of the workflow instance.</p>
         * <ul>
         * <li><p>Normal: Periodic scheduling</p>
         * </li>
         * <li><p>Manual: Manual task</p>
         * </li>
         * <li><p>SmokeTest: Testing</p>
         * </li>
         * <li><p>SupplementData: Backfill data</p>
         * </li>
         * <li><p>ManualWorkflow: Manual workflow</p>
         * </li>
         * <li><p>TriggerWorkflow: Trigger-based workflow</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unified workflow instance ID. All workflow instances within the same business date of a single trigger share the same value for this field.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("UnifiedWorkflowInstanceId")
        public Long unifiedWorkflowInstanceId;

        /**
         * <p>The ID of the workflow to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        /**
         * <p>The workflow parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>周期工作流：
         * key1=value1 key2=value2
         * 手动业务流程：
         * {&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
         */
        @NameInMap("WorkflowParameters")
        public String workflowParameters;

        /**
         * <p>The task instance ID corresponding to the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("WorkflowTaskInstanceId")
        public Long workflowTaskInstanceId;

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

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
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

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setTags(java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstancesTags> getTags() {
            return this.tags;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setUnifiedWorkflowInstanceId(Long unifiedWorkflowInstanceId) {
            this.unifiedWorkflowInstanceId = unifiedWorkflowInstanceId;
            return this;
        }
        public Long getUnifiedWorkflowInstanceId() {
            return this.unifiedWorkflowInstanceId;
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

        public ListWorkflowInstancesResponseBodyPagingInfoWorkflowInstances setWorkflowTaskInstanceId(Long workflowTaskInstanceId) {
            this.workflowTaskInstanceId = workflowTaskInstanceId;
            return this;
        }
        public Long getWorkflowTaskInstanceId() {
            return this.workflowTaskInstanceId;
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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of workflow instances.</p>
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
