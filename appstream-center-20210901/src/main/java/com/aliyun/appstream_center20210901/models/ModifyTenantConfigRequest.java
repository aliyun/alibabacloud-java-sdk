// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantConfigRequest extends TeaModel {
    @NameInMap("AppInstanceGroupExpireRemind")
    public Boolean appInstanceGroupExpireRemind;

    public static ModifyTenantConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantConfigRequest self = new ModifyTenantConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantConfigRequest setAppInstanceGroupExpireRemind(Boolean appInstanceGroupExpireRemind) {
        this.appInstanceGroupExpireRemind = appInstanceGroupExpireRemind;
        return this;
    }
    public Boolean getAppInstanceGroupExpireRemind() {
        return this.appInstanceGroupExpireRemind;
    }

}
