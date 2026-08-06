// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptVersionRequest extends TeaModel {
    /**
     * <p>The commit message.</p>
     * 
     * <strong>example:</strong>
     * <p>Optimize response tone.</p>
     */
    @NameInMap("CommitMsg")
    public String commitMsg;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The unique identifier of the prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer-service-qa</p>
     */
    @NameInMap("PromptKey")
    public String promptKey;

    /**
     * <p>The updated template content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>You are a customer service assistant. Please answer: {question}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The updated variable definition in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;question&quot;,&quot;defaultValue&quot;:&quot;Hello&quot;}]</p>
     */
    @NameInMap("Variables")
    public String variables;

    public static UpdatePromptVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptVersionRequest self = new UpdatePromptVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePromptVersionRequest setCommitMsg(String commitMsg) {
        this.commitMsg = commitMsg;
        return this;
    }
    public String getCommitMsg() {
        return this.commitMsg;
    }

    public UpdatePromptVersionRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdatePromptVersionRequest setPromptKey(String promptKey) {
        this.promptKey = promptKey;
        return this;
    }
    public String getPromptKey() {
        return this.promptKey;
    }

    public UpdatePromptVersionRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdatePromptVersionRequest setVariables(String variables) {
        this.variables = variables;
        return this;
    }
    public String getVariables() {
        return this.variables;
    }

}
