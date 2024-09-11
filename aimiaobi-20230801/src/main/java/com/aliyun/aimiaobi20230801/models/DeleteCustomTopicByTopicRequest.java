// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteCustomTopicByTopicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>话题</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static DeleteCustomTopicByTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomTopicByTopicRequest self = new DeleteCustomTopicByTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomTopicByTopicRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteCustomTopicByTopicRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
