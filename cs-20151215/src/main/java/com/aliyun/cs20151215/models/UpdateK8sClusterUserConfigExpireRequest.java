// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateK8sClusterUserConfigExpireRequest extends TeaModel {
    /**
     * <p>The validity period of the kubeconfig file. Unit: hours.</p>
     * <br>
     * <p>> The value of expire_hour must be greater than 0 and equal to or smaller than 876000 (100 years).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("expire_hour")
    public Long expireHour;

    /**
     * <p>The user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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
