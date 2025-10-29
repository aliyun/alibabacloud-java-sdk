// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultRequest extends TeaModel {
    /**
     * <p>The check status of the extension for this extension point event. Valid values:</p>
     * <ul>
     * <li>OK: The extension passed the check for this event.</li>
     * <li>FAIL: The extension failed the check for this event. You need to review and resolve the error promptly to avoid affecting subsequent program execution.</li>
     * <li>WARN: The extension passed the check for this event, but with warnings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>A summary of the check result for this extension point event. This message is displayed on your current development page. When the check fails or has warnings, you can use this summary to quickly identify the cause.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The unique identifier of the extension. You can obtain the identifier from the Extensions tab on Open Platform in the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The OpenEvent message ID from DataWorks. When an extension point event is triggered, you can obtain the message ID from the event message.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static UpdateIDEEventResultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIDEEventResultRequest self = new UpdateIDEEventResultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIDEEventResultRequest setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public UpdateIDEEventResultRequest setCheckResultTip(String checkResultTip) {
        this.checkResultTip = checkResultTip;
        return this;
    }
    public String getCheckResultTip() {
        return this.checkResultTip;
    }

    public UpdateIDEEventResultRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public UpdateIDEEventResultRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
