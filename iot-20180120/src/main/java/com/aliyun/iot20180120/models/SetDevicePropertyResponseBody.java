// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class SetDevicePropertyResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public SetDevicePropertyResponseBodyData data;

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

    public static SetDevicePropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDevicePropertyResponseBody self = new SetDevicePropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDevicePropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetDevicePropertyResponseBody setData(SetDevicePropertyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SetDevicePropertyResponseBodyData getData() {
        return this.data;
    }

    public SetDevicePropertyResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SetDevicePropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDevicePropertyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SetDevicePropertyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the message that IoT Platform sends to the device.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static SetDevicePropertyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SetDevicePropertyResponseBodyData self = new SetDevicePropertyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SetDevicePropertyResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
