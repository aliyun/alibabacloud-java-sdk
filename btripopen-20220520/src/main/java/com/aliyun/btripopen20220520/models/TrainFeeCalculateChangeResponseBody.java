// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateChangeResponseBody extends TeaModel {
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
    public TrainFeeCalculateChangeResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

    public static TrainFeeCalculateChangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateChangeResponseBody self = new TrainFeeCalculateChangeResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateChangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainFeeCalculateChangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainFeeCalculateChangeResponseBody setModule(TrainFeeCalculateChangeResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainFeeCalculateChangeResponseBodyModule getModule() {
        return this.module;
    }

    public TrainFeeCalculateChangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainFeeCalculateChangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainFeeCalculateChangeResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo extends TeaModel {
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
         * <p>123</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo self = new TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("change_fee")
        public Long changeFee;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("change_rate")
        public Long changeRate;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("change_refund_fee")
        public Long changeRefundFee;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("change_refund_rate")
        public Long changeRefundRate;

        @NameInMap("passenger_info")
        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo passengerInfo;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("seat_type")
        public String seatType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails self = new TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setChangeFee(Long changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Long getChangeFee() {
            return this.changeFee;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setChangeRate(Long changeRate) {
            this.changeRate = changeRate;
            return this;
        }
        public Long getChangeRate() {
            return this.changeRate;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setChangeRefundFee(Long changeRefundFee) {
            this.changeRefundFee = changeRefundFee;
            return this;
        }
        public Long getChangeRefundFee() {
            return this.changeRefundFee;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setChangeRefundRate(Long changeRefundRate) {
            this.changeRefundRate = changeRefundRate;
            return this;
        }
        public Long getChangeRefundRate() {
            return this.changeRefundRate;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setPassengerInfo(TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo passengerInfo) {
            this.passengerInfo = passengerInfo;
            return this;
        }
        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetailsPassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("change_ticket_details")
        public java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails> changeTicketDetails;

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

        /**
         * <strong>example:</strong>
         * <p>K2345</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails self = new TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails setChangeTicketDetails(java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails> changeTicketDetails) {
            this.changeTicketDetails = changeTicketDetails;
            return this;
        }
        public java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetailsChangeTicketDetails> getChangeTicketDetails() {
            return this.changeTicketDetails;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainFeeCalculateChangeResponseBodyModule extends TeaModel {
        @NameInMap("change_train_details")
        public java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails> changeTrainDetails;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("distribute_order_id")
        public String distributeOrderId;

        /**
         * <strong>example:</strong>
         * <p>1683901850297448200</p>
         */
        @NameInMap("order_id")
        public String orderId;

        public static TrainFeeCalculateChangeResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeResponseBodyModule self = new TrainFeeCalculateChangeResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeResponseBodyModule setChangeTrainDetails(java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails> changeTrainDetails) {
            this.changeTrainDetails = changeTrainDetails;
            return this;
        }
        public java.util.List<TrainFeeCalculateChangeResponseBodyModuleChangeTrainDetails> getChangeTrainDetails() {
            return this.changeTrainDetails;
        }

        public TrainFeeCalculateChangeResponseBodyModule setDistributeOrderId(String distributeOrderId) {
            this.distributeOrderId = distributeOrderId;
            return this;
        }
        public String getDistributeOrderId() {
            return this.distributeOrderId;
        }

        public TrainFeeCalculateChangeResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
