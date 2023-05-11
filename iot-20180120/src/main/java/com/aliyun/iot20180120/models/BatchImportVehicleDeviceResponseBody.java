// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportVehicleDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchImportVehicleDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchImportVehicleDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchImportVehicleDeviceResponseBody self = new BatchImportVehicleDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchImportVehicleDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchImportVehicleDeviceResponseBody setData(BatchImportVehicleDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchImportVehicleDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchImportVehicleDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchImportVehicleDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchImportVehicleDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList extends TeaModel {
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Manufacturer")
        public String manufacturer;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList self = new BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("InvalidDetailList")
        public java.util.List<BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidDetailList self = new BatchImportVehicleDeviceResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailList setInvalidDetailList(java.util.List<BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<BatchImportVehicleDeviceResponseBodyDataInvalidDetailListInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList extends TeaModel {
        @NameInMap("invalidDeviceIdList")
        public java.util.List<String> invalidDeviceIdList;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList self = new BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList setInvalidDeviceIdList(java.util.List<String> invalidDeviceIdList) {
            this.invalidDeviceIdList = invalidDeviceIdList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList extends TeaModel {
        @NameInMap("invalidDeviceModelList")
        public java.util.List<String> invalidDeviceModelList;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList self = new BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList setInvalidDeviceModelList(java.util.List<String> invalidDeviceModelList) {
            this.invalidDeviceModelList = invalidDeviceModelList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList extends TeaModel {
        @NameInMap("InvalidDeviceNameList")
        public java.util.List<String> invalidDeviceNameList;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList self = new BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList setInvalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList extends TeaModel {
        @NameInMap("invalidManufacturerList")
        public java.util.List<String> invalidManufacturerList;

        public static BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList self = new BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList setInvalidManufacturerList(java.util.List<String> invalidManufacturerList) {
            this.invalidManufacturerList = invalidManufacturerList;
            return this;
        }
        public java.util.List<String> getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList extends TeaModel {
        @NameInMap("repeatedDeviceIdList")
        public java.util.List<String> repeatedDeviceIdList;

        public static BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList self = new BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList setRepeatedDeviceIdList(java.util.List<String> repeatedDeviceIdList) {
            this.repeatedDeviceIdList = repeatedDeviceIdList;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList extends TeaModel {
        @NameInMap("RepeatedDeviceNameList")
        public java.util.List<String> repeatedDeviceNameList;

        public static BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList self = new BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList setRepeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

    public static class BatchImportVehicleDeviceResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        @NameInMap("InvalidDetailList")
        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailList invalidDetailList;

        @NameInMap("InvalidDeviceIdList")
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList invalidDeviceIdList;

        @NameInMap("InvalidDeviceModelList")
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList invalidDeviceModelList;

        @NameInMap("InvalidDeviceNameList")
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidManufacturerList")
        public BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList invalidManufacturerList;

        @NameInMap("RepeatedDeviceIdList")
        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList repeatedDeviceIdList;

        @NameInMap("RepeatedDeviceNameList")
        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList;

        public static BatchImportVehicleDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchImportVehicleDeviceResponseBodyData self = new BatchImportVehicleDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchImportVehicleDeviceResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public BatchImportVehicleDeviceResponseBodyData setInvalidDetailList(BatchImportVehicleDeviceResponseBodyDataInvalidDetailList invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public BatchImportVehicleDeviceResponseBodyData setInvalidDeviceIdList(BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList invalidDeviceIdList) {
            this.invalidDeviceIdList = invalidDeviceIdList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceIdList getInvalidDeviceIdList() {
            return this.invalidDeviceIdList;
        }

        public BatchImportVehicleDeviceResponseBodyData setInvalidDeviceModelList(BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList invalidDeviceModelList) {
            this.invalidDeviceModelList = invalidDeviceModelList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceModelList getInvalidDeviceModelList() {
            return this.invalidDeviceModelList;
        }

        public BatchImportVehicleDeviceResponseBodyData setInvalidDeviceNameList(BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataInvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public BatchImportVehicleDeviceResponseBodyData setInvalidManufacturerList(BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList invalidManufacturerList) {
            this.invalidManufacturerList = invalidManufacturerList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataInvalidManufacturerList getInvalidManufacturerList() {
            return this.invalidManufacturerList;
        }

        public BatchImportVehicleDeviceResponseBodyData setRepeatedDeviceIdList(BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList repeatedDeviceIdList) {
            this.repeatedDeviceIdList = repeatedDeviceIdList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceIdList getRepeatedDeviceIdList() {
            return this.repeatedDeviceIdList;
        }

        public BatchImportVehicleDeviceResponseBodyData setRepeatedDeviceNameList(BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public BatchImportVehicleDeviceResponseBodyDataRepeatedDeviceNameList getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

}
