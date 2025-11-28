// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeStatDeviceInfoRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeStatDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatDeviceInfoRequest self = new DescribeStatDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatDeviceInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
