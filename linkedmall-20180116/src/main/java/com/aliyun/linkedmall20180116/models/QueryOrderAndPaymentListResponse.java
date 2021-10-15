// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListResponse extends TeaModel {
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
    public QueryOrderAndPaymentListResponseLmOrderList lmOrderList;

    @NameInMap("PostFee")
    @Validation(required = true)
    public QueryOrderAndPaymentListResponsePostFee postFee;

    public static QueryOrderAndPaymentListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListResponse self = new QueryOrderAndPaymentListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderAndPaymentListResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderAndPaymentListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderAndPaymentListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderAndPaymentListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderAndPaymentListResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryOrderAndPaymentListResponse setLmOrderList(QueryOrderAndPaymentListResponseLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderAndPaymentListResponseLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public QueryOrderAndPaymentListResponse setPostFee(QueryOrderAndPaymentListResponsePostFee postFee) {
        this.postFee = postFee;
        return this;
    }
    public QueryOrderAndPaymentListResponsePostFee getPostFee() {
        return this.postFee;
    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels extends TeaModel {
        @NameInMap("FundStructureModels")
        @Validation(required = true)
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels setFundStructureModels(java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModelsFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList extends TeaModel {
        @NameInMap("ItemPriceList")
        @Validation(required = true)
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList setItemPriceList(java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList extends TeaModel {
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
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList setItemPriceList(QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList extends TeaModel {
        @NameInMap("SubOrderList")
        @Validation(required = true)
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList setSubOrderList(java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderListSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderListLmOrderList extends TeaModel {
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

        @NameInMap("LmPaymentId")
        @Validation(required = true)
        public String lmPaymentId;

        @NameInMap("FundStructureModels")
        @Validation(required = true)
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels fundStructureModels;

        @NameInMap("SubOrderList")
        @Validation(required = true)
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList subOrderList;

        @NameInMap("PostFee")
        @Validation(required = true)
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee postFee;

        public static QueryOrderAndPaymentListResponseLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderListLmOrderList self = new QueryOrderAndPaymentListResponseLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setLmPaymentId(String lmPaymentId) {
            this.lmPaymentId = lmPaymentId;
            return this;
        }
        public String getLmPaymentId() {
            return this.lmPaymentId;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setFundStructureModels(QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setSubOrderList(QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListSubOrderList getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderAndPaymentListResponseLmOrderListLmOrderList setPostFee(QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderAndPaymentListResponseLmOrderListLmOrderListPostFee getPostFee() {
            return this.postFee;
        }

    }

    public static class QueryOrderAndPaymentListResponseLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        @Validation(required = true)
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderAndPaymentListResponseLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseLmOrderList self = new QueryOrderAndPaymentListResponseLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseLmOrderList setLmOrderList(java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class QueryOrderAndPaymentListResponsePostFee extends TeaModel {
        @NameInMap("FundAmount")
        @Validation(required = true)
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        @Validation(required = true)
        public Long fundAmountMoney;

        @NameInMap("FundType")
        @Validation(required = true)
        public String fundType;

        public static QueryOrderAndPaymentListResponsePostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponsePostFee self = new QueryOrderAndPaymentListResponsePostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponsePostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponsePostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponsePostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

}
