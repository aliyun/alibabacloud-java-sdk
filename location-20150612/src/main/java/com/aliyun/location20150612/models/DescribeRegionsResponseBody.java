// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionIds")
    public DescribeRegionsResponseBodyRegionIds regionIds;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setRegionIds(DescribeRegionsResponseBodyRegionIds regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public DescribeRegionsResponseBodyRegionIds getRegionIds() {
        return this.regionIds;
    }

    public static class DescribeRegionsResponseBodyRegionIds extends TeaModel {
        @NameInMap("RegionIds")
        public java.util.List<String> regionIds;

        public static DescribeRegionsResponseBodyRegionIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionIds self = new DescribeRegionsResponseBodyRegionIds();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionIds setRegionIds(java.util.List<String> regionIds) {
            this.regionIds = regionIds;
            return this;
        }
        public java.util.List<String> getRegionIds() {
            return this.regionIds;
        }

    }

}
