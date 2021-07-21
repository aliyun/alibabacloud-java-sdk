// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentConfigRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitoringAgentConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentConfigRequest self = new DescribeMonitoringAgentConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
