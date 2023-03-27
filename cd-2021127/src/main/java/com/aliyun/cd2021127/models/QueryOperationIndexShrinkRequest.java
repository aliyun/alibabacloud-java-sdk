// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class QueryOperationIndexShrinkRequest extends TeaModel {
    @NameInMap("Country")
    public String country;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ShopIdList")
    public String shopIdListShrink;

    @NameInMap("StartDate")
    public String startDate;

    public static QueryOperationIndexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationIndexShrinkRequest self = new QueryOperationIndexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationIndexShrinkRequest setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryOperationIndexShrinkRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryOperationIndexShrinkRequest setShopIdListShrink(String shopIdListShrink) {
        this.shopIdListShrink = shopIdListShrink;
        return this;
    }
    public String getShopIdListShrink() {
        return this.shopIdListShrink;
    }

    public QueryOperationIndexShrinkRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
