// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreatePublishTaskRequest extends TeaModel {
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
