// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsRegionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("EnsRegions")
    @Validation(required = true)
    public DescribeEnsRegionsResponseEnsRegions ensRegions;

    public static DescribeEnsRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsRegionsResponse self = new DescribeEnsRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsRegionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsRegionsResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsRegionsResponse setEnsRegions(DescribeEnsRegionsResponseEnsRegions ensRegions) {
        this.ensRegions = ensRegions;
        return this;
    }
    public DescribeEnsRegionsResponseEnsRegions getEnsRegions() {
        return this.ensRegions;
    }

    public static class DescribeEnsRegionsResponseEnsRegionsEnsRegions extends TeaModel {
        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EnName")
        @Validation(required = true)
        public String enName;

        @NameInMap("Area")
        @Validation(required = true)
        public String area;

        @NameInMap("Province")
        @Validation(required = true)
        public String province;

        public static DescribeEnsRegionsResponseEnsRegionsEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseEnsRegionsEnsRegions self = new DescribeEnsRegionsResponseEnsRegionsEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseEnsRegionsEnsRegions setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeEnsRegionsResponseEnsRegionsEnsRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEnsRegionsResponseEnsRegionsEnsRegions setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeEnsRegionsResponseEnsRegionsEnsRegions setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeEnsRegionsResponseEnsRegionsEnsRegions setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class DescribeEnsRegionsResponseEnsRegions extends TeaModel {
        @NameInMap("EnsRegions")
        @Validation(required = true)
        public java.util.List<DescribeEnsRegionsResponseEnsRegionsEnsRegions> ensRegions;

        public static DescribeEnsRegionsResponseEnsRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsRegionsResponseEnsRegions self = new DescribeEnsRegionsResponseEnsRegions();
            return TeaModel.build(map, self);
        }

        public DescribeEnsRegionsResponseEnsRegions setEnsRegions(java.util.List<DescribeEnsRegionsResponseEnsRegionsEnsRegions> ensRegions) {
            this.ensRegions = ensRegions;
            return this;
        }
        public java.util.List<DescribeEnsRegionsResponseEnsRegionsEnsRegions> getEnsRegions() {
            return this.ensRegions;
        }

    }

}
