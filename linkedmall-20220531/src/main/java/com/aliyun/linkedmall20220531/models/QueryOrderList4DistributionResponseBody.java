// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderList4DistributionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<QueryOrderList4DistributionResponseBodyModel> model;

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

    public static QueryOrderList4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderList4DistributionResponseBody self = new QueryOrderList4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderList4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderList4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryOrderList4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderList4DistributionResponseBody setModel(java.util.List<QueryOrderList4DistributionResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<QueryOrderList4DistributionResponseBodyModel> getModel() {
        return this.model;
    }

    public QueryOrderList4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderList4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderList4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderList4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryOrderList4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryOrderList4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderList4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice extends TeaModel {
        @NameInMap("FundAmountMoney")
        public String fundAmountMoney;

        public static QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice self = new QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice();
            return TeaModel.build(map, self);
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice setFundAmountMoney(String fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public String getFundAmountMoney() {
            return this.fundAmountMoney;
        }

    }

    public static class QueryOrderList4DistributionResponseBodyModelSubOrderList extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPrice")
        public java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice> itemPrice;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("MainDistributionOrderId")
        public String mainDistributionOrderId;

        @NameInMap("Number")
        public String number;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SkuName")
        public String skuName;

        @NameInMap("SubDistributionOrderId")
        public String subDistributionOrderId;

        public static QueryOrderList4DistributionResponseBodyModelSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderList4DistributionResponseBodyModelSubOrderList self = new QueryOrderList4DistributionResponseBodyModelSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setItemPrice(java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice> itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }
        public java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderListItemPrice> getItemPrice() {
            return this.itemPrice;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setMainDistributionOrderId(String mainDistributionOrderId) {
            this.mainDistributionOrderId = mainDistributionOrderId;
            return this;
        }
        public String getMainDistributionOrderId() {
            return this.mainDistributionOrderId;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderList4DistributionResponseBodyModelSubOrderList setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

    public static class QueryOrderList4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DistributionOrderId")
        public String distributionOrderId;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("OrderAmount")
        public String orderAmount;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderList> subOrderList;

        public static QueryOrderList4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderList4DistributionResponseBodyModel self = new QueryOrderList4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderList4DistributionResponseBodyModel setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderList4DistributionResponseBodyModel setDistributionOrderId(String distributionOrderId) {
            this.distributionOrderId = distributionOrderId;
            return this;
        }
        public String getDistributionOrderId() {
            return this.distributionOrderId;
        }

        public QueryOrderList4DistributionResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public QueryOrderList4DistributionResponseBodyModel setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderList4DistributionResponseBodyModel setOrderAmount(String orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public String getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderList4DistributionResponseBodyModel setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderList4DistributionResponseBodyModel setSubOrderList(java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderList4DistributionResponseBodyModelSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

}
