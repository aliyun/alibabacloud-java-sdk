// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("EnsRegions")
    public DescribeEnsRegionsResponseBodyEnsRegions ensRegions;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionsResponseBody self = new DescribeEnsRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsRegionsResponseBody setEnsRegions(DescribeEnsRegionsResponseBodyEnsRegions ensRegions) {
        this.ensRegions = ensRegions;
        return this;
    }
    public DescribeEnsRegionsResponseBodyEnsRegions getEnsRegions() {
        return this.ensRegions;
    }

    public DescribeEnsRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Province")
        public String province;

        public static DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions self = new DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeEnsRegionsResponseBodyEnsRegions extends TeaModel {
        @NameInMap("EnsRegions")
        public java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> ensRegions;

        public static DescribeEnsRegionsResponseBodyEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseBodyEnsRegions self = new DescribeEnsRegionsResponseBodyEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseBodyEnsRegions setEnsRegions(java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> ensRegions) {
            this.ensRegions = ensRegions;
            return this;
        }
        public java.util.List<DescribeEnsRegionsResponseBodyEnsRegionsEnsRegions> getEnsRegions() {
            return this.ensRegions;
        }

    }

}
