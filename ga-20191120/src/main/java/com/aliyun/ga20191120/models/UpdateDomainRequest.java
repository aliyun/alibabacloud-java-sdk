// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TargetDomain")
    public String targetDomain;

    public static UpdateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRequest self = new UpdateDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDomainRequest setTargetDomain(String targetDomain) {
        this.targetDomain = targetDomain;
        return this;
    }
    public String getTargetDomain() {
        return this.targetDomain;
    }

}
