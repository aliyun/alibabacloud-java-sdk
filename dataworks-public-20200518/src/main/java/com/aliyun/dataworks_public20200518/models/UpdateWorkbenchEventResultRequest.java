// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultRequest extends TeaModel {
    /**
     * <p>The check status of the extension point event. Valid values: OK and Fail. A value of OK indicates that the event passes the check. A value of FAIL indicates that the event fails to pass the check.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The cause of the check failure.</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The code of the extension.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The ID of the message received when the related extension point event is triggered after you enable message subscription by using the OpenEvent module.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static UpdateWorkbenchEventResultRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkbenchEventResultRequest self = new UpdateWorkbenchEventResultRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkbenchEventResultRequest setCheckResult(String checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public String getCheckResult() {
        return this.checkResult;
    }

    public UpdateWorkbenchEventResultRequest setCheckResultTip(String checkResultTip) {
        this.checkResultTip = checkResultTip;
        return this;
    }
    public String getCheckResultTip() {
        return this.checkResultTip;
    }

    public UpdateWorkbenchEventResultRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

    public UpdateWorkbenchEventResultRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
