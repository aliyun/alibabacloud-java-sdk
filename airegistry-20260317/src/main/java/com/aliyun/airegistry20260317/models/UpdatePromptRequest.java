// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[&quot;cs&quot;,&quot;qa&quot;,&quot;support&quot;]</p>
     */
    @NameInMap("BizTags")
    public java.util.List<String> bizTags;

    /**
     * <strong>example:</strong>
     * <p>客服问答 Prompt</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Labels")
    public java.util.Map<String, ?> labels;

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

    public static UpdatePromptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptRequest self = new UpdatePromptRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePromptRequest setBizTags(java.util.List<String> bizTags) {
        this.bizTags = bizTags;
        return this;
    }
    public java.util.List<String> getBizTags() {
        return this.bizTags;
    }

    public UpdatePromptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePromptRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public UpdatePromptRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdatePromptRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

}
