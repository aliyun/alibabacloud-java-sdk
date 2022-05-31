// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class QueryOrderDetail4DistributionResponseBody extends TeaModel {
    // 渠道公共数据
    @NameInMap("BizViewData")
    public java.util.Map<String, ?> bizViewData;

    // 返回的执行结果码， 正确为字符串 0000
    @NameInMap("Code")
    public String code;

    // 每次请求操作对应的操作日志号，由系统自动生成，返回给租户，可用于排查问题，双方日志中统一透出此标识
    @NameInMap("LogsId")
    public String logsId;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 请求结果数据
    @NameInMap("Model")
    public QueryOrderDetail4DistributionResponseBodyModel model;

    // 当前页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("PageSize")
    public Long pageSize;

    // POP请求流水号，建议租户日志中也输出此流水号，双方排查问题方便
    @NameInMap("RequestId")
    public String requestId;

    // 错误子代码。一般用于显示业务类的错误代码，一般建议关注此类错误
    @NameInMap("SubCode")
    public String subCode;

    // 业务处理相关的错误信息，一般建议关注此类错误
    @NameInMap("SubMessage")
    public String subMessage;

    // 本次执行的结果成功与否
    @NameInMap("Success")
    public Boolean success;

    // 总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryOrderDetail4DistributionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderDetail4DistributionResponseBody self = new QueryOrderDetail4DistributionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderDetail4DistributionResponseBody setBizViewData(java.util.Map<String, ?> bizViewData) {
        this.bizViewData = bizViewData;
        return this;
    }
    public java.util.Map<String, ?> getBizViewData() {
        return this.bizViewData;
    }

    public QueryOrderDetail4DistributionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderDetail4DistributionResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryOrderDetail4DistributionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderDetail4DistributionResponseBody setModel(QueryOrderDetail4DistributionResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderDetail4DistributionResponseBodyModel getModel() {
        return this.model;
    }

    public QueryOrderDetail4DistributionResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryOrderDetail4DistributionResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryOrderDetail4DistributionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderDetail4DistributionResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryOrderDetail4DistributionResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryOrderDetail4DistributionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOrderDetail4DistributionResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList extends TeaModel {
        @NameInMap("FundAmountMoney")
        public String fundAmountMoney;

        public static QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList self = new QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList setFundAmountMoney(String fundAmountMoney) {
            this.fundAmountMoney = fundAmountMoney;
            return this;
        }
        public String getFundAmountMoney() {
            return this.fundAmountMoney;
        }

    }

    public static class QueryOrderDetail4DistributionResponseBodyModelSubOrderList extends TeaModel {
        @NameInMap("ItemPic")
        public String itemPic;

        @NameInMap("ItemPriceList")
        public java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList> itemPriceList;

        @NameInMap("ItemTitle")
        public String itemTitle;

        @NameInMap("LmItemId")
        public String lmItemId;

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

        public static QueryOrderDetail4DistributionResponseBodyModelSubOrderList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetail4DistributionResponseBodyModelSubOrderList self = new QueryOrderDetail4DistributionResponseBodyModelSubOrderList();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setItemPic(String itemPic) {
            this.itemPic = itemPic;
            return this;
        }
        public String getItemPic() {
            return this.itemPic;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setItemPriceList(java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList> itemPriceList) {
            this.itemPriceList = itemPriceList;
            return this;
        }
        public java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderListItemPriceList> getItemPriceList() {
            return this.itemPriceList;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
            return this;
        }
        public String getItemTitle() {
            return this.itemTitle;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setMainDistributionOrderId(String mainDistributionOrderId) {
            this.mainDistributionOrderId = mainDistributionOrderId;
            return this;
        }
        public String getMainDistributionOrderId() {
            return this.mainDistributionOrderId;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setSkuName(String skuName) {
            this.skuName = skuName;
            return this;
        }
        public String getSkuName() {
            return this.skuName;
        }

        public QueryOrderDetail4DistributionResponseBodyModelSubOrderList setSubDistributionOrderId(String subDistributionOrderId) {
            this.subDistributionOrderId = subDistributionOrderId;
            return this;
        }
        public String getSubDistributionOrderId() {
            return this.subDistributionOrderId;
        }

    }

    public static class QueryOrderDetail4DistributionResponseBodyModel extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("DistributionOrderId")
        public String distributionOrderId;

        @NameInMap("DistributorId")
        public String distributorId;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("MainDistributionOrderId")
        public String mainDistributionOrderId;

        @NameInMap("OrderAmount")
        public String orderAmount;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("SubOrderList")
        public java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderList> subOrderList;

        public static QueryOrderDetail4DistributionResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderDetail4DistributionResponseBodyModel self = new QueryOrderDetail4DistributionResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderDetail4DistributionResponseBodyModel setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setDistributionOrderId(String distributionOrderId) {
            this.distributionOrderId = distributionOrderId;
            return this;
        }
        public String getDistributionOrderId() {
            return this.distributionOrderId;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setDistributorId(String distributorId) {
            this.distributorId = distributorId;
            return this;
        }
        public String getDistributorId() {
            return this.distributorId;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setMainDistributionOrderId(String mainDistributionOrderId) {
            this.mainDistributionOrderId = mainDistributionOrderId;
            return this;
        }
        public String getMainDistributionOrderId() {
            return this.mainDistributionOrderId;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setOrderAmount(String orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public String getOrderAmount() {
            return this.orderAmount;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderDetail4DistributionResponseBodyModel setSubOrderList(java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderList> subOrderList) {
            this.subOrderList = subOrderList;
            return this;
        }
        public java.util.List<QueryOrderDetail4DistributionResponseBodyModelSubOrderList> getSubOrderList() {
            return this.subOrderList;
        }

    }

}
