// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static DescribeCdnDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainRequest self = new DescribeCdnDomainRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public DescribeCdnDomainRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeCdnDomainRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
