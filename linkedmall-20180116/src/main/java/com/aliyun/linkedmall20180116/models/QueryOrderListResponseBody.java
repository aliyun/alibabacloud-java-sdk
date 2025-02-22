// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("LmOrderList")
    public QueryOrderListResponseBodyLmOrderList lmOrderList;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PostFee")
    public QueryOrderListResponseBodyPostFee postFee;

    /**
     * <strong>example:</strong>
     * <p>6EC363BE-9A87-55AA-A9AF-44E77F0EEDCA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderListResponseBody self = new QueryOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderListResponseBody setLmOrderList(QueryOrderListResponseBodyLmOrderList lmOrderList) {
        this.lmOrderList = lmOrderList;
        return this;
    }
    public QueryOrderListResponseBodyLmOrderList getLmOrderList() {
        return this.lmOrderList;
    }

    public QueryOrderListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOrderListResponseBody setPostFee(QueryOrderListResponseBodyPostFee postFee) {
        this.postFee = postFee;
        return this;
    }
    public QueryOrderListResponseBodyPostFee getPostFee() {
        return this.postFee;
    }

    public QueryOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels self = new QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels extends TeaModel {
        @NameInMap("FundStructureModels")
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels self = new QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels setFundStructureModels(java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModelsFundStructureModels> getFundStructureModels() {
            return this.fundStructureModels;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListPostFee self = new QueryOrderListResponseBodyLmOrderListLmOrderListPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList self = new QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList extends TeaModel {
        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList self = new QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList setItemPriceList(java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        /**
         * <strong>example:</strong>
         * <p>607******466</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList;

        @NameInMap("ItemTitle")
        public String itemTitle;

        /**
         * <strong>example:</strong>
         * <p>10000102-******170234</p>
         */
        @NameInMap("LmItemId")
        public String lmItemId;

        /**
         * <strong>example:</strong>
         * <p>37******63</p>
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
         * <strong>example:</strong>
         * <p>472******6880</p>
         */
        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("SkuName")
        public String skuName;

        /**
         * <strong>example:</strong>
         * <p>12******41253</p>
         */
        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList self = new QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemPriceList(QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderListItemPriceList getItemPriceList() {
            return this.itemPriceList;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setNumber(Long number) {
            this.number = number;
            return this;
        }
        public Long getNumber() {
            return this.number;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList extends TeaModel {
        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList;

        public static QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList self = new QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList setSubOrderList(java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderListSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderListLmOrderList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-04-01 12:00:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableStatus")
        public Integer enableStatus;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("FundStructureModels")
        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels fundStructureModels;

        /**
         * <strong>example:</strong>
         * <p>41******03</p>
         */
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LogisticsStatus")
        public Integer logisticsStatus;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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
        public QueryOrderListResponseBodyLmOrderListLmOrderListPostFee postFee;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("SubOrderList")
        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList subOrderList;

        /**
         * <strong>example:</strong>
         * <p>12******41253</p>
         */
        @NameInMap("TbOrderId")
        public Long tbOrderId;

        public static QueryOrderListResponseBodyLmOrderListLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderListLmOrderList self = new QueryOrderListResponseBodyLmOrderListLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setEnableStatus(Integer enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public Integer getEnableStatus() {
            return this.enableStatus;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setFundStructureModels(QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels fundStructureModels) {
            this.fundStructureModels = fundStructureModels;
            return this;
        }
        public QueryOrderListResponseBodyLmOrderListLmOrderListFundStructureModels getFundStructureModels() {
            return this.fundStructureModels;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setLogisticsStatus(Integer logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public Integer getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setPostFee(QueryOrderListResponseBodyLmOrderListLmOrderListPostFee postFee) {
            this.postFee = postFee;
            return this;
        }
        public QueryOrderListResponseBodyLmOrderListLmOrderListPostFee getPostFee() {
            return this.postFee;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setSubOrderList(QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public QueryOrderListResponseBodyLmOrderListLmOrderListSubOrderList getSubOrderList() {
            return this.subOrderList;
        }

        public QueryOrderListResponseBodyLmOrderListLmOrderList setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

    }

    public static class QueryOrderListResponseBodyLmOrderList extends TeaModel {
        @NameInMap("LmOrderList")
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderList> lmOrderList;

        public static QueryOrderListResponseBodyLmOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyLmOrderList self = new QueryOrderListResponseBodyLmOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyLmOrderList setLmOrderList(java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderList> lmOrderList) {
            this.lmOrderList = lmOrderList;
            return this;
        }
        public java.util.List<QueryOrderListResponseBodyLmOrderListLmOrderList> getLmOrderList() {
            return this.lmOrderList;
        }

    }

    public static class QueryOrderListResponseBodyPostFee extends TeaModel {
        @NameInMap("FundAmount")
        public Long fundAmount;

        @NameInMap("FundAmountMoney")
        public Long fundAmountMoney;

        @NameInMap("FundType")
        public String fundType;

        public static QueryOrderListResponseBodyPostFee build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderListResponseBodyPostFee self = new QueryOrderListResponseBodyPostFee();
            return TeaModel.build(map, self);
        }

        public QueryOrderListResponseBodyPostFee setFundAmount(Long fundAmount) {
            this.fundAmount = fundAmount;
            return this;
        }
        public Long getFundAmount() {
            return this.fundAmount;
        }

        public QueryOrderListResponseBodyPostFee setFundAmountMoney(Long fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public Long getFundAmountMoney() {
            return this.fundAmountMoney;
        }

        public QueryOrderListResponseBodyPostFee setFundType(String fundType) {
            this.fundType = fundType;
            return this;
        }
        public String getFundType() {
            return this.fundType;
        }

    }

}
