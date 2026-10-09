// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListWorkflowsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. You can use the ID to locate logs and troubleshoot issues.</p>
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
         * <p>The cron expression. This parameter takes effect only when Type is set to Scheduler.</p>
         * 
         * <strong>example:</strong>
         * <p>00 00 00 * * ?</p>
         */
        @NameInMap("Cron")
        public String cron;

        /**
         * <p>The expiration time of the periodic trigger. This parameter takes effect only when Type is set to Scheduler.</p>
         * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>9999-01-01 00:00:00</code>. The example does not include a time zone identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The running mode upon triggering. This parameter takes effect only when Type is set to Scheduler. Valid values:</p>
         * <ul>
         * <li>Pause: Paused.</li>
         * <li>Skip: Dry run.</li>
         * <li>Normal: Normal execution.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Recurrence")
        public String recurrence;

        /**
         * <p>The effective period of the epoch trigger. This parameter takes effect only when Type is set to Scheduler.</p>
         * <p>The format is <code>yyyy-MM-dd HH:mm:ss</code>, such as <code>1970-01-01 00:00:00</code>. The example does not include a time zone identity.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The trigger type. Valid values:</p>
         * <ul>
         * <li>Scheduler: Triggered by a scheduling cycle.</li>
         * <li>Manual: Triggered manually.</li>
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
         * <p>The client unique code of the workflow, which is used to implement asynchronous processing and idempotence. If you do not specify this parameter when creating a workflow, the system automatically generates one and uniquely binds it to the resource ID. If you specify this parameter when updating or deleting a resource, it must be the same as the client unique code used during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>Workflow_0bc5213917368545132902xxxxxxxx</p>
         */
        @NameInMap("ClientUniqueCode")
        public String clientUniqueCode;

        /**
         * <p>The creation time.</p>
         * <p>The value is a 13-digit timestamp, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The account ID of the user who created the workflow.</p>
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
         * <p>The project environment.</p>
         * 
         * <strong>example:</strong>
         * <p>Prod</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The unique identifier of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The modification time.</p>
         * <p>The value is a 13-digit timestamp, such as <code>1710239005403</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The account ID of the user who last modified the workflow.</p>
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
         * <p>The list of parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>para1=$bizdate para2=$[yyyymmdd]</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The node tags.</p>
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
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of workflows.</p>
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
