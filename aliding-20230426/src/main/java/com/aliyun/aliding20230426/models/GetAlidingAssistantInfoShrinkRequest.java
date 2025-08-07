// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAlidingAssistantInfoShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AssistantId")
    public String assistantId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetAlidingAssistantInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlidingAssistantInfoShrinkRequest self = new GetAlidingAssistantInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetAlidingAssistantInfoShrinkRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAlidingAssistantInfoShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
