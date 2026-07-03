// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusRequest extends TeaModel {
    /**
     * <p>The region of the Data Management hub. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: For assets in the Chinese mainland and China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: For assets in regions outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusRequest self = new DescribeServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
