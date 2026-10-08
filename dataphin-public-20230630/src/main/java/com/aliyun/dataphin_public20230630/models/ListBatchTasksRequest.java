// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BatchTaskQuery")
    public ListBatchTasksRequestBatchTaskQuery batchTaskQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
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
        @NameInMap("ConditionScheduleEnable")
        public Boolean conditionScheduleEnable;

        /**
         * <strong>example:</strong>
         * <p>1785930337435</p>
         */
        @NameInMap("CreateBeginTime")
        public Long createBeginTime;

        /**
         * <strong>example:</strong>
         * <p>1788608737435</p>
         */
        @NameInMap("CreateEndTime")
        public Long createEndTime;

        @NameInMap("DevelopOwnerList")
        public java.util.List<String> developOwnerList;

        @NameInMap("DirectoryList")
        public java.util.List<String> directoryList;

        @NameInMap("IncludeSubDirectory")
        public Boolean includeSubDirectory;

        /**
         * <strong>example:</strong>
         * <p>dwd_order</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("LastSubmitStatusList")
        public java.util.List<String> lastSubmitStatusList;

        @NameInMap("LockUserList")
        public java.util.List<String> lockUserList;

        /**
         * <strong>example:</strong>
         * <p>1785930337435</p>
         */
        @NameInMap("ModifiedBeginTime")
        public Long modifiedBeginTime;

        /**
         * <strong>example:</strong>
         * <p>1788608737435</p>
         */
        @NameInMap("ModifiedEndTime")
        public Long modifiedEndTime;

        @NameInMap("NodeStatusList")
        public java.util.List<Integer> nodeStatusList;

        @NameInMap("OpsOwnerList")
        public java.util.List<String> opsOwnerList;

        @NameInMap("OutputTableNameList")
        public java.util.List<String> outputTableNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7086194564164288</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Published")
        public Boolean published;

        /**
         * <strong>example:</strong>
         * <p>7305621095333696</p>
         */
        @NameInMap("RefCodeTemplateId")
        public String refCodeTemplateId;

        @NameInMap("ScheduleIntervalTypeList")
        public java.util.List<String> scheduleIntervalTypeList;

        @NameInMap("TaskStatusList")
        public java.util.List<Integer> taskStatusList;

        @NameInMap("TaskTagList")
        public java.util.List<String> taskTagList;

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
