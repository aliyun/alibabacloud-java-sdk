// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The device status returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public GetDeviceStatusResponseBodyData data;

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

    public static GetDeviceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusResponseBody self = new GetDeviceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeviceStatusResponseBody setData(GetDeviceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeviceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetDeviceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDeviceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeviceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDeviceStatusResponseBodyData extends TeaModel {
        /**
         * <p>The status of the device. Valid values:</p>
         * <br>
         * <p>*   **ONLINE**: The device is online.</p>
         * <p>*   **OFFLINE**: The device is offline.</p>
         * <p>*   **UNACTIVE**: The device is not activated.</p>
         * <p>*   **DISABLE**: The device is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the device status changed.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetDeviceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusResponseBodyData self = new GetDeviceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeviceStatusResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
