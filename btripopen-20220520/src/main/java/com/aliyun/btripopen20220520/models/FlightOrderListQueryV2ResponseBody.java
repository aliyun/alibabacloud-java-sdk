// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderListQueryV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<FlightOrderListQueryV2ResponseBodyModule> module;

    @NameInMap("pageInfo")
    public FlightOrderListQueryV2ResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-<strong><strong>-</strong></strong>-****-D77369043A5F</p>
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
     * <strong>example:</strong>
     * <p>21041ce********056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightOrderListQueryV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderListQueryV2ResponseBody self = new FlightOrderListQueryV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOrderListQueryV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOrderListQueryV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOrderListQueryV2ResponseBody setModule(java.util.List<FlightOrderListQueryV2ResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<FlightOrderListQueryV2ResponseBodyModule> getModule() {
        return this.module;
    }

    public FlightOrderListQueryV2ResponseBody setPageInfo(FlightOrderListQueryV2ResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public FlightOrderListQueryV2ResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public FlightOrderListQueryV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOrderListQueryV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOrderListQueryV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOrderListQueryV2ResponseBodyModuleApprove extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        @NameInMap("approve_id")
        public Long approveId;

        @NameInMap("btrip_title")
        public String btripTitle;

        /**
         * <strong>example:</strong>
         * <p>1233544</p>
         */
        @NameInMap("exceed_approve_id")
        public String exceedApproveId;

        /**
         * <strong>example:</strong>
         * <p>100231431</p>
         */
        @NameInMap("thirdpart_approve_id")
        public String thirdpartApproveId;

        /**
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("thirdpart_exceed_approve_id")
        public String thirdpartExceedApproveId;

        public static FlightOrderListQueryV2ResponseBodyModuleApprove build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleApprove self = new FlightOrderListQueryV2ResponseBodyModuleApprove();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleApprove setApproveId(Long approveId) {
            this.approveId = approveId;
            return this;
        }
        public Long getApproveId() {
            return this.approveId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleApprove setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public FlightOrderListQueryV2ResponseBodyModuleApprove setExceedApproveId(String exceedApproveId) {
            this.exceedApproveId = exceedApproveId;
            return this;
        }
        public String getExceedApproveId() {
            return this.exceedApproveId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleApprove setThirdpartApproveId(String thirdpartApproveId) {
            this.thirdpartApproveId = thirdpartApproveId;
            return this;
        }
        public String getThirdpartApproveId() {
            return this.thirdpartApproveId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleApprove setThirdpartExceedApproveId(String thirdpartExceedApproveId) {
            this.thirdpartExceedApproveId = thirdpartExceedApproveId;
            return this;
        }
        public String getThirdpartExceedApproveId() {
            return this.thirdpartExceedApproveId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>CA8572</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList self = new FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList> flightList;

        @NameInMap("ticket_no_list")
        public java.util.List<String> ticketNoList;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList self = new FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList setFlightList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketListFlightList> getFlightList() {
            return this.flightList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList setTicketNoList(java.util.List<String> ticketNoList) {
            this.ticketNoList = ticketNoList;
            return this;
        }
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList extends TeaModel {
        @NameInMap("build_fee")
        public Double buildFee;

        @NameInMap("corp_pay_amount")
        public Double corpPayAmount;

        @NameInMap("oil_fee")
        public Double oilFee;

        @NameInMap("person_pay_amount")
        public Double personPayAmount;

        @NameInMap("ticket_price")
        public Double ticketPrice;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList self = new FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setBuildFee(Double buildFee) {
            this.buildFee = buildFee;
            return this;
        }
        public Double getBuildFee() {
            return this.buildFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setCorpPayAmount(Double corpPayAmount) {
            this.corpPayAmount = corpPayAmount;
            return this;
        }
        public Double getCorpPayAmount() {
            return this.corpPayAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setOilFee(Double oilFee) {
            this.oilFee = oilFee;
            return this;
        }
        public Double getOilFee() {
            return this.oilFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setPersonPayAmount(Double personPayAmount) {
            this.personPayAmount = personPayAmount;
            return this;
        }
        public Double getPersonPayAmount() {
            return this.personPayAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>HU7052</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList self = new FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList> flightList;

        @NameInMap("ticket_no_list")
        public java.util.List<String> ticketNoList;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList self = new FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList setFlightList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketListFlightList> getFlightList() {
            return this.flightList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList setTicketNoList(java.util.List<String> ticketNoList) {
            this.ticketNoList = ticketNoList;
            return this;
        }
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CZ</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>PKX</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_mile")
        public Integer flightMile;

        /**
         * <strong>example:</strong>
         * <p>MU5619</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("stop_city")
        public java.util.List<String> stopCity;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList self = new FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setFlightMile(Integer flightMile) {
            this.flightMile = flightMile;
            return this;
        }
        public Integer getFlightMile() {
            return this.flightMile;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList setStopCity(java.util.List<String> stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList extends TeaModel {
        @NameInMap("already_use_amount")
        public Double alreadyUseAmount;

        @NameInMap("non_refundable_reshop_change_amount")
        public Double nonRefundableReshopChangeAmount;

        @NameInMap("non_refundable_reshop_upgrade_amount")
        public Double nonRefundableReshopUpgradeAmount;

        @NameInMap("refund_amount")
        public Double refundAmount;

        @NameInMap("refund_corp_amount")
        public Double refundCorpAmount;

        @NameInMap("refund_hand_fee")
        public Double refundHandFee;

        @NameInMap("refund_person_amount")
        public Double refundPersonAmount;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList self = new FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setAlreadyUseAmount(Double alreadyUseAmount) {
            this.alreadyUseAmount = alreadyUseAmount;
            return this;
        }
        public Double getAlreadyUseAmount() {
            return this.alreadyUseAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setNonRefundableReshopChangeAmount(Double nonRefundableReshopChangeAmount) {
            this.nonRefundableReshopChangeAmount = nonRefundableReshopChangeAmount;
            return this;
        }
        public Double getNonRefundableReshopChangeAmount() {
            return this.nonRefundableReshopChangeAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setNonRefundableReshopUpgradeAmount(Double nonRefundableReshopUpgradeAmount) {
            this.nonRefundableReshopUpgradeAmount = nonRefundableReshopUpgradeAmount;
            return this;
        }
        public Double getNonRefundableReshopUpgradeAmount() {
            return this.nonRefundableReshopUpgradeAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setRefundAmount(Double refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Double getRefundAmount() {
            return this.refundAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setRefundCorpAmount(Double refundCorpAmount) {
            this.refundCorpAmount = refundCorpAmount;
            return this;
        }
        public Double getRefundCorpAmount() {
            return this.refundCorpAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setRefundHandFee(Double refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Double getRefundHandFee() {
            return this.refundHandFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setRefundPersonAmount(Double refundPersonAmount) {
            this.refundPersonAmount = refundPersonAmount;
            return this;
        }
        public Double getRefundPersonAmount() {
            return this.refundPersonAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList extends TeaModel {
        @NameInMap("flight_refund_apply_ticket_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList> flightRefundApplyTicketList;

        @NameInMap("flight_refund_segment_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList> flightRefundSegmentList;

        @NameInMap("flight_refund_user_fee_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList> flightRefundUserFeeList;

        /**
         * <strong>example:</strong>
         * <p>232213</p>
         */
        @NameInMap("refund_apply_id")
        public String refundApplyId;

        /**
         * <strong>example:</strong>
         * <p>2024122312</p>
         */
        @NameInMap("refund_approve_id")
        public String refundApproveId;

        @NameInMap("refund_corp_total_amount")
        public Double refundCorpTotalAmount;

        @NameInMap("refund_hand_fee")
        public Double refundHandFee;

        @NameInMap("refund_person_total_amount")
        public Double refundPersonTotalAmount;

        @NameInMap("refund_reason")
        public String refundReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("refund_reason_code")
        public String refundReasonCode;

        @NameInMap("refund_total_amount")
        public Double refundTotalAmount;

        /**
         * <strong>example:</strong>
         * <p>232218</p>
         */
        @NameInMap("relate_refund_apply_id")
        public String relateRefundApplyId;

        @NameInMap("user_id_list")
        public java.util.List<String> userIdList;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList self = new FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setFlightRefundApplyTicketList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList> flightRefundApplyTicketList) {
            this.flightRefundApplyTicketList = flightRefundApplyTicketList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundApplyTicketList> getFlightRefundApplyTicketList() {
            return this.flightRefundApplyTicketList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setFlightRefundSegmentList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList> flightRefundSegmentList) {
            this.flightRefundSegmentList = flightRefundSegmentList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setFlightRefundUserFeeList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList> flightRefundUserFeeList) {
            this.flightRefundUserFeeList = flightRefundUserFeeList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyListFlightRefundUserFeeList> getFlightRefundUserFeeList() {
            return this.flightRefundUserFeeList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundApplyId(String refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundApproveId(String refundApproveId) {
            this.refundApproveId = refundApproveId;
            return this;
        }
        public String getRefundApproveId() {
            return this.refundApproveId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundCorpTotalAmount(Double refundCorpTotalAmount) {
            this.refundCorpTotalAmount = refundCorpTotalAmount;
            return this;
        }
        public Double getRefundCorpTotalAmount() {
            return this.refundCorpTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundHandFee(Double refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Double getRefundHandFee() {
            return this.refundHandFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundPersonTotalAmount(Double refundPersonTotalAmount) {
            this.refundPersonTotalAmount = refundPersonTotalAmount;
            return this;
        }
        public Double getRefundPersonTotalAmount() {
            return this.refundPersonTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundReasonCode(String refundReasonCode) {
            this.refundReasonCode = refundReasonCode;
            return this;
        }
        public String getRefundReasonCode() {
            return this.refundReasonCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRefundTotalAmount(Double refundTotalAmount) {
            this.refundTotalAmount = refundTotalAmount;
            return this;
        }
        public Double getRefundTotalAmount() {
            return this.refundTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setRelateRefundApplyId(String relateRefundApplyId) {
            this.relateRefundApplyId = relateRefundApplyId;
            return this;
        }
        public String getRelateRefundApplyId() {
            return this.relateRefundApplyId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>MU1398</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList self = new FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList extends TeaModel {
        @NameInMap("flight_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList> flightList;

        @NameInMap("relate_ticket_no_list")
        public java.util.List<String> relateTicketNoList;

        @NameInMap("ticket_no_list")
        public java.util.List<String> ticketNoList;

        /**
         * <strong>example:</strong>
         * <p>alitrip123</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList self = new FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList setFlightList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList> flightList) {
            this.flightList = flightList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketListFlightList> getFlightList() {
            return this.flightList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList setRelateTicketNoList(java.util.List<String> relateTicketNoList) {
            this.relateTicketNoList = relateTicketNoList;
            return this;
        }
        public java.util.List<String> getRelateTicketNoList() {
            return this.relateTicketNoList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList setTicketNoList(java.util.List<String> ticketNoList) {
            this.ticketNoList = ticketNoList;
            return this;
        }
        public java.util.List<String> getTicketNoList() {
            return this.ticketNoList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>PEX</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_mile")
        public Integer flightMile;

        /**
         * <strong>example:</strong>
         * <p>CA3358</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("stop_city")
        public java.util.List<String> stopCity;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList self = new FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setFlightMile(Integer flightMile) {
            this.flightMile = flightMile;
            return this;
        }
        public Integer getFlightMile() {
            return this.flightMile;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList setStopCity(java.util.List<String> stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList extends TeaModel {
        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("reshop_corp_amount")
        public Double reshopCorpAmount;

        @NameInMap("reshop_person_amount")
        public Double reshopPersonAmount;

        @NameInMap("upgrade_fee")
        public Double upgradeFee;

        /**
         * <strong>example:</strong>
         * <p>alitrip123</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList self = new FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList setReshopCorpAmount(Double reshopCorpAmount) {
            this.reshopCorpAmount = reshopCorpAmount;
            return this;
        }
        public Double getReshopCorpAmount() {
            return this.reshopCorpAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList setReshopPersonAmount(Double reshopPersonAmount) {
            this.reshopPersonAmount = reshopPersonAmount;
            return this;
        }
        public Double getReshopPersonAmount() {
            return this.reshopPersonAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList setUpgradeFee(Double upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList extends TeaModel {
        @NameInMap("flight_reshop_apply_ticket_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList> flightReshopApplyTicketList;

        @NameInMap("flight_reshop_segment_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList> flightReshopSegmentList;

        @NameInMap("flight_reshop_user_fee_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList> flightReshopUserFeeList;

        /**
         * <strong>example:</strong>
         * <p>100231231</p>
         */
        @NameInMap("relate_reshop_apply_id")
        public Long relateReshopApplyId;

        /**
         * <strong>example:</strong>
         * <p>123232323</p>
         */
        @NameInMap("reshop_apply_id")
        public Long reshopApplyId;

        /**
         * <strong>example:</strong>
         * <p>122312</p>
         */
        @NameInMap("reshop_approve_id")
        public String reshopApproveId;

        @NameInMap("reshop_corp_total_amount")
        public Double reshopCorpTotalAmount;

        @NameInMap("reshop_person_total_amount")
        public Double reshopPersonTotalAmount;

        @NameInMap("reshop_reason")
        public String reshopReason;

        /**
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("reshop_reason_code")
        public String reshopReasonCode;

        @NameInMap("reshop_total_amount")
        public Double reshopTotalAmount;

        @NameInMap("user_id_list")
        public java.util.List<String> userIdList;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList self = new FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setFlightReshopApplyTicketList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList> flightReshopApplyTicketList) {
            this.flightReshopApplyTicketList = flightReshopApplyTicketList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopApplyTicketList> getFlightReshopApplyTicketList() {
            return this.flightReshopApplyTicketList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setFlightReshopSegmentList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList> flightReshopSegmentList) {
            this.flightReshopSegmentList = flightReshopSegmentList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopSegmentList> getFlightReshopSegmentList() {
            return this.flightReshopSegmentList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setFlightReshopUserFeeList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList> flightReshopUserFeeList) {
            this.flightReshopUserFeeList = flightReshopUserFeeList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyListFlightReshopUserFeeList> getFlightReshopUserFeeList() {
            return this.flightReshopUserFeeList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setRelateReshopApplyId(Long relateReshopApplyId) {
            this.relateReshopApplyId = relateReshopApplyId;
            return this;
        }
        public Long getRelateReshopApplyId() {
            return this.relateReshopApplyId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopApplyId(Long reshopApplyId) {
            this.reshopApplyId = reshopApplyId;
            return this;
        }
        public Long getReshopApplyId() {
            return this.reshopApplyId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopApproveId(String reshopApproveId) {
            this.reshopApproveId = reshopApproveId;
            return this;
        }
        public String getReshopApproveId() {
            return this.reshopApproveId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopCorpTotalAmount(Double reshopCorpTotalAmount) {
            this.reshopCorpTotalAmount = reshopCorpTotalAmount;
            return this;
        }
        public Double getReshopCorpTotalAmount() {
            return this.reshopCorpTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopPersonTotalAmount(Double reshopPersonTotalAmount) {
            this.reshopPersonTotalAmount = reshopPersonTotalAmount;
            return this;
        }
        public Double getReshopPersonTotalAmount() {
            return this.reshopPersonTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopReason(String reshopReason) {
            this.reshopReason = reshopReason;
            return this;
        }
        public String getReshopReason() {
            return this.reshopReason;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopReasonCode(String reshopReasonCode) {
            this.reshopReasonCode = reshopReasonCode;
            return this;
        }
        public String getReshopReasonCode() {
            return this.reshopReasonCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setReshopTotalAmount(Double reshopTotalAmount) {
            this.reshopTotalAmount = reshopTotalAmount;
            return this;
        }
        public Double getReshopTotalAmount() {
            return this.reshopTotalAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList setUserIdList(java.util.List<String> userIdList) {
            this.userIdList = userIdList;
            return this;
        }
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CZ</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2022-07-20T10:40Z</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_mile")
        public Integer flightMile;

        /**
         * <strong>example:</strong>
         * <p>CZ2891</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("stop_city")
        public java.util.List<String> stopCity;

        public static FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList self = new FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setFlightMile(Integer flightMile) {
            this.flightMile = flightMile;
            return this;
        }
        public Integer getFlightMile() {
            return this.flightMile;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList setStopCity(java.util.List<String> stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public java.util.List<String> getStopCity() {
            return this.stopCity;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleInsureInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1002308231</p>
         */
        @NameInMap("insure_id")
        public String insureId;

        @NameInMap("insure_order_amount")
        public Double insureOrderAmount;

        @NameInMap("insure_price")
        public Double insurePrice;

        @NameInMap("insure_type")
        public String insureType;

        @NameInMap("name_list")
        public java.util.List<String> nameList;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        public static FlightOrderListQueryV2ResponseBodyModuleInsureInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleInsureInfoList self = new FlightOrderListQueryV2ResponseBodyModuleInsureInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setInsureId(String insureId) {
            this.insureId = insureId;
            return this;
        }
        public String getInsureId() {
            return this.insureId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setInsureOrderAmount(Double insureOrderAmount) {
            this.insureOrderAmount = insureOrderAmount;
            return this;
        }
        public Double getInsureOrderAmount() {
            return this.insureOrderAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setInsurePrice(Double insurePrice) {
            this.insurePrice = insurePrice;
            return this;
        }
        public Double getInsurePrice() {
            return this.insurePrice;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setInsureType(String insureType) {
            this.insureType = insureType;
            return this;
        }
        public String getInsureType() {
            return this.insureType;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public FlightOrderListQueryV2ResponseBodyModuleInsureInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModulePriceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_code")
        public Integer categoryCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category_type")
        public Integer categoryType;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("price")
        public Double price;

        /**
         * <strong>example:</strong>
         * <p>175549295</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        /**
         * <strong>example:</strong>
         * <p>f98236773</p>
         */
        @NameInMap("trade_id")
        public String tradeId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public Integer type;

        public static FlightOrderListQueryV2ResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModulePriceInfoList self = new FlightOrderListQueryV2ResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public FlightOrderListQueryV2ResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alitrip</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>alitripTest</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test_cost_center</p>
         */
        @NameInMap("number")
        public String number;

        public static FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter self = new FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alitrip</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        public static FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment self = new FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test1233</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice self = new FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test_project_id</p>
         */
        @NameInMap("project_id")
        public String projectId;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>test_third_part_project_id</p>
         */
        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        public static FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject self = new FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList extends TeaModel {
        @NameInMap("cost_center")
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter costCenter;

        @NameInMap("department")
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment department;

        @NameInMap("invoice")
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice invoice;

        @NameInMap("project")
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject project;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList self = new FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setCostCenter(FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListCostCenter getCostCenter() {
            return this.costCenter;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setDepartment(FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment department) {
            this.department = department;
            return this;
        }
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListDepartment getDepartment() {
            return this.department;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setInvoice(FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice invoice) {
            this.invoice = invoice;
            return this;
        }
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListInvoice getInvoice() {
            return this.invoice;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setProject(FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject project) {
            this.project = project;
            return this;
        }
        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateListProject getProject() {
            return this.project;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyModule extends TeaModel {
        @NameInMap("approve")
        public FlightOrderListQueryV2ResponseBodyModuleApprove approve;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("flight_order_ticket_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList> flightOrderTicketList;

        @NameInMap("flight_order_user_fee_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList> flightOrderUserFeeList;

        @NameInMap("flight_refund_apply_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList> flightRefundApplyList;

        @NameInMap("flight_reshop_apply_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList> flightReshopApplyList;

        @NameInMap("flight_segment_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList> flightSegmentList;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("gmt_create")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("gmt_modified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>200042</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("insure_info_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleInsureInfoList> insureInfoList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("mix_pay")
        public Boolean mixPay;

        @NameInMap("order_reserve_amount")
        public Double orderReserveAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("passenger_count")
        public Integer passengerCount;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("price_info_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModulePriceInfoList> priceInfoList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("supplier")
        public String supplier;

        /**
         * <strong>example:</strong>
         * <p>cs9897766</p>
         */
        @NameInMap("thirdpart_itinerary_id")
        public java.util.List<String> thirdpartItineraryId;

        @NameInMap("ticket_corp_reserve_amount")
        public Double ticketCorpReserveAmount;

        @NameInMap("ticket_person_reserve_amount")
        public Double ticketPersonReserveAmount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_mode")
        public Integer tripMode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        @NameInMap("user_affiliate_list")
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList> userAffiliateList;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static FlightOrderListQueryV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyModule self = new FlightOrderListQueryV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyModule setApprove(FlightOrderListQueryV2ResponseBodyModuleApprove approve) {
            this.approve = approve;
            return this;
        }
        public FlightOrderListQueryV2ResponseBodyModuleApprove getApprove() {
            return this.approve;
        }

        public FlightOrderListQueryV2ResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightOrderListQueryV2ResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public FlightOrderListQueryV2ResponseBodyModule setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public FlightOrderListQueryV2ResponseBodyModule setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public FlightOrderListQueryV2ResponseBodyModule setFlightOrderTicketList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList> flightOrderTicketList) {
            this.flightOrderTicketList = flightOrderTicketList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setFlightOrderUserFeeList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList> flightOrderUserFeeList) {
            this.flightOrderUserFeeList = flightOrderUserFeeList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightOrderUserFeeList> getFlightOrderUserFeeList() {
            return this.flightOrderUserFeeList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setFlightRefundApplyList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList> flightRefundApplyList) {
            this.flightRefundApplyList = flightRefundApplyList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightRefundApplyList> getFlightRefundApplyList() {
            return this.flightRefundApplyList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setFlightReshopApplyList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList> flightReshopApplyList) {
            this.flightReshopApplyList = flightReshopApplyList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightReshopApplyList> getFlightReshopApplyList() {
            return this.flightReshopApplyList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setFlightSegmentList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList> flightSegmentList) {
            this.flightSegmentList = flightSegmentList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleFlightSegmentList> getFlightSegmentList() {
            return this.flightSegmentList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderListQueryV2ResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public FlightOrderListQueryV2ResponseBodyModule setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public FlightOrderListQueryV2ResponseBodyModule setInsureInfoList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleInsureInfoList> insureInfoList) {
            this.insureInfoList = insureInfoList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleInsureInfoList> getInsureInfoList() {
            return this.insureInfoList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setMixPay(Boolean mixPay) {
            this.mixPay = mixPay;
            return this;
        }
        public Boolean getMixPay() {
            return this.mixPay;
        }

        public FlightOrderListQueryV2ResponseBodyModule setOrderReserveAmount(Double orderReserveAmount) {
            this.orderReserveAmount = orderReserveAmount;
            return this;
        }
        public Double getOrderReserveAmount() {
            return this.orderReserveAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModule setPassengerCount(Integer passengerCount) {
            this.passengerCount = passengerCount;
            return this;
        }
        public Integer getPassengerCount() {
            return this.passengerCount;
        }

        public FlightOrderListQueryV2ResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public FlightOrderListQueryV2ResponseBodyModule setPriceInfoList(java.util.List<FlightOrderListQueryV2ResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightOrderListQueryV2ResponseBodyModule setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }
        public String getSupplier() {
            return this.supplier;
        }

        public FlightOrderListQueryV2ResponseBodyModule setThirdpartItineraryId(java.util.List<String> thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public java.util.List<String> getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public FlightOrderListQueryV2ResponseBodyModule setTicketCorpReserveAmount(Double ticketCorpReserveAmount) {
            this.ticketCorpReserveAmount = ticketCorpReserveAmount;
            return this;
        }
        public Double getTicketCorpReserveAmount() {
            return this.ticketCorpReserveAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModule setTicketPersonReserveAmount(Double ticketPersonReserveAmount) {
            this.ticketPersonReserveAmount = ticketPersonReserveAmount;
            return this;
        }
        public Double getTicketPersonReserveAmount() {
            return this.ticketPersonReserveAmount;
        }

        public FlightOrderListQueryV2ResponseBodyModule setTripMode(Integer tripMode) {
            this.tripMode = tripMode;
            return this;
        }
        public Integer getTripMode() {
            return this.tripMode;
        }

        public FlightOrderListQueryV2ResponseBodyModule setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public FlightOrderListQueryV2ResponseBodyModule setUserAffiliateList(java.util.List<FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList> userAffiliateList) {
            this.userAffiliateList = userAffiliateList;
            return this;
        }
        public java.util.List<FlightOrderListQueryV2ResponseBodyModuleUserAffiliateList> getUserAffiliateList() {
            return this.userAffiliateList;
        }

        public FlightOrderListQueryV2ResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightOrderListQueryV2ResponseBodyModule setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class FlightOrderListQueryV2ResponseBodyPageInfo extends TeaModel {
        @NameInMap("number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>CAESBgoEIgIIABgAIhkKFwMSAAAAMUw4ZGViODFlYmM3MYzM4</p>
         */
        @NameInMap("scroll_id")
        public String scrollId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_number")
        public Integer totalNumber;

        public static FlightOrderListQueryV2ResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderListQueryV2ResponseBodyPageInfo self = new FlightOrderListQueryV2ResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public FlightOrderListQueryV2ResponseBodyPageInfo setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public FlightOrderListQueryV2ResponseBodyPageInfo setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public FlightOrderListQueryV2ResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
