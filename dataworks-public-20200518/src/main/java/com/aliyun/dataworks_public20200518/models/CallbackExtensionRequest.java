// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CallbackExtensionRequest extends TeaModel {
    /**
     * <p>The reason for the failure when CheckResult is set to FAIL.</p>
     * 
     * <strong>example:</strong>
     * <p>The xxx rule is hit. Modify it and try again.</p>
     */
    @NameInMap("CheckMessage")
    public String checkMessage;

    /**
     * <p>The check status of the extension program for the extension point event. Valid values:</p>
     * <ul>
     * <li>OK: The extension program check for the extension point event passed.</li>
     * <li>FAIL: The extension program check for the extension point event failed. View and resolve the error promptly to avoid affecting the normal execution of subsequent programs.</li>
     * <li>WARN: The extension program check for the extension point event passed, but warnings exist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FAIL</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The unique code of the extension program.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2****</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The message ID of the DataWorks open message. After an extension point event is triggered, you can obtain the message ID from the received event message.</p>
     * <p>&lt;props=&quot;china&quot;&gt;For more information about the message format, see <a href="https://help.aliyun.com/document_detail/215367.html">Message format</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>034********091</p>
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
