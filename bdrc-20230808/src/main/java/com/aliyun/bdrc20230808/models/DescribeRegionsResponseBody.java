// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>Response parameters</p>
     */
    @NameInMap("Data")
    public DescribeRegionsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setData(DescribeRegionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeRegionsResponseBodyData getData() {
        return this.data;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyDataRegions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsResponseBodyDataRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyDataRegions self = new DescribeRegionsResponseBodyDataRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyDataRegions setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeRegionsResponseBodyDataRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeRegionsResponseBodyData extends TeaModel {
        /**
         * <p>Regions</p>
         */
        @NameInMap("Regions")
        public java.util.List<DescribeRegionsResponseBodyDataRegions> regions;

        public static DescribeRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyData self = new DescribeRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyData setRegions(java.util.List<DescribeRegionsResponseBodyDataRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<DescribeRegionsResponseBodyDataRegions> getRegions() {
            return this.regions;
        }

    }

}
