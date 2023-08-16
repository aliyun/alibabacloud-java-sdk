// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGuestApplicationsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("EndUserId")
    public String endUserId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeGuestApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGuestApplicationsRequest self = new DescribeGuestApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGuestApplicationsRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DescribeGuestApplicationsRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public DescribeGuestApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
