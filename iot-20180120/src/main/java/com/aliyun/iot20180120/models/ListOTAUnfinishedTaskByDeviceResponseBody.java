// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListOTAUnfinishedTaskByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOTAUnfinishedTaskByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAUnfinishedTaskByDeviceResponseBody self = new ListOTAUnfinishedTaskByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAUnfinishedTaskByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAUnfinishedTaskByDeviceResponseBody setData(ListOTAUnfinishedTaskByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOTAUnfinishedTaskByDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListOTAUnfinishedTaskByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAUnfinishedTaskByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAUnfinishedTaskByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo extends TeaModel {
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

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("SrcVersion")
        public String srcVersion;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo self = new ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListOTAUnfinishedTaskByDeviceResponseBodyData extends TeaModel {
        @NameInMap("SimpleOTATaskInfo")
        public java.util.List<ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo> simpleOTATaskInfo;

        public static ListOTAUnfinishedTaskByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAUnfinishedTaskByDeviceResponseBodyData self = new ListOTAUnfinishedTaskByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTAUnfinishedTaskByDeviceResponseBodyData setSimpleOTATaskInfo(java.util.List<ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo> simpleOTATaskInfo) {
            this.simpleOTATaskInfo = simpleOTATaskInfo;
            return this;
        }
        public java.util.List<ListOTAUnfinishedTaskByDeviceResponseBodyDataSimpleOTATaskInfo> getSimpleOTATaskInfo() {
            return this.simpleOTATaskInfo;
        }

    }

}
