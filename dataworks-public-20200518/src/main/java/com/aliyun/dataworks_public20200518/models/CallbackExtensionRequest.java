// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CallbackExtensionRequest extends TeaModel {
    /**
     * <p>The check message of the extension point event. If CheckResult is set to FAIL, you must provide the failure cause.</p>
     * 
     * <strong>example:</strong>
     * <p>The xxx rule is hit. Modify it and try again.</p>
     */
    @NameInMap("CheckMessage")
    public String checkMessage;

    /**
     * <p>The check status of the extension point event. Valid values:</p>
     * <ul>
     * <li>OK: The event passes the check.</li>
     * <li>FAIL: The event fails to pass the check. You must check and handle the reported error at the earliest opportunity to ensure that your program is run as expected.</li>
     * <li>WARN: The event passes the check, but an alert is reported.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FAIL</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The unique code of the extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The message ID in DataWorks OpenEvent. You can obtain the ID from a received message when an extension point event is triggered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03400b03-b721-4c34-8727-2d6884077091</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static CallbackExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackExtensionRequest self = new CallbackExtensionRequest();
        return TeaModel.build(map, self);
    }

    public CallbackExtensionRequest setCheckMessage(String checkMessage) {
        this.checkMessage = checkMessage;
        return this;
    }
    public String getCheckMessage() {
        return this.checkMessage;
    }

    public CallbackExtensionRequest setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public CallbackExtensionRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public CallbackExtensionRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
