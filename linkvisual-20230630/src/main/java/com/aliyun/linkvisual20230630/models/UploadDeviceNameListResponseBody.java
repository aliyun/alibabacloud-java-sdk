// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class UploadDeviceNameListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UploadDeviceNameListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UploadDeviceNameListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceNameListResponseBody self = new UploadDeviceNameListResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadDeviceNameListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UploadDeviceNameListResponseBody setData(UploadDeviceNameListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UploadDeviceNameListResponseBodyData getData() {
        return this.data;
    }

    public UploadDeviceNameListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UploadDeviceNameListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadDeviceNameListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UploadDeviceNameListResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static UploadDeviceNameListResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            UploadDeviceNameListResponseBodyDataInvalidDetailList self = new UploadDeviceNameListResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public UploadDeviceNameListResponseBodyDataInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public UploadDeviceNameListResponseBodyDataInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class UploadDeviceNameListResponseBodyData extends TeaModel {
        @NameInMap("BatchId")
        public String batchId;

        @NameInMap("InvalidDetailList")
        public java.util.List<UploadDeviceNameListResponseBodyDataInvalidDetailList> invalidDetailList;

        @NameInMap("InvalidDeviceNameList")
        public java.util.List<String> invalidDeviceNameList;

        @NameInMap("RepeatedDeviceNameList")
        public java.util.List<String> repeatedDeviceNameList;

        public static UploadDeviceNameListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UploadDeviceNameListResponseBodyData self = new UploadDeviceNameListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UploadDeviceNameListResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public UploadDeviceNameListResponseBodyData setInvalidDetailList(java.util.List<UploadDeviceNameListResponseBodyDataInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<UploadDeviceNameListResponseBodyDataInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public UploadDeviceNameListResponseBodyData setInvalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public UploadDeviceNameListResponseBodyData setRepeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

}
