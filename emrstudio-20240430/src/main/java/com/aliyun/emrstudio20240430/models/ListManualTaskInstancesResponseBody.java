// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListManualTaskInstancesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListManualTaskInstancesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>123abc***</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
         * <strong>example:</strong>
         * <p>c-b933c5aac7f7***</p>
         */
        @NameInMap("EmrClusterId")
        public String emrClusterId;

        /**
         * <strong>example:</strong>
         * <p>2024-03-27 00:00:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>application_123_***</p>
         */
        @NameInMap("ExternalAppId")
        public String externalAppId;

        /**
         * <strong>example:</strong>
         * <p>mti-3q9jo749ne5****</p>
         */
        @NameInMap("ManualTaskInstanceId")
        public String manualTaskInstanceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ManualTaskInstanceName")
        public String manualTaskInstanceName;

        /**
         * <strong>example:</strong>
         * <p>wg-3q9jo749ne5****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>2024-03-27 00:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2024-03-27 00:00:00</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;yarnUser&quot;: &quot;&quot;,
         *     &quot;conditionResult&quot;: &quot;null&quot;,
         *     &quot;rawScript&quot;: &quot;sleep 300&quot;,
         *     &quot;submitOnYarnFlag&quot;: false,
         *     &quot;emrClusterId&quot;: &quot;&quot;,
         *     &quot;yarnPriority&quot;: &quot;&quot;,
         *     &quot;dependence&quot;: &quot;null&quot;,
         *     &quot;yarnMemory&quot;: &quot;&quot;,
         *     &quot;localParams&quot;: [],
         *     &quot;switchResult&quot;: &quot;null&quot;,
         *     &quot;resourceList&quot;: [],
         *     &quot;yarnQueue&quot;: &quot;&quot;,
         *     &quot;yarnVCores&quot;: &quot;&quot;,
         *     &quot;associateManualTaskFlag&quot;: false
         * }</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <strong>example:</strong>
         * <p>SHELL</p>
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
