// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryBindsByPkShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantIds")
    public String tenantIdsShrink;

    public static QueryBindsByPkShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBindsByPkShrinkRequest self = new QueryBindsByPkShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBindsByPkShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryBindsByPkShrinkRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public QueryBindsByPkShrinkRequest setTenantIdsShrink(String tenantIdsShrink) {
        this.tenantIdsShrink = tenantIdsShrink;
        return this;
    }
    public String getTenantIdsShrink() {
        return this.tenantIdsShrink;
    }

}
