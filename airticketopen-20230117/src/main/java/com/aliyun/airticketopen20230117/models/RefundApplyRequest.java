// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyRequest extends TeaModel {
    /**
     * <p>The order number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4966***617111</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <p>The journeys for the refund application.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_journeys")
    public java.util.List<RefundApplyRequestRefundJourneys> refundJourneys;

    /**
     * <p>The list of passengers for the refund application.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_passenger_list")
    public java.util.List<RefundApplyRequestRefundPassengerList> refundPassengerList;

    /**
     * <p>The refund type. Attachments are required for involuntary refund applications.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_type")
    public RefundApplyRequestRefundType refundType;

    public static RefundApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundApplyRequest self = new RefundApplyRequest();
        return TeaModel.build(map, self);
    }

    public RefundApplyRequest setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
        return this;
    }
    public Long getOrderNum() {
        return this.orderNum;
    }

    public RefundApplyRequest setRefundJourneys(java.util.List<RefundApplyRequestRefundJourneys> refundJourneys) {
        this.refundJourneys = refundJourneys;
        return this;
    }
    public java.util.List<RefundApplyRequestRefundJourneys> getRefundJourneys() {
        return this.refundJourneys;
    }

    public RefundApplyRequest setRefundPassengerList(java.util.List<RefundApplyRequestRefundPassengerList> refundPassengerList) {
        this.refundPassengerList = refundPassengerList;
        return this;
    }
    public java.util.List<RefundApplyRequestRefundPassengerList> getRefundPassengerList() {
        return this.refundPassengerList;
    }

    public RefundApplyRequest setRefundType(RefundApplyRequestRefundType refundType) {
        this.refundType = refundType;
        return this;
    }
    public RefundApplyRequestRefundType getRefundType() {
        return this.refundType;
    }

    public static class RefundApplyRequestRefundJourneysSegmentList extends TeaModel {
        /**
         * <p>The three-letter IATA code of the arrival airport (uppercase).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>The three-letter IATA code of the arrival city (uppercase).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>The three-letter IATA code of the departure airport (uppercase).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>The three-letter IATA code of the departure city (uppercase).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        public static RefundApplyRequestRefundJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyRequestRefundJourneysSegmentList self = new RefundApplyRequestRefundJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public RefundApplyRequestRefundJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public RefundApplyRequestRefundJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public RefundApplyRequestRefundJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public RefundApplyRequestRefundJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

    }

    public static class RefundApplyRequestRefundJourneys extends TeaModel {
        /**
         * <p>The segment information.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("segment_list")
        public java.util.List<RefundApplyRequestRefundJourneysSegmentList> segmentList;

        public static RefundApplyRequestRefundJourneys build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyRequestRefundJourneys self = new RefundApplyRequestRefundJourneys();
            return TeaModel.build(map, self);
        }

        public RefundApplyRequestRefundJourneys setSegmentList(java.util.List<RefundApplyRequestRefundJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<RefundApplyRequestRefundJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

    public static class RefundApplyRequestRefundPassengerList extends TeaModel {
        /**
         * <p>The document number of the passenger.</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>The first name of the passenger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>The last name of the passenger.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static RefundApplyRequestRefundPassengerList build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyRequestRefundPassengerList self = new RefundApplyRequestRefundPassengerList();
            return TeaModel.build(map, self);
        }

        public RefundApplyRequestRefundPassengerList setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public RefundApplyRequestRefundPassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public RefundApplyRequestRefundPassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class RefundApplyRequestRefundType extends TeaModel {
        /**
         * <p>The array of attachment file URLs. Upload files first by using the dedicated file upload operation to obtain the file URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>[xxx,yyy]</p>
         */
        @NameInMap("file")
        public java.util.List<String> file;

        /**
         * <p>The refund type. Valid values:</p>
         * <ul>
         * <li>2: Voluntary refund (change of travel plans or decision not to fly).</li>
         * <li>5: Involuntary refund due to airline reasons such as flight delay, cancellation, or schedule change.</li>
         * <li>6: Involuntary refund due to medical reasons with a certificate from a Grade II Class A hospital or above.</li>
         * </ul>
         * <p>Note: Attachments are not mandatory, but providing attachments for involuntary refunds can improve the success rate of the refund application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("refund_type_id")
        public Integer refundTypeId;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>remark desc</p>
         */
        @NameInMap("remark")
        public String remark;

        public static RefundApplyRequestRefundType build(java.util.Map<String, ?> map) throws Exception {
            RefundApplyRequestRefundType self = new RefundApplyRequestRefundType();
            return TeaModel.build(map, self);
        }

        public RefundApplyRequestRefundType setFile(java.util.List<String> file) {
            this.file = file;
            return this;
        }
        public java.util.List<String> getFile() {
            return this.file;
        }

        public RefundApplyRequestRefundType setRefundTypeId(Integer refundTypeId) {
            this.refundTypeId = refundTypeId;
            return this;
        }
        public Integer getRefundTypeId() {
            return this.refundTypeId;
        }

        public RefundApplyRequestRefundType setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
