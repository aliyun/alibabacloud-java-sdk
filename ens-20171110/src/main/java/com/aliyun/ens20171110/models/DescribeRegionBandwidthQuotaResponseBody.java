// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionBandwidthQuotaResponseBody extends TeaModel {
    @NameInMap("BandwidthQuota")
    public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota> bandwidthQuota;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionBandwidthQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionBandwidthQuotaResponseBody self = new DescribeRegionBandwidthQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionBandwidthQuotaResponseBody setBandwidthQuota(java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota> bandwidthQuota) {
        this.bandwidthQuota = bandwidthQuota;
        return this;
    }
    public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota> getBandwidthQuota() {
        return this.bandwidthQuota;
    }

    public DescribeRegionBandwidthQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo extends TeaModel {
        @NameInMap("Isp")
        public String isp;

        @NameInMap("MonthAverageQuota")
        public Long monthAverageQuota;

        @NameInMap("MonthMax")
        public Long monthMax;

        @NameInMap("WeekAverageQuota")
        public Long weekAverageQuota;

        @NameInMap("WeekMax")
        public Long weekMax;

        public static DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo self = new DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo setMonthAverageQuota(Long monthAverageQuota) {
            this.monthAverageQuota = monthAverageQuota;
            return this;
        }
        public Long getMonthAverageQuota() {
            return this.monthAverageQuota;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo setMonthMax(Long monthMax) {
            this.monthMax = monthMax;
            return this;
        }
        public Long getMonthMax() {
            return this.monthMax;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo setWeekAverageQuota(Long weekAverageQuota) {
            this.weekAverageQuota = weekAverageQuota;
            return this;
        }
        public Long getWeekAverageQuota() {
            return this.weekAverageQuota;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo setWeekMax(Long weekMax) {
            this.weekMax = weekMax;
            return this;
        }
        public Long getWeekMax() {
            return this.weekMax;
        }

    }

    public static class DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo extends TeaModel {
        @NameInMap("InstanceNumber")
        public Long instanceNumber;

        @NameInMap("InstanceSpec")
        public String instanceSpec;

        public static DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo self = new DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo setInstanceNumber(Long instanceNumber) {
            this.instanceNumber = instanceNumber;
            return this;
        }
        public Long getInstanceNumber() {
            return this.instanceNumber;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo setInstanceSpec(String instanceSpec) {
            this.instanceSpec = instanceSpec;
            return this;
        }
        public String getInstanceSpec() {
            return this.instanceSpec;
        }

    }

    public static class DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota extends TeaModel {
        @NameInMap("BandwidthInfo")
        public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo> bandwidthInfo;

        @NameInMap("Date")
        public String date;

        @NameInMap("InstanceInfo")
        public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo> instanceInfo;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota self = new DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota();
            return TeaModel.build(map, self);
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota setBandwidthInfo(java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo> bandwidthInfo) {
            this.bandwidthInfo = bandwidthInfo;
            return this;
        }
        public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaBandwidthInfo> getBandwidthInfo() {
            return this.bandwidthInfo;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota setInstanceInfo(java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public java.util.List<DescribeRegionBandwidthQuotaResponseBodyBandwidthQuotaInstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

        public DescribeRegionBandwidthQuotaResponseBodyBandwidthQuota setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
