// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainRegionsForSaleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntChainRegionsForSaleResponseBodyResult> result;

    public static DescribeAntChainRegionsForSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainRegionsForSaleResponseBody self = new DescribeAntChainRegionsForSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainRegionsForSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainRegionsForSaleResponseBody setResult(java.util.List<DescribeAntChainRegionsForSaleResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntChainRegionsForSaleResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAntChainRegionsForSaleResponseBodyResult extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("TypeList")
        public java.util.List<String> typeList;

        public static DescribeAntChainRegionsForSaleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainRegionsForSaleResponseBodyResult self = new DescribeAntChainRegionsForSaleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainRegionsForSaleResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeAntChainRegionsForSaleResponseBodyResult setTypeList(java.util.List<String> typeList) {
            this.typeList = typeList;
            return this;
        }
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

    }

}
