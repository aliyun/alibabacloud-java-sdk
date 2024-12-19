// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListWithDesignatedTbUidResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogsId")
    public String logsId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>1EA70857-79***3E-9F0F777180</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SubCode")
    public String subCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("SubMessage")
    public String subMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FundAmount")
        public Long fundAmount;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        /**
         * <strong>example:</strong>
         * <p>lmCashCnyPay</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FundAmount")
        public Long fundAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        /**
         * <strong>example:</strong>
         * <p>lmCashCnyPay</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FundAmount")
        public Long fundAmount;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        /**
         * <strong>example:</strong>
         * <p>lmCashCnyPay</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        /**
         * <strong>example:</strong>
         * <p>665***373</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aliyundoc.com">https://aliyundoc.com</a></p>
         */
        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderListItemPriceList> itemPriceList;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>100<em><strong>02-665</strong></em>373</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>559***813</p>
         */
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Number")
        public Long number;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        /**
         * <p>skuId</p>
         * 
         * <strong>example:</strong>
         * <p>496***350</p>
         */
        @NameInMap("SkuId")
        public String skuId;

        /**
         * <strong>example:</strong>
         * <p>500g</p>
         */
        @NameInMap("SkuName")
        public String skuName;

        /**
         * <strong>example:</strong>
         * <p>323***242</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2022-10-11 15:21:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FundStructureModels")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelFundStructureModels> fundStructureModels;

        /**
         * <strong>example:</strong>
         * <p>639***718</p>
         */
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LogisticsStatus")
        public Integer logisticsStatus;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("OrderAmount")
        public Long orderAmount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OrderStatus")
        public Integer orderStatus;

        @NameInMap("PostFee")
        public QueryOrderListWithDesignatedTbUidResponseBodyModelPostFee postFee;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderListWithDesignatedTbUidResponseBodyModelSubOrderList> subOrderList;

        /**
         * <strong>example:</strong>
         * <p>412******113</p>
         */
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
