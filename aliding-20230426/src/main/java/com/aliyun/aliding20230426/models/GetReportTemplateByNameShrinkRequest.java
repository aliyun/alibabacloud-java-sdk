// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportTemplateByNameShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetReportTemplateByNameShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportTemplateByNameShrinkRequest self = new GetReportTemplateByNameShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetReportTemplateByNameShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public GetReportTemplateByNameShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
