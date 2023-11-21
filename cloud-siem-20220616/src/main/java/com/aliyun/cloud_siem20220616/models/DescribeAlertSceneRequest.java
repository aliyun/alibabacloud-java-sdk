// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertSceneRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlertSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSceneRequest self = new DescribeAlertSceneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSceneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
