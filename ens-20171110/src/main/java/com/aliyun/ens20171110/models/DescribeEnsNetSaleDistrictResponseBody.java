// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetSaleDistrictResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("EnsNetDistricts")
    public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts ensNetDistricts;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsNetSaleDistrictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetSaleDistrictResponseBody self = new DescribeEnsNetSaleDistrictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetSaleDistrictResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetSaleDistrictResponseBody setEnsNetDistricts(DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts ensNetDistricts) {
        this.ensNetDistricts = ensNetDistricts;
        return this;
    }
    public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts getEnsNetDistricts() {
        return this.ensNetDistricts;
    }

    public DescribeEnsNetSaleDistrictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict extends TeaModel {
        @NameInMap("EnsRegionIdCount")
        public String ensRegionIdCount;

        @NameInMap("InstanceCount")
        public String instanceCount;

        @NameInMap("NetDistrictCode")
        public String netDistrictCode;

        @NameInMap("NetDistrictEnName")
        public String netDistrictEnName;

        @NameInMap("NetDistrictFatherCode")
        public String netDistrictFatherCode;

        @NameInMap("NetDistrictLevel")
        public String netDistrictLevel;

        @NameInMap("NetDistrictName")
        public String netDistrictName;

        public static DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict self = new DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setEnsRegionIdCount(String ensRegionIdCount) {
            this.ensRegionIdCount = ensRegionIdCount;
            return this;
        }
        public String getEnsRegionIdCount() {
            return this.ensRegionIdCount;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictCode(String netDistrictCode) {
            this.netDistrictCode = netDistrictCode;
            return this;
        }
        public String getNetDistrictCode() {
            return this.netDistrictCode;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictEnName(String netDistrictEnName) {
            this.netDistrictEnName = netDistrictEnName;
            return this;
        }
        public String getNetDistrictEnName() {
            return this.netDistrictEnName;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictFatherCode(String netDistrictFatherCode) {
            this.netDistrictFatherCode = netDistrictFatherCode;
            return this;
        }
        public String getNetDistrictFatherCode() {
            return this.netDistrictFatherCode;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictLevel(String netDistrictLevel) {
            this.netDistrictLevel = netDistrictLevel;
            return this;
        }
        public String getNetDistrictLevel() {
            return this.netDistrictLevel;
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictName(String netDistrictName) {
            this.netDistrictName = netDistrictName;
            return this;
        }
        public String getNetDistrictName() {
            return this.netDistrictName;
        }

    }

    public static class DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts extends TeaModel {
        @NameInMap("EnsNetDistrict")
        public java.util.List<DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> ensNetDistrict;

        public static DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts self = new DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetSaleDistrictResponseBodyEnsNetDistricts setEnsNetDistrict(java.util.List<DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> ensNetDistrict) {
            this.ensNetDistrict = ensNetDistrict;
            return this;
        }
        public java.util.List<DescribeEnsNetSaleDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

    }

}
