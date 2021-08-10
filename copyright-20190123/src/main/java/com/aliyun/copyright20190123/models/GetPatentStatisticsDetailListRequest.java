// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class GetPatentStatisticsDetailListRequest extends TeaModel {
    @NameInMap("UserType")
    public String userType;

    @NameInMap("StartDate")
    public Long startDate;

    @NameInMap("EndDate")
    public Long endDate;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Type")
    public String type;

    @NameInMap("Discount")
    public String discount;

    @NameInMap("StartYear")
    public Integer startYear;

    @NameInMap("EndYear")
    public Integer endYear;

    public static GetPatentStatisticsDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatentStatisticsDetailListRequest self = new GetPatentStatisticsDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetPatentStatisticsDetailListRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public GetPatentStatisticsDetailListRequest setStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }
    public Long getStartDate() {
        return this.startDate;
    }

    public GetPatentStatisticsDetailListRequest setEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }
    public Long getEndDate() {
        return this.endDate;
    }

    public GetPatentStatisticsDetailListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public GetPatentStatisticsDetailListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetPatentStatisticsDetailListRequest setDiscount(String discount) {
        this.discount = discount;
        return this;
    }
    public String getDiscount() {
        return this.discount;
    }

    public GetPatentStatisticsDetailListRequest setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }
    public Integer getStartYear() {
        return this.startYear;
    }

    public GetPatentStatisticsDetailListRequest setEndYear(Integer endYear) {
        this.endYear = endYear;
        return this;
    }
    public Integer getEndYear() {
        return this.endYear;
    }

}
