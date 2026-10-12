// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SendConsoleMessageRequest extends TeaModel {
    /**
     * <p>The ID of the console message to be sent. You can obtain the ID from the return value of the message creation operation or the query result of DescribeConsoleMessages. Each call supports only one message ID, and the message must belong to the current Alibaba Cloud account. Only messages in the Published state can be sent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>msg-123456</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static SendConsoleMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendConsoleMessageRequest self = new SendConsoleMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendConsoleMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
