// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryOrderInfoAfterSaleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryOrderInfoAfterSaleResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>A107756D-18BF-56BC-9F33-8DFAA2279F17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public QueryOrderInfoAfterSaleResponseBody setModel(QueryOrderInfoAfterSaleResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryOrderInfoAfterSaleResponseBodyModel getModel() {
        return this.model;
    }

    public QueryOrderInfoAfterSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SF</p>
         */
        @NameInMap("LogisticsCompanyCode")
        public String logisticsCompanyCode;

        @NameInMap("LogisticsCompanyName")
        public String logisticsCompanyName;

        /**
         * <strong>example:</strong>
         * <p>731******8882</p>
         */
        @NameInMap("LogisticsNo")
        public String logisticsNo;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LogisticsStatus")
        public String logisticsStatus;

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

        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsListLogistics setLogisticsCompanyName(String logisticsCompanyName) {
            this.logisticsCompanyName = logisticsCompanyName;
            return this;
        }
        public String getLogisticsCompanyName() {
            return this.logisticsCompanyName;
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
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CashAmount")
        public String cashAmount;

        /**
         * <strong>example:</strong>
         * <p>2022-03-29</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExtJson")
        public String extJson;

        /**
         * <strong>example:</strong>
         * <p>45******66</p>
         */
        @NameInMap("LmOrderId")
        public Long lmOrderId;

        @NameInMap("LogisticsList")
        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsList logisticsList;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("OrderStatus")
        public String orderStatus;

        /**
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("Points")
        public Long points;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PointsAmount")
        public Long pointsAmount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("RefundAmount")
        public Long refundAmount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RefundPoints")
        public Long refundPoints;

        @NameInMap("RefundRate")
        public String refundRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RefundStatus")
        public String refundStatus;

        @NameInMap("ShopName")
        public String shopName;

        @NameInMap("ShopServiceTelephone")
        public String shopServiceTelephone;

        /**
         * <strong>example:</strong>
         * <p>12******964113</p>
         */
        @NameInMap("TbOrderId")
        public Long tbOrderId;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("XiaomiCode")
        public String xiaomiCode;

        public static QueryOrderInfoAfterSaleResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderInfoAfterSaleResponseBodyModel self = new QueryOrderInfoAfterSaleResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setCashAmount(String cashAmount) {
            this.cashAmount = cashAmount;
            return this;
        }
        public String getCashAmount() {
            return this.cashAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setExtJson(String extJson) {
            this.extJson = extJson;
            return this;
        }
        public String getExtJson() {
            return this.extJson;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setLmOrderId(Long lmOrderId) {
            this.lmOrderId = lmOrderId;
            return this;
        }
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setLogisticsList(QueryOrderInfoAfterSaleResponseBodyModelLogisticsList logisticsList) {
            this.logisticsList = logisticsList;
            return this;
        }
        public QueryOrderInfoAfterSaleResponseBodyModelLogisticsList getLogisticsList() {
            return this.logisticsList;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public String getOrderStatus() {
            return this.orderStatus;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundPoints(Long refundPoints) {
            this.refundPoints = refundPoints;
            return this;
        }
        public Long getRefundPoints() {
            return this.refundPoints;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundRate(String refundRate) {
            this.refundRate = refundRate;
            return this;
        }
        public String getRefundRate() {
            return this.refundRate;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setShopName(String shopName) {
            this.shopName = shopName;
            return this;
        }
        public String getShopName() {
            return this.shopName;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setShopServiceTelephone(String shopServiceTelephone) {
            this.shopServiceTelephone = shopServiceTelephone;
            return this;
        }
        public String getShopServiceTelephone() {
            return this.shopServiceTelephone;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setTbOrderId(Long tbOrderId) {
            this.tbOrderId = tbOrderId;
            return this;
        }
        public Long getTbOrderId() {
            return this.tbOrderId;
        }

        public QueryOrderInfoAfterSaleResponseBodyModel setXiaomiCode(String xiaomiCode) {
            this.xiaomiCode = xiaomiCode;
            return this;
        }
        public String getXiaomiCode() {
            return this.xiaomiCode;
        }

    }

}
