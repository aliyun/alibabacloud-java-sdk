// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderAndPaymentListWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel> model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderAndPaymentListWithDesignatedTbUidResponseBody self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setModel(java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderAndPaymentListWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList extends TeaModel {
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> itemPriceList;

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
        public String skuId;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setItemPriceList(java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FundStructureModels")
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels> fundStructureModels;

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
        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee postFee;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList> subOrderList;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel self = new QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setFundStructureModels(java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setLmPaymentId(String lmPaymentId) {
            this.lmPaymentId = lmPaymentId;
            return this;
        }
        public String getLmPaymentId() {
            return this.lmPaymentId;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setPostFee(QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelPostFee getPostFee() {
            return this.postFee;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setSubOrderList(java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModelSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderAndPaymentListWithDesignatedTbUidResponseBodyModel setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

}
