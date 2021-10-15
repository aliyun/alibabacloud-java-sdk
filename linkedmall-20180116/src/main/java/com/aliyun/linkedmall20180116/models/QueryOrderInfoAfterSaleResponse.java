// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Model")
    @Validation(required = true)
    public QueryOrderInfoAfterSaleResponseModel model;

    public static QueryOrderInfoAfterSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderInfoAfterSaleResponse self = new QueryOrderInfoAfterSaleResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderInfoAfterSaleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOrderInfoAfterSaleResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryOrderInfoAfterSaleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderInfoAfterSaleResponse setModel(QueryOrderInfoAfterSaleResponseModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderInfoAfterSaleResponseModel getModel() {
        return this.model;
    }

    public static class QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics extends TeaModel {
        @NameInMap("LogisticsNo")
        @Validation(required = true)
        public String logisticsNo;

        @NameInMap("LogisticsStatus")
        @Validation(required = true)
        public String logisticsStatus;

        @NameInMap("LogisticsCompanyName")
        @Validation(required = true)
        public String logisticsCompanyName;

        @NameInMap("LogisticsCompanyCode")
        @Validation(required = true)
        public String logisticsCompanyCode;

        public static QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics self = new QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics setLogisticsNo(String logisticsNo) {
            this.logisticsNo = logisticsNo;
            return this;
        }
        public String getLogisticsNo() {
            return this.logisticsNo;
        }

        public QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics setLogisticsStatus(String logisticsStatus) {
            this.logisticsStatus = logisticsStatus;
            return this;
        }
        public String getLogisticsStatus() {
            return this.logisticsStatus;
        }

        public QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
        }

        public QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics setLogisticsCompanyCode(String logisticsCompanyCode) {
            this.logisticsCompanyCode = logisticsCompanyCode;
            return this;
        }
        public String getLogisticsCompanyCode() {
            return this.logisticsCompanyCode;
        }

    }

    public static class QueryOrderInfoAfterSaleResponseModelLogisticsList extends TeaModel {
        @NameInMap("Logistics")
        @Validation(required = true)
        public java.util.List<QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics> logistics;

        public static QueryOrderInfoAfterSaleResponseModelLogisticsList build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseModelLogisticsList self = new QueryOrderInfoAfterSaleResponseModelLogisticsList();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseModelLogisticsList setLogistics(java.util.List<QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics> logistics) {
            this.logistics = logistics;
            return this;
        }
        public java.util.List<QueryOrderInfoAfterSaleResponseModelLogisticsListLogistics> getLogistics() {
            return this.logistics;
        }

    }

    public static class QueryOrderInfoAfterSaleResponseModel extends TeaModel {
        @NameInMap("LmOrderId")
        @Validation(required = true)
        public Long lmOrderId;

        @NameInMap("TbOrderId")
        @Validation(required = true)
        public Long tbOrderId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("CashAmount")
        @Validation(required = true)
        public String cashAmount;

        @NameInMap("Points")
        @Validation(required = true)
        public Long points;

        @NameInMap("PointsAmount")
        @Validation(required = true)
        public Long pointsAmount;

        @NameInMap("OrderStatus")
        @Validation(required = true)
        public String orderStatus;

        @NameInMap("ShopName")
        @Validation(required = true)
        public String shopName;

        @NameInMap("RefundStatus")
        @Validation(required = true)
        public String refundStatus;

        @NameInMap("RefundAmount")
        @Validation(required = true)
        public Long refundAmount;

        @NameInMap("RefundRate")
        @Validation(required = true)
        public String refundRate;

        @NameInMap("XiaomiCode")
        @Validation(required = true)
        public String xiaomiCode;

        @NameInMap("ShopServiceTelephone")
        @Validation(required = true)
        public String shopServiceTelephone;

        @NameInMap("ExtJson")
        @Validation(required = true)
        public String extJson;

        @NameInMap("RefundPoints")
        @Validation(required = true)
        public Long refundPoints;

        @NameInMap("LogisticsList")
        @Validation(required = true)
        public QueryOrderInfoAfterSaleResponseModelLogisticsList logisticsList;

        public static QueryOrderInfoAfterSaleResponseModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseModel self = new QueryOrderInfoAfterSaleResponseModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseModel setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderInfoAfterSaleResponseModel setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderInfoAfterSaleResponseModel setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderInfoAfterSaleResponseModel setCashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public String getCashAmount() {
            return this.cashAmount;
        }

        public QueryOrderInfoAfterSaleResponseModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryOrderInfoAfterSaleResponseModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryOrderInfoAfterSaleResponseModel setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderInfoAfterSaleResponseModel setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderInfoAfterSaleResponseModel setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public QueryOrderInfoAfterSaleResponseModel setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public QueryOrderInfoAfterSaleResponseModel setRefundRate(String refundRate) {
            this.refundRate = refundRate;
            return this;
        }
        public String getRefundRate() {
            return this.refundRate;
        }

        public QueryOrderInfoAfterSaleResponseModel setXiaomiCode(String xiaomiCode) {
            this.xiaomiCode = xiaomiCode;
            return this;
        }
        public String getXiaomiCode() {
            return this.xiaomiCode;
        }

        public QueryOrderInfoAfterSaleResponseModel setShopServiceTelephone(String shopServiceTelephone) {
            this.shopServiceTelephone = shopServiceTelephone;
            return this;
        }
        public String getShopServiceTelephone() {
            return this.shopServiceTelephone;
        }

        public QueryOrderInfoAfterSaleResponseModel setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderInfoAfterSaleResponseModel setRefundPoints(Long refundPoints) {
            this.refundPoints = refundPoints;
            return this;
        }
        public Long getRefundPoints() {
            return this.refundPoints;
        }

        public QueryOrderInfoAfterSaleResponseModel setLogisticsList(QueryOrderInfoAfterSaleResponseModelLogisticsList logisticsList) {
            this.logisticsList = logisticsList;
            return this;
        }
        public QueryOrderInfoAfterSaleResponseModelLogisticsList getLogisticsList() {
            return this.logisticsList;
        }

    }

}
