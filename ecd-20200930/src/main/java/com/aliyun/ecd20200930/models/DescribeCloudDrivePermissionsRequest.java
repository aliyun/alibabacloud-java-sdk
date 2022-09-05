// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCloudDrivePermissionsRequest extends TeaModel {
    @NameInMap("CdsId")
    public String cdsId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCloudDrivePermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDrivePermissionsRequest self = new DescribeCloudDrivePermissionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDrivePermissionsRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public DescribeCloudDrivePermissionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
