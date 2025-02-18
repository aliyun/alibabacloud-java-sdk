// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyTenantConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the resource expiration reminder feature.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
