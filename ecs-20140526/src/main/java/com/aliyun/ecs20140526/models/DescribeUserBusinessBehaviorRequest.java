// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeUserBusinessBehaviorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("statusKey")
    @Validation(required = true)
    public String statusKey;

    public static DescribeUserBusinessBehaviorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBusinessBehaviorRequest self = new DescribeUserBusinessBehaviorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBusinessBehaviorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserBusinessBehaviorRequest setStatusKey(String statusKey) {
        this.statusKey = statusKey;
        return this;
    }
    public String getStatusKey() {
        return this.statusKey;
    }

}
