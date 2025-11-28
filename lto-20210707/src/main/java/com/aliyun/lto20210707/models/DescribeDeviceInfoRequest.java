// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeDeviceInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceInfoRequest self = new DescribeDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
