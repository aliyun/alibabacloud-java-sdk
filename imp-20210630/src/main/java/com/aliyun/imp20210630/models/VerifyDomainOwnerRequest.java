// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerRequest extends TeaModel {
    // 直播域名
    @NameInMap("LiveDomainName")
    public String liveDomainName;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static VerifyDomainOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerRequest self = new VerifyDomainOwnerRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerRequest setLiveDomainName(String liveDomainName) {
        this.liveDomainName = liveDomainName;
        return this;
    }
    public String getLiveDomainName() {
        return this.liveDomainName;
    }

    public VerifyDomainOwnerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
