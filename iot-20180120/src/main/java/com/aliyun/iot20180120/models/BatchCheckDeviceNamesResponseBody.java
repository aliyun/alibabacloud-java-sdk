// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchCheckDeviceNamesResponseBodyData data;

    /**
     * <p>The application ID (ApplyId) returned if the call is successful. When you call the [BatchRegisterDeviceWithApplyId](~~69514~~) operation to register the devices, this parameter is required.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The list of invalid device aliases returned if the call fails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of invalid DeviceNames returned if the call fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchCheckDeviceNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesResponseBody self = new BatchCheckDeviceNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckDeviceNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCheckDeviceNamesResponseBody setData(BatchCheckDeviceNamesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCheckDeviceNamesResponseBodyData getData() {
        return this.data;
    }

    public BatchCheckDeviceNamesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCheckDeviceNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckDeviceNamesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("NickName")
        public String nickName;

        public static BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList self = new BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class BatchCheckDeviceNamesResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("InvalidDetailList")
        public java.util.List<BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList;

        public static BatchCheckDeviceNamesResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyDataInvalidDetailList self = new BatchCheckDeviceNamesResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailList setInvalidDetailList(java.util.List<BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<BatchCheckDeviceNamesResponseBodyDataInvalidDetailListInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

    }

    public static class BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList extends TeaModel {
        @NameInMap("InvalidDeviceName")
        public java.util.List<String> invalidDeviceName;

        public static BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList self = new BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList setInvalidDeviceName(java.util.List<String> invalidDeviceName) {
            this.invalidDeviceName = invalidDeviceName;
            return this;
        }
        public java.util.List<String> getInvalidDeviceName() {
            return this.invalidDeviceName;
        }

    }

    public static class BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList extends TeaModel {
        @NameInMap("InvalidDeviceNickname")
        public java.util.List<String> invalidDeviceNickname;

        public static BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList self = new BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList setInvalidDeviceNickname(java.util.List<String> invalidDeviceNickname) {
            this.invalidDeviceNickname = invalidDeviceNickname;
            return this;
        }
        public java.util.List<String> getInvalidDeviceNickname() {
            return this.invalidDeviceNickname;
        }

    }

    public static class BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList extends TeaModel {
        @NameInMap("RepeatDevieNameList")
        public java.util.List<String> repeatDevieNameList;

        public static BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList self = new BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList setRepeatDevieNameList(java.util.List<String> repeatDevieNameList) {
            this.repeatDevieNameList = repeatDevieNameList;
            return this;
        }
        public java.util.List<String> getRepeatDevieNameList() {
            return this.repeatDevieNameList;
        }

    }

    public static class BatchCheckDeviceNamesResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        @NameInMap("InvalidDetailList")
        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailList invalidDetailList;

        @NameInMap("InvalidDeviceNameList")
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceNicknameList")
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList invalidDeviceNicknameList;

        @NameInMap("RepeatedDeviceNameList")
        public BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList;

        public static BatchCheckDeviceNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseBodyData self = new BatchCheckDeviceNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public BatchCheckDeviceNamesResponseBodyData setInvalidDetailList(BatchCheckDeviceNamesResponseBodyDataInvalidDetailList invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public BatchCheckDeviceNamesResponseBodyDataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public BatchCheckDeviceNamesResponseBodyData setInvalidDeviceNameList(BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public BatchCheckDeviceNamesResponseBodyData setInvalidDeviceNicknameList(BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList invalidDeviceNicknameList) {
            this.invalidDeviceNicknameList = invalidDeviceNicknameList;
            return this;
        }
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList getInvalidDeviceNicknameList() {
            return this.invalidDeviceNicknameList;
        }

        public BatchCheckDeviceNamesResponseBodyData setRepeatedDeviceNameList(BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public BatchCheckDeviceNamesResponseBodyDataRepeatedDeviceNameList getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

}
