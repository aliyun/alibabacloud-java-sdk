// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DisableSceneGroupTemplateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2efdt*****fswe==</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static DisableSceneGroupTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneGroupTemplateShrinkRequest self = new DisableSceneGroupTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneGroupTemplateShrinkRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public DisableSceneGroupTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DisableSceneGroupTemplateShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
