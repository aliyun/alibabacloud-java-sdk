// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightExceedApplyQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightExceedApplyQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightExceedApplyQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightExceedApplyQueryResponseBody self = new FlightExceedApplyQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightExceedApplyQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightExceedApplyQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightExceedApplyQueryResponseBody setModule(FlightExceedApplyQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightExceedApplyQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FlightExceedApplyQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightExceedApplyQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightExceedApplyQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo extends TeaModel {
        @NameInMap("arr_airport_name")
        public String arrAirportName;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public Integer cabinClass;

        @NameInMap("cabin_class_str")
        public String cabinClassStr;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("price")
        public Long price;

        @NameInMap("type")
        public Integer type;

        public static FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo self = new FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo();
            return TeaModel.build(map, self);
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabinClass(Integer cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public Integer getCabinClass() {
            return this.cabinClass;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setCabinClassStr(String cabinClassStr) {
            this.cabinClassStr = cabinClassStr;
            return this;
        }
        public String getCabinClassStr() {
            return this.cabinClassStr;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights extends TeaModel {
        @NameInMap("arr_airport_name")
        public String arrAirportName;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public Integer cabinClass;

        @NameInMap("cabin_class_str")
        public String cabinClassStr;

        @NameInMap("dep_airport_name")
        public String depAirportName;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("discount")
        public String discount;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("price")
        public Long price;

        @NameInMap("transfer_airport_name")
        public String transferAirportName;

        public static FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights build(java.util.Map<String, ?> map) throws Exception {
            FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights self = new FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights();
            return TeaModel.build(map, self);
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setArrAirportName(String arrAirportName) {
            this.arrAirportName = arrAirportName;
            return this;
        }
        public String getArrAirportName() {
            return this.arrAirportName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setCabinClass(Integer cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public Integer getCabinClass() {
            return this.cabinClass;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setCabinClassStr(String cabinClassStr) {
            this.cabinClassStr = cabinClassStr;
            return this;
        }
        public String getCabinClassStr() {
            return this.cabinClassStr;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setDepAirportName(String depAirportName) {
            this.depAirportName = depAirportName;
            return this;
        }
        public String getDepAirportName() {
            return this.depAirportName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights setTransferAirportName(String transferAirportName) {
            this.transferAirportName = transferAirportName;
            return this;
        }
        public String getTransferAirportName() {
            return this.transferAirportName;
        }

    }

    public static class FlightExceedApplyQueryResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public Long applyId;

        @NameInMap("apply_intention_info_do")
        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo;

        @NameInMap("apply_recommend_flights")
        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights applyRecommendFlights;

        @NameInMap("btrip_cause")
        public String btripCause;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("exceed_type")
        public Integer exceedType;

        @NameInMap("origin_standard")
        public String originStandard;

        @NameInMap("status")
        public Integer status;

        @NameInMap("submit_time")
        public String submitTime;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("thirdpart_corp_id")
        public String thirdpartCorpId;

        @NameInMap("user_id")
        public String userId;

        public static FlightExceedApplyQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightExceedApplyQueryResponseBodyModule self = new FlightExceedApplyQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightExceedApplyQueryResponseBodyModule setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public FlightExceedApplyQueryResponseBodyModule setApplyIntentionInfoDo(FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo applyIntentionInfoDo) {
            this.applyIntentionInfoDo = applyIntentionInfoDo;
            return this;
        }
        public FlightExceedApplyQueryResponseBodyModuleApplyIntentionInfoDo getApplyIntentionInfoDo() {
            return this.applyIntentionInfoDo;
        }

        public FlightExceedApplyQueryResponseBodyModule setApplyRecommendFlights(FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights applyRecommendFlights) {
            this.applyRecommendFlights = applyRecommendFlights;
            return this;
        }
        public FlightExceedApplyQueryResponseBodyModuleApplyRecommendFlights getApplyRecommendFlights() {
            return this.applyRecommendFlights;
        }

        public FlightExceedApplyQueryResponseBodyModule setBtripCause(String btripCause) {
            this.btripCause = btripCause;
            return this;
        }
        public String getBtripCause() {
            return this.btripCause;
        }

        public FlightExceedApplyQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightExceedApplyQueryResponseBodyModule setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public FlightExceedApplyQueryResponseBodyModule setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public FlightExceedApplyQueryResponseBodyModule setOriginStandard(String originStandard) {
            this.originStandard = originStandard;
            return this;
        }
        public String getOriginStandard() {
            return this.originStandard;
        }

        public FlightExceedApplyQueryResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightExceedApplyQueryResponseBodyModule setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public FlightExceedApplyQueryResponseBodyModule setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public FlightExceedApplyQueryResponseBodyModule setThirdpartCorpId(String thirdpartCorpId) {
            this.thirdpartCorpId = thirdpartCorpId;
            return this;
        }
        public String getThirdpartCorpId() {
            return this.thirdpartCorpId;
        }

        public FlightExceedApplyQueryResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
