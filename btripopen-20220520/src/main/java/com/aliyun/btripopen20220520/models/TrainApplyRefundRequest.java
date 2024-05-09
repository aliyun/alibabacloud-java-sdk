// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyRefundRequest extends TeaModel {
    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_refund_id")
    public String outRefundId;

    @NameInMap("refund_train_infos")
    public java.util.List<TrainApplyRefundRequestRefundTrainInfos> refundTrainInfos;

    public static TrainApplyRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainApplyRefundRequest self = new TrainApplyRefundRequest();
        return TeaModel.build(map, self);
    }

    public TrainApplyRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainApplyRefundRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public TrainApplyRefundRequest setOutRefundId(String outRefundId) {
        this.outRefundId = outRefundId;
        return this;
    }
    public String getOutRefundId() {
        return this.outRefundId;
    }

    public TrainApplyRefundRequest setRefundTrainInfos(java.util.List<TrainApplyRefundRequestRefundTrainInfos> refundTrainInfos) {
        this.refundTrainInfos = refundTrainInfos;
        return this;
    }
    public java.util.List<TrainApplyRefundRequestRefundTrainInfos> getRefundTrainInfos() {
        return this.refundTrainInfos;
    }

    public static class TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos extends TeaModel {
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos self = new TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos();
            return TeaModel.build(map, self);
        }

        public TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainApplyRefundRequestRefundTrainInfos extends TeaModel {
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("refund_passenger_infos")
        public java.util.List<TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos> refundPassengerInfos;

        @NameInMap("train_no")
        public String trainNo;

        public static TrainApplyRefundRequestRefundTrainInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainApplyRefundRequestRefundTrainInfos self = new TrainApplyRefundRequestRefundTrainInfos();
            return TeaModel.build(map, self);
        }

        public TrainApplyRefundRequestRefundTrainInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainApplyRefundRequestRefundTrainInfos setRefundPassengerInfos(java.util.List<TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos> refundPassengerInfos) {
            this.refundPassengerInfos = refundPassengerInfos;
            return this;
        }
        public java.util.List<TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos> getRefundPassengerInfos() {
            return this.refundPassengerInfos;
        }

        public TrainApplyRefundRequestRefundTrainInfos setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

}
