// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportTemplateByNameRequest extends TeaModel {
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public GetReportTemplateByNameRequestTenantContext tenantContext;

    public static GetReportTemplateByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateByNameRequest self = new GetReportTemplateByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateByNameRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetReportTemplateByNameRequest setTenantContext(GetReportTemplateByNameRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetReportTemplateByNameRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetReportTemplateByNameRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetReportTemplateByNameRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetReportTemplateByNameRequestTenantContext self = new GetReportTemplateByNameRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetReportTemplateByNameRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
