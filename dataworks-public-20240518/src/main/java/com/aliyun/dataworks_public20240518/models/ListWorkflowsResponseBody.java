// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    /**
     * <p>Pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListWorkflowsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>22C97E95-F023-56B5-8852-B1A77A17XXXX</p>
     */
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

    public static class ListWorkflowsResponseBodyPagingInfoWorkflowsTags extends TeaModel {
        /**
         * <p>The key of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListWorkflowsResponseBodyPagingInfoWorkflowsTags build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyPagingInfoWorkflowsTags self = new ListWorkflowsResponseBodyPagingInfoWorkflowsTags();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListWorkflowsResponseBodyPagingInfoWorkflowsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListWorkflowsResponseBodyPagingInfoWorkflowsTrigger extends TeaModel {
        /**
         * <p>The CRON expression. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The end time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode of the workflow after it is triggered. This parameter takes effect only if the Type parameter is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause</li>
         * <li>Skip</li>
         * <li>Normal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The start time of the time range during which the workflow is periodically scheduled. This parameter takes effect only if the Type parameter is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: scheduling cycle-based trigger</li>
         * <li>Manual: manual trigger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduler</p>
         */
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
        /**
         * <p>The unique code of the client. This parameter is used to create a workflow asynchronously and implement the idempotence of the workflow. If you do not specify this parameter when you create the workflow, the system automatically generates a unique code. The unique code is uniquely associated with the workflow ID. If you specify this parameter when you update or delete the workflow, the value of this parameter must be the unique code that is used to create the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

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
         * <p>1000</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>The workflow ID.</p>
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
         * <p>1000</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The account ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate para2=$[yyyymmdd]</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The task tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflowsTags> tags;

        /**
         * <p>The trigger method.</p>
         */
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

        public ListWorkflowsResponseBodyPagingInfoWorkflows setTags(java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflowsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListWorkflowsResponseBodyPagingInfoWorkflowsTags> getTags() {
            return this.tags;
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
         * <p>The workflows.</p>
         */
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
