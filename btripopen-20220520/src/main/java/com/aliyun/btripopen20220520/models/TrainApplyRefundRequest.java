// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainApplyRefundRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1002145190081005400</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456778</p>
     */
    @NameInMap("out_refund_id")
    public String outRefundId;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>170d9ac6f8807f9ec603c688f45f78a41</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12334</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("refund_passenger_infos")
        public java.util.List<TrainApplyRefundRequestRefundTrainInfosRefundPassengerInfos> refundPassengerInfos;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>K234</p>
         */
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
