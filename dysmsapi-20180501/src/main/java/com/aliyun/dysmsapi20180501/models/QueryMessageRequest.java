// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class QueryMessageRequest extends TeaModel {
    /**
     * <p>The ID of the message.</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static QueryMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMessageRequest self = new QueryMessageRequest();
        return TeaModel.build(map, self);
    }

    public QueryMessageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
