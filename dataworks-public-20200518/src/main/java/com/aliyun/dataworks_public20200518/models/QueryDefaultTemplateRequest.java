// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDefaultTemplateRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static QueryDefaultTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDefaultTemplateRequest self = new QueryDefaultTemplateRequest();
        return TeaModel.build(map, self);
    }

    public QueryDefaultTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
