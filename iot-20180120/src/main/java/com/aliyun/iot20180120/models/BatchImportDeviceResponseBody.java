// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchImportDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public BatchImportDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchImportDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchImportDeviceResponseBody self = new BatchImportDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchImportDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchImportDeviceResponseBody setData(BatchImportDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BatchImportDeviceResponseBodyData getData() {
        return this.data;
    }

    public BatchImportDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchImportDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchImportDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("DeviceSecret")
        public String deviceSecret;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("Sn")
        public String sn;

        public static BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList self = new BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList setDeviceSecret(String deviceSecret) {
            this.deviceSecret = deviceSecret;
            return this;
        }
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        public BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList setSn(String sn) {
            this.sn = sn;
            return this;
        }
        public String getSn() {
            return this.sn;
        }

    }

    public static class BatchImportDeviceResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("InvalidDetailList")
        public java.util.List<BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList;

        public static BatchImportDeviceResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataInvalidDetailList self = new BatchImportDeviceResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataInvalidDetailList setInvalidDetailList(java.util.List<BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<BatchImportDeviceResponseBodyDataInvalidDetailListInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

    }

    public static class BatchImportDeviceResponseBodyDataInvalidDeviceNameList extends TeaModel {
        @NameInMap("invalidDeviceName")
        public java.util.List<String> invalidDeviceName;

        public static BatchImportDeviceResponseBodyDataInvalidDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataInvalidDeviceNameList self = new BatchImportDeviceResponseBodyDataInvalidDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataInvalidDeviceNameList setInvalidDeviceName(java.util.List<String> invalidDeviceName) {
            this.invalidDeviceName = invalidDeviceName;
            return this;
        }
        public java.util.List<String> getInvalidDeviceName() {
            return this.invalidDeviceName;
        }

    }

    public static class BatchImportDeviceResponseBodyDataInvalidDeviceSecretList extends TeaModel {
        @NameInMap("invalidDeviceSecret")
        public java.util.List<String> invalidDeviceSecret;

        public static BatchImportDeviceResponseBodyDataInvalidDeviceSecretList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataInvalidDeviceSecretList self = new BatchImportDeviceResponseBodyDataInvalidDeviceSecretList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataInvalidDeviceSecretList setInvalidDeviceSecret(java.util.List<String> invalidDeviceSecret) {
            this.invalidDeviceSecret = invalidDeviceSecret;
            return this;
        }
        public java.util.List<String> getInvalidDeviceSecret() {
            return this.invalidDeviceSecret;
        }

    }

    public static class BatchImportDeviceResponseBodyDataInvalidSnList extends TeaModel {
        @NameInMap("invalidSn")
        public java.util.List<String> invalidSn;

        public static BatchImportDeviceResponseBodyDataInvalidSnList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataInvalidSnList self = new BatchImportDeviceResponseBodyDataInvalidSnList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataInvalidSnList setInvalidSn(java.util.List<String> invalidSn) {
            this.invalidSn = invalidSn;
            return this;
        }
        public java.util.List<String> getInvalidSn() {
            return this.invalidSn;
        }

    }

    public static class BatchImportDeviceResponseBodyDataRepeatedDeviceNameList extends TeaModel {
        @NameInMap("repeatedDeviceName")
        public java.util.List<String> repeatedDeviceName;

        public static BatchImportDeviceResponseBodyDataRepeatedDeviceNameList build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyDataRepeatedDeviceNameList self = new BatchImportDeviceResponseBodyDataRepeatedDeviceNameList();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyDataRepeatedDeviceNameList setRepeatedDeviceName(java.util.List<String> repeatedDeviceName) {
            this.repeatedDeviceName = repeatedDeviceName;
            return this;
        }
        public java.util.List<String> getRepeatedDeviceName() {
            return this.repeatedDeviceName;
        }

    }

    public static class BatchImportDeviceResponseBodyData extends TeaModel {
        /**
         * <p>The application ID returned if the request is successful.</p>
         */
        @NameInMap("ApplyId")
        public Long applyId;

        @NameInMap("InvalidDetailList")
        public BatchImportDeviceResponseBodyDataInvalidDetailList invalidDetailList;

        @NameInMap("InvalidDeviceNameList")
        public BatchImportDeviceResponseBodyDataInvalidDeviceNameList invalidDeviceNameList;

        @NameInMap("InvalidDeviceSecretList")
        public BatchImportDeviceResponseBodyDataInvalidDeviceSecretList invalidDeviceSecretList;

        @NameInMap("InvalidSnList")
        public BatchImportDeviceResponseBodyDataInvalidSnList invalidSnList;

        @NameInMap("RepeatedDeviceNameList")
        public BatchImportDeviceResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList;

        public static BatchImportDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BatchImportDeviceResponseBodyData self = new BatchImportDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BatchImportDeviceResponseBodyData setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public BatchImportDeviceResponseBodyData setInvalidDetailList(BatchImportDeviceResponseBodyDataInvalidDetailList invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public BatchImportDeviceResponseBodyDataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public BatchImportDeviceResponseBodyData setInvalidDeviceNameList(BatchImportDeviceResponseBodyDataInvalidDeviceNameList invalidDeviceNameList) {
            this.invalidDeviceNameList = invalidDeviceNameList;
            return this;
        }
        public BatchImportDeviceResponseBodyDataInvalidDeviceNameList getInvalidDeviceNameList() {
            return this.invalidDeviceNameList;
        }

        public BatchImportDeviceResponseBodyData setInvalidDeviceSecretList(BatchImportDeviceResponseBodyDataInvalidDeviceSecretList invalidDeviceSecretList) {
            this.invalidDeviceSecretList = invalidDeviceSecretList;
            return this;
        }
        public BatchImportDeviceResponseBodyDataInvalidDeviceSecretList getInvalidDeviceSecretList() {
            return this.invalidDeviceSecretList;
        }

        public BatchImportDeviceResponseBodyData setInvalidSnList(BatchImportDeviceResponseBodyDataInvalidSnList invalidSnList) {
            this.invalidSnList = invalidSnList;
            return this;
        }
        public BatchImportDeviceResponseBodyDataInvalidSnList getInvalidSnList() {
            return this.invalidSnList;
        }

        public BatchImportDeviceResponseBodyData setRepeatedDeviceNameList(BatchImportDeviceResponseBodyDataRepeatedDeviceNameList repeatedDeviceNameList) {
            this.repeatedDeviceNameList = repeatedDeviceNameList;
            return this;
        }
        public BatchImportDeviceResponseBodyDataRepeatedDeviceNameList getRepeatedDeviceNameList() {
            return this.repeatedDeviceNameList;
        }

    }

}
