// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class DescribeAnycastServerRegionsResponseBody extends TeaModel {
    /**
     * <p>The list of regions where you can associate Anycast EIPs with backend servers.</p>
     */
    @NameInMap("AnycastServerRegionList")
    public java.util.List<DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList> anycastServerRegionList;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAnycastServerRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAnycastServerRegionsResponseBody self = new DescribeAnycastServerRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAnycastServerRegionsResponseBody setAnycastServerRegionList(java.util.List<DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList> anycastServerRegionList) {
        this.anycastServerRegionList = anycastServerRegionList;
        return this;
    }
    public java.util.List<DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList> getAnycastServerRegionList() {
        return this.anycastServerRegionList;
    }

    public DescribeAnycastServerRegionsResponseBody setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public DescribeAnycastServerRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList self = new DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAnycastServerRegionsResponseBodyAnycastServerRegionList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
