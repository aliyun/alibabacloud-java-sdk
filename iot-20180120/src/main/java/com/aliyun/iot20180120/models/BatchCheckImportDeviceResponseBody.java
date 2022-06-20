// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchCheckImportDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BatchCheckImportDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCheckImportDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCheckImportDeviceResponseBody self = new BatchCheckImportDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCheckImportDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCheckImportDeviceResponseBody setData(BatchCheckImportDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchCheckImportDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchCheckImportDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCheckImportDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCheckImportDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchCheckImportDeviceResponseBodyData extends TeaModel {
        @NameInMap("InvalidDeviceNameList")
        public java.util.List<String> invalidDeviceNameList;

        @NameInMap("InvalidDeviceSecretList")
        public java.util.List<String> invalidDeviceSecretList;

        @NameInMap("InvalidSnList")
        public java.util.List<String> invalidSnList;

        @NameInMap("RepeatedDeviceNameList")
        public java.util.List<String> repeatedDeviceNameList;

        public static BatchCheckImportDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchCheckImportDeviceResponseBodyData self = new BatchCheckImportDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchCheckImportDeviceResponseBodyData setInvalidDeviceNameList(java.util.List<String> invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public BatchCheckImportDeviceResponseBodyData setInvalidDeviceSecretList(java.util.List<String> invalidDeviceSecretList) {
            this.invalidDeviceSecretList = invalidDeviceSecretList;
            return this;
        }
        public java.util.List<String> getInvalidDeviceSecretList() {
            return this.invalidDeviceSecretList;
        }

        public BatchCheckImportDeviceResponseBodyData setInvalidSnList(java.util.List<String> invalidSnList) {
            this.invalidSnList = invalidSnList;
            return this;
        }
        public java.util.List<String> getInvalidSnList() {
            return this.invalidSnList;
        }

        public BatchCheckImportDeviceResponseBodyData setRepeatedDeviceNameList(java.util.List<String> repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

}
