// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGuestApplicationsRequest extends TeaModel {
    /**
     * <p>The ID of the cloud computer.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    /**
     * <p>The ID of the end user.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
