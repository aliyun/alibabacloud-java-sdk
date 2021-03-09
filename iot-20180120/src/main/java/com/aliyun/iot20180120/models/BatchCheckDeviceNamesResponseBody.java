// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public BatchCheckDeviceNamesResponseBodyData data;

    public static BatchCheckDeviceNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesResponseBody self = new BatchCheckDeviceNamesResponseBody();
        return TeaModel.build(map, self);
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

    public BatchCheckDeviceNamesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCheckDeviceNamesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCheckDeviceNamesResponseBody setData(BatchCheckDeviceNamesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCheckDeviceNamesResponseBodyData getData() {
        return this.data;
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

    public static class BatchCheckDeviceNamesResponseBodyData extends TeaModel {
        @NameInMap("ApplyId")
        public Long applyId;

        @NameInMap("InvalidDeviceNameList")
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceNicknameList")
        public BatchCheckDeviceNamesResponseBodyDataInvalidDeviceNicknameList invalidDeviceNicknameList;

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

    }

}
