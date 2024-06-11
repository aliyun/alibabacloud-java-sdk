// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    @NameInMap("RegionModels")
    public java.util.List<DescribeRegionsResponseBodyRegionModels> regionModels;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setRegionModels(java.util.List<DescribeRegionsResponseBodyRegionModels> regionModels) {
        this.regionModels = regionModels;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegionModels> getRegionModels() {
        return this.regionModels;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionsResponseBodyRegionModels extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeRegionsResponseBodyRegionModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegionModels self = new DescribeRegionsResponseBodyRegionModels();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegionModels setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
