// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class EnableSceneGroupTemplateRequest extends TeaModel {
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
    public EnableSceneGroupTemplateRequestTenantContext tenantContext;

    public static EnableSceneGroupTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSceneGroupTemplateRequest self = new EnableSceneGroupTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EnableSceneGroupTemplateRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public EnableSceneGroupTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public EnableSceneGroupTemplateRequest setTenantContext(EnableSceneGroupTemplateRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public EnableSceneGroupTemplateRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class EnableSceneGroupTemplateRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static EnableSceneGroupTemplateRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            EnableSceneGroupTemplateRequestTenantContext self = new EnableSceneGroupTemplateRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public EnableSceneGroupTemplateRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
