// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateRefundResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainFeeCalculateRefundResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>210bc4c416859457407135025d509c</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainFeeCalculateRefundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateRefundResponseBody self = new TrainFeeCalculateRefundResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateRefundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainFeeCalculateRefundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainFeeCalculateRefundResponseBody setModule(TrainFeeCalculateRefundResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainFeeCalculateRefundResponseBodyModule getModule() {
        return this.module;
    }

    public TrainFeeCalculateRefundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainFeeCalculateRefundResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainFeeCalculateRefundResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <strong>example:</strong>
         * <p>170d9ac6f8807f9ec603c688f45f78a41</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo self = new TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_refund")
        public Boolean canRefund;

        @NameInMap("passenger_info")
        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo passengerInfo;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("refund_cost_fee")
        public Long refundCostFee;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("refund_rate")
        public Long refundRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails self = new TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setPassengerInfo(TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo passengerInfo) {
            this.passengerInfo = passengerInfo;
            return this;
        }
        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setRefundCostFee(Long refundCostFee) {
            this.refundCostFee = refundCostFee;
            return this;
        }
        public Long getRefundCostFee() {
            return this.refundCostFee;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setRefundRate(Long refundRate) {
            this.refundRate = refundRate;
            return this;
        }
        public Long getRefundRate() {
            return this.refundRate;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        /**
         * <strong>example:</strong>
         * <p>BDC</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("refund_ticket_details")
        public java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails> refundTicketDetails;

        /**
         * <strong>example:</strong>
         * <p>K1234</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails self = new TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails setRefundTicketDetails(java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails> refundTicketDetails) {
            this.refundTicketDetails = refundTicketDetails;
            return this;
        }
        public java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails> getRefundTicketDetails() {
            return this.refundTicketDetails;
        }

        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainFeeCalculateRefundResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123445</p>
         */
        @NameInMap("distribute_order_id")
        public String distributeOrderId;

        /**
         * <strong>example:</strong>
         * <p>1017002195370467200</p>
         */
        @NameInMap("order_id")
        public String orderId;

        @NameInMap("refund_train_details")
        public java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails> refundTrainDetails;

        public static TrainFeeCalculateRefundResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundResponseBodyModule self = new TrainFeeCalculateRefundResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundResponseBodyModule setDistributeOrderId(String distributeOrderId) {
            this.distributeOrderId = distributeOrderId;
            return this;
        }
        public String getDistributeOrderId() {
            return this.distributeOrderId;
        }

        public TrainFeeCalculateRefundResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainFeeCalculateRefundResponseBodyModule setRefundTrainDetails(java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails> refundTrainDetails) {
            this.refundTrainDetails = refundTrainDetails;
            return this;
        }
        public java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetails> getRefundTrainDetails() {
            return this.refundTrainDetails;
        }

    }

}
