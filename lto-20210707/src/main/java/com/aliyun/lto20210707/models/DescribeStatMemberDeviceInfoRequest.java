// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatMemberDeviceInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeStatMemberDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatMemberDeviceInfoRequest self = new DescribeStatMemberDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatMemberDeviceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
