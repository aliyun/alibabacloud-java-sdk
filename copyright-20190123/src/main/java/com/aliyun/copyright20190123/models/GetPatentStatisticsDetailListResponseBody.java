// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentStatisticsDetailListResponseBody extends TeaModel {
    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<GetPatentStatisticsDetailListResponseBodyData> data;

    public static GetPatentStatisticsDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentStatisticsDetailListResponseBody self = new GetPatentStatisticsDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentStatisticsDetailListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetPatentStatisticsDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentStatisticsDetailListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentStatisticsDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public GetPatentStatisticsDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPatentStatisticsDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public GetPatentStatisticsDetailListResponseBody setData(java.util.List<GetPatentStatisticsDetailListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPatentStatisticsDetailListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetPatentStatisticsDetailListResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Year")
        public Integer year;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("Agency")
        public String agency;

        @NameInMap("ApplyNumber")
        public String applyNumber;

        @NameInMap("Discount")
        public String discount;

        @NameInMap("Name")
        public String name;

        @NameInMap("SalePrice")
        public Float salePrice;

        @NameInMap("Age")
        public String age;

        @NameInMap("PayEndDate")
        public String payEndDate;

        public static GetPatentStatisticsDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentStatisticsDetailListResponseBodyData self = new GetPatentStatisticsDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentStatisticsDetailListResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetPatentStatisticsDetailListResponseBodyData setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

        public GetPatentStatisticsDetailListResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPatentStatisticsDetailListResponseBodyData setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public GetPatentStatisticsDetailListResponseBodyData setAgency(String agency) {
            this.agency = agency;
            return this;
        }
        public String getAgency() {
            return this.agency;
        }

        public GetPatentStatisticsDetailListResponseBodyData setApplyNumber(String applyNumber) {
            this.applyNumber = applyNumber;
            return this;
        }
        public String getApplyNumber() {
            return this.applyNumber;
        }

        public GetPatentStatisticsDetailListResponseBodyData setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public GetPatentStatisticsDetailListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPatentStatisticsDetailListResponseBodyData setSalePrice(Float salePrice) {
            this.salePrice = salePrice;
            return this;
        }
        public Float getSalePrice() {
            return this.salePrice;
        }

        public GetPatentStatisticsDetailListResponseBodyData setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public GetPatentStatisticsDetailListResponseBodyData setPayEndDate(String payEndDate) {
            this.payEndDate = payEndDate;
            return this;
        }
        public String getPayEndDate() {
            return this.payEndDate;
        }

    }

}
