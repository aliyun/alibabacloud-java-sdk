// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentStatusesRequest extends TeaModel {
    /**
     * <p>The ID of the availability monitoring task.</p>
     */
    @NameInMap("HostAvailabilityTaskId")
    public String hostAvailabilityTaskId;

    /**
     * <p>The instance IDs. Separate multiple instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeMonitoringAgentStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentStatusesRequest self = new DescribeMonitoringAgentStatusesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitoringAgentStatusesRequest setHostAvailabilityTaskId(String hostAvailabilityTaskId) {
        this.hostAvailabilityTaskId = hostAvailabilityTaskId;
        return this;
    }
    public String getHostAvailabilityTaskId() {
        return this.hostAvailabilityTaskId;
    }

    public DescribeMonitoringAgentStatusesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeMonitoringAgentStatusesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
