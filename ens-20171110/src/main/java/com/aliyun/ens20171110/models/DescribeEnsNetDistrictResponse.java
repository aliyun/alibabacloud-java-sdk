// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEnsNetDistrictResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("EnsNetDistricts")
    @Validation(required = true)
    public DescribeEnsNetDistrictResponseEnsNetDistricts ensNetDistricts;

    public static DescribeEnsNetDistrictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnsNetDistrictResponse self = new DescribeEnsNetDistrictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEnsNetDistrictResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEnsNetDistrictResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeEnsNetDistrictResponse setEnsNetDistricts(DescribeEnsNetDistrictResponseEnsNetDistricts ensNetDistricts) {
        this.ensNetDistricts = ensNetDistricts;
        return this;
    }
    public DescribeEnsNetDistrictResponseEnsNetDistricts getEnsNetDistricts() {
        return this.ensNetDistricts;
    }

    public static class DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict extends TeaModel {
        @NameInMap("NetDistrictCode")
        @Validation(required = true)
        public String netDistrictCode;

        @NameInMap("NetDistrictName")
        @Validation(required = true)
        public String netDistrictName;

        @NameInMap("NetDistrictFatherCode")
        @Validation(required = true)
        public String netDistrictFatherCode;

        @NameInMap("EnsRegionIdCount")
        @Validation(required = true)
        public String ensRegionIdCount;

        @NameInMap("NetDistrictLevel")
        @Validation(required = true)
        public String netDistrictLevel;

        @NameInMap("NetDistrictEnName")
        @Validation(required = true)
        public String netDistrictEnName;

        public static DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict self = new DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictCode(String netDistrictCode) {
            this.netDistrictCode = netDistrictCode;
            return this;
        }
        public String getNetDistrictCode() {
            return this.netDistrictCode;
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictName(String netDistrictName) {
            this.netDistrictName = netDistrictName;
            return this;
        }
        public String getNetDistrictName() {
            return this.netDistrictName;
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictFatherCode(String netDistrictFatherCode) {
            this.netDistrictFatherCode = netDistrictFatherCode;
            return this;
        }
        public String getNetDistrictFatherCode() {
            return this.netDistrictFatherCode;
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setEnsRegionIdCount(String ensRegionIdCount) {
            this.ensRegionIdCount = ensRegionIdCount;
            return this;
        }
        public String getEnsRegionIdCount() {
            return this.ensRegionIdCount;
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictLevel(String netDistrictLevel) {
            this.netDistrictLevel = netDistrictLevel;
            return this;
        }
        public String getNetDistrictLevel() {
            return this.netDistrictLevel;
        }

        public DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict setNetDistrictEnName(String netDistrictEnName) {
            this.netDistrictEnName = netDistrictEnName;
            return this;
        }
        public String getNetDistrictEnName() {
            return this.netDistrictEnName;
        }

    }

    public static class DescribeEnsNetDistrictResponseEnsNetDistricts extends TeaModel {
        @NameInMap("EnsNetDistrict")
        @Validation(required = true)
        public java.util.List<DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict> ensNetDistrict;

        public static DescribeEnsNetDistrictResponseEnsNetDistricts build(java.util.Map<String, ?> map) throws Exception {
            DescribeEnsNetDistrictResponseEnsNetDistricts self = new DescribeEnsNetDistrictResponseEnsNetDistricts();
            return TeaModel.build(map, self);
        }

        public DescribeEnsNetDistrictResponseEnsNetDistricts setEnsNetDistrict(java.util.List<DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict> ensNetDistrict) {
            this.ensNetDistrict = ensNetDistrict;
            return this;
        }
        public java.util.List<DescribeEnsNetDistrictResponseEnsNetDistrictsEnsNetDistrict> getEnsNetDistrict() {
            return this.ensNetDistrict;
        }

    }

}
