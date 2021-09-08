// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceDriverResponse extends TeaModel {
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

    @NameInMap("DeviceDriverList")
    @Validation(required = true)
    public java.util.List<BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList> deviceDriverList;

    public static BatchGetEdgeInstanceDeviceDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceDriverResponse self = new BatchGetEdgeInstanceDeviceDriverResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setDeviceDriverList(java.util.List<BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList> deviceDriverList) {
        this.deviceDriverList = deviceDriverList;
        return this;
    }
    public java.util.List<BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList> getDeviceDriverList() {
        return this.deviceDriverList;
    }

    public static class BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        public static BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList self = new BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public BatchGetEdgeInstanceDeviceDriverResponseDeviceDriverList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

}
