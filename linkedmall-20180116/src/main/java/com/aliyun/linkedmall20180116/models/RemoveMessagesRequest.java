// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveMessagesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LMALL2******001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtJson")
    public String extJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>212112212</p>
     */
    @NameInMap("MessageIds")
    public String messageIds;

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

    public RemoveMessagesRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public RemoveMessagesRequest setMessageIds(String messageIds) {
        this.messageIds = messageIds;
        return this;
    }
    public String getMessageIds() {
        return this.messageIds;
    }

}
