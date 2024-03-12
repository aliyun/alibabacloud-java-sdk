// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ReplyMessagList")
    public String replyMessagListShrink;

    public static InsertInterveneGlobalReplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneGlobalReplyShrinkRequest self = new InsertInterveneGlobalReplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertInterveneGlobalReplyShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public InsertInterveneGlobalReplyShrinkRequest setReplyMessagListShrink(String replyMessagListShrink) {
        this.replyMessagListShrink = replyMessagListShrink;
        return this;
    }
    public String getReplyMessagListShrink() {
        return this.replyMessagListShrink;
    }

}
