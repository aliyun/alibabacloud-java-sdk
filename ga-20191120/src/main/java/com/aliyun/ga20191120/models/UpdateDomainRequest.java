// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateDomainRequest extends TeaModel {
    /**
     * <p>The new accelerated domain name.</p>
     * <br>
     * <p>Only primary domain names are supported, such as `example.net`.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The accelerated domain name to be modified.</p>
     */
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
