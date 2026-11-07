// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayAuthShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh (default): Chinese, en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>The filter conditions. Refer to the examples.</p>
     */
    @NameInMap("FilterParams")
    public String filterParamsShrink;

    /**
     * <p>This parameter is not available.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListGatewayAuthShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayAuthShrinkRequest self = new ListGatewayAuthShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGatewayAuthShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListGatewayAuthShrinkRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public ListGatewayAuthShrinkRequest setFilterParamsShrink(String filterParamsShrink) {
        this.filterParamsShrink = filterParamsShrink;
        return this;
    }
    public String getFilterParamsShrink() {
        return this.filterParamsShrink;
    }

    public ListGatewayAuthShrinkRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public ListGatewayAuthShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayAuthShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
