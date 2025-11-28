// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAccountRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAccountRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountRoleRequest self = new DescribeAccountRoleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccountRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
