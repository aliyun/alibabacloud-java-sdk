// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryBatchRegisterDeviceStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     * <br>
     * <p>>  X.509 certificates are available only for devices in the China (Shanghai) region. If devices do not reside in the China (Shanghai) region, you cannot generate X.509 certificates for the devices and the iot.device.RegionNotSupportX509 error code is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status information returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public QueryBatchRegisterDeviceStatusResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryBatchRegisterDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryBatchRegisterDeviceStatusResponseBody self = new QueryBatchRegisterDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryBatchRegisterDeviceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setData(QueryBatchRegisterDeviceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryBatchRegisterDeviceStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryBatchRegisterDeviceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("NickName")
        public String nickName;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList extends TeaModel {
        @NameInMap("invalidDetailList")
        public java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList setInvalidDetailList(java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public java.util.List<QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailListInvalidDetailList> getInvalidDetailList() {
            return this.invalidDetailList;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList extends TeaModel {
        @NameInMap("Name")
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList self = new QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyDataValidList extends TeaModel {
        @NameInMap("Name")
        public java.util.List<String> name;

        public static QueryBatchRegisterDeviceStatusResponseBodyDataValidList build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyDataValidList self = new QueryBatchRegisterDeviceStatusResponseBodyDataValidList();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList setName(java.util.List<String> name) {
            this.name = name;
            return this;
        }
        public java.util.List<String> getName() {
            return this.name;
        }

    }

    public static class QueryBatchRegisterDeviceStatusResponseBodyData extends TeaModel {
        @NameInMap("InvalidDetailList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList invalidDetailList;

        /**
         * <p>*   If the value of the **Status** parameter is **CHECK_FAILED** or **CREATE_FAILED**, some devices failed to be created and the names of the devices that failed to be created are returned in this parameter.</p>
         * <p>*   If the value of the **Status** parameter is **CHECK_SUCCESS** or **CREATE_SUCCESS**, all devices are created and an empty array is returned in this parameter.</p>
         */
        @NameInMap("InvalidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList;

        /**
         * <p>The processing status and result. Valid values:</p>
         * <br>
         * <p>*   **CHECK**: The system is verifying device names.</p>
         * <br>
         * <p>*   **CHECK_SUCCESS**: All devices in the application form are verified.</p>
         * <br>
         * <p>*   **CHECK_FAILED**: All devices in the application form failed to be verified.</p>
         * <br>
         * <p>*   **CREATE**: The system is creating devices.</p>
         * <br>
         * <p>*   **CREATE_SUCCESS**: All devices in the application form are created.</p>
         * <br>
         * <p>> If the authentication type of the product to which the devices belong is X.509, all devices and the related X.509 certificates are created.</p>
         * <br>
         * <p>*   **CREATE_FAILED**: Some devices in the application form failed to be created.</p>
         * <br>
         * <p>> If a device or X.509 certificate fails to be created in the current batch when the authentication type is X.509, all devices fail to be created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>*   If the value of the **Status** parameter is **CHECK_FAILED** or **CREATE_FAILED**, some devices failed to be created and the names of the created devices are returned in this parameter.</p>
         * <p>*   If the value of the **Status** parameter is **CHECK_SUCCESS** or **CREATE_SUCCESS**, all devices are created and an empty array is returned in this parameter.</p>
         */
        @NameInMap("ValidList")
        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList validList;

        public static QueryBatchRegisterDeviceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryBatchRegisterDeviceStatusResponseBodyData self = new QueryBatchRegisterDeviceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setInvalidDetailList(QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList invalidDetailList) {
            this.invalidDetailList = invalidDetailList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidDetailList getInvalidDetailList() {
            return this.invalidDetailList;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setInvalidList(QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList invalidList) {
            this.invalidList = invalidList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataInvalidList getInvalidList() {
            return this.invalidList;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryBatchRegisterDeviceStatusResponseBodyData setValidList(QueryBatchRegisterDeviceStatusResponseBodyDataValidList validList) {
            this.validList = validList;
            return this;
        }
        public QueryBatchRegisterDeviceStatusResponseBodyDataValidList getValidList() {
            return this.validList;
        }

    }

}
