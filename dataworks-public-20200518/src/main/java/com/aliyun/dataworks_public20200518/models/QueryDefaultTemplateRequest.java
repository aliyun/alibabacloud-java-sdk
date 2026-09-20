// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryDefaultTemplateRequest extends TeaModel {
    /**
     * <p>The tenant ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>, go to the DataStudio page, click your username in the upper-right corner, and choose Menu &gt; User Info to obtain the tenant ID.</p>
     * <p>You can also obtain the tenant ID from Data.TenantId in the response of the GetProject operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024102</p>
     */
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
