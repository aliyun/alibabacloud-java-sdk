// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAUnfinishedTaskByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The update task information returned if the call is successful. For more information, see the following <strong>SimpleOTATaskInfo</strong>.</p>
     */
    @NameInMap("Data")
    public ListOTAUnfinishedTaskByDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

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
        /**
         * <p>The firmware version after the update.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.1</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>light</p>
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
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
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
         * <p>The name of the OTA module.</p>
         * 
         * <strong>example:</strong>
         * <p>WifiConfigModify</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

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
         * <p>The firmware version before the update.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <p>The ID of the update task.</p>
         * 
         * <strong>example:</strong>
         * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The status of the update task.</p>
         * <ul>
         * <li><strong>CONFIRM</strong>: The update task is pending confirmation.</li>
         * <li><strong>QUEUED</strong>: The update notification is to be pushed.</li>
         * <li><strong>NOTIFIED</strong>: The update notification is pushed to the device.</li>
         * <li><strong>IN_PROGRESS</strong>: The update task is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONFIRM</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

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
         * <p>2021-11-04T03:38:22.000Z</p>
         */
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
