// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <strong>example:</strong>
     * <p>faq</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>[&quot;8521&quot;]</p>
     */
    @NameInMap("DataIdList")
    public String dataIdListShrink;

    public static CreatePublishTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskShrinkRequest self = new CreatePublishTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePublishTaskShrinkRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreatePublishTaskShrinkRequest setDataIdListShrink(String dataIdListShrink) {
        this.dataIdListShrink = dataIdListShrink;
        return this;
    }
    public String getDataIdListShrink() {
        return this.dataIdListShrink;
    }

}
