// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DisableSceneGroupTemplateRequest extends TeaModel {
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
    public DisableSceneGroupTemplateRequestTenantContext tenantContext;

    public static DisableSceneGroupTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSceneGroupTemplateRequest self = new DisableSceneGroupTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DisableSceneGroupTemplateRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public DisableSceneGroupTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public DisableSceneGroupTemplateRequest setTenantContext(DisableSceneGroupTemplateRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DisableSceneGroupTemplateRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DisableSceneGroupTemplateRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DisableSceneGroupTemplateRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DisableSceneGroupTemplateRequestTenantContext self = new DisableSceneGroupTemplateRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DisableSceneGroupTemplateRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
