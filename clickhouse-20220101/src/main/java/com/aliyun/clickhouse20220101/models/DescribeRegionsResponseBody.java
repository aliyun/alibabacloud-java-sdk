// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRegionsResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setData(java.util.List<DescribeRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyDataZones extends TeaModel {
        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeRegionsResponseBodyDataZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDataZones self = new DescribeRegionsResponseBodyDataZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDataZones setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

        public DescribeRegionsResponseBodyDataZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Zones")
        public java.util.List<DescribeRegionsResponseBodyDataZones> zones;

        public static DescribeRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyData self = new DescribeRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyData setZones(java.util.List<DescribeRegionsResponseBodyDataZones> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDataZones> getZones() {
            return this.zones;
        }

    }

}
