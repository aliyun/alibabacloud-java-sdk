// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainStateRequest extends TeaModel {
    /**
     * <p>The accelerated domain name whose ICP filing status you want to update.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The region ID of the GA instance. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateDomainStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainStateRequest self = new UpdateDomainStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainStateRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateDomainStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
