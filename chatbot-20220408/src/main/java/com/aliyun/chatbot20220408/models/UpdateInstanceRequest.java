// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateInstanceRequest extends TeaModel {
    /**
     * <p>The business space key. If this parameter is not specified, the default business space is accessed. You can obtain the key value from the business management page of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique identifier of the chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The remarks of the chatbot to update.</p>
     * 
     * <strong>example:</strong>
     * <p>A chatbot for consumer Q&amp;A</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>The name of the chatbot to update. The name can be up to 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Intelligent-Customer-Service-C</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceRequest self = new UpdateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public UpdateInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceRequest setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public UpdateInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
