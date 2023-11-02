// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertTypeRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlertTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertTypeRequest self = new DescribeAlertTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
