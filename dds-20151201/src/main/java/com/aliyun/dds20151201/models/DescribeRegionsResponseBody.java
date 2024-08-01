// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>The regions.</p>
     */
    @NameInMap("Regions")
    public DescribeRegionsResponseBodyRegions regions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4E46C22C-D3B7-4DB8-9C76-63851BE68E20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(DescribeRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionsDdsRegionZonesZone extends TeaModel {
        /**
         * <p>Indicates whether a virtual private cloud (VPC) is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: VPC is supported.</li>
         * <li><strong>false</strong>: VPC is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcEnabled")
        public Boolean vpcEnabled;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The name of the zone.</p>
         * <p>The value of the ZoneName parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the ZoneId parameter in the response is <strong>cn-hangzhou-h</strong>, the following values are returned for the ZoneName parameter:</p>
         * <ul>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh</strong>, the value <strong>H</strong> is returned for the ZoneName parameter.</li>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en</strong>, the value <strong>Hangzhou Zone H</strong> is returned for the ZoneName parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou Zone H</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeRegionsResponseBodyRegionsDdsRegionZonesZone build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsDdsRegionZonesZone self = new DescribeRegionsResponseBodyRegionsDdsRegionZonesZone();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsDdsRegionZonesZone setVpcEnabled(Boolean vpcEnabled) {
            this.vpcEnabled = vpcEnabled;
            return this;
        }
        public Boolean getVpcEnabled() {
            return this.vpcEnabled;
        }

        public DescribeRegionsResponseBodyRegionsDdsRegionZonesZone setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeRegionsResponseBodyRegionsDdsRegionZonesZone setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsDdsRegionZones extends TeaModel {
        @NameInMap("Zone")
        public java.util.List<DescribeRegionsResponseBodyRegionsDdsRegionZonesZone> zone;

        public static DescribeRegionsResponseBodyRegionsDdsRegionZones build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsDdsRegionZones self = new DescribeRegionsResponseBodyRegionsDdsRegionZones();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsDdsRegionZones setZone(java.util.List<DescribeRegionsResponseBodyRegionsDdsRegionZonesZone> zone) {
            this.zone = zone;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsDdsRegionZonesZone> getZone() {
            return this.zone;
        }

    }

    public static class DescribeRegionsResponseBodyRegionsDdsRegion extends TeaModel {
        /**
         * <p>The public endpoint of the region.</p>
         * <p>For example, if the value of the RegionId parameter in the response is cn-hangzhou, the following value is returned for the EndPoint parameter:</p>
         * <ul>
         * <li>mongodb.aliyuncs.com</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mongodb.aliyuncs.com</p>
         */
        @NameInMap("EndPoint")
        public String endPoint;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         * <p>The value of the LocalName parameter is in the language that is specified by the <strong>AcceptLanguage</strong> parameter. For example, if the value of the RegionId parameter in the response is <strong>cn-hangzhou</strong>, the following values are returned for the LocalName parameter:</p>
         * <ul>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>zh</strong>, the value <strong>华东1（杭州）</strong> is returned for the LocalName parameter.</li>
         * <li>If the value of the <strong>AcceptLanguage</strong> parameter is <strong>en</strong>, the value <strong>China (Hangzhou)</strong> is returned for the LocalName parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The zones.</p>
         */
        @NameInMap("Zones")
        public DescribeRegionsResponseBodyRegionsDdsRegionZones zones;

        public static DescribeRegionsResponseBodyRegionsDdsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionsDdsRegion self = new DescribeRegionsResponseBodyRegionsDdsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionsDdsRegion setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

        public DescribeRegionsResponseBodyRegionsDdsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegionsDdsRegion setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeRegionsResponseBodyRegionsDdsRegion setZones(DescribeRegionsResponseBodyRegionsDdsRegionZones zones) {
            this.zones = zones;
            return this;
        }
        public DescribeRegionsResponseBodyRegionsDdsRegionZones getZones() {
            return this.zones;
        }

    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("DdsRegion")
        public java.util.List<DescribeRegionsResponseBodyRegionsDdsRegion> ddsRegion;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setDdsRegion(java.util.List<DescribeRegionsResponseBodyRegionsDdsRegion> ddsRegion) {
            this.ddsRegion = ddsRegion;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyRegionsDdsRegion> getDdsRegion() {
            return this.ddsRegion;
        }

    }

}
