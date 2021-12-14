// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetDomainOwnerVerifyContentRequest extends TeaModel {
    // 直播域名
    @NameInMap("LiveDomainName")
    public String liveDomainName;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static GetDomainOwnerVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainOwnerVerifyContentRequest self = new GetDomainOwnerVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainOwnerVerifyContentRequest setLiveDomainName(String liveDomainName) {
        this.liveDomainName = liveDomainName;
        return this;
    }
    public String getLiveDomainName() {
        return this.liveDomainName;
    }

    public GetDomainOwnerVerifyContentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
