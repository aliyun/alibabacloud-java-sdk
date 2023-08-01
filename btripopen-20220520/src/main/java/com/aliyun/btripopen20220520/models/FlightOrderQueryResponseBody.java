// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightOrderQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightOrderQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightOrderQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightOrderQueryResponseBody self = new FlightOrderQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightOrderQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightOrderQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightOrderQueryResponseBody setModule(FlightOrderQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightOrderQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FlightOrderQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightOrderQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightOrderQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList extends TeaModel {
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("change_cabin")
        public String changeCabin;

        @NameInMap("change_cabin_level")
        public String changeCabinLevel;

        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("change_flight_no")
        public String changeFlightNo;

        @NameInMap("change_order_id")
        public Long changeOrderId;

        @NameInMap("change_reason")
        public String changeReason;

        @NameInMap("change_type")
        public Integer changeType;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        @NameInMap("origin_ticket_no")
        public String originTicketNo;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("upgrade_fee")
        public Double upgradeFee;

        public static FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList self = new FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeCabin(String changeCabin) {
            this.changeCabin = changeCabin;
            return this;
        }
        public String getChangeCabin() {
            return this.changeCabin;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeCabinLevel(String changeCabinLevel) {
            this.changeCabinLevel = changeCabinLevel;
            return this;
        }
        public String getChangeCabinLevel() {
            return this.changeCabinLevel;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeFlightNo(String changeFlightNo) {
            this.changeFlightNo = changeFlightNo;
            return this;
        }
        public String getChangeFlightNo() {
            return this.changeFlightNo;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeOrderId(Long changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public Long getChangeOrderId() {
            return this.changeOrderId;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeReason(String changeReason) {
            this.changeReason = changeReason;
            return this;
        }
        public String getChangeReason() {
            return this.changeReason;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setOriginTicketNo(String originTicketNo) {
            this.originTicketNo = originTicketNo;
            return this;
        }
        public String getOriginTicketNo() {
            return this.originTicketNo;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList setUpgradeFee(Double upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Double getUpgradeFee() {
            return this.upgradeFee;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleFlightInfoList extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_airport_name")
        public String arrAirportName;

        @NameInMap("arr_city_ad_code")
        public String arrCityAdCode;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_level")
        public String cabinLevel;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        @NameInMap("dep_city_ad_code")
        public String depCityAdCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_mile")
        public Integer flightMile;

        @NameInMap("flight_no")
        public String flightNo;

        public static FlightOrderQueryResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleFlightInfoList self = new FlightOrderQueryResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrCityAdCode(String arrCityAdCode) {
            this.arrCityAdCode = arrCityAdCode;
            return this;
        }
        public String getArrCityAdCode() {
            return this.arrCityAdCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setCabinLevel(String cabinLevel) {
            this.cabinLevel = cabinLevel;
            return this;
        }
        public String getCabinLevel() {
            return this.cabinLevel;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepCityAdCode(String depCityAdCode) {
            this.depCityAdCode = depCityAdCode;
            return this;
        }
        public String getDepCityAdCode() {
            return this.depCityAdCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setFlightMile(Integer flightMile) {
            this.flightMile = flightMile;
            return this;
        }
        public Integer getFlightMile() {
            return this.flightMile;
        }

        public FlightOrderQueryResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList extends TeaModel {
        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        @NameInMap("refund_order_id")
        public Long refundOrderId;

        @NameInMap("refund_reason")
        public String refundReason;

        @NameInMap("refund_ticket_fee")
        public Double refundTicketFee;

        @NameInMap("refund_type")
        public Integer refundType;

        @NameInMap("ticket_no")
        public String ticketNo;

        public static FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList self = new FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setRefundOrderId(Long refundOrderId) {
            this.refundOrderId = refundOrderId;
            return this;
        }
        public Long getRefundOrderId() {
            return this.refundOrderId;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setRefundTicketFee(Double refundTicketFee) {
            this.refundTicketFee = refundTicketFee;
            return this;
        }
        public Double getRefundTicketFee() {
            return this.refundTicketFee;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

        public FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleFlightTicketInfoList extends TeaModel {
        @NameInMap("build_price")
        public Double buildPrice;

        @NameInMap("changed")
        public Boolean changed;

        @NameInMap("discount")
        public Integer discount;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        @NameInMap("oil_price")
        public Double oilPrice;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("settle_price")
        public Double settlePrice;

        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_price")
        public Double ticketPrice;

        @NameInMap("ticket_status")
        public String ticketStatus;

        @NameInMap("ticket_status_code")
        public Integer ticketStatusCode;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderQueryResponseBodyModuleFlightTicketInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleFlightTicketInfoList self = new FlightOrderQueryResponseBodyModuleFlightTicketInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setBuildPrice(Double buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Double getBuildPrice() {
            return this.buildPrice;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setChanged(Boolean changed) {
            this.changed = changed;
            return this;
        }
        public Boolean getChanged() {
            return this.changed;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setDiscount(Integer discount) {
            this.discount = discount;
            return this;
        }
        public Integer getDiscount() {
            return this.discount;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setOilPrice(Double oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Double getOilPrice() {
            return this.oilPrice;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setSettlePrice(Double settlePrice) {
            this.settlePrice = settlePrice;
            return this;
        }
        public Double getSettlePrice() {
            return this.settlePrice;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public String getTicketStatus() {
            return this.ticketStatus;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setTicketStatusCode(Integer ticketStatusCode) {
            this.ticketStatusCode = ticketStatusCode;
            return this;
        }
        public Integer getTicketStatusCode() {
            return this.ticketStatusCode;
        }

        public FlightOrderQueryResponseBodyModuleFlightTicketInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleInsuranceInfoList extends TeaModel {
        @NameInMap("amount")
        public Double amount;

        @NameInMap("insurance_no")
        public String insuranceNo;

        @NameInMap("status")
        public Integer status;

        @NameInMap("type")
        public String type;

        public static FlightOrderQueryResponseBodyModuleInsuranceInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleInsuranceInfoList self = new FlightOrderQueryResponseBodyModuleInsuranceInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleInsuranceInfoList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public FlightOrderQueryResponseBodyModuleInsuranceInfoList setInsuranceNo(String insuranceNo) {
            this.insuranceNo = insuranceNo;
            return this;
        }
        public String getInsuranceNo() {
            return this.insuranceNo;
        }

        public FlightOrderQueryResponseBodyModuleInsuranceInfoList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightOrderQueryResponseBodyModuleInsuranceInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleInvoiceInfo extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("title")
        public String title;

        public static FlightOrderQueryResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleInvoiceInfo self = new FlightOrderQueryResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleInvoiceInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FlightOrderQueryResponseBodyModuleInvoiceInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class FlightOrderQueryResponseBodyModuleOrderBaseInfo extends TeaModel {
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("btrip_title")
        public String btripTitle;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modify")
        public String gmtModify;

        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("thirdpart_itinerary_id")
        public String thirdpartItineraryId;

        @NameInMap("trip_type")
        public Integer tripType;

        @NameInMap("user_id")
        public String userId;

        public static FlightOrderQueryResponseBodyModuleOrderBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModuleOrderBaseInfo self = new FlightOrderQueryResponseBodyModuleOrderBaseInfo();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setBtripTitle(String btripTitle) {
            this.btripTitle = btripTitle;
            return this;
        }
        public String getBtripTitle() {
            return this.btripTitle;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setThirdpartItineraryId(String thirdpartItineraryId) {
            this.thirdpartItineraryId = thirdpartItineraryId;
            return this;
        }
        public String getThirdpartItineraryId() {
            return this.thirdpartItineraryId;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public FlightOrderQueryResponseBodyModuleOrderBaseInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightOrderQueryResponseBodyModulePassengerInfoList extends TeaModel {
        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_id")
        public Long projectId;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("thirdpart_project_id")
        public String thirdpartProjectId;

        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        @NameInMap("user_type")
        public Integer userType;

        public static FlightOrderQueryResponseBodyModulePassengerInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModulePassengerInfoList self = new FlightOrderQueryResponseBodyModulePassengerInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setThirdpartProjectId(String thirdpartProjectId) {
            this.thirdpartProjectId = thirdpartProjectId;
            return this;
        }
        public String getThirdpartProjectId() {
            return this.thirdpartProjectId;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public FlightOrderQueryResponseBodyModulePassengerInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class FlightOrderQueryResponseBodyModulePriceInfoList extends TeaModel {
        @NameInMap("category_code")
        public Integer categoryCode;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("passenger_name")
        public String passengerName;

        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("price")
        public Double price;

        @NameInMap("trade_id")
        public String tradeId;

        @NameInMap("type")
        public Integer type;

        public static FlightOrderQueryResponseBodyModulePriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModulePriceInfoList self = new FlightOrderQueryResponseBodyModulePriceInfoList();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setCategoryCode(Integer categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public Integer getCategoryCode() {
            return this.categoryCode;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setTradeId(String tradeId) {
            this.tradeId = tradeId;
            return this;
        }
        public String getTradeId() {
            return this.tradeId;
        }

        public FlightOrderQueryResponseBodyModulePriceInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightOrderQueryResponseBodyModule extends TeaModel {
        @NameInMap("flight_change_ticket_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList> flightChangeTicketInfoList;

        @NameInMap("flight_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightInfoList> flightInfoList;

        @NameInMap("flight_refund_ticket_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList> flightRefundTicketInfoList;

        @NameInMap("flight_ticket_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightTicketInfoList> flightTicketInfoList;

        @NameInMap("insurance_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModuleInsuranceInfoList> insuranceInfoList;

        @NameInMap("invoice_info")
        public FlightOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo;

        @NameInMap("order_base_info")
        public FlightOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo;

        @NameInMap("passenger_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModulePassengerInfoList> passengerInfoList;

        @NameInMap("price_info_list")
        public java.util.List<FlightOrderQueryResponseBodyModulePriceInfoList> priceInfoList;

        public static FlightOrderQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightOrderQueryResponseBodyModule self = new FlightOrderQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightOrderQueryResponseBodyModule setFlightChangeTicketInfoList(java.util.List<FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList> flightChangeTicketInfoList) {
            this.flightChangeTicketInfoList = flightChangeTicketInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightChangeTicketInfoList> getFlightChangeTicketInfoList() {
            return this.flightChangeTicketInfoList;
        }

        public FlightOrderQueryResponseBodyModule setFlightInfoList(java.util.List<FlightOrderQueryResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

        public FlightOrderQueryResponseBodyModule setFlightRefundTicketInfoList(java.util.List<FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList> flightRefundTicketInfoList) {
            this.flightRefundTicketInfoList = flightRefundTicketInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightRefundTicketInfoList> getFlightRefundTicketInfoList() {
            return this.flightRefundTicketInfoList;
        }

        public FlightOrderQueryResponseBodyModule setFlightTicketInfoList(java.util.List<FlightOrderQueryResponseBodyModuleFlightTicketInfoList> flightTicketInfoList) {
            this.flightTicketInfoList = flightTicketInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModuleFlightTicketInfoList> getFlightTicketInfoList() {
            return this.flightTicketInfoList;
        }

        public FlightOrderQueryResponseBodyModule setInsuranceInfoList(java.util.List<FlightOrderQueryResponseBodyModuleInsuranceInfoList> insuranceInfoList) {
            this.insuranceInfoList = insuranceInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModuleInsuranceInfoList> getInsuranceInfoList() {
            return this.insuranceInfoList;
        }

        public FlightOrderQueryResponseBodyModule setInvoiceInfo(FlightOrderQueryResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public FlightOrderQueryResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public FlightOrderQueryResponseBodyModule setOrderBaseInfo(FlightOrderQueryResponseBodyModuleOrderBaseInfo orderBaseInfo) {
            this.orderBaseInfo = orderBaseInfo;
            return this;
        }
        public FlightOrderQueryResponseBodyModuleOrderBaseInfo getOrderBaseInfo() {
            return this.orderBaseInfo;
        }

        public FlightOrderQueryResponseBodyModule setPassengerInfoList(java.util.List<FlightOrderQueryResponseBodyModulePassengerInfoList> passengerInfoList) {
            this.passengerInfoList = passengerInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModulePassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

        public FlightOrderQueryResponseBodyModule setPriceInfoList(java.util.List<FlightOrderQueryResponseBodyModulePriceInfoList> priceInfoList) {
            this.priceInfoList = priceInfoList;
            return this;
        }
        public java.util.List<FlightOrderQueryResponseBodyModulePriceInfoList> getPriceInfoList() {
            return this.priceInfoList;
        }

    }

}
