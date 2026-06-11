// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;cs&quot;,&quot;qa&quot;,&quot;support&quot;]</p>
     */
    @NameInMap("BizTags")
    public String bizTagsShrink;

    /**
     * <strong>example:</strong>
     * <p>客服问答 Prompt</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Labels")
    public String labelsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-qa</p>
     */
    @NameInMap("PromptKey")
    public String promptKey;

    public static UpdatePromptShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptShrinkRequest self = new UpdatePromptShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePromptShrinkRequest setBizTagsShrink(String bizTagsShrink) {
        this.bizTagsShrink = bizTagsShrink;
        return this;
    }
    public String getBizTagsShrink() {
        return this.bizTagsShrink;
    }

    public UpdatePromptShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePromptShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public UpdatePromptShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdatePromptShrinkRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

}
