// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeItemsRequest extends TeaModel {
    @NameInMap("BePromotion")
    public Boolean bePromotion;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("ItemBarCode")
    public String itemBarCode;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("ItemTitle")
    public String itemTitle;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>SkuID。</p>
     */
    @NameInMap("SkuId")
    public String skuId;

    @NameInMap("StoreId")
    public String storeId;

    public static DescribeItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeItemsRequest self = new DescribeItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeItemsRequest setBePromotion(Boolean bePromotion) {
        this.bePromotion = bePromotion;
        return this;
    }
    public Boolean getBePromotion() {
        return this.bePromotion;
    }

    public DescribeItemsRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public DescribeItemsRequest setItemBarCode(String itemBarCode) {
        this.itemBarCode = itemBarCode;
        return this;
    }
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    public DescribeItemsRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public DescribeItemsRequest setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }
    public String getItemTitle() {
        return this.itemTitle;
    }

    public DescribeItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeItemsRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public DescribeItemsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

}
