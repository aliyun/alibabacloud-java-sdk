// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateWorkbenchEventResultRequest extends TeaModel {
    @NameInMap("CheckResult")
    public String checkResult;

    @NameInMap("CheckResultTip")
    public String checkResultTip;

    @NameInMap("ExtensionCode")
    public String extensionCode;

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
