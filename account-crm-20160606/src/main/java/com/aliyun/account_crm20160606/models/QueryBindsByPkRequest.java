// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByPkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("TenantIds")
    public java.util.Map<String, ?> tenantIds;

    public static QueryBindsByPkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByPkRequest self = new QueryBindsByPkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBindsByPkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryBindsByPkRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public QueryBindsByPkRequest setTenantIds(java.util.Map<String, ?> tenantIds) {
        this.tenantIds = tenantIds;
        return this;
    }
    public java.util.Map<String, ?> getTenantIds() {
        return this.tenantIds;
    }

}
