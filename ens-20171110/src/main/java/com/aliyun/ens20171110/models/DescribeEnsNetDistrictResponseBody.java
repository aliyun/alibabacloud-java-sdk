// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("EnsNetDistricts")
    public DescribeEnsNetDistrictResponseBodyEnsNetDistricts ensNetDistricts;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEnsNetDistrictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictResponseBody self = new DescribeEnsNetDistrictResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetDistrictResponseBody setEnsNetDistricts(DescribeEnsNetDistrictResponseBodyEnsNetDistricts ensNetDistricts) {
        this.ensNetDistricts = ensNetDistricts;
        return this;
    }
    public DescribeEnsNetDistrictResponseBodyEnsNetDistricts getEnsNetDistricts() {
        return this.ensNetDistricts;
    }

    public DescribeEnsNetDistrictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict extends TeaModel {
        @NameInMap("EnsRegionIdCount")
        public String ensRegionIdCount;

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

        public static DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict self = new DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setEnsRegionIdCount(String ensRegionIdCount) {
            this.ensRegionIdCount = ensRegionIdCount;
            return this;
        }
        public String getEnsRegionIdCount() {
            return this.ensRegionIdCount;
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictCode(String netDistrictCode) {
            this.netDistrictCode = netDistrictCode;
            return this;
        }
        public String getNetDistrictCode() {
            return this.netDistrictCode;
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictEnName(String netDistrictEnName) {
            this.netDistrictEnName = netDistrictEnName;
            return this;
        }
        public String getNetDistrictEnName() {
            return this.netDistrictEnName;
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictFatherCode(String netDistrictFatherCode) {
            this.netDistrictFatherCode = netDistrictFatherCode;
            return this;
        }
        public String getNetDistrictFatherCode() {
            return this.netDistrictFatherCode;
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictLevel(String netDistrictLevel) {
            this.netDistrictLevel = netDistrictLevel;
            return this;
        }
        public String getNetDistrictLevel() {
            return this.netDistrictLevel;
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict setNetDistrictName(String netDistrictName) {
            this.netDistrictName = netDistrictName;
            return this;
        }
        public String getNetDistrictName() {
            return this.netDistrictName;
        }

    }

    public static class DescribeEnsNetDistrictResponseBodyEnsNetDistricts extends TeaModel {
        @NameInMap("EnsNetDistrict")
        public java.util.List<DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> ensNetDistrict;

        public static DescribeEnsNetDistrictResponseBodyEnsNetDistricts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetDistrictResponseBodyEnsNetDistricts self = new DescribeEnsNetDistrictResponseBodyEnsNetDistricts();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetDistrictResponseBodyEnsNetDistricts setEnsNetDistrict(java.util.List<DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> ensNetDistrict) {
            this.ensNetDistrict = ensNetDistrict;
            return this;
        }
        public java.util.List<DescribeEnsNetDistrictResponseBodyEnsNetDistrictsEnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

    }

}
