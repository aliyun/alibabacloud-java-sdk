// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("EnsNetDistricts")
    @Validation(required = true)
    public DescribeEnsNetSaleDistrictResponseEnsNetDistricts ensNetDistricts;

    public static DescribeEnsNetSaleDistrictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetSaleDistrictResponse self = new DescribeEnsNetSaleDistrictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetSaleDistrictResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsNetSaleDistrictResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetSaleDistrictResponse setEnsNetDistricts(DescribeEnsNetSaleDistrictResponseEnsNetDistricts ensNetDistricts) {
        this.ensNetDistricts = ensNetDistricts;
        return this;
    }
    public DescribeEnsNetSaleDistrictResponseEnsNetDistricts getEnsNetDistricts() {
        return this.ensNetDistricts;
    }

    public static class DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict extends TeaModel {
        @NameInMap("NetDistrictCode")
        @Validation(required = true)
        public String netDistrictCode;

        @NameInMap("NetDistrictName")
        @Validation(required = true)
        public String netDistrictName;

        @NameInMap("EnsRegionIdCount")
        @Validation(required = true)
        public String ensRegionIdCount;

        @NameInMap("NetDistrictLevel")
        @Validation(required = true)
        public String netDistrictLevel;

        @NameInMap("NetDistrictFatherCode")
        @Validation(required = true)
        public String netDistrictFatherCode;

        @NameInMap("NetDistrictEnName")
        @Validation(required = true)
        public String netDistrictEnName;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public String instanceCount;

        public static DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict self = new DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictCode(String netDistrictCode) {
            this.netDistrictCode = netDistrictCode;
            return this;
        }
        public String getNetDistrictCode() {
            return this.netDistrictCode;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictName(String netDistrictName) {
            this.netDistrictName = netDistrictName;
            return this;
        }
        public String getNetDistrictName() {
            return this.netDistrictName;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setEnsRegionIdCount(String ensRegionIdCount) {
            this.ensRegionIdCount = ensRegionIdCount;
            return this;
        }
        public String getEnsRegionIdCount() {
            return this.ensRegionIdCount;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictLevel(String netDistrictLevel) {
            this.netDistrictLevel = netDistrictLevel;
            return this;
        }
        public String getNetDistrictLevel() {
            return this.netDistrictLevel;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictFatherCode(String netDistrictFatherCode) {
            this.netDistrictFatherCode = netDistrictFatherCode;
            return this;
        }
        public String getNetDistrictFatherCode() {
            return this.netDistrictFatherCode;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictEnName(String netDistrictEnName) {
            this.netDistrictEnName = netDistrictEnName;
            return this;
        }
        public String getNetDistrictEnName() {
            return this.netDistrictEnName;
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

    }

    public static class DescribeEnsNetSaleDistrictResponseEnsNetDistricts extends TeaModel {
        @NameInMap("EnsNetDistrict")
        @Validation(required = true)
        public java.util.List<DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict> ensNetDistrict;

        public static DescribeEnsNetSaleDistrictResponseEnsNetDistricts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetSaleDistrictResponseEnsNetDistricts self = new DescribeEnsNetSaleDistrictResponseEnsNetDistricts();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetSaleDistrictResponseEnsNetDistricts setEnsNetDistrict(java.util.List<DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict> ensNetDistrict) {
            this.ensNetDistrict = ensNetDistrict;
            return this;
        }
        public java.util.List<DescribeEnsNetSaleDistrictResponseEnsNetDistrictsEnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

    }

}
