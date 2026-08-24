// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskStatusesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<ListVirusScanTaskStatusesResponseBodyTasks> tasks;

    public static ListVirusScanTaskStatusesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskStatusesResponseBody self = new ListVirusScanTaskStatusesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskStatusesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusScanTaskStatusesResponseBody setTasks(java.util.List<ListVirusScanTaskStatusesResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListVirusScanTaskStatusesResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListVirusScanTaskStatusesResponseBodyTasksTaskStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DeviceAckCount")
        public Integer deviceAckCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DeviceResultFailCount")
        public Integer deviceResultFailCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DeviceResultSuccessCount")
        public Integer deviceResultSuccessCount;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DeviceStartCount")
        public Integer deviceStartCount;

        public static ListVirusScanTaskStatusesResponseBodyTasksTaskStatus build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTaskStatusesResponseBodyTasksTaskStatus self = new ListVirusScanTaskStatusesResponseBodyTasksTaskStatus();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus setDeviceAckCount(Integer deviceAckCount) {
            this.deviceAckCount = deviceAckCount;
            return this;
        }
        public Integer getDeviceAckCount() {
            return this.deviceAckCount;
        }

        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus setDeviceResultFailCount(Integer deviceResultFailCount) {
            this.deviceResultFailCount = deviceResultFailCount;
            return this;
        }
        public Integer getDeviceResultFailCount() {
            return this.deviceResultFailCount;
        }

        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus setDeviceResultSuccessCount(Integer deviceResultSuccessCount) {
            this.deviceResultSuccessCount = deviceResultSuccessCount;
            return this;
        }
        public Integer getDeviceResultSuccessCount() {
            return this.deviceResultSuccessCount;
        }

        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus setDeviceStartCount(Integer deviceStartCount) {
            this.deviceStartCount = deviceStartCount;
            return this;
        }
        public Integer getDeviceStartCount() {
            return this.deviceStartCount;
        }

    }

    public static class ListVirusScanTaskStatusesResponseBodyTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>v1:1024772</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus taskStatus;

        public static ListVirusScanTaskStatusesResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTaskStatusesResponseBodyTasks self = new ListVirusScanTaskStatusesResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTaskStatusesResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVirusScanTaskStatusesResponseBodyTasks setTaskStatus(ListVirusScanTaskStatusesResponseBodyTasksTaskStatus taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public ListVirusScanTaskStatusesResponseBodyTasksTaskStatus getTaskStatus() {
            return this.taskStatus;
        }

    }

}
