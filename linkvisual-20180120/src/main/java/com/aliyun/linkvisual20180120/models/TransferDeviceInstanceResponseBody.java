// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TransferDeviceInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public TransferDeviceInstanceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static TransferDeviceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferDeviceInstanceResponseBody self = new TransferDeviceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferDeviceInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TransferDeviceInstanceResponseBody setData(TransferDeviceInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TransferDeviceInstanceResponseBodyData getData() {
        return this.data;
    }

    public TransferDeviceInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TransferDeviceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TransferDeviceInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TransferDeviceInstanceResponseBodyDataFailedList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Message")
        public String message;

        public static TransferDeviceInstanceResponseBodyDataFailedList build(java.util.Map<String, ?> map) throws Exception {
            TransferDeviceInstanceResponseBodyDataFailedList self = new TransferDeviceInstanceResponseBodyDataFailedList();
            return TeaModel.build(map, self);
        }

        public TransferDeviceInstanceResponseBodyDataFailedList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public TransferDeviceInstanceResponseBodyDataFailedList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class TransferDeviceInstanceResponseBodyDataSuccessList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("Message")
        public String message;

        public static TransferDeviceInstanceResponseBodyDataSuccessList build(java.util.Map<String, ?> map) throws Exception {
            TransferDeviceInstanceResponseBodyDataSuccessList self = new TransferDeviceInstanceResponseBodyDataSuccessList();
            return TeaModel.build(map, self);
        }

        public TransferDeviceInstanceResponseBodyDataSuccessList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public TransferDeviceInstanceResponseBodyDataSuccessList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class TransferDeviceInstanceResponseBodyData extends TeaModel {
        @NameInMap("FailedList")
        public java.util.List<TransferDeviceInstanceResponseBodyDataFailedList> failedList;

        @NameInMap("SuccessList")
        public java.util.List<TransferDeviceInstanceResponseBodyDataSuccessList> successList;

        public static TransferDeviceInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TransferDeviceInstanceResponseBodyData self = new TransferDeviceInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TransferDeviceInstanceResponseBodyData setFailedList(java.util.List<TransferDeviceInstanceResponseBodyDataFailedList> failedList) {
            this.failedList = failedList;
            return this;
        }
        public java.util.List<TransferDeviceInstanceResponseBodyDataFailedList> getFailedList() {
            return this.failedList;
        }

        public TransferDeviceInstanceResponseBodyData setSuccessList(java.util.List<TransferDeviceInstanceResponseBodyDataSuccessList> successList) {
            this.successList = successList;
            return this;
        }
        public java.util.List<TransferDeviceInstanceResponseBodyDataSuccessList> getSuccessList() {
            return this.successList;
        }

    }

}
