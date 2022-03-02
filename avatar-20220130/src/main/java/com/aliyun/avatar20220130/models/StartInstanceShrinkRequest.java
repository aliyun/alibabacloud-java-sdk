// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class StartInstanceShrinkRequest extends TeaModel {
    @NameInMap("App")
    public String appShrink;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("User")
    public String userShrink;

    public static StartInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceShrinkRequest self = new StartInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceShrinkRequest setAppShrink(String appShrink) {
        this.appShrink = appShrink;
        return this;
    }
    public String getAppShrink() {
        return this.appShrink;
    }

    public StartInstanceShrinkRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public StartInstanceShrinkRequest setUserShrink(String userShrink) {
        this.userShrink = userShrink;
        return this;
    }
    public String getUserShrink() {
        return this.userShrink;
    }

}
