// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class RefundDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public RefundDetailResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>error data</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http reqeust has been processed successfully，status code is 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true represents success, false represents failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static RefundDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundDetailResponseBody self = new RefundDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundDetailResponseBody setData(RefundDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefundDetailResponseBodyData getData() {
        return this.data;
    }

    public RefundDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RefundDetailResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public RefundDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public RefundDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public RefundDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>last name</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger self = new RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails extends TeaModel {
        /**
         * <p>amount of the supplementary refund for the change order</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("change_order_refund_fee")
        public Double changeOrderRefundFee;

        /**
         * <p>amount of the supplementary refund for the original order</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("original_order_refund_fee")
        public Double originalOrderRefundFee;

        /**
         * <p>passenger for the refund</p>
         */
        @NameInMap("passenger")
        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger passenger;

        public static RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails self = new RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails setChangeOrderRefundFee(Double changeOrderRefundFee) {
            this.changeOrderRefundFee = changeOrderRefundFee;
            return this;
        }
        public Double getChangeOrderRefundFee() {
            return this.changeOrderRefundFee;
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails setOriginalOrderRefundFee(Double originalOrderRefundFee) {
            this.originalOrderRefundFee = originalOrderRefundFee;
            return this;
        }
        public Double getOriginalOrderRefundFee() {
            return this.originalOrderRefundFee;
        }

        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails setPassenger(RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetailsPassenger getPassenger() {
            return this.passenger;
        }

    }

    public static class RefundDetailResponseBodyDataMultiRefundDetails extends TeaModel {
        /**
         * <p>supplementary refund order number</p>
         * 
         * <strong>example:</strong>
         * <p>498843***6950</p>
         */
        @NameInMap("multi_refund_order_num")
        public Long multiRefundOrderNum;

        /**
         * <p>transaction number of the supplementary refund order</p>
         * 
         * <strong>example:</strong>
         * <p>498843***6950</p>
         */
        @NameInMap("multi_refund_transaction_no")
        public String multiRefundTransactionNo;

        /**
         * <p>supplementary refund details in passenger dimension</p>
         */
        @NameInMap("passenger_multi_refund_details")
        public java.util.List<RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails> passengerMultiRefundDetails;

        public static RefundDetailResponseBodyDataMultiRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataMultiRefundDetails self = new RefundDetailResponseBodyDataMultiRefundDetails();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataMultiRefundDetails setMultiRefundOrderNum(Long multiRefundOrderNum) {
            this.multiRefundOrderNum = multiRefundOrderNum;
            return this;
        }
        public Long getMultiRefundOrderNum() {
            return this.multiRefundOrderNum;
        }

        public RefundDetailResponseBodyDataMultiRefundDetails setMultiRefundTransactionNo(String multiRefundTransactionNo) {
            this.multiRefundTransactionNo = multiRefundTransactionNo;
            return this;
        }
        public String getMultiRefundTransactionNo() {
            return this.multiRefundTransactionNo;
        }

        public RefundDetailResponseBodyDataMultiRefundDetails setPassengerMultiRefundDetails(java.util.List<RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails> passengerMultiRefundDetails) {
            this.passengerMultiRefundDetails = passengerMultiRefundDetails;
            return this;
        }
        public java.util.List<RefundDetailResponseBodyDataMultiRefundDetailsPassengerMultiRefundDetails> getPassengerMultiRefundDetails() {
            return this.passengerMultiRefundDetails;
        }

    }

    public static class RefundDetailResponseBodyDataPassengerRefundDetailsPassenger extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>SAN</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <p>first name</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG</p>
         */
        @NameInMap("last_name")
        public String lastName;

        public static RefundDetailResponseBodyDataPassengerRefundDetailsPassenger build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataPassengerRefundDetailsPassenger self = new RefundDetailResponseBodyDataPassengerRefundDetailsPassenger();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsPassenger setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsPassenger setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsPassenger setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

    }

    public static class RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee extends TeaModel {
        /**
         * <p>total price of the used flight tickets</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("already_used_total_fee")
        public Double alreadyUsedTotalFee;

        /**
         * <p>amount refunded to the user after change (only available when has change order)</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("modify_refund_to_buyer_money")
        public Double modifyRefundToBuyerMoney;

        /**
         * <p>non-refundable change service fee</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("non_refundable_change_service_fee")
        public Double nonRefundableChangeServiceFee;

        /**
         * <p>non-refundable upgrade fee</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("non_refundable_change_upgrade_fee")
        public Double nonRefundableChangeUpgradeFee;

        /**
         * <p>non-refundable tax amount, i.e., tax refund fee</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("non_refundable_tax_fee")
        public Double nonRefundableTaxFee;

        /**
         * <p>non-refundable ticket amount, i.e., ticket refund fee</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("non_refundable_ticket_fee")
        public Double nonRefundableTicketFee;

        /**
         * <p>amount refundable to the user from the original ticket (fare + tax - non_refundable_ticket_fee - non_refundable_tax_fee - already_used_total_fee - discount)</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("refund_to_buyer_money")
        public Double refundToBuyerMoney;

        public static RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee self = new RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setAlreadyUsedTotalFee(Double alreadyUsedTotalFee) {
            this.alreadyUsedTotalFee = alreadyUsedTotalFee;
            return this;
        }
        public Double getAlreadyUsedTotalFee() {
            return this.alreadyUsedTotalFee;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setModifyRefundToBuyerMoney(Double modifyRefundToBuyerMoney) {
            this.modifyRefundToBuyerMoney = modifyRefundToBuyerMoney;
            return this;
        }
        public Double getModifyRefundToBuyerMoney() {
            return this.modifyRefundToBuyerMoney;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setNonRefundableChangeServiceFee(Double nonRefundableChangeServiceFee) {
            this.nonRefundableChangeServiceFee = nonRefundableChangeServiceFee;
            return this;
        }
        public Double getNonRefundableChangeServiceFee() {
            return this.nonRefundableChangeServiceFee;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setNonRefundableChangeUpgradeFee(Double nonRefundableChangeUpgradeFee) {
            this.nonRefundableChangeUpgradeFee = nonRefundableChangeUpgradeFee;
            return this;
        }
        public Double getNonRefundableChangeUpgradeFee() {
            return this.nonRefundableChangeUpgradeFee;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setNonRefundableTaxFee(Double nonRefundableTaxFee) {
            this.nonRefundableTaxFee = nonRefundableTaxFee;
            return this;
        }
        public Double getNonRefundableTaxFee() {
            return this.nonRefundableTaxFee;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setNonRefundableTicketFee(Double nonRefundableTicketFee) {
            this.nonRefundableTicketFee = nonRefundableTicketFee;
            return this;
        }
        public Double getNonRefundableTicketFee() {
            return this.nonRefundableTicketFee;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee setRefundToBuyerMoney(Double refundToBuyerMoney) {
            this.refundToBuyerMoney = refundToBuyerMoney;
            return this;
        }
        public Double getRefundToBuyerMoney() {
            return this.refundToBuyerMoney;
        }

    }

    public static class RefundDetailResponseBodyDataPassengerRefundDetails extends TeaModel {
        /**
         * <p>information of the passenger applying for a refund</p>
         */
        @NameInMap("passenger")
        public RefundDetailResponseBodyDataPassengerRefundDetailsPassenger passenger;

        /**
         * <p>details of the refund fee</p>
         */
        @NameInMap("refund_fee")
        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee refundFee;

        public static RefundDetailResponseBodyDataPassengerRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataPassengerRefundDetails self = new RefundDetailResponseBodyDataPassengerRefundDetails();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataPassengerRefundDetails setPassenger(RefundDetailResponseBodyDataPassengerRefundDetailsPassenger passenger) {
            this.passenger = passenger;
            return this;
        }
        public RefundDetailResponseBodyDataPassengerRefundDetailsPassenger getPassenger() {
            return this.passenger;
        }

        public RefundDetailResponseBodyDataPassengerRefundDetails setRefundFee(RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public RefundDetailResponseBodyDataPassengerRefundDetailsRefundFee getRefundFee() {
            return this.refundFee;
        }

    }

    public static class RefundDetailResponseBodyDataRefundJourneysSegmentList extends TeaModel {
        /**
         * <p>arrival airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_airport")
        public String arrivalAirport;

        /**
         * <p>arrival city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("arrival_city")
        public String arrivalCity;

        /**
         * <p>arrival terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arrival_terminal")
        public String arrivalTerminal;

        /**
         * <p>arrival time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 10:40:00</p>
         */
        @NameInMap("arrival_time")
        public String arrivalTime;

        /**
         * <p>field deprecated</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("availability")
        public String availability;

        /**
         * <p>RBD</p>
         * 
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>cabin class</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <p>code share or not</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("code_share")
        public Boolean codeShare;

        /**
         * <p>departure airport code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("departure_airport")
        public String departureAirport;

        /**
         * <p>departure city code (capitalized)</p>
         * 
         * <strong>example:</strong>
         * <p>SHA</p>
         */
        @NameInMap("departure_city")
        public String departureCity;

        /**
         * <p>departure terminal</p>
         * 
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("departure_terminal")
        public String departureTerminal;

        /**
         * <p>departure time in string format (yyyy-MM-dd HH:mm:ss)</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10 07:55:00</p>
         */
        @NameInMap("departure_time")
        public String departureTime;

        /**
         * <p>equipment type</p>
         * 
         * <strong>example:</strong>
         * <p>32Q</p>
         */
        @NameInMap("equip_type")
        public String equipType;

        /**
         * <p>flight time, unit: minute</p>
         * 
         * <strong>example:</strong>
         * <p>165</p>
         */
        @NameInMap("flight_duration")
        public Integer flightDuration;

        /**
         * <p>marketing airline code (eg: KA)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("marketing_airline")
        public String marketingAirline;

        /**
         * <p>marketing flight no. (eg: KA5809)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <p>marketing flight no. (eg: 5809)</p>
         * 
         * <strong>example:</strong>
         * <p>1295</p>
         */
        @NameInMap("marketing_flight_no_int")
        public Integer marketingFlightNoInt;

        /**
         * <p>operating airline code (eg: CX)</p>
         * 
         * <strong>example:</strong>
         * <p>HO</p>
         */
        @NameInMap("operating_airline")
        public String operatingAirline;

        /**
         * <p>operating flight no. (eg: CX601)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <p>segment ID format: flight no.+departure airport[IATA airport code]+arrival airport[IATA airport code]+departure time(MMdd)</p>
         * 
         * <strong>example:</strong>
         * <p>HO1295-PVG-MFM-20230310</p>
         */
        @NameInMap("segment_id")
        public String segmentId;

        /**
         * <p>stopover city list when stop_quantity &gt; 0 , use “,” for seperation use</p>
         * 
         * <strong>example:</strong>
         * <p>SEL,HKG</p>
         */
        @NameInMap("stop_city_list")
        public String stopCityList;

        /**
         * <p>number of stopover</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("stop_quantity")
        public Integer stopQuantity;

        public static RefundDetailResponseBodyDataRefundJourneysSegmentList build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataRefundJourneysSegmentList self = new RefundDetailResponseBodyDataRefundJourneysSegmentList();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
            return this;
        }
        public String getArrivalAirport() {
            return this.arrivalAirport;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setArrivalCity(String arrivalCity) {
            this.arrivalCity = arrivalCity;
            return this;
        }
        public String getArrivalCity() {
            return this.arrivalCity;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setArrivalTerminal(String arrivalTerminal) {
            this.arrivalTerminal = arrivalTerminal;
            return this;
        }
        public String getArrivalTerminal() {
            return this.arrivalTerminal;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setArrivalTime(String arrivalTime) {
            this.arrivalTime = arrivalTime;
            return this;
        }
        public String getArrivalTime() {
            return this.arrivalTime;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setCodeShare(Boolean codeShare) {
            this.codeShare = codeShare;
            return this;
        }
        public Boolean getCodeShare() {
            return this.codeShare;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
            return this;
        }
        public String getDepartureAirport() {
            return this.departureAirport;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setDepartureCity(String departureCity) {
            this.departureCity = departureCity;
            return this;
        }
        public String getDepartureCity() {
            return this.departureCity;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setDepartureTerminal(String departureTerminal) {
            this.departureTerminal = departureTerminal;
            return this;
        }
        public String getDepartureTerminal() {
            return this.departureTerminal;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setDepartureTime(String departureTime) {
            this.departureTime = departureTime;
            return this;
        }
        public String getDepartureTime() {
            return this.departureTime;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setEquipType(String equipType) {
            this.equipType = equipType;
            return this;
        }
        public String getEquipType() {
            return this.equipType;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setFlightDuration(Integer flightDuration) {
            this.flightDuration = flightDuration;
            return this;
        }
        public Integer getFlightDuration() {
            return this.flightDuration;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setMarketingAirline(String marketingAirline) {
            this.marketingAirline = marketingAirline;
            return this;
        }
        public String getMarketingAirline() {
            return this.marketingAirline;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setMarketingFlightNoInt(Integer marketingFlightNoInt) {
            this.marketingFlightNoInt = marketingFlightNoInt;
            return this;
        }
        public Integer getMarketingFlightNoInt() {
            return this.marketingFlightNoInt;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setOperatingAirline(String operatingAirline) {
            this.operatingAirline = operatingAirline;
            return this;
        }
        public String getOperatingAirline() {
            return this.operatingAirline;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setSegmentId(String segmentId) {
            this.segmentId = segmentId;
            return this;
        }
        public String getSegmentId() {
            return this.segmentId;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setStopCityList(String stopCityList) {
            this.stopCityList = stopCityList;
            return this;
        }
        public String getStopCityList() {
            return this.stopCityList;
        }

        public RefundDetailResponseBodyDataRefundJourneysSegmentList setStopQuantity(Integer stopQuantity) {
            this.stopQuantity = stopQuantity;
            return this;
        }
        public Integer getStopQuantity() {
            return this.stopQuantity;
        }

    }

    public static class RefundDetailResponseBodyDataRefundJourneys extends TeaModel {
        /**
         * <p>segment list</p>
         */
        @NameInMap("segment_list")
        public java.util.List<RefundDetailResponseBodyDataRefundJourneysSegmentList> segmentList;

        /**
         * <p>number of transfer</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("transfer_count")
        public Integer transferCount;

        public static RefundDetailResponseBodyDataRefundJourneys build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyDataRefundJourneys self = new RefundDetailResponseBodyDataRefundJourneys();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyDataRefundJourneys setSegmentList(java.util.List<RefundDetailResponseBodyDataRefundJourneysSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<RefundDetailResponseBodyDataRefundJourneysSegmentList> getSegmentList() {
            return this.segmentList;
        }

        public RefundDetailResponseBodyDataRefundJourneys setTransferCount(Integer transferCount) {
            this.transferCount = transferCount;
            return this;
        }
        public Integer getTransferCount() {
            return this.transferCount;
        }

    }

    public static class RefundDetailResponseBodyData extends TeaModel {
        /**
         * <p>whether it is a supplementary refund order (if the refund amount is not enough, you can use RefundApply to create a supplementary refund order)</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("contain_multi_refund")
        public Boolean containMultiRefund;

        /**
         * <p>supplementary refund orders</p>
         */
        @NameInMap("multi_refund_details")
        public java.util.List<RefundDetailResponseBodyDataMultiRefundDetails> multiRefundDetails;

        /**
         * <p>order number that returned by Book</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
        @NameInMap("order_num")
        public Long orderNum;

        /**
         * <p>refund details by passenger dimension</p>
         */
        @NameInMap("passenger_refund_details")
        public java.util.List<RefundDetailResponseBodyDataPassengerRefundDetails> passengerRefundDetails;

        /**
         * <p>refund completed time(timestamp)</p>
         * 
         * <strong>example:</strong>
         * <p>1677229005000</p>
         */
        @NameInMap("pay_success_utc_time")
        public Long paySuccessUtcTime;

        /**
         * <p>URLs for refund attachments</p>
         * 
         * <strong>example:</strong>
         * <p>[zzz,yyy]</p>
         */
        @NameInMap("refund_attachment_urls")
        public java.util.List<String> refundAttachmentUrls;

        /**
         * <p>refunded journey</p>
         */
        @NameInMap("refund_journeys")
        public java.util.List<RefundDetailResponseBodyDataRefundJourneys> refundJourneys;

        /**
         * <p>refund order number that returned by RefundApply</p>
         * 
         * <strong>example:</strong>
         * <p>4966***617654</p>
         */
        @NameInMap("refund_order_num")
        public Long refundOrderNum;

        /**
         * <p>reason for refund</p>
         * 
         * <strong>example:</strong>
         * <p>desc reason</p>
         */
        @NameInMap("refund_reason")
        public String refundReason;

        /**
         * <p>refund type </p>
         * <p>2: voluntary application</p>
         * <p>5: flight delay or cancellation, flight schedule change, etc., due to airline reasons</p>
         * <p>6: health reasons with a certificate from a secondary class A hospital or above</p>
         * <p>7: non-voluntary confirmed guidance</p>
         * <p>100: non-voluntary non-confirmed guidance</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("refund_type")
        public Integer refundType;

        /**
         * <p>reason for refund rejection</p>
         * 
         * <strong>example:</strong>
         * <p>refuse reason</p>
         */
        @NameInMap("refuse_reason")
        public String refuseReason;

        /**
         * <p>refund order status</p>
         * <p>0: refund application</p>
         * <p>1: refund in progress</p>
         * <p>2: refund failed</p>
         * <p>3: refund succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>transaction number</p>
         * 
         * <strong>example:</strong>
         * <p>1677229005000</p>
         */
        @NameInMap("transaction_no")
        public String transactionNo;

        /**
         * <p>refund order created time(timestamp)</p>
         * 
         * <strong>example:</strong>
         * <p>1677229002000</p>
         */
        @NameInMap("utc_create_time")
        public Long utcCreateTime;

        public static RefundDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefundDetailResponseBodyData self = new RefundDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefundDetailResponseBodyData setContainMultiRefund(Boolean containMultiRefund) {
            this.containMultiRefund = containMultiRefund;
            return this;
        }
        public Boolean getContainMultiRefund() {
            return this.containMultiRefund;
        }

        public RefundDetailResponseBodyData setMultiRefundDetails(java.util.List<RefundDetailResponseBodyDataMultiRefundDetails> multiRefundDetails) {
            this.multiRefundDetails = multiRefundDetails;
            return this;
        }
        public java.util.List<RefundDetailResponseBodyDataMultiRefundDetails> getMultiRefundDetails() {
            return this.multiRefundDetails;
        }

        public RefundDetailResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

        public RefundDetailResponseBodyData setPassengerRefundDetails(java.util.List<RefundDetailResponseBodyDataPassengerRefundDetails> passengerRefundDetails) {
            this.passengerRefundDetails = passengerRefundDetails;
            return this;
        }
        public java.util.List<RefundDetailResponseBodyDataPassengerRefundDetails> getPassengerRefundDetails() {
            return this.passengerRefundDetails;
        }

        public RefundDetailResponseBodyData setPaySuccessUtcTime(Long paySuccessUtcTime) {
            this.paySuccessUtcTime = paySuccessUtcTime;
            return this;
        }
        public Long getPaySuccessUtcTime() {
            return this.paySuccessUtcTime;
        }

        public RefundDetailResponseBodyData setRefundAttachmentUrls(java.util.List<String> refundAttachmentUrls) {
            this.refundAttachmentUrls = refundAttachmentUrls;
            return this;
        }
        public java.util.List<String> getRefundAttachmentUrls() {
            return this.refundAttachmentUrls;
        }

        public RefundDetailResponseBodyData setRefundJourneys(java.util.List<RefundDetailResponseBodyDataRefundJourneys> refundJourneys) {
            this.refundJourneys = refundJourneys;
            return this;
        }
        public java.util.List<RefundDetailResponseBodyDataRefundJourneys> getRefundJourneys() {
            return this.refundJourneys;
        }

        public RefundDetailResponseBodyData setRefundOrderNum(Long refundOrderNum) {
            this.refundOrderNum = refundOrderNum;
            return this;
        }
        public Long getRefundOrderNum() {
            return this.refundOrderNum;
        }

        public RefundDetailResponseBodyData setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public RefundDetailResponseBodyData setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

        public RefundDetailResponseBodyData setRefuseReason(String refuseReason) {
            this.refuseReason = refuseReason;
            return this;
        }
        public String getRefuseReason() {
            return this.refuseReason;
        }

        public RefundDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public RefundDetailResponseBodyData setTransactionNo(String transactionNo) {
            this.transactionNo = transactionNo;
            return this;
        }
        public String getTransactionNo() {
            return this.transactionNo;
        }

        public RefundDetailResponseBodyData setUtcCreateTime(Long utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public Long getUtcCreateTime() {
            return this.utcCreateTime;
        }

    }

}
