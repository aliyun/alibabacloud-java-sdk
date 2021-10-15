// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("LmOrderList")
    @Validation(required = true)
    public QueryOrderListResponseLmOrderList lmOrderList;

    @NameInMap("PostFee")
    @Validation(required = true)
    public QueryOrderListResponsePostFee postFee;

    public static QueryOrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListResponse self = new QueryOrderListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderListResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryOrderListResponse setLmOrderList(QueryOrderListResponseLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderListResponseLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public QueryOrderListResponse setPostFee(QueryOrderListResponsePostFee postFee) {
        this.postFee = postFee;
        return this;
    }
    public QueryOrderListResponsePostFee getPostFee() {
        return this.postFee;
    }

    public static class QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels self = new QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListFundStructureModels extends TeaModel {
        @NameInMap("FundStructureModels")
        @Validation(required = true)
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels;

        public static QueryOrderListResponseLmOrderListLmOrderListFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListFundStructureModels self = new QueryOrderListResponseLmOrderListLmOrderListFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModels setFundStructureModels(java.util.List<QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList self = new QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList extends TeaModel {
        @NameInMap("ItemPriceList")
        @Validation(required = true)
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList;

        public static QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList self = new QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList setItemPriceList(java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList extends TeaModel {
        @NameInMap("ItemId")
        @Validation(required = true)
        public Long itemId;

        @NameInMap("ItemPic")
        @Validation(required = true)
        public String itemPic;

        @NameInMap("ItemTitle")
        @Validation(required = true)
        public String itemTitle;

        @NameInMap("Number")
        @Validation(required = true)
        public Long number;

        @NameInMap("SkuId")
        @Validation(required = true)
        public Long skuId;

        @NameInMap("SkuName")
        @Validation(required = true)
        public String skuName;

        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("OrderStatus")
        @Validation(required = true)
        public Integer orderStatus;

        @NameInMap("EnableStatus")
        @Validation(required = true)
        public Integer enableStatus;

        @NameInMap("TbOrderId")
        @Validation(required = true)
        public Long tbOrderId;

        @NameInMap("LmItemId")
        @Validation(required = true)
        public String lmItemId;

        @NameInMap("ItemPriceList")
        @Validation(required = true)
        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList;

        public static QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList self = new QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemPriceList(QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListSubOrderList extends TeaModel {
        @NameInMap("SubOrderList")
        @Validation(required = true)
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList;

        public static QueryOrderListResponseLmOrderListLmOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListSubOrderList self = new QueryOrderListResponseLmOrderListLmOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListSubOrderList setSubOrderList(java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderListSubOrderListSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderListPostFee extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderListResponseLmOrderListLmOrderListPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderListPostFee self = new QueryOrderListResponseLmOrderListLmOrderListPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderListPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseLmOrderListLmOrderListPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseLmOrderListLmOrderListPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseLmOrderListLmOrderList extends TeaModel {
        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("OrderAmount")
        @Validation(required = true)
        public Long orderAmount;

        @NameInMap("OrderStatus")
        @Validation(required = true)
        public Integer orderStatus;

        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("ShopName")
        @Validation(required = true)
        public String shopName;

        @NameInMap("LogisticsStatus")
        @Validation(required = true)
        public Integer logisticsStatus;

        @NameInMap("EnableStatus")
        @Validation(required = true)
        public Integer enableStatus;

        @NameInMap("TbOrderId")
        @Validation(required = true)
        public Long tbOrderId;

        @NameInMap("FundStructureModels")
        @Validation(required = true)
        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModels fundStructureModels;

        @NameInMap("SubOrderList")
        @Validation(required = true)
        public QueryOrderListResponseLmOrderListLmOrderListSubOrderList subOrderList;

        @NameInMap("PostFee")
        @Validation(required = true)
        public QueryOrderListResponseLmOrderListLmOrderListPostFee postFee;

        public static QueryOrderListResponseLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderListLmOrderList self = new QueryOrderListResponseLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderListLmOrderList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setFundStructureModels(QueryOrderListResponseLmOrderListLmOrderListFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderListResponseLmOrderListLmOrderListFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setSubOrderList(QueryOrderListResponseLmOrderListLmOrderListSubOrderList subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public QueryOrderListResponseLmOrderListLmOrderListSubOrderList getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderListResponseLmOrderListLmOrderList setPostFee(QueryOrderListResponseLmOrderListLmOrderListPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderListResponseLmOrderListLmOrderListPostFee getPostFee() {
            return this.postFee;
        }

    }

    public static class QueryOrderListResponseLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderListResponseLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseLmOrderList self = new QueryOrderListResponseLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseLmOrderList setLmOrderList(java.util.List<QueryOrderListResponseLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderListResponseLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class QueryOrderListResponsePostFee extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderListResponsePostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponsePostFee self = new QueryOrderListResponsePostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponsePostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponsePostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponsePostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

}
