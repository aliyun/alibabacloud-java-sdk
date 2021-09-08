// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public ListOTAUnfinishedTaskByDeviceResponseData data;

    public static ListOTAUnfinishedTaskByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAUnfinishedTaskByDeviceResponse self = new ListOTAUnfinishedTaskByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAUnfinishedTaskByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAUnfinishedTaskByDeviceResponse setData(ListOTAUnfinishedTaskByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public ListOTAUnfinishedTaskByDeviceResponseData getData() {
        return this.data;
    }

    public static class ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

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

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        @NameInMap("FirmwareId")
        @Validation(required = true)
        public String firmwareId;

        public static ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo self = new ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

    }

    public static class ListOTAUnfinishedTaskByDeviceResponseData extends TeaModel {
        @NameInMap("SimpleOTATaskInfo")
        @Validation(required = true)
        public java.util.List<ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo> simpleOTATaskInfo;

        public static ListOTAUnfinishedTaskByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAUnfinishedTaskByDeviceResponseData self = new ListOTAUnfinishedTaskByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTAUnfinishedTaskByDeviceResponseData setSimpleOTATaskInfo(java.util.List<ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo> simpleOTATaskInfo) {
            this.simpleOTATaskInfo = simpleOTATaskInfo;
            return this;
        }
        public java.util.List<ListOTAUnfinishedTaskByDeviceResponseDataSimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

    }

}
