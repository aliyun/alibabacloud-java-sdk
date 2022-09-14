// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("DescSort")
    public Boolean descSort;

    @NameInMap("FilterParams")
    public String filterParamsShrink;

    @NameInMap("MseSessionId")
    public String mseSessionId;

    @NameInMap("OrderItem")
    public String orderItem;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayServiceShrinkRequest self = new ListGatewayServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayServiceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayServiceShrinkRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayServiceShrinkRequest setFilterParamsShrink(String filterParamsShrink) {
        this.filterParamsShrink = filterParamsShrink;
        return this;
    }
    public String getFilterParamsShrink() {
        return this.filterParamsShrink;
    }

    public ListGatewayServiceShrinkRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public ListGatewayServiceShrinkRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayServiceShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayServiceShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
