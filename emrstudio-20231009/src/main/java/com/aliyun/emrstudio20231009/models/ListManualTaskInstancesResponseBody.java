// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20231009.models;

import com.aliyun.tea.*;

public class ListManualTaskInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListManualTaskInstancesResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListManualTaskInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListManualTaskInstancesResponseBody self = new ListManualTaskInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListManualTaskInstancesResponseBody setData(java.util.List<ListManualTaskInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListManualTaskInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListManualTaskInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListManualTaskInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListManualTaskInstancesResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListManualTaskInstancesResponseBodyData extends TeaModel {
        /**
         * <p>EMR集群ID</p>
         */
        @NameInMap("EmrClusterId")
        public String emrClusterId;

        /**
         * <p>结束时间</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>外部应用ID</p>
         */
        @NameInMap("ExternalAppId")
        public String externalAppId;

        /**
         * <p>代表资源一级ID的资源属性字段</p>
         */
        @NameInMap("ManualTaskInstanceId")
        public String manualTaskInstanceId;

        /**
         * <p>代表资源名称的资源属性字段</p>
         */
        @NameInMap("ManualTaskInstanceName")
        public String manualTaskInstanceName;

        /**
         * <p>资源组ID</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>开始时间</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>状态</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>提交时间</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>任务参数</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>任务类型</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListManualTaskInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListManualTaskInstancesResponseBodyData self = new ListManualTaskInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListManualTaskInstancesResponseBodyData setEmrClusterId(String emrClusterId) {
            this.emrClusterId = emrClusterId;
            return this;
        }
        public String getEmrClusterId() {
            return this.emrClusterId;
        }

        public ListManualTaskInstancesResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListManualTaskInstancesResponseBodyData setExternalAppId(String externalAppId) {
            this.externalAppId = externalAppId;
            return this;
        }
        public String getExternalAppId() {
            return this.externalAppId;
        }

        public ListManualTaskInstancesResponseBodyData setManualTaskInstanceId(String manualTaskInstanceId) {
            this.manualTaskInstanceId = manualTaskInstanceId;
            return this;
        }
        public String getManualTaskInstanceId() {
            return this.manualTaskInstanceId;
        }

        public ListManualTaskInstancesResponseBodyData setManualTaskInstanceName(String manualTaskInstanceName) {
            this.manualTaskInstanceName = manualTaskInstanceName;
            return this;
        }
        public String getManualTaskInstanceName() {
            return this.manualTaskInstanceName;
        }

        public ListManualTaskInstancesResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListManualTaskInstancesResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListManualTaskInstancesResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListManualTaskInstancesResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListManualTaskInstancesResponseBodyData setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public ListManualTaskInstancesResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
