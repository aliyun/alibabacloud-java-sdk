// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class PromptTemplateItem extends TeaModel {
    /**
     * <p>The content, which supports {{variable name}} placeholders.</p>
     * 
     * <strong>example:</strong>
     * <p>Please answer: {{question}}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The role: system/user/assistant.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("role")
    public String role;

    public static PromptTemplateItem build(java.util.Map<String, ?> map) throws Exception {
        PromptTemplateItem self = new PromptTemplateItem();
        return TeaModel.build(map, self);
    }

    public PromptTemplateItem setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public PromptTemplateItem setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

}
