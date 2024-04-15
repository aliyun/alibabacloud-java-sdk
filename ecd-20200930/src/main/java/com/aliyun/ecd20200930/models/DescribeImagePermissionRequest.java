// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeImagePermissionRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeImagePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePermissionRequest self = new DescribeImagePermissionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePermissionRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public DescribeImagePermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
