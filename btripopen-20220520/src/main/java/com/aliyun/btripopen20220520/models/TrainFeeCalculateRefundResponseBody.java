// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateRefundResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainFeeCalculateRefundResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
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
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        @NameInMap("passenger_id")
        public String passengerId;

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
        @NameInMap("can_refund")
        public Boolean canRefund;

        @NameInMap("passenger_info")
        public TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetailsPassengerInfo passengerInfo;

        @NameInMap("refund_cost_fee")
        public Long refundCostFee;

        @NameInMap("refund_price")
        public Long refundPrice;

        @NameInMap("refund_rate")
        public Long refundRate;

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
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("refund_ticket_details")
        public java.util.List<TrainFeeCalculateRefundResponseBodyModuleRefundTrainDetailsRefundTicketDetails> refundTicketDetails;

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
        @NameInMap("distribute_order_id")
        public String distributeOrderId;

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
