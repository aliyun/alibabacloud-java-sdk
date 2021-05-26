// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class SendChannelEventRequest extends TeaModel {
    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("MessageBody")
    public String messageBody;

    public static SendChannelEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChannelEventRequest self = new SendChannelEventRequest();
        return TeaModel.build(map, self);
    }

    public SendChannelEventRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public SendChannelEventRequest setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        return this;
    }
    public String getMessageBody() {
        return this.messageBody;
    }

}
