// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserResourcePackageRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The status of the resource plan. Valid values:</p>
     * <br>
     * <p>*   **valid**: valid</p>
     * <p>*   **closed**: expired</p>
     * <p>*   If you leave this parameter empty, all resource plans are queried.</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnUserResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserResourcePackageRequest self = new DescribeDcdnUserResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserResourcePackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnUserResourcePackageRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDcdnUserResourcePackageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
