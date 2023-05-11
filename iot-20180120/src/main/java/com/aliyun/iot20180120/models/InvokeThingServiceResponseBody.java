// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned if the call is successful.</p>
     */
    @NameInMap("Data")
    public InvokeThingServiceResponseBodyData data;

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
     * <p>*   **true**: The call was successful. However, this value does not indicate that the service is implemented. To obtain the implementation result, view the logs of the device.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static InvokeThingServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeThingServiceResponseBody self = new InvokeThingServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeThingServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeThingServiceResponseBody setData(InvokeThingServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InvokeThingServiceResponseBodyData getData() {
        return this.data;
    }

    public InvokeThingServiceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public InvokeThingServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InvokeThingServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InvokeThingServiceResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the message. IoT Platform sends the message to the device to call the service.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The result of the synchronous call.</p>
         * <br>
         * <p>If you asynchronously call the service, this parameter is not returned.</p>
         */
        @NameInMap("Result")
        public String result;

        public static InvokeThingServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InvokeThingServiceResponseBodyData self = new InvokeThingServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InvokeThingServiceResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public InvokeThingServiceResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

}
