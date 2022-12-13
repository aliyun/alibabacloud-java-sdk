// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    // The list of regions.
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        // The name of the region.
        // 
        // > If the AcceptLanguage parameter is set to zh-CN, the Chinese name of the region is returned. If the AcceptLanguage parameter is set to zh-US or left empty, the English name of the region is returned.
        @NameInMap("LocalName")
        public String localName;

        // The endpoint of the region.
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        // The ID of the region.
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyRegions setRegionEndpoint(String regionEndpoint) {
            this.regionEndpoint = regionEndpoint;
            return this;
        }
        public String getRegionEndpoint() {
            return this.regionEndpoint;
        }

        public DescribeRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
