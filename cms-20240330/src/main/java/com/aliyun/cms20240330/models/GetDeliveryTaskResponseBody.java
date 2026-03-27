// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetDeliveryTaskResponseBody extends TeaModel {
    @NameInMap("deliveryTask")
    public GetDeliveryTaskResponseBodyDeliveryTask deliveryTask;

    /**
     * <strong>example:</strong>
     * <p>0CEC5375-C554-562B-A65F-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryTaskResponseBody self = new GetDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeliveryTaskResponseBody setDeliveryTask(GetDeliveryTaskResponseBodyDeliveryTask deliveryTask) {
        this.deliveryTask = deliveryTask;
        return this;
    }
    public GetDeliveryTaskResponseBodyDeliveryTask getDeliveryTask() {
        return this.deliveryTask;
    }

    public GetDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo extends TeaModel {
        @NameInMap("taskNameList")
        public java.util.List<String> taskNameList;

        public static GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo self = new GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo setTaskNameList(java.util.List<String> taskNameList) {
            this.taskNameList = taskNameList;
            return this;
        }
        public java.util.List<String> getTaskNameList() {
            return this.taskNameList;
        }

    }

    public static class GetDeliveryTaskResponseBodyDeliveryTaskSinkList extends TeaModel {
        @NameInMap("sinkConfigs")
        public java.util.Map<String, String> sinkConfigs;

        /**
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        @NameInMap("sinkType")
        public String sinkType;

        public static GetDeliveryTaskResponseBodyDeliveryTaskSinkList build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTaskResponseBodyDeliveryTaskSinkList self = new GetDeliveryTaskResponseBodyDeliveryTaskSinkList();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTaskResponseBodyDeliveryTaskSinkList setSinkConfigs(java.util.Map<String, String> sinkConfigs) {
            this.sinkConfigs = sinkConfigs;
            return this;
        }
        public java.util.Map<String, String> getSinkConfigs() {
            return this.sinkConfigs;
        }

        public GetDeliveryTaskResponseBodyDeliveryTaskSinkList setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

    }

    public static class GetDeliveryTaskResponseBodyDeliveryTaskTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sourcetype</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("value")
        public String value;

        public static GetDeliveryTaskResponseBodyDeliveryTaskTags build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTaskResponseBodyDeliveryTaskTags self = new GetDeliveryTaskResponseBodyDeliveryTaskTags();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTaskResponseBodyDeliveryTaskTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetDeliveryTaskResponseBodyDeliveryTaskTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetDeliveryTaskResponseBodyDeliveryTask extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-24T02:08:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>rw-xxxxxx</p>
         */
        @NameInMap("dataSourceId")
        public String dataSourceId;

        @NameInMap("externalLabels")
        public java.util.Map<String, String> externalLabels;

        @NameInMap("extraInfo")
        public GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo extraInfo;

        @NameInMap("labelFilters")
        public java.util.Map<String, String> labelFilters;

        /**
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        @NameInMap("labelFiltersType")
        public String labelFiltersType;

        /**
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("regionId")
        public String regionId;

        @NameInMap("sinkList")
        public java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskSinkList> sinkList;

        /**
         * <strong>example:</strong>
         * <p>Pending2Running</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("tags")
        public java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskTags> tags;

        /**
         * <strong>example:</strong>
         * <p>my delivery task</p>
         */
        @NameInMap("taskDescription")
        public String taskDescription;

        /**
         * <strong>example:</strong>
         * <p>8b07eeac8249866d</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>test-task</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-22T11:50:48Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static GetDeliveryTaskResponseBodyDeliveryTask build(java.util.Map<String, ?> map) throws Exception {
            GetDeliveryTaskResponseBodyDeliveryTask self = new GetDeliveryTaskResponseBodyDeliveryTask();
            return TeaModel.build(map, self);
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setExternalLabels(java.util.Map<String, String> externalLabels) {
            this.externalLabels = externalLabels;
            return this;
        }
        public java.util.Map<String, String> getExternalLabels() {
            return this.externalLabels;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setExtraInfo(GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public GetDeliveryTaskResponseBodyDeliveryTaskExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setLabelFilters(java.util.Map<String, String> labelFilters) {
            this.labelFilters = labelFilters;
            return this;
        }
        public java.util.Map<String, String> getLabelFilters() {
            return this.labelFilters;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setLabelFiltersType(String labelFiltersType) {
            this.labelFiltersType = labelFiltersType;
            return this;
        }
        public String getLabelFiltersType() {
            return this.labelFiltersType;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setSinkList(java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskSinkList> sinkList) {
            this.sinkList = sinkList;
            return this;
        }
        public java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskSinkList> getSinkList() {
            return this.sinkList;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setTags(java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetDeliveryTaskResponseBodyDeliveryTaskTags> getTags() {
            return this.tags;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public GetDeliveryTaskResponseBodyDeliveryTask setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
