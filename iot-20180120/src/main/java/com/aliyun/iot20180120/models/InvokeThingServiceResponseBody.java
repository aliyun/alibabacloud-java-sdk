// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class InvokeThingServiceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
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
     * 
     * <strong>example:</strong>
     * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful. However, this value does not indicate that the service is implemented. To obtain the implementation result, view the logs of the device.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>abcabcabc1234****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The result of the synchronous call.</p>
         * <p>If you asynchronously call the service, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param1&quot;:1}</p>
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
