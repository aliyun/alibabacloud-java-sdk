// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CallbackExtensionRequest extends TeaModel {
    @NameInMap("CheckMessage")
    public String checkMessage;

    @NameInMap("CheckResult")
    public String checkResult;

    @NameInMap("ExtensionCode")
    public String extensionCode;

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
