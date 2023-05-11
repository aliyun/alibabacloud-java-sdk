// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentProcessesRequest extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitoringAgentProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentProcessesRequest self = new DescribeMonitoringAgentProcessesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentProcessesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitoringAgentProcessesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
