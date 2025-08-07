// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCardTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TenantContext")
    public GetCardTemplateRequestTenantContext tenantContext;

    public static GetCardTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardTemplateRequest self = new GetCardTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetCardTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GetCardTemplateRequest setTenantContext(GetCardTemplateRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetCardTemplateRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetCardTemplateRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetCardTemplateRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetCardTemplateRequestTenantContext self = new GetCardTemplateRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetCardTemplateRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
