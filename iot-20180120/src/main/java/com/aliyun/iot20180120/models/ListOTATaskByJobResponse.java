// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("Data")
    @Validation(required = true)
    public ListOTATaskByJobResponseData data;

    public static ListOTATaskByJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobResponse self = new ListOTATaskByJobResponse();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTATaskByJobResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTATaskByJobResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTATaskByJobResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTATaskByJobResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTATaskByJobResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTATaskByJobResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTATaskByJobResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTATaskByJobResponse setData(ListOTATaskByJobResponseData data) {
        this.data = data;
        return this;
    }
    public ListOTATaskByJobResponseData getData() {
        return this.data;
    }

    public static class ListOTATaskByJobResponseDataSimpleOTATaskInfo extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("FirmwareId")
        @Validation(required = true)
        public String firmwareId;

        @NameInMap("TaskStatus")
        @Validation(required = true)
        public String taskStatus;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("SrcVersion")
        @Validation(required = true)
        public String srcVersion;

        @NameInMap("DestVersion")
        @Validation(required = true)
        public String destVersion;

        @NameInMap("TaskDesc")
        @Validation(required = true)
        public String taskDesc;

        @NameInMap("Progress")
        @Validation(required = true)
        public String progress;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        public static ListOTATaskByJobResponseDataSimpleOTATaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTATaskByJobResponseDataSimpleOTATaskInfo self = new ListOTATaskByJobResponseDataSimpleOTATaskInfo();
            return TeaModel.build(map, self);
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setTaskDesc(String taskDesc) {
            this.taskDesc = taskDesc;
            return this;
        }
        public String getTaskDesc() {
            return this.taskDesc;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTATaskByJobResponseDataSimpleOTATaskInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

    }

    public static class ListOTATaskByJobResponseData extends TeaModel {
        @NameInMap("SimpleOTATaskInfo")
        @Validation(required = true)
        public java.util.List<ListOTATaskByJobResponseDataSimpleOTATaskInfo> simpleOTATaskInfo;

        public static ListOTATaskByJobResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTATaskByJobResponseData self = new ListOTATaskByJobResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTATaskByJobResponseData setSimpleOTATaskInfo(java.util.List<ListOTATaskByJobResponseDataSimpleOTATaskInfo> simpleOTATaskInfo) {
            this.simpleOTATaskInfo = simpleOTATaskInfo;
            return this;
        }
        public java.util.List<ListOTATaskByJobResponseDataSimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

    }

}
