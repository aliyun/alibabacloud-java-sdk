// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultRequest extends TeaModel {
    /**
     * <p>The check status of the extension point event. Valid values:</p>
     * <ul>
     * <li>OK: The event passes the check.</li>
     * <li>FAIL: The event fails to pass the check. You must check and handle the reported error at the earliest opportunity to ensure that your program is run as expected.</li>
     * <li>WARN: The event passes the check, but an alert is reported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The summary information of the check result. The information is displayed in DataStudio. If an alert is reported or the event fails the check, you can troubleshoot errors based on the information.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The unique identifier of the extension. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Extensions tab of the Open Platform page to view the identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>8abcb91f-d266-4073-b907-2ed670378ed1</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The message ID. You can obtain the ID from a received message when an extension point event is triggered.</p>
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
