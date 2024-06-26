// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRegionNamesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainRegionNamesResponseBodyResult> result;

    public static DescribeAntChainRegionNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRegionNamesResponseBody self = new DescribeAntChainRegionNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRegionNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainRegionNamesResponseBody setResult(java.util.List<DescribeAntChainRegionNamesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainRegionNamesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAntChainRegionNamesResponseBodyResult extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeAntChainRegionNamesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainRegionNamesResponseBodyResult self = new DescribeAntChainRegionNamesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainRegionNamesResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAntChainRegionNamesResponseBodyResult setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
