// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QuerySensLevelRequest extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("tenantId")
    public String tenantId;

    public static QuerySensLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySensLevelRequest self = new QuerySensLevelRequest();
        return TeaModel.build(map, self);
    }

    public QuerySensLevelRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QuerySensLevelRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
