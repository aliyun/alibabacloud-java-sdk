// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeUserSpnSummaryInfoResponseBody extends TeaModel {
    @NameInMap("InstanceFamilyList")
    public java.util.List<String> instanceFamilyList;

    @NameInMap("RegionList")
    public java.util.List<DescribeUserSpnSummaryInfoResponseBodyRegionList> regionList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpnCodeAndTypeList")
    public java.util.List<DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList> spnCodeAndTypeList;

    public static DescribeUserSpnSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserSpnSummaryInfoResponseBody self = new DescribeUserSpnSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserSpnSummaryInfoResponseBody setInstanceFamilyList(java.util.List<String> instanceFamilyList) {
        this.instanceFamilyList = instanceFamilyList;
        return this;
    }
    public java.util.List<String> getInstanceFamilyList() {
        return this.instanceFamilyList;
    }

    public DescribeUserSpnSummaryInfoResponseBody setRegionList(java.util.List<DescribeUserSpnSummaryInfoResponseBodyRegionList> regionList) {
        this.regionList = regionList;
        return this;
    }
    public java.util.List<DescribeUserSpnSummaryInfoResponseBodyRegionList> getRegionList() {
        return this.regionList;
    }

    public DescribeUserSpnSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserSpnSummaryInfoResponseBody setSpnCodeAndTypeList(java.util.List<DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList> spnCodeAndTypeList) {
        this.spnCodeAndTypeList = spnCodeAndTypeList;
        return this;
    }
    public java.util.List<DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList> getSpnCodeAndTypeList() {
        return this.spnCodeAndTypeList;
    }

    public static class DescribeUserSpnSummaryInfoResponseBodyRegionList extends TeaModel {
        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RegionName")
        public String regionName;

        public static DescribeUserSpnSummaryInfoResponseBodyRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserSpnSummaryInfoResponseBodyRegionList self = new DescribeUserSpnSummaryInfoResponseBodyRegionList();
            return TeaModel.build(map, self);
        }

        public DescribeUserSpnSummaryInfoResponseBodyRegionList setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public DescribeUserSpnSummaryInfoResponseBodyRegionList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

    public static class DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList extends TeaModel {
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("SpnCommodityCode")
        public String spnCommodityCode;

        @NameInMap("SpnType")
        public String spnType;

        @NameInMap("SpnTypeName")
        public String spnTypeName;

        public static DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList self = new DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList();
            return TeaModel.build(map, self);
        }

        public DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList setSpnCommodityCode(String spnCommodityCode) {
            this.spnCommodityCode = spnCommodityCode;
            return this;
        }
        public String getSpnCommodityCode() {
            return this.spnCommodityCode;
        }

        public DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList setSpnType(String spnType) {
            this.spnType = spnType;
            return this;
        }
        public String getSpnType() {
            return this.spnType;
        }

        public DescribeUserSpnSummaryInfoResponseBodySpnCodeAndTypeList setSpnTypeName(String spnTypeName) {
            this.spnTypeName = spnTypeName;
            return this;
        }
        public String getSpnTypeName() {
            return this.spnTypeName;
        }

    }

}
