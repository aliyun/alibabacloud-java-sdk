// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeChildInstanceRegionsResponseBody extends TeaModel {
    /**
     * <p>A list of regions.</p>
     */
    @NameInMap("Regions")
    public DescribeChildInstanceRegionsResponseBodyRegions regions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChildInstanceRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChildInstanceRegionsResponseBody self = new DescribeChildInstanceRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChildInstanceRegionsResponseBody setRegions(DescribeChildInstanceRegionsResponseBodyRegions regions) {
        this.regions = regions;
        return this;
    }
    public DescribeChildInstanceRegionsResponseBodyRegions getRegions() {
        return this.regions;
    }

    public DescribeChildInstanceRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChildInstanceRegionsResponseBodyRegionsRegion extends TeaModel {
        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeChildInstanceRegionsResponseBodyRegionsRegion build(java.util.Map<String, ?> map) throws Exception {
            DescribeChildInstanceRegionsResponseBodyRegionsRegion self = new DescribeChildInstanceRegionsResponseBodyRegionsRegion();
            return TeaModel.build(map, self);
        }

        public DescribeChildInstanceRegionsResponseBodyRegionsRegion setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeChildInstanceRegionsResponseBodyRegionsRegion setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeChildInstanceRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("Region")
        public java.util.List<DescribeChildInstanceRegionsResponseBodyRegionsRegion> region;

        public static DescribeChildInstanceRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeChildInstanceRegionsResponseBodyRegions self = new DescribeChildInstanceRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeChildInstanceRegionsResponseBodyRegions setRegion(java.util.List<DescribeChildInstanceRegionsResponseBodyRegionsRegion> region) {
            this.region = region;
            return this;
        }
        public java.util.List<DescribeChildInstanceRegionsResponseBodyRegionsRegion> getRegion() {
            return this.region;
        }

    }

}
