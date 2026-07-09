// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDeliveryTasksResponseBody extends TeaModel {
    /**
     * <p>The list of delivery tasks.</p>
     */
    @NameInMap("deliveryTasks")
    public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasks> deliveryTasks;

    /**
     * <p>The maximum number of entries returned. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>2-ba4d-4b9f-aa24-dcb067a30f1c</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7D7DF334-B2F2-5453-AD51-A27B337E3191</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDeliveryTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryTasksResponseBody self = new ListDeliveryTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeliveryTasksResponseBody setDeliveryTasks(java.util.List<ListDeliveryTasksResponseBodyDeliveryTasks> deliveryTasks) {
        this.deliveryTasks = deliveryTasks;
        return this;
    }
    public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasks> getDeliveryTasks() {
        return this.deliveryTasks;
    }

    public ListDeliveryTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDeliveryTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDeliveryTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeliveryTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo extends TeaModel {
        /**
         * <p>The list of EventBridge tasks.</p>
         */
        @NameInMap("taskNameList")
        public java.util.List<String> taskNameList;

        public static ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo self = new ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo();
            return TeaModel.build(map, self);
        }

        public ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo setTaskNameList(java.util.List<String> taskNameList) {
            this.taskNameList = taskNameList;
            return this;
        }
        public java.util.List<String> getTaskNameList() {
            return this.taskNameList;
        }

    }

    public static class ListDeliveryTasksResponseBodyDeliveryTasksSinkList extends TeaModel {
        /**
         * <p>The detailed configuration of the delivery target. The meanings of the key/value pairs vary depending on the sinkType.</p>
         */
        @NameInMap("sinkConfigs")
        public java.util.Map<String, String> sinkConfigs;

        /**
         * <p>The type of the delivery target.</p>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("sinkType")
        public String sinkType;

        public static ListDeliveryTasksResponseBodyDeliveryTasksSinkList build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryTasksResponseBodyDeliveryTasksSinkList self = new ListDeliveryTasksResponseBodyDeliveryTasksSinkList();
            return TeaModel.build(map, self);
        }

        public ListDeliveryTasksResponseBodyDeliveryTasksSinkList setSinkConfigs(java.util.Map<String, String> sinkConfigs) {
            this.sinkConfigs = sinkConfigs;
            return this;
        }
        public java.util.Map<String, String> getSinkConfigs() {
            return this.sinkConfigs;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasksSinkList setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

    }

    public static class ListDeliveryTasksResponseBodyDeliveryTasksTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("value")
        public String value;

        public static ListDeliveryTasksResponseBodyDeliveryTasksTags build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryTasksResponseBodyDeliveryTasksTags self = new ListDeliveryTasksResponseBodyDeliveryTasksTags();
            return TeaModel.build(map, self);
        }

        public ListDeliveryTasksResponseBodyDeliveryTasksTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasksTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDeliveryTasksResponseBodyDeliveryTasks extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-22T09:02:01Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The data source ID (Prometheus instance ID).</p>
         * 
         * <strong>example:</strong>
         * <p>rw-5f2b4c7e66342s</p>
         */
        @NameInMap("dataSourceId")
        public String dataSourceId;

        /**
         * <p>The additional labels attached to all delivered metrics. The key is the label name and the value is the label value.</p>
         */
        @NameInMap("externalLabels")
        public java.util.Map<String, String> externalLabels;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("extraInfo")
        public ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo extraInfo;

        /**
         * <p>The metric filter conditions. Used together with labelFiltersType. The key is the metric label name and the value is the match value.</p>
         */
        @NameInMap("labelFilters")
        public java.util.Map<String, String> labelFilters;

        /**
         * <p>The metric filtering mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("labelFiltersType")
        public String labelFiltersType;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3gn5i6bigbi</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The list of delivery targets. Multiple sinks can be configured.</p>
         */
        @NameInMap("sinkList")
        public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksSinkList> sinkList;

        /**
         * <p>The current status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksTags> tags;

        /**
         * <p>The task description.</p>
         * 
         * <strong>example:</strong>
         * <p>my delivery task</p>
         */
        @NameInMap("taskDescription")
        public String taskDescription;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>db21f8a126d96953</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-task</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>The time when the task was last updated.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-22T09:02:01Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDeliveryTasksResponseBodyDeliveryTasks build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryTasksResponseBodyDeliveryTasks self = new ListDeliveryTasksResponseBodyDeliveryTasks();
            return TeaModel.build(map, self);
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setExternalLabels(java.util.Map<String, String> externalLabels) {
            this.externalLabels = externalLabels;
            return this;
        }
        public java.util.Map<String, String> getExternalLabels() {
            return this.externalLabels;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setExtraInfo(ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public ListDeliveryTasksResponseBodyDeliveryTasksExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setLabelFilters(java.util.Map<String, String> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }
        public java.util.Map<String, String> getLabelFilters() {
            return this.labelFilters;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setLabelFiltersType(String labelFiltersType) {
            this.labelFiltersType = labelFiltersType;
            return this;
        }
        public String getLabelFiltersType() {
            return this.labelFiltersType;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setSinkList(java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksSinkList> sinkList) {
            this.sinkList = sinkList;
            return this;
        }
        public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksSinkList> getSinkList() {
            return this.sinkList;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setTags(java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDeliveryTasksResponseBodyDeliveryTasksTags> getTags() {
            return this.tags;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListDeliveryTasksResponseBodyDeliveryTasks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
