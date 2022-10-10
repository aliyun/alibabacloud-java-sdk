// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListStoreItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StoreItemsModels")
    public java.util.List<ListStoreItemsResponseBodyStoreItemsModels> storeItemsModels;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStoreItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStoreItemsResponseBody self = new ListStoreItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStoreItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStoreItemsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListStoreItemsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListStoreItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStoreItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStoreItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStoreItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStoreItemsResponseBody setStoreItemsModels(java.util.List<ListStoreItemsResponseBodyStoreItemsModels> storeItemsModels) {
        this.storeItemsModels = storeItemsModels;
        return this;
    }
    public java.util.List<ListStoreItemsResponseBodyStoreItemsModels> getStoreItemsModels() {
        return this.storeItemsModels;
    }

    public ListStoreItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListStoreItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels extends TeaModel {
        @NameInMap("ChannelSaleId")
        public String channelSaleId;

        @NameInMap("ChannelSaleName")
        public String channelSaleName;

        @NameInMap("ChannelSaleQuantity")
        public String channelSaleQuantity;

        public static ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels build(java.util.Map<String, ?> map) throws Exception {
            ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels self = new ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels();
            return TeaModel.build(map, self);
        }

        public ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels setChannelSaleId(String channelSaleId) {
            this.channelSaleId = channelSaleId;
            return this;
        }
        public String getChannelSaleId() {
            return this.channelSaleId;
        }

        public ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels setChannelSaleName(String channelSaleName) {
            this.channelSaleName = channelSaleName;
            return this;
        }
        public String getChannelSaleName() {
            return this.channelSaleName;
        }

        public ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels setChannelSaleQuantity(String channelSaleQuantity) {
            this.channelSaleQuantity = channelSaleQuantity;
            return this;
        }
        public String getChannelSaleQuantity() {
            return this.channelSaleQuantity;
        }

    }

    public static class ListStoreItemsResponseBodyStoreItemsModels extends TeaModel {
        @NameInMap("CatagoryLeafId")
        public String catagoryLeafId;

        @NameInMap("DescPath")
        public String descPath;

        @NameInMap("EnterWarehouseTime")
        public String enterWarehouseTime;

        @NameInMap("ExceptMessage")
        public String exceptMessage;

        @NameInMap("ItemChannelSaleModels")
        public java.util.List<ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels> itemChannelSaleModels;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("MaxMarkPrice")
        public Long maxMarkPrice;

        @NameInMap("MaxPrice")
        public Long maxPrice;

        @NameInMap("MinMarkPrice")
        public Long minMarkPrice;

        @NameInMap("MinPrice")
        public Long minPrice;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("SourceChannel")
        public Integer sourceChannel;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StockQuantity")
        public Long stockQuantity;

        @NameInMap("StoreId")
        public String storeId;

        @NameInMap("TbItemId")
        public String tbItemId;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpShelfTime")
        public String upShelfTime;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListStoreItemsResponseBodyStoreItemsModels build(java.util.Map<String, ?> map) throws Exception {
            ListStoreItemsResponseBodyStoreItemsModels self = new ListStoreItemsResponseBodyStoreItemsModels();
            return TeaModel.build(map, self);
        }

        public ListStoreItemsResponseBodyStoreItemsModels setCatagoryLeafId(String catagoryLeafId) {
            this.catagoryLeafId = catagoryLeafId;
            return this;
        }
        public String getCatagoryLeafId() {
            return this.catagoryLeafId;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setDescPath(String descPath) {
            this.descPath = descPath;
            return this;
        }
        public String getDescPath() {
            return this.descPath;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setEnterWarehouseTime(String enterWarehouseTime) {
            this.enterWarehouseTime = enterWarehouseTime;
            return this;
        }
        public String getEnterWarehouseTime() {
            return this.enterWarehouseTime;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setExceptMessage(String exceptMessage) {
            this.exceptMessage = exceptMessage;
            return this;
        }
        public String getExceptMessage() {
            return this.exceptMessage;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setItemChannelSaleModels(java.util.List<ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels> itemChannelSaleModels) {
            this.itemChannelSaleModels = itemChannelSaleModels;
            return this;
        }
        public java.util.List<ListStoreItemsResponseBodyStoreItemsModelsItemChannelSaleModels> getItemChannelSaleModels() {
            return this.itemChannelSaleModels;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setMaxMarkPrice(Long maxMarkPrice) {
            this.maxMarkPrice = maxMarkPrice;
            return this;
        }
        public Long getMaxMarkPrice() {
            return this.maxMarkPrice;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setMaxPrice(Long maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }
        public Long getMaxPrice() {
            return this.maxPrice;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setMinMarkPrice(Long minMarkPrice) {
            this.minMarkPrice = minMarkPrice;
            return this;
        }
        public Long getMinMarkPrice() {
            return this.minMarkPrice;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setMinPrice(Long minPrice) {
            this.minPrice = minPrice;
            return this;
        }
        public Long getMinPrice() {
            return this.minPrice;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setSourceChannel(Integer sourceChannel) {
            this.sourceChannel = sourceChannel;
            return this;
        }
        public Integer getSourceChannel() {
            return this.sourceChannel;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setStockQuantity(Long stockQuantity) {
            this.stockQuantity = stockQuantity;
            return this;
        }
        public Long getStockQuantity() {
            return this.stockQuantity;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setStoreId(String storeId) {
            this.storeId = storeId;
            return this;
        }
        public String getStoreId() {
            return this.storeId;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setTbItemId(String tbItemId) {
            this.tbItemId = tbItemId;
            return this;
        }
        public String getTbItemId() {
            return this.tbItemId;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setUpShelfTime(String upShelfTime) {
            this.upShelfTime = upShelfTime;
            return this;
        }
        public String getUpShelfTime() {
            return this.upShelfTime;
        }

        public ListStoreItemsResponseBodyStoreItemsModels setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
