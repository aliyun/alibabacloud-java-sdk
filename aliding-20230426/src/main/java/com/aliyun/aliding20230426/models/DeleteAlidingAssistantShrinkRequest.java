// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteAlidingAssistantShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AssistantId")
    public String assistantId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DeleteAlidingAssistantShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlidingAssistantShrinkRequest self = new DeleteAlidingAssistantShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlidingAssistantShrinkRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public DeleteAlidingAssistantShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
