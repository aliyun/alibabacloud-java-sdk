// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRelatedAuthorizationStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeRelatedAuthorizationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRelatedAuthorizationStatusRequest self = new DescribeRelatedAuthorizationStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRelatedAuthorizationStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
