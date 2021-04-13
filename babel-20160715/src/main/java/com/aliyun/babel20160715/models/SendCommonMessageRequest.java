// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class SendCommonMessageRequest extends TeaModel {
    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("MessageBody")
    public String messageBody;

    @NameInMap("MessageTag")
    public String messageTag;

    @NameInMap("ClientToken")
    public String clientToken;

    public static SendCommonMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommonMessageRequest self = new SendCommonMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendCommonMessageRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public SendCommonMessageRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

    public SendCommonMessageRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

    public SendCommonMessageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
