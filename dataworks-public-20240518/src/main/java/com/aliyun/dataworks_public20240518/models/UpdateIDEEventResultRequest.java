// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultRequest extends TeaModel {
    /**
     * <p>The check status of the extension for this extension point event. Valid values:</p>
     * <ul>
     * <li>OK: The extension check for this extension point event passed.</li>
     * <li>FAIL: The extension check for this extension point event failed. View and resolve the error promptly to avoid affecting the normal execution of subsequent programs.</li>
     * <li>WARN: The extension check for this extension point event passed, but warnings exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The summary of the check performed by the extension on this extension point event.
     * This information is displayed on your current development page. If the check has warnings or fails, you can use this summary to quickly identify the cause.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The unique identifier of the extension.
     * You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and view the identifier on the Extensions tab of the Open Platform page.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The message ID of the DataWorks open message. After an extension point event is triggered, you can obtain the message ID from the received event message.</p>
     * <p>&lt;props=&quot;china&quot;&gt;For more information about the message format, see <a href="https://help.aliyun.com/document_detail/215367.html">Message format</a>.</p>
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
