// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    /**
     * <strong>example:</strong>
     * <p>162FCE8D-CEEC-5083-90BF-B45D8C4F81FB</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <strong>example:</strong>
         * <p>gwlb.cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("RegionEndpoint")
        public String regionEndpoint;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
