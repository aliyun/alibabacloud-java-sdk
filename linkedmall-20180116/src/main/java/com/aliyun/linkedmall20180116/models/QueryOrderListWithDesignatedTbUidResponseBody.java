// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListWithDesignatedTbUidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModel> model;

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

    public static QueryOrderListWithDesignatedTbUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListWithDesignatedTbUidResponseBody self = new QueryOrderListWithDesignatedTbUidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setModel(java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderListWithDesignatedTbUidResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels self = new QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee self = new QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList self = new QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList extends TeaModel {
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> itemPriceList;

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

        public static QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList self = new QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setItemPriceList(java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderListWithDesignatedTbUidResponseBodyModel extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FundStructureModels")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels> fundStructureModels;

        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("LogisticsStatus")
        public Integer logisticsStatus;

        @NameInMap("OrderAmount")
        public Long orderAmount;

        @NameInMap("OrderStatus")
        public Integer orderStatus;

        @NameInMap("PostFee")
        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee postFee;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList> subOrderList;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderListWithDesignatedTbUidResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListWithDesignatedTbUidResponseBodyModel self = new QueryOrderListWithDesignatedTbUidResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setFundStructureModels(java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setPostFee(QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee getPostFee() {
            return this.postFee;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setSubOrderList(java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderListWithDesignatedTbUidResponseBodyModel setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

}
