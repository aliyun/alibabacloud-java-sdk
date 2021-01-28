// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRegionAndIspRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDcdnRegionAndIspRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRegionAndIspRequest self = new DescribeDcdnRegionAndIspRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRegionAndIspRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnRegionAndIspRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
