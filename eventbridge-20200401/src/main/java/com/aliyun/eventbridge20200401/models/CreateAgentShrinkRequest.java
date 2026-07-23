// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateAgentShrinkRequest extends TeaModel {
    /**
     * <p>The description of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>连接配置描述信息</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The associated metadata.</p>
     */
    @NameInMap("Metadata")
    public String metadataShrink;

    /**
     * <p>The name of the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>You are an IoT data analytics assistant...</p>
     * 
     * <strong>example:</strong>
     * <p>我想要她，你这样增加请求头获取用户IP CF-Connecting-IP%3B</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    public static CreateAgentShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentShrinkRequest self = new CreateAgentShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentShrinkRequest setMetadataShrink(String metadataShrink) {
        this.metadataShrink = metadataShrink;
        return this;
    }
    public String getMetadataShrink() {
        return this.metadataShrink;
    }

    public CreateAgentShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAgentShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

}
