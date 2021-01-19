// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveMessagesRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("MessageIds")
    @Validation(required = true)
    public String messageIds;

    @NameInMap("ExtJson")
    public String extJson;

    public static RemoveMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveMessagesRequest self = new RemoveMessagesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveMessagesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RemoveMessagesRequest setMessageIds(String messageIds) {
        this.messageIds = messageIds;
        return this;
    }
    public String getMessageIds() {
        return this.messageIds;
    }

    public RemoveMessagesRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

}
