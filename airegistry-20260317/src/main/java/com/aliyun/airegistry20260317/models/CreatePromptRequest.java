// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class CreatePromptRequest extends TeaModel {
    /**
     * <p>Business tags, comma-separated</p>
     * 
     * <strong>example:</strong>
     * <p>cs,qa,support</p>
     */
    @NameInMap("BizTags")
    public String bizTags;

    /**
     * <p>Commit message</p>
     * 
     * <strong>example:</strong>
     * <p>初始版本</p>
     */
    @NameInMap("CommitMsg")
    public String commitMsg;

    /**
     * <p>Prompt description</p>
     * 
     * <strong>example:</strong>
     * <p>客服问答 Prompt</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Workspace ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Prompt unique identifier</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-qa</p>
     */
    @NameInMap("PromptKey")
    public String promptKey;

    /**
     * <p>Version number for the initial draft version of the prompt. Defaults to 0.0.1 if not specified.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.1</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    /**
     * <p>Template content for the initial draft version of the prompt</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>你是一个客服助手，请回答：{question}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>Variable definitions, JSON array string, supporting name, description, and defaultValue parameters</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;defaultValue&quot;:&quot;Hello&quot;}]</p>
     */
    @NameInMap("Variables")
    public String variables;

    public static CreatePromptRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptRequest self = new CreatePromptRequest();
        return TeaModel.build(map, self);
    }

    public CreatePromptRequest setBizTags(String bizTags) {
        this.bizTags = bizTags;
        return this;
    }
    public String getBizTags() {
        return this.bizTags;
    }

    public CreatePromptRequest setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public CreatePromptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePromptRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreatePromptRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

    public CreatePromptRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public CreatePromptRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public CreatePromptRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
