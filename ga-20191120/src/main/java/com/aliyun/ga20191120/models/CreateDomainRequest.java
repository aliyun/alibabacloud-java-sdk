// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance.</p>
     * <p>You can enter up to 50 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AcceleratorIds")
    public java.util.List<String> acceleratorIds;

    /**
     * <p>The accelerated domain name to be added.</p>
     * <p>Wildcard domain names are supported. A wildcard domain name must start with <code>*.</code>, such as <code>*.example.com</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setAcceleratorIds(java.util.List<String> acceleratorIds) {
        this.acceleratorIds = acceleratorIds;
        return this;
    }
    public java.util.List<String> getAcceleratorIds() {
        return this.acceleratorIds;
    }

    public CreateDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
