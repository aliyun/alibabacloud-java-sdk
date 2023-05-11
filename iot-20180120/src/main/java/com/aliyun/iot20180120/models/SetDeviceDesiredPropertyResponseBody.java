// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDeviceDesiredPropertyResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful. For more information, see the following parameters.</p>
     */
    @NameInMap("Data")
    public SetDeviceDesiredPropertyResponseBodyData data;

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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SetDeviceDesiredPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceDesiredPropertyResponseBody self = new SetDeviceDesiredPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDeviceDesiredPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDeviceDesiredPropertyResponseBody setData(SetDeviceDesiredPropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDeviceDesiredPropertyResponseBodyData getData() {
        return this.data;
    }

    public SetDeviceDesiredPropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDeviceDesiredPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDeviceDesiredPropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetDeviceDesiredPropertyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the message that IoT Platform sends to the device to specify desired property values.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The current version numbers of the desired property values.</p>
         */
        @NameInMap("Versions")
        public String versions;

        public static SetDeviceDesiredPropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDeviceDesiredPropertyResponseBodyData self = new SetDeviceDesiredPropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDeviceDesiredPropertyResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SetDeviceDesiredPropertyResponseBodyData setVersions(String versions) {
            this.versions = versions;
            return this;
        }
        public String getVersions() {
            return this.versions;
        }

    }

}
