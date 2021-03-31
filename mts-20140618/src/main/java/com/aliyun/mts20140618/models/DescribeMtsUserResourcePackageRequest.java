// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DescribeMtsUserResourcePackageRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeMtsUserResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMtsUserResourcePackageRequest self = new DescribeMtsUserResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMtsUserResourcePackageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeMtsUserResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
