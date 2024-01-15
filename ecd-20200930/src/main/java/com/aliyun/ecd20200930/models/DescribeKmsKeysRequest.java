// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeKmsKeysRequest extends TeaModel {
    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~DescribeRegions~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeKmsKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKmsKeysRequest self = new DescribeKmsKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKmsKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
