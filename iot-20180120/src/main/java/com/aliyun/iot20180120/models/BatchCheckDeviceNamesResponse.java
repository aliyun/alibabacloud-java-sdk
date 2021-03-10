// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckDeviceNamesResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public BatchCheckDeviceNamesResponseData data;

    public static BatchCheckDeviceNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckDeviceNamesResponse self = new BatchCheckDeviceNamesResponse();
        return TeaModel.build(map, self);
    }

    public BatchCheckDeviceNamesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckDeviceNamesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchCheckDeviceNamesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCheckDeviceNamesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCheckDeviceNamesResponse setData(BatchCheckDeviceNamesResponseData data) {
        this.data = data;
        return this;
    }
    public BatchCheckDeviceNamesResponseData getData() {
        return this.data;
    }

    public static class BatchCheckDeviceNamesResponseDataInvalidDeviceNameList extends TeaModel {
        // InvalidDeviceName
        @NameInMap("InvalidDeviceName")
        @Validation(required = true)
        public java.util.List<String> invalidDeviceName;

        public static BatchCheckDeviceNamesResponseDataInvalidDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseDataInvalidDeviceNameList self = new BatchCheckDeviceNamesResponseDataInvalidDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseDataInvalidDeviceNameList setInvalidDeviceName(java.util.List<String> invalidDeviceName) {
            this.invalidDeviceName = invalidDeviceName;
            return this;
        }
        public java.util.List<String> getInvalidDeviceName() {
            return this.invalidDeviceName;
        }

    }

    public static class BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList extends TeaModel {
        // InvalidDeviceNickname
        @NameInMap("InvalidDeviceNickname")
        @Validation(required = true)
        public java.util.List<String> invalidDeviceNickname;

        public static BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList self = new BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList setInvalidDeviceNickname(java.util.List<String> invalidDeviceNickname) {
            this.invalidDeviceNickname = invalidDeviceNickname;
            return this;
        }
        public java.util.List<String> getInvalidDeviceNickname() {
            return this.invalidDeviceNickname;
        }

    }

    public static class BatchCheckDeviceNamesResponseData extends TeaModel {
        @NameInMap("ApplyId")
        @Validation(required = true)
        public Long applyId;

        @NameInMap("InvalidDeviceNameList")
        @Validation(required = true)
        public BatchCheckDeviceNamesResponseDataInvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceNicknameList")
        @Validation(required = true)
        public BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList invalidDeviceNicknameList;

        public static BatchCheckDeviceNamesResponseData build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckDeviceNamesResponseData self = new BatchCheckDeviceNamesResponseData();
            return TeaModel.build(map, self);
        }

        public BatchCheckDeviceNamesResponseData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public BatchCheckDeviceNamesResponseData setInvalidDeviceNameList(BatchCheckDeviceNamesResponseDataInvalidDeviceNameList invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public BatchCheckDeviceNamesResponseDataInvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public BatchCheckDeviceNamesResponseData setInvalidDeviceNicknameList(BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList invalidDeviceNicknameList) {
            this.invalidDeviceNicknameList = invalidDeviceNicknameList;
            return this;
        }
        public BatchCheckDeviceNamesResponseDataInvalidDeviceNicknameList getInvalidDeviceNicknameList() {
            return this.invalidDeviceNicknameList;
        }

    }

}
