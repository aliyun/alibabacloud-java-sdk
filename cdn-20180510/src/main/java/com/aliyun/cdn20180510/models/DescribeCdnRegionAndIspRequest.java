// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnRegionAndIspRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeCdnRegionAndIspRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnRegionAndIspRequest self = new DescribeCdnRegionAndIspRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnRegionAndIspRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnRegionAndIspRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
