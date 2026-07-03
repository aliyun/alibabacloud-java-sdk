// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserBuyStatusRequest extends TeaModel {
    /**
     * <p>The region of the Data Management center for threat analysis. Select a region for the management center based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland or China (Hong Kong).</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>123XXXXXX</p>
     */
    @NameInMap("SubUserId")
    public Long subUserId;

    public static DescribeUserBuyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyStatusRequest self = new DescribeUserBuyStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeUserBuyStatusRequest setSubUserId(Long subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public Long getSubUserId() {
        return this.subUserId;
    }

}
