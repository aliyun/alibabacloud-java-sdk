// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWafScopeRequest extends TeaModel {
    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeWafScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWafScopeRequest self = new DescribeWafScopeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWafScopeRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeWafScopeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
