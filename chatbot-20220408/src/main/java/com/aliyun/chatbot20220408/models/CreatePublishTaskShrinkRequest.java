// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskShrinkRequest extends TeaModel {
    /**
     * <p>The key of the business space. If you omit this parameter, the default business space is used. You can obtain the key from the Business Management page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The type of content to publish. To publish a bot, use the <code>CreateInstancePublishTask</code> API.</p>
     * 
     * <strong>example:</strong>
     * <p>faq</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Specifies data to publish by ID. This parameter is used only when <code>BizType</code> is set to <code>faq</code>. In this case, provide one or more category IDs to publish knowledge exclusively from the specified categories.</p>
     * 
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
