// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserBuyStatusRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

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
