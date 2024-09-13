// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GatewayBlackWhiteListShrinkRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is unavailable for public use.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("DescSort")
    public Boolean descSort;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("FilterParams")
    public String filterParamsShrink;

    /**
     * <p>This parameter is unavailable for public use.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("OrderItem")
    public String orderItem;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GatewayBlackWhiteListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GatewayBlackWhiteListShrinkRequest self = new GatewayBlackWhiteListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GatewayBlackWhiteListShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GatewayBlackWhiteListShrinkRequest setDescSort(Boolean descSort) {
        this.descSort = descSort;
        return this;
    }
    public Boolean getDescSort() {
        return this.descSort;
    }

    public GatewayBlackWhiteListShrinkRequest setFilterParamsShrink(String filterParamsShrink) {
        this.filterParamsShrink = filterParamsShrink;
        return this;
    }
    public String getFilterParamsShrink() {
        return this.filterParamsShrink;
    }

    public GatewayBlackWhiteListShrinkRequest setOrderItem(String orderItem) {
        this.orderItem = orderItem;
        return this;
    }
    public String getOrderItem() {
        return this.orderItem;
    }

    public GatewayBlackWhiteListShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GatewayBlackWhiteListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
