// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeChildInstanceRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Regions")
    public java.util.List<DescribeChildInstanceRegionsResponseBodyRegions> regions;

    public static DescribeChildInstanceRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChildInstanceRegionsResponseBody self = new DescribeChildInstanceRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChildInstanceRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChildInstanceRegionsResponseBody setRegions(java.util.List<DescribeChildInstanceRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeChildInstanceRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public static class DescribeChildInstanceRegionsResponseBodyRegions extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeChildInstanceRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeChildInstanceRegionsResponseBodyRegions self = new DescribeChildInstanceRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeChildInstanceRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeChildInstanceRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
