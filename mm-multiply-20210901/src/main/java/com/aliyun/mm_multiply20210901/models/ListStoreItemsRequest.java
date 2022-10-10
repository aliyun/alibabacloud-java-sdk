// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListStoreItemsRequest extends TeaModel {
    @NameInMap("ChannelOptionItemId")
    public String channelOptionItemId;

    @NameInMap("EndEnterWarehouseTime")
    public String endEnterWarehouseTime;

    @NameInMap("ItemCatagoryId")
    public String itemCatagoryId;

    @NameInMap("ItemGroupId")
    public String itemGroupId;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartEnterWarehouseTime")
    public String startEnterWarehouseTime;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("Title")
    public String title;

    public static ListStoreItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStoreItemsRequest self = new ListStoreItemsRequest();
        return TeaModel.build(map, self);
    }

    public ListStoreItemsRequest setChannelOptionItemId(String channelOptionItemId) {
        this.channelOptionItemId = channelOptionItemId;
        return this;
    }
    public String getChannelOptionItemId() {
        return this.channelOptionItemId;
    }

    public ListStoreItemsRequest setEndEnterWarehouseTime(String endEnterWarehouseTime) {
        this.endEnterWarehouseTime = endEnterWarehouseTime;
        return this;
    }
    public String getEndEnterWarehouseTime() {
        return this.endEnterWarehouseTime;
    }

    public ListStoreItemsRequest setItemCatagoryId(String itemCatagoryId) {
        this.itemCatagoryId = itemCatagoryId;
        return this;
    }
    public String getItemCatagoryId() {
        return this.itemCatagoryId;
    }

    public ListStoreItemsRequest setItemGroupId(String itemGroupId) {
        this.itemGroupId = itemGroupId;
        return this;
    }
    public String getItemGroupId() {
        return this.itemGroupId;
    }

    public ListStoreItemsRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public ListStoreItemsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStoreItemsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStoreItemsRequest setStartEnterWarehouseTime(String startEnterWarehouseTime) {
        this.startEnterWarehouseTime = startEnterWarehouseTime;
        return this;
    }
    public String getStartEnterWarehouseTime() {
        return this.startEnterWarehouseTime;
    }

    public ListStoreItemsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListStoreItemsRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public ListStoreItemsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
