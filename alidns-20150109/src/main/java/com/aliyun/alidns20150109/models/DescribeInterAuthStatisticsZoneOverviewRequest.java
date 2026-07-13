// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsZoneOverviewRequest extends TeaModel {
    /**
     * <p>The statistical period. Valid values: DAY, WEEK, and MONTH.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY、WEEK、MONTH</p>
     */
    @NameInMap("OverviewPeriod")
    public String overviewPeriod;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>DescribeInterAuthStatisticsZoneOverview</p>
     */
    @NameInMap("ServerRegion")
    public String serverRegion;

    /**
     * <p>The name of the zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cheng.suow.cc</p>
     */
    @NameInMap("ZoneName")
    public String zoneName;

    public static DescribeInterAuthStatisticsZoneOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsZoneOverviewRequest self = new DescribeInterAuthStatisticsZoneOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsZoneOverviewRequest setOverviewPeriod(String overviewPeriod) {
        this.overviewPeriod = overviewPeriod;
        return this;
    }
    public String getOverviewPeriod() {
        return this.overviewPeriod;
    }

    public DescribeInterAuthStatisticsZoneOverviewRequest setServerRegion(String serverRegion) {
        this.serverRegion = serverRegion;
        return this;
    }
    public String getServerRegion() {
        return this.serverRegion;
    }

    public DescribeInterAuthStatisticsZoneOverviewRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

}
