// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LmOrderList")
    public QueryOrderAndPaymentListResponseBodyLmOrderList lmOrderList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PostFee")
    public QueryOrderAndPaymentListResponseBodyPostFee postFee;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrderAndPaymentListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListResponseBody self = new QueryOrderAndPaymentListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderAndPaymentListResponseBody setLmOrderList(QueryOrderAndPaymentListResponseBodyLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderAndPaymentListResponseBodyLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public QueryOrderAndPaymentListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderAndPaymentListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderAndPaymentListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderAndPaymentListResponseBody setPostFee(QueryOrderAndPaymentListResponseBodyPostFee postFee) {
        this.postFee = postFee;
        return this;
    }
    public QueryOrderAndPaymentListResponseBodyPostFee getPostFee() {
        return this.postFee;
    }

    public QueryOrderAndPaymentListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderAndPaymentListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels extends TeaModel {
        @NameInMap("FundStructureModels")
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels setFundStructureModels(java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList extends TeaModel {
        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList setItemPriceList(java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList extends TeaModel {
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("Number")
        public Long number;

        @NameInMap("OrderStatus")
        public Integer orderStatus;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemPriceList(QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList extends TeaModel {
        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList setSubOrderList(java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FundStructureModels")
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels fundStructureModels;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("LmPaymentId")
        public String lmPaymentId;

        @NameInMap("LogisticsStatus")
        public Integer logisticsStatus;

        @NameInMap("OrderAmount")
        public Long orderAmount;

        @NameInMap("OrderStatus")
        public Integer orderStatus;

        @NameInMap("PostFee")
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee postFee;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("SubOrderList")
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList subOrderList;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList self = new QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setFundStructureModels(QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setLmPaymentId(String lmPaymentId) {
            this.lmPaymentId = lmPaymentId;
            return this;
        }
        public String getLmPaymentId() {
            return this.lmPaymentId;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setPostFee(QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListPostFee getPostFee() {
            return this.postFee;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setSubOrderList(QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderListSubOrderList getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderAndPaymentListResponseBodyLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyLmOrderList self = new QueryOrderAndPaymentListResponseBodyLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyLmOrderList setLmOrderList(java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListResponseBodyLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class QueryOrderAndPaymentListResponseBodyPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListResponseBodyPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListResponseBodyPostFee self = new QueryOrderAndPaymentListResponseBodyPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListResponseBodyPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListResponseBodyPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListResponseBodyPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

}
