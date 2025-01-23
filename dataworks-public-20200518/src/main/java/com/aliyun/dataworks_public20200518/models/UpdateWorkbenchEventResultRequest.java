// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultRequest extends TeaModel {
    /**
     * <p>The check result of the extension point event. Valid values: OK and Fail.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FAIL</p>
     */
    @NameInMap("CheckResult")
    public String checkResult;

    /**
     * <p>The cause of the check failure.</p>
     * 
     * <strong>example:</strong>
     * <p>SQL is too long</p>
     */
    @NameInMap("CheckResultTip")
    public String checkResultTip;

    /**
     * <p>The code of the extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58e95e2acd6f408e8707f1bf2591f9e9</p>
     */
    @NameInMap("ExtensionCode")
    public String extensionCode;

    /**
     * <p>The ID of the message received when the related extension point event is triggered after you enable message subscription by using the OpenEvent module.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03400b03-b721-4c34-8727-2d6884077091</p>
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
