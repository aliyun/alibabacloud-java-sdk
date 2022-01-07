// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListOTATaskByJobResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("DestVersion")
        public String destVersion;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("FirmwareId")
        public String firmwareId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SrcVersion")
        public String srcVersion;

        @NameInMap("TaskDesc")
        public String taskDesc;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("UtcCreate")
        public String utcCreate;

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
