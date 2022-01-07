// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceDriverResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DeviceDriverList")
    public java.util.List<BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList> deviceDriverList;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchGetEdgeInstanceDeviceDriverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceDriverResponseBody self = new BatchGetEdgeInstanceDeviceDriverResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceDriverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceDriverResponseBody setDeviceDriverList(java.util.List<BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList> deviceDriverList) {
        this.deviceDriverList = deviceDriverList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList> getDeviceDriverList() {
        return this.deviceDriverList;
    }

    public BatchGetEdgeInstanceDeviceDriverResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceDriverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceDriverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList extends TeaModel {
        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("IotId")
        public String iotId;

        public static BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList self = new BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public BatchGetEdgeInstanceDeviceDriverResponseBodyDeviceDriverList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
