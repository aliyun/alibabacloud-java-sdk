// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentAccessKeyRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitoringAgentAccessKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentAccessKeyRequest self = new DescribeMonitoringAgentAccessKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentAccessKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
