// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The update task information returned if the call is successful. For more information, see **SimpleOTATaskInfo**.</p>
     */
    @NameInMap("Data")
    public ListOTATaskByJobResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of update tasks.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOTATaskByJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobResponseBody self = new ListOTATaskByJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTATaskByJobResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTATaskByJobResponseBody setData(ListOTATaskByJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOTATaskByJobResponseBodyData getData() {
        return this.data;
    }

    public ListOTATaskByJobResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTATaskByJobResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTATaskByJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTATaskByJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTATaskByJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTATaskByJobResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo extends TeaModel {
        /**
         * <p>The version of the destination over-the-air (OTA) update package.</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The name of the device.</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the update package.</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The ID of the device.</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ID of the update batch.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the device belongs.</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The current update progress.</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The firmware version before the update.</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <p>The description of the update task. This parameter displays an error message if the device update times out or the update task is canceled.</p>
         */
        @NameInMap("TaskDesc")
        public String taskDesc;

        /**
         * <p>The ID of the update task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The update status of the device.</p>
         * <br>
         * <p>*   **CONFIRM**: The update task is pending confirmation.</p>
         * <p>*   **QUEUED**: The update notification is to be pushed.</p>
         * <p>*   **NOTIFIED**: The update notification is pushed to the device.</p>
         * <p>*   **IN_PROGRESS**: The update task is in progress.</p>
         * <p>*   **SUCCEEDED**: The update is successful.</p>
         * <p>*   **FAILED**: The update failed.</p>
         * <p>*   **CANCELED**: The update batch is canceled.</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The timeout period of the device update. Unit: minutes.</p>
         * <br>
         * <p>>  If no timeout period is specified for the update batch, the return value is null.</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <p>The time when the update task was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo self = new ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo();
            return TeaModel.build(map, self);
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setTaskDesc(String taskDesc) {
            this.taskDesc = taskDesc;
            return this;
        }
        public String getTaskDesc() {
            return this.taskDesc;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListOTATaskByJobResponseBodyData extends TeaModel {
        @NameInMap("SimpleOTATaskInfo")
        public java.util.List<ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo> simpleOTATaskInfo;

        public static ListOTATaskByJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTATaskByJobResponseBodyData self = new ListOTATaskByJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTATaskByJobResponseBodyData setSimpleOTATaskInfo(java.util.List<ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo> simpleOTATaskInfo) {
            this.simpleOTATaskInfo = simpleOTATaskInfo;
            return this;
        }
        public java.util.List<ListOTATaskByJobResponseBodyDataSimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

    }

}
