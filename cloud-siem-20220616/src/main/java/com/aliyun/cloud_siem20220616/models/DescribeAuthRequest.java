// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAuthRequest extends TeaModel {
    /**
     * <p>The region of the threat analysis center. Select a region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Select this value if your assets are deployed in the Chinese mainland or the China (Hong Kong) region.</p>
     * </li>
     * <li><p>ap-southeast-1: Select this value if your assets are deployed in regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthRequest self = new DescribeAuthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
