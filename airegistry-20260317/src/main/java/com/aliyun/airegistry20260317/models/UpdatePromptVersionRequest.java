// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class UpdatePromptVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>优化回答语气</p>
     */
    @NameInMap("CommitMsg")
    public String commitMsg;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>你是一个客服助手，请回答：{question}</p>
     */
    @NameInMap("Template")
    public String template;

    /**
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
