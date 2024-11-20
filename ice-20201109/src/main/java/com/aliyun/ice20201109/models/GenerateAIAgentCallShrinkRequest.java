// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    @NameInMap("UserData")
    public String userData;

    /**
     * <strong>example:</strong>
     * <p>877ae632caae49b1afc81c2e8194ffb4</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateAIAgentCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAIAgentCallShrinkRequest self = new GenerateAIAgentCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAIAgentCallShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public GenerateAIAgentCallShrinkRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GenerateAIAgentCallShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public GenerateAIAgentCallShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateAIAgentCallShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
