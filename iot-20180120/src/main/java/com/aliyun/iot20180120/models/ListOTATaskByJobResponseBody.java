// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The update task information returned if the call is successful. For more information, see <strong>SimpleOTATaskInfo</strong>.</p>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A59D3BE1-E9A3-43F3-9B50-B7C8DE165D9B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of update tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The name of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>testDevice2</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the update package.</p>
         * 
         * <strong>example:</strong>
         * <p>q3j9OYBjUAZMv1hlMgdo03****</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>nadRdeffljdEndlfadgadfse****</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The ID of the update batch.</p>
         * 
         * <strong>example:</strong>
         * <p>7glPHmaDYLAYMD1HHutT02****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1GUfrM****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProduct</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The current update progress.</p>
         * 
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The firmware version before the update.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <p>The description of the update task. This parameter displays an error message if the device update times out or the update task is canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>report version is not conform</p>
         */
        @NameInMap("TaskDesc")
        public String taskDesc;

        /**
         * <p>The ID of the update task.</p>
         * 
         * <strong>example:</strong>
         * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The update status of the device.</p>
         * <ul>
         * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
         * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
         * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
         * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
         * <li><strong>SUCCEEDED</strong>: The update is successful.</li>
         * <li><strong>FAILED</strong>: The update failed.</li>
         * <li><strong>CANCELED</strong>: The update batch is canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The timeout period of the device update. Unit: minutes.</p>
         * <blockquote>
         * <p> If no timeout period is specified for the update batch, the return value is null.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1440</p>
         */
        @NameInMap("Timeout")
        public String timeout;

        /**
         * <p>The time when the update task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-04T03:38:22.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-04T03:38:22.000Z</p>
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
