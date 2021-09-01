// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Model")
    public QueryOrderInfoAfterSaleResponseBodyModel model;

    public static QueryOrderInfoAfterSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoAfterSaleResponseBody self = new QueryOrderInfoAfterSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoAfterSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderInfoAfterSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderInfoAfterSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderInfoAfterSaleResponseBody setModel(QueryOrderInfoAfterSaleResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderInfoAfterSaleResponseBodyModel getModel() {
        return this.model;
    }

    public static class QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics extends TeaModel {
        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsNo")
        public String logisticsNo;

        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        public static QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics self = new QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

    }

    public static class QueryOrderInfoAfterSaleResponseBodyModelLogisticsList extends TeaModel {
        @NameInMap("Logistics")
        public java.util.List<QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics> logistics;

        public static QueryOrderInfoAfterSaleResponseBodyModelLogisticsList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseBodyModelLogisticsList self = new QueryOrderInfoAfterSaleResponseBodyModelLogisticsList();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsList setLogistics(java.util.List<QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics> logistics) {
            this.logistics = logistics;
            return this;
        }
        public java.util.List<QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics> getLogistics() {
            return this.logistics;
        }

    }

    public static class QueryOrderInfoAfterSaleResponseBodyModel extends TeaModel {
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("ShopServiceTelephone")
        public String shopServiceTelephone;

        @NameInMap("RefundAmount")
        public Long refundAmount;

        @NameInMap("XiaomiCode")
        public String xiaomiCode;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RefundRate")
        public String refundRate;

        @NameInMap("ExtJson")
        public String extJson;

        @NameInMap("OrderStatus")
        public String orderStatus;

        @NameInMap("RefundPoints")
        public Long refundPoints;

        @NameInMap("TbOrderId")
        public Long tbOrderId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("RefundStatus")
        public String refundStatus;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("CashAmount")
        public String cashAmount;

        @NameInMap("LogisticsList")
        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsList logisticsList;

        public static QueryOrderInfoAfterSaleResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseBodyModel self = new QueryOrderInfoAfterSaleResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setShopServiceTelephone(String shopServiceTelephone) {
            this.shopServiceTelephone = shopServiceTelephone;
            return this;
        }
        public String getShopServiceTelephone() {
            return this.shopServiceTelephone;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setXiaomiCode(String xiaomiCode) {
            this.xiaomiCode = xiaomiCode;
            return this;
        }
        public String getXiaomiCode() {
            return this.xiaomiCode;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundRate(String refundRate) {
            this.refundRate = refundRate;
            return this;
        }
        public String getRefundRate() {
            return this.refundRate;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundPoints(Long refundPoints) {
            this.refundPoints = refundPoints;
            return this;
        }
        public Long getRefundPoints() {
            return this.refundPoints;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setCashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public String getCashAmount() {
            return this.cashAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setLogisticsList(QueryOrderInfoAfterSaleResponseBodyModelLogisticsList logisticsList) {
            this.logisticsList = logisticsList;
            return this;
        }
        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsList getLogisticsList() {
            return this.logisticsList;
        }

    }

}
