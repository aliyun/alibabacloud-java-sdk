// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingRequest extends TeaModel {
    /**
     * <p>The domain name for which you want to query the mappings. The following types of domain names are supported:</p>
     * <ul>
     * <li>Ingest domain</li>
     * <li>Main streaming domain</li>
     * <li>Sub-streaming domain</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeLiveDomainMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingRequest self = new DescribeLiveDomainMappingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainMappingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
