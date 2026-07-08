// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyShrinkRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>List of reply content</p>
     */
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
