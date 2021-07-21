// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitoringConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringConfigRequest self = new DescribeMonitoringConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
