// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensClassificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static QuerySensClassificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySensClassificationRequest self = new QuerySensClassificationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySensClassificationRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QuerySensClassificationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
