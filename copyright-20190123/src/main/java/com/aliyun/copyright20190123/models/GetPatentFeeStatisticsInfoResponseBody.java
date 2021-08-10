// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentFeeStatisticsInfoResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetPatentFeeStatisticsInfoResponseBodyData data;

    public static GetPatentFeeStatisticsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentFeeStatisticsInfoResponseBody self = new GetPatentFeeStatisticsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentFeeStatisticsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentFeeStatisticsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentFeeStatisticsInfoResponseBody setData(GetPatentFeeStatisticsInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPatentFeeStatisticsInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("SalePrice")
        public Float salePrice;

        @NameInMap("Age")
        public String age;

        @NameInMap("Count")
        public Integer count;

        public static GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo self = new GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo();
            return TeaModel.build(map, self);
        }

        public GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo setSalePrice(Float salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Float getSalePrice() {
            return this.salePrice;
        }

        public GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetPatentFeeStatisticsInfoResponseBodyData extends TeaModel {
        @NameInMap("UserType")
        public String userType;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("UsedCount")
        public Integer usedCount;

        @NameInMap("ShiyongCount")
        public Integer shiyongCount;

        @NameInMap("WaiguanCount")
        public Integer waiguanCount;

        @NameInMap("TotalPrice")
        public Float totalPrice;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("FreeCount")
        public Integer freeCount;

        @NameInMap("FamingCount")
        public Integer famingCount;

        @NameInMap("AgeInfo")
        public java.util.List<GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo> ageInfo;

        public static GetPatentFeeStatisticsInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentFeeStatisticsInfoResponseBodyData self = new GetPatentFeeStatisticsInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setUsedCount(Integer usedCount) {
            this.usedCount = usedCount;
            return this;
        }
        public Integer getUsedCount() {
            return this.usedCount;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setShiyongCount(Integer shiyongCount) {
            this.shiyongCount = shiyongCount;
            return this;
        }
        public Integer getShiyongCount() {
            return this.shiyongCount;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setWaiguanCount(Integer waiguanCount) {
            this.waiguanCount = waiguanCount;
            return this;
        }
        public Integer getWaiguanCount() {
            return this.waiguanCount;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setTotalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Float getTotalPrice() {
            return this.totalPrice;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setFreeCount(Integer freeCount) {
            this.freeCount = freeCount;
            return this;
        }
        public Integer getFreeCount() {
            return this.freeCount;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setFamingCount(Integer famingCount) {
            this.famingCount = famingCount;
            return this;
        }
        public Integer getFamingCount() {
            return this.famingCount;
        }

        public GetPatentFeeStatisticsInfoResponseBodyData setAgeInfo(java.util.List<GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo> ageInfo) {
            this.ageInfo = ageInfo;
            return this;
        }
        public java.util.List<GetPatentFeeStatisticsInfoResponseBodyDataAgeInfo> getAgeInfo() {
            return this.ageInfo;
        }

    }

}
