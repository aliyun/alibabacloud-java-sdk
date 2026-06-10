// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskRequest extends TeaModel {
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
    public java.util.List<String> dataIdList;

    public static CreatePublishTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePublishTaskRequest self = new CreatePublishTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePublishTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreatePublishTaskRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreatePublishTaskRequest setDataIdList(java.util.List<String> dataIdList) {
        this.dataIdList = dataIdList;
        return this;
    }
    public java.util.List<String> getDataIdList() {
        return this.dataIdList;
    }

}
