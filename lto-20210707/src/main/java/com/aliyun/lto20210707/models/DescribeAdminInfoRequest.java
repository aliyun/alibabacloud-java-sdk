// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeAdminInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAdminInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAdminInfoRequest self = new DescribeAdminInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAdminInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
