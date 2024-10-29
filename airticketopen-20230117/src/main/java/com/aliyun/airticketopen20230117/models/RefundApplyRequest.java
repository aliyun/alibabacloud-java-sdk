// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundApplyRequest extends TeaModel {
    /**
     * <p>order number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4966***617111</p>
     */
    @NameInMap("order_num")
    public Long orderNum;

    /**
     * <p>journeys for which a refund is being requested</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_journeys")
    public java.util.List<RefundApplyRequestRefundJourneys> refundJourneys;

    /**
     * <p>passengers that applying for a refund</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_passenger_list")
    public java.util.List<RefundApplyRequestRefundPassengerList> refundPassengerList;

    /**
     * <p>refund type and attachments</p>
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
         * <p>arrival airport code (capitalized)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>arrival city code (capitalized)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>departure airport code (capitalized)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>departure city code (capitalized)</p>
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
         * <p>segment list</p>
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
         * <p>credential number</p>
         * 
         * <strong>example:</strong>
         * <p>411***********4411</p>
         */
        @NameInMap("document")
        public String document;

        /**
         * <p>first name</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>last name</p>
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
         * <p>attachment file URLs</p>
         * <p>(note: upload the files using a separate file upload interface to get the file URLs)</p>
         * 
         * <strong>example:</strong>
         * <p>[xxx,yyy]</p>
         */
        @NameInMap("file")
        public java.util.List<String> file;

        /**
         * <p>refund type </p>
         * <p>2: voluntary (I want to change my travel plan/I don\&quot;t want to fly) </p>
         * <p>5: involuntary, due to flight delay or cancellation, schedule changes, etc., by the airline </p>
         * <p>6: involuntary, due to health reasons with a certificate from a hospital of at least secondary level A or above </p>
         * <p> (note: attachments are not mandatory, but it is recommended to provide them for involuntary refunds as they can increase the success rate)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("refund_type_id")
        public Integer refundTypeId;

        /**
         * <p>remark</p>
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
