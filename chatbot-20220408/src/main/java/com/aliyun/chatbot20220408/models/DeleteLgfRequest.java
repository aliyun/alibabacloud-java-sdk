// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DeleteLgfRequest extends TeaModel {
    /**
     * <p>The business space key. If not specified, the default business space is accessed. You can obtain the key value on the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The chatbot ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-yjzbyrEvqd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The intent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23242342</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <p>lgf Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2342424</p>
     */
    @NameInMap("LgfId")
    public Long lgfId;

    public static DeleteLgfRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLgfRequest self = new DeleteLgfRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLgfRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public DeleteLgfRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteLgfRequest setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DeleteLgfRequest setLgfId(Long lgfId) {
        this.lgfId = lgfId;
        return this;
    }
    public Long getLgfId() {
        return this.lgfId;
    }

}
