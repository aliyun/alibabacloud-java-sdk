// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceShrinkRequest extends TeaModel {
    /**
     * <p>systemError</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>duplicated cluster alias name</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>mse-100-007</p>
     */
    @NameInMap("FilterParams")
    public String filterParamsShrink;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>code</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>mse-200-105</p>
     */
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
