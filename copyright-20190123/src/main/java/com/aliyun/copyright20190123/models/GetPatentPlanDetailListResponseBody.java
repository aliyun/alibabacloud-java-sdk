// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanDetailListResponseBody extends TeaModel {
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
    public java.util.List<GetPatentPlanDetailListResponseBodyData> data;

    public static GetPatentPlanDetailListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanDetailListResponseBody self = new GetPatentPlanDetailListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanDetailListResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetPatentPlanDetailListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPatentPlanDetailListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPatentPlanDetailListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public GetPatentPlanDetailListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPatentPlanDetailListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public GetPatentPlanDetailListResponseBody setData(java.util.List<GetPatentPlanDetailListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPatentPlanDetailListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetPatentPlanDetailListResponseBodyData extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("PaidDate")
        public String paidDate;

        @NameInMap("PlanPayDate")
        public String planPayDate;

        @NameInMap("SoldStatus")
        public Integer soldStatus;

        @NameInMap("ApplyNumber")
        public String applyNumber;

        @NameInMap("BizId")
        public String bizId;

        @NameInMap("GmtExpireDate")
        public String gmtExpireDate;

        @NameInMap("PlanId")
        public Long planId;

        @NameInMap("Year")
        public Integer year;

        @NameInMap("PayStatus")
        public Integer payStatus;

        @NameInMap("PlanDetailId")
        public Long planDetailId;

        @NameInMap("Agency")
        public String agency;

        @NameInMap("Discount")
        public Integer discount;

        @NameInMap("UidAgreement")
        public Boolean uidAgreement;

        @NameInMap("Name")
        public String name;

        public static GetPatentPlanDetailListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPatentPlanDetailListResponseBodyData self = new GetPatentPlanDetailListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPatentPlanDetailListResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetPatentPlanDetailListResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetPatentPlanDetailListResponseBodyData setPaidDate(String paidDate) {
            this.paidDate = paidDate;
            return this;
        }
        public String getPaidDate() {
            return this.paidDate;
        }

        public GetPatentPlanDetailListResponseBodyData setPlanPayDate(String planPayDate) {
            this.planPayDate = planPayDate;
            return this;
        }
        public String getPlanPayDate() {
            return this.planPayDate;
        }

        public GetPatentPlanDetailListResponseBodyData setSoldStatus(Integer soldStatus) {
            this.soldStatus = soldStatus;
            return this;
        }
        public Integer getSoldStatus() {
            return this.soldStatus;
        }

        public GetPatentPlanDetailListResponseBodyData setApplyNumber(String applyNumber) {
            this.applyNumber = applyNumber;
            return this;
        }
        public String getApplyNumber() {
            return this.applyNumber;
        }

        public GetPatentPlanDetailListResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetPatentPlanDetailListResponseBodyData setGmtExpireDate(String gmtExpireDate) {
            this.gmtExpireDate = gmtExpireDate;
            return this;
        }
        public String getGmtExpireDate() {
            return this.gmtExpireDate;
        }

        public GetPatentPlanDetailListResponseBodyData setPlanId(Long planId) {
            this.planId = planId;
            return this;
        }
        public Long getPlanId() {
            return this.planId;
        }

        public GetPatentPlanDetailListResponseBodyData setYear(Integer year) {
            this.year = year;
            return this;
        }
        public Integer getYear() {
            return this.year;
        }

        public GetPatentPlanDetailListResponseBodyData setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public GetPatentPlanDetailListResponseBodyData setPlanDetailId(Long planDetailId) {
            this.planDetailId = planDetailId;
            return this;
        }
        public Long getPlanDetailId() {
            return this.planDetailId;
        }

        public GetPatentPlanDetailListResponseBodyData setAgency(String agency) {
            this.agency = agency;
            return this;
        }
        public String getAgency() {
            return this.agency;
        }

        public GetPatentPlanDetailListResponseBodyData setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public GetPatentPlanDetailListResponseBodyData setUidAgreement(Boolean uidAgreement) {
            this.uidAgreement = uidAgreement;
            return this;
        }
        public Boolean getUidAgreement() {
            return this.uidAgreement;
        }

        public GetPatentPlanDetailListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
