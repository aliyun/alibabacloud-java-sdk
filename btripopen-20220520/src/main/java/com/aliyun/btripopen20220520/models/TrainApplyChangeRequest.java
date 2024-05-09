// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyChangeRequest extends TeaModel {
    @NameInMap("accept_no_seat")
    public String acceptNoSeat;

    @NameInMap("change_train_info_s")
    public java.util.List<TrainApplyChangeRequestChangeTrainInfoS> changeTrainInfoS;

    @NameInMap("force_match")
    public String forceMatch;

    @NameInMap("is_pay_now")
    public Boolean isPayNow;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_change_apply_id")
    public String outChangeApplyId;

    @NameInMap("out_order_id")
    public String outOrderId;

    public static TrainApplyChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyChangeRequest self = new TrainApplyChangeRequest();
        return TeaModel.build(map, self);
    }

    public TrainApplyChangeRequest setAcceptNoSeat(String acceptNoSeat) {
        this.acceptNoSeat = acceptNoSeat;
        return this;
    }
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    public TrainApplyChangeRequest setChangeTrainInfoS(java.util.List<TrainApplyChangeRequestChangeTrainInfoS> changeTrainInfoS) {
        this.changeTrainInfoS = changeTrainInfoS;
        return this;
    }
    public java.util.List<TrainApplyChangeRequestChangeTrainInfoS> getChangeTrainInfoS() {
        return this.changeTrainInfoS;
    }

    public TrainApplyChangeRequest setForceMatch(String forceMatch) {
        this.forceMatch = forceMatch;
        return this;
    }
    public String getForceMatch() {
        return this.forceMatch;
    }

    public TrainApplyChangeRequest setIsPayNow(Boolean isPayNow) {
        this.isPayNow = isPayNow;
        return this;
    }
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    public TrainApplyChangeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainApplyChangeRequest setOutChangeApplyId(String outChangeApplyId) {
        this.outChangeApplyId = outChangeApplyId;
        return this;
    }
    public String getOutChangeApplyId() {
        return this.outChangeApplyId;
    }

    public TrainApplyChangeRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public static class TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo extends TeaModel {
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo self = new TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo();
            return TeaModel.build(map, self);
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS extends TeaModel {
        @NameInMap("passenger_info")
        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo passengerInfo;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("ticket_price")
        public String ticketPrice;

        @NameInMap("ticket_type")
        public String ticketType;

        public static TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS self = new TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS();
            return TeaModel.build(map, self);
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS setPassengerInfo(TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo passengerInfo) {
            this.passengerInfo = passengerInfo;
            return this;
        }
        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoSPassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS setTicketPrice(String ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public String getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

    }

    public static class TrainApplyChangeRequestChangeTrainInfoS extends TeaModel {
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("change_ticket_info_s")
        public java.util.List<TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS> changeTicketInfoS;

        @NameInMap("choose_bed_s")
        public String chooseBedS;

        @NameInMap("choose_seat_s")
        public String chooseSeatS;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("original_dep_time")
        public String originalDepTime;

        @NameInMap("original_train_no")
        public String originalTrainNo;

        @NameInMap("train_no")
        public String trainNo;

        public static TrainApplyChangeRequestChangeTrainInfoS build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyChangeRequestChangeTrainInfoS self = new TrainApplyChangeRequestChangeTrainInfoS();
            return TeaModel.build(map, self);
        }

        public TrainApplyChangeRequestChangeTrainInfoS setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setChangeTicketInfoS(java.util.List<TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS> changeTicketInfoS) {
            this.changeTicketInfoS = changeTicketInfoS;
            return this;
        }
        public java.util.List<TrainApplyChangeRequestChangeTrainInfoSChangeTicketInfoS> getChangeTicketInfoS() {
            return this.changeTicketInfoS;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setChooseBedS(String chooseBedS) {
            this.chooseBedS = chooseBedS;
            return this;
        }
        public String getChooseBedS() {
            return this.chooseBedS;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setChooseSeatS(String chooseSeatS) {
            this.chooseSeatS = chooseSeatS;
            return this;
        }
        public String getChooseSeatS() {
            return this.chooseSeatS;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setOriginalDepTime(String originalDepTime) {
            this.originalDepTime = originalDepTime;
            return this;
        }
        public String getOriginalDepTime() {
            return this.originalDepTime;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setOriginalTrainNo(String originalTrainNo) {
            this.originalTrainNo = originalTrainNo;
            return this;
        }
        public String getOriginalTrainNo() {
            return this.originalTrainNo;
        }

        public TrainApplyChangeRequestChangeTrainInfoS setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

}
