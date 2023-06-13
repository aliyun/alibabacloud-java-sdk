// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayServiceShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>Specifies whether to enable sorting.</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>The parameters that are used to specify filter conditions. The values of the parameters are in the format of {"key1":"value1"}.</p>
     */
    @NameInMap("FilterParams")
    public String filterParamsShrink;

    /**
     * <p>The item based on which entries are sorted.</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
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
