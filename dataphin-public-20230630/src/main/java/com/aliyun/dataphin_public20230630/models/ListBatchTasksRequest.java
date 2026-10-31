// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTasksRequest extends TeaModel {
    /**
     * <p>The task query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchTaskQuery")
    public ListBatchTasksRequestBatchTaskQuery batchTaskQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the user who performs the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListBatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksRequest self = new ListBatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksRequest setBatchTaskQuery(ListBatchTasksRequestBatchTaskQuery batchTaskQuery) {
        this.batchTaskQuery = batchTaskQuery;
        return this;
    }
    public ListBatchTasksRequestBatchTaskQuery getBatchTaskQuery() {
        return this.batchTaskQuery;
    }

    public ListBatchTasksRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListBatchTasksRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListBatchTasksRequestBatchTaskQuery extends TeaModel {
        /**
         * <p>Specifies whether to enable conditional scheduling. If not specified, no filtering is applied.</p>
         */
        @NameInMap("ConditionScheduleEnable")
        public Boolean conditionScheduleEnable;

        /**
         * <p>The start time of the creation time range, in milliseconds. Must be specified together with CreateEndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1785930337435</p>
         */
        @NameInMap("CreateBeginTime")
        public Long createBeginTime;

        /**
         * <p>The end time of the creation time range, in milliseconds. Must be specified together with CreateBeginTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1788608737435</p>
         */
        @NameInMap("CreateEndTime")
        public Long createEndTime;

        /**
         * <p>The list of developer IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("DevelopOwnerList")
        public java.util.List<String> developOwnerList;

        /**
         * <p>The list of task directories, such as [&quot;/&quot;]. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("DirectoryList")
        public java.util.List<String> directoryList;

        /**
         * <p>Specifies whether to include tasks in the subdirectories of the directories specified in DirectoryList. Default value: false.</p>
         */
        @NameInMap("IncludeSubDirectory")
        public Boolean includeSubDirectory;

        /**
         * <p>The search keyword for fuzzy matching by task name or node ID. If empty or not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_order</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The list of recent submit statuses. Valid values: SUBMITTING, SUCCESS, FAILED, and WARNING. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("LastSubmitStatusList")
        public java.util.List<String> lastSubmitStatusList;

        /**
         * <p>The list of locker IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering by locker is applied.</p>
         */
        @NameInMap("LockUserList")
        public java.util.List<String> lockUserList;

        /**
         * <p>The start time of the last modification time range, in milliseconds. Must be specified together with ModifiedEndTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1785930337435</p>
         */
        @NameInMap("ModifiedBeginTime")
        public Long modifiedBeginTime;

        /**
         * <p>The end time of the last modification time range, in milliseconds. Must be specified together with ModifiedBeginTime.</p>
         * 
         * <strong>example:</strong>
         * <p>1788608737435</p>
         */
        @NameInMap("ModifiedEndTime")
        public Long modifiedEndTime;

        /**
         * <p>The list of scheduling types. Valid values: 0 (Manual), 1 (Normal), 2 (Paused), and 3 (Dry run). If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("NodeStatusList")
        public java.util.List<Integer> nodeStatusList;

        /**
         * <p>The list of O&amp;M owner IDs. If multiple IDs are specified, the union is used. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("OpsOwnerList")
        public java.util.List<String> opsOwnerList;

        /**
         * <p>The list of output table names for exact matching. If multiple table names are specified, the OR logical operator is used. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("OutputTableNameList")
        public java.util.List<String> outputTableNameList;

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The project ID. The query scope is limited to this project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>Specifies whether the task is published to the production environment. If not specified, no filtering is applied.</p>
         */
        @NameInMap("Published")
        public Boolean published;

        /**
         * <p>The ID of the referenced offline code template. If empty or not specified, no filtering is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>7305621095333696</p>
         */
        @NameInMap("RefCodeTemplateId")
        public String refCodeTemplateId;

        /**
         * <p>The list of scheduling intervals. Valid values: MINUTELY, HOURLY, DAILY, WEEKLY, and MONTHLY. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("ScheduleIntervalTypeList")
        public java.util.List<String> scheduleIntervalTypeList;

        /**
         * <p>The list of task statuses. Valid values: 0 (Draft), 1 (Submitting), 2 (Submitted), and 100 (In development). If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("TaskStatusList")
        public java.util.List<Integer> taskStatusList;

        /**
         * <p>The list of task tag names. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("TaskTagList")
        public java.util.List<String> taskTagList;

        /**
         * <p>The list of task type codes. If empty or not specified, no filtering is applied.</p>
         */
        @NameInMap("TaskTypeList")
        public java.util.List<Integer> taskTypeList;

        public static ListBatchTasksRequestBatchTaskQuery build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTasksRequestBatchTaskQuery self = new ListBatchTasksRequestBatchTaskQuery();
            return TeaModel.build(map, self);
        }

        public ListBatchTasksRequestBatchTaskQuery setConditionScheduleEnable(Boolean conditionScheduleEnable) {
            this.conditionScheduleEnable = conditionScheduleEnable;
            return this;
        }
        public Boolean getConditionScheduleEnable() {
            return this.conditionScheduleEnable;
        }

        public ListBatchTasksRequestBatchTaskQuery setCreateBeginTime(Long createBeginTime) {
            this.createBeginTime = createBeginTime;
            return this;
        }
        public Long getCreateBeginTime() {
            return this.createBeginTime;
        }

        public ListBatchTasksRequestBatchTaskQuery setCreateEndTime(Long createEndTime) {
            this.createEndTime = createEndTime;
            return this;
        }
        public Long getCreateEndTime() {
            return this.createEndTime;
        }

        public ListBatchTasksRequestBatchTaskQuery setDevelopOwnerList(java.util.List<String> developOwnerList) {
            this.developOwnerList = developOwnerList;
            return this;
        }
        public java.util.List<String> getDevelopOwnerList() {
            return this.developOwnerList;
        }

        public ListBatchTasksRequestBatchTaskQuery setDirectoryList(java.util.List<String> directoryList) {
            this.directoryList = directoryList;
            return this;
        }
        public java.util.List<String> getDirectoryList() {
            return this.directoryList;
        }

        public ListBatchTasksRequestBatchTaskQuery setIncludeSubDirectory(Boolean includeSubDirectory) {
            this.includeSubDirectory = includeSubDirectory;
            return this;
        }
        public Boolean getIncludeSubDirectory() {
            return this.includeSubDirectory;
        }

        public ListBatchTasksRequestBatchTaskQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListBatchTasksRequestBatchTaskQuery setLastSubmitStatusList(java.util.List<String> lastSubmitStatusList) {
            this.lastSubmitStatusList = lastSubmitStatusList;
            return this;
        }
        public java.util.List<String> getLastSubmitStatusList() {
            return this.lastSubmitStatusList;
        }

        public ListBatchTasksRequestBatchTaskQuery setLockUserList(java.util.List<String> lockUserList) {
            this.lockUserList = lockUserList;
            return this;
        }
        public java.util.List<String> getLockUserList() {
            return this.lockUserList;
        }

        public ListBatchTasksRequestBatchTaskQuery setModifiedBeginTime(Long modifiedBeginTime) {
            this.modifiedBeginTime = modifiedBeginTime;
            return this;
        }
        public Long getModifiedBeginTime() {
            return this.modifiedBeginTime;
        }

        public ListBatchTasksRequestBatchTaskQuery setModifiedEndTime(Long modifiedEndTime) {
            this.modifiedEndTime = modifiedEndTime;
            return this;
        }
        public Long getModifiedEndTime() {
            return this.modifiedEndTime;
        }

        public ListBatchTasksRequestBatchTaskQuery setNodeStatusList(java.util.List<Integer> nodeStatusList) {
            this.nodeStatusList = nodeStatusList;
            return this;
        }
        public java.util.List<Integer> getNodeStatusList() {
            return this.nodeStatusList;
        }

        public ListBatchTasksRequestBatchTaskQuery setOpsOwnerList(java.util.List<String> opsOwnerList) {
            this.opsOwnerList = opsOwnerList;
            return this;
        }
        public java.util.List<String> getOpsOwnerList() {
            return this.opsOwnerList;
        }

        public ListBatchTasksRequestBatchTaskQuery setOutputTableNameList(java.util.List<String> outputTableNameList) {
            this.outputTableNameList = outputTableNameList;
            return this;
        }
        public java.util.List<String> getOutputTableNameList() {
            return this.outputTableNameList;
        }

        public ListBatchTasksRequestBatchTaskQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListBatchTasksRequestBatchTaskQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBatchTasksRequestBatchTaskQuery setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBatchTasksRequestBatchTaskQuery setPublished(Boolean published) {
            this.published = published;
            return this;
        }
        public Boolean getPublished() {
            return this.published;
        }

        public ListBatchTasksRequestBatchTaskQuery setRefCodeTemplateId(String refCodeTemplateId) {
            this.refCodeTemplateId = refCodeTemplateId;
            return this;
        }
        public String getRefCodeTemplateId() {
            return this.refCodeTemplateId;
        }

        public ListBatchTasksRequestBatchTaskQuery setScheduleIntervalTypeList(java.util.List<String> scheduleIntervalTypeList) {
            this.scheduleIntervalTypeList = scheduleIntervalTypeList;
            return this;
        }
        public java.util.List<String> getScheduleIntervalTypeList() {
            return this.scheduleIntervalTypeList;
        }

        public ListBatchTasksRequestBatchTaskQuery setTaskStatusList(java.util.List<Integer> taskStatusList) {
            this.taskStatusList = taskStatusList;
            return this;
        }
        public java.util.List<Integer> getTaskStatusList() {
            return this.taskStatusList;
        }

        public ListBatchTasksRequestBatchTaskQuery setTaskTagList(java.util.List<String> taskTagList) {
            this.taskTagList = taskTagList;
            return this;
        }
        public java.util.List<String> getTaskTagList() {
            return this.taskTagList;
        }

        public ListBatchTasksRequestBatchTaskQuery setTaskTypeList(java.util.List<Integer> taskTypeList) {
            this.taskTypeList = taskTypeList;
            return this;
        }
        public java.util.List<Integer> getTaskTypeList() {
            return this.taskTypeList;
        }

    }

}
