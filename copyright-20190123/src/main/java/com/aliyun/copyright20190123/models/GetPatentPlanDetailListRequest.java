// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentPlanDetailListRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PlanId")
    public Long planId;

    @NameInMap("Type")
    public String type;

    @NameInMap("PayStatus")
    public Integer payStatus;

    @NameInMap("SoldStatus")
    public Integer soldStatus;

    @NameInMap("StartYear")
    public Integer startYear;

    @NameInMap("EndYear")
    public Integer endYear;

    @NameInMap("Discount")
    public String discount;

    public static GetPatentPlanDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatentPlanDetailListRequest self = new GetPatentPlanDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetPatentPlanDetailListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetPatentPlanDetailListRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public GetPatentPlanDetailListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPatentPlanDetailListRequest setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
        return this;
    }
    public Integer getPayStatus() {
        return this.payStatus;
    }

    public GetPatentPlanDetailListRequest setSoldStatus(Integer soldStatus) {
        this.soldStatus = soldStatus;
        return this;
    }
    public Integer getSoldStatus() {
        return this.soldStatus;
    }

    public GetPatentPlanDetailListRequest setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }
    public Integer getStartYear() {
        return this.startYear;
    }

    public GetPatentPlanDetailListRequest setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }
    public Integer getEndYear() {
        return this.endYear;
    }

    public GetPatentPlanDetailListRequest setDiscount(String discount) {
        this.discount = discount;
        return this;
    }
    public String getDiscount() {
        return this.discount;
    }

}
