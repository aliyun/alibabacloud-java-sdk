// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingRequest extends TeaModel {
    /**
     * <p>The domain that you want to query. Valid types:</p>
     * <ul>
     * <li><p>Ingest domain</p>
     * </li>
     * <li><p>Main streaming domain</p>
     * </li>
     * <li><p>Sub-streaming domain</p>
     * </li>
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

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
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
