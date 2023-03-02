// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateIDEEventResultRequest extends TeaModel {
    /**
     * <p>The check status of the extension point event. Valid values:</p>
     * <br>
     * <p>*   OK: The event passes the check.</p>
     * <p>*   FAIL: The event fails to pass the check. You must check and handle the reported error at the earliest opportunity to ensure that your program is run as expected.</p>
     * <p>*   WARN: The event passes the check, but an alert is reported.</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The summary information of the check result. The information is displayed in DataStudio. If an alert is reported or the event fails the check, you can troubleshoot errors based on the information.</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The ID of the extension. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Extensions tab of the Open Platform page to view the ID.</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The ID of the message. You can obtain the ID from the received message when the extension point event is triggered.</p>
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
