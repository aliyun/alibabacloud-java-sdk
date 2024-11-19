// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class NotifyAddThingTopoResponseBody extends TeaModel {
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
    public NotifyAddThingTopoResponseBodyData data;

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
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static NotifyAddThingTopoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyAddThingTopoResponseBody self = new NotifyAddThingTopoResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyAddThingTopoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyAddThingTopoResponseBody setData(NotifyAddThingTopoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public NotifyAddThingTopoResponseBodyData getData() {
        return this.data;
    }

    public NotifyAddThingTopoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NotifyAddThingTopoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyAddThingTopoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NotifyAddThingTopoResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the message that IoT Platform sends to the gateway. The message is used to notify the gateway to add a topology.</p>
         * 
         * <strong>example:</strong>
         * <p>5443123</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static NotifyAddThingTopoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            NotifyAddThingTopoResponseBodyData self = new NotifyAddThingTopoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public NotifyAddThingTopoResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

}
