// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ChangeLiveDomainResourceGroupRequest extends TeaModel {
    /**
     * <p>The ingest domain or streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the resource group to which the domain name is moved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-<strong><strong>ke6uuxw</strong></strong></p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static ChangeLiveDomainResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeLiveDomainResourceGroupRequest self = new ChangeLiveDomainResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeLiveDomainResourceGroupRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ChangeLiveDomainResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ChangeLiveDomainResourceGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ChangeLiveDomainResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
