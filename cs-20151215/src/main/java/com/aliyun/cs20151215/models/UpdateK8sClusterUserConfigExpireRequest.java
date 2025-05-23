// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateK8sClusterUserConfigExpireRequest extends TeaModel {
    /**
     * <p>Specifies the expiration time of the kubeconfig file. Unit: hours.</p>
     * <p>Valid values: [1, 1876000]. The maximum value is 100 years.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("expire_hour")
    public Long expireHour;

    /**
     * <p>The RAM user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The ID of the Resource Access Management (RAM) user that you use.</p>
     */
    @NameInMap("user")
    public String user;

    public static UpdateK8sClusterUserConfigExpireRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sClusterUserConfigExpireRequest self = new UpdateK8sClusterUserConfigExpireRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sClusterUserConfigExpireRequest setExpireHour(Long expireHour) {
        this.expireHour = expireHour;
        return this;
    }
    public Long getExpireHour() {
        return this.expireHour;
    }

    public UpdateK8sClusterUserConfigExpireRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
