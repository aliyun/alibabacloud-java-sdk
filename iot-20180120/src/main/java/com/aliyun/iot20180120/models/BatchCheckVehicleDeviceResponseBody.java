// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchCheckVehicleDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCheckVehicleDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckVehicleDeviceResponseBody self = new BatchCheckVehicleDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckVehicleDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCheckVehicleDeviceResponseBody setData(BatchCheckVehicleDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCheckVehicleDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchCheckVehicleDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCheckVehicleDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckVehicleDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCheckVehicleDeviceResponseBodyData extends TeaModel {
        @NameInMap("InvalidDeviceIdList")
        public java.util.List<String> invalidDeviceIdList;

        @NameInMap("InvalidDeviceModelList")
        public java.util.List<String> invalidDeviceModelList;

        @NameInMap("InvalidManufacturerList")
        public java.util.List<String> invalidManufacturerList;

        @NameInMap("RepeatedDeviceIdList")
        public java.util.List<String> repeatedDeviceIdList;

        public static BatchCheckVehicleDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckVehicleDeviceResponseBodyData self = new BatchCheckVehicleDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCheckVehicleDeviceResponseBodyData setInvalidDeviceIdList(java.util.List<String> invalidDeviceIdList) {
            this.invalidDeviceIdList = invalidDeviceIdList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        public BatchCheckVehicleDeviceResponseBodyData setInvalidDeviceModelList(java.util.List<String> invalidDeviceModelList) {
            this.invalidDeviceModelList = invalidDeviceModelList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        public BatchCheckVehicleDeviceResponseBodyData setInvalidManufacturerList(java.util.List<String> invalidManufacturerList) {
            this.invalidManufacturerList = invalidManufacturerList;
            return this;
        }
        public java.util.List<String> getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        public BatchCheckVehicleDeviceResponseBodyData setRepeatedDeviceIdList(java.util.List<String> repeatedDeviceIdList) {
            this.repeatedDeviceIdList = repeatedDeviceIdList;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

    }

}
