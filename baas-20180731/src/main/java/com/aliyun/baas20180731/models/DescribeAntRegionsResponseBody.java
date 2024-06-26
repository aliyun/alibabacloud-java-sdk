// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeAntRegionsResponseBodyResult> result;

    public static DescribeAntRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntRegionsResponseBody self = new DescribeAntRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntRegionsResponseBody setResult(java.util.List<DescribeAntRegionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeAntRegionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeAntRegionsResponseBodyResult extends TeaModel {
        @NameInMap("LocalName")
        public String localName;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeAntRegionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntRegionsResponseBodyResult self = new DescribeAntRegionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntRegionsResponseBodyResult setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeAntRegionsResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
