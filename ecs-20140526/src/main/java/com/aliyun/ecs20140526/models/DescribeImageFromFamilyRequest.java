// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageFromFamilyRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ImageFamily")
    @Validation(required = true)
    public String imageFamily;

    public static DescribeImageFromFamilyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageFromFamilyRequest self = new DescribeImageFromFamilyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageFromFamilyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageFromFamilyRequest setImageFamily(String imageFamily) {
        this.imageFamily = imageFamily;
        return this;
    }
    public String getImageFamily() {
        return this.imageFamily;
    }

}
