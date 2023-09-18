// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class Render3dAvatarRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Code")
    public String code;

    @NameInMap("TenantId")
    public Long tenantId;

    public static Render3dAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        Render3dAvatarRequest self = new Render3dAvatarRequest();
        return TeaModel.build(map, self);
    }

    public Render3dAvatarRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public Render3dAvatarRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Render3dAvatarRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
