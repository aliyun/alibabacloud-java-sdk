// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryOperationIndexRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ShopIdList")
    public java.util.List<String> shopIdList;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryOperationIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationIndexRequest self = new QueryOperationIndexRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationIndexRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryOperationIndexRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryOperationIndexRequest setShopIdList(java.util.List<String> shopIdList) {
        this.shopIdList = shopIdList;
        return this;
    }
    public java.util.List<String> getShopIdList() {
        return this.shopIdList;
    }

    public QueryOperationIndexRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
