// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightReShopConsultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("module")
    public IntlFlightReShopConsultResponseBodyModule module;

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
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightReShopConsultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightReShopConsultResponseBody self = new IntlFlightReShopConsultResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightReShopConsultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightReShopConsultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightReShopConsultResponseBody setModule(IntlFlightReShopConsultResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightReShopConsultResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightReShopConsultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightReShopConsultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightReShopConsultResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList extends TeaModel {
        @NameInMap("full_name")
        public String fullName;

        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList self = new IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

    public static class IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList extends TeaModel {
        @NameInMap("can_re_shop")
        public Boolean canReShop;

        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("un_re_shop_reason")
        public String unReShopReason;

        @NameInMap("un_re_shop_reason_code")
        public String unReShopReasonCode;

        public static IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList self = new IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setCanReShop(Boolean canReShop) {
            this.canReShop = canReShop;
            return this;
        }
        public Boolean getCanReShop() {
            return this.canReShop;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setUnReShopReason(String unReShopReason) {
            this.unReShopReason = unReShopReason;
            return this;
        }
        public String getUnReShopReason() {
            return this.unReShopReason;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setUnReShopReasonCode(String unReShopReasonCode) {
            this.unReShopReasonCode = unReShopReasonCode;
            return this;
        }
        public String getUnReShopReasonCode() {
            return this.unReShopReasonCode;
        }

    }

    public static class IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList extends TeaModel {
        @NameInMap("reason_code")
        public String reasonCode;

        @NameInMap("reason_desc")
        public String reasonDesc;

        @NameInMap("voluntary")
        public Boolean voluntary;

        public static IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList self = new IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList setReasonDesc(String reasonDesc) {
            this.reasonDesc = reasonDesc;
            return this;
        }
        public String getReasonDesc() {
            return this.reasonDesc;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList setVoluntary(Boolean voluntary) {
            this.voluntary = voluntary;
            return this;
        }
        public Boolean getVoluntary() {
            return this.voluntary;
        }

    }

    public static class IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList extends TeaModel {
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList self = new IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList extends TeaModel {
        @NameInMap("passenger_journey_group_key")
        public String passengerJourneyGroupKey;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> passengerList;

        @NameInMap("passenger_segment_status_info_list")
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> passengerSegmentStatusInfoList;

        @NameInMap("re_shop_reason_info_list")
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList> reShopReasonInfoList;

        @NameInMap("segment_list")
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> segmentList;

        public static IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList self = new IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
            this.passengerJourneyGroupKey = passengerJourneyGroupKey;
            return this;
        }
        public String getPassengerJourneyGroupKey() {
            return this.passengerJourneyGroupKey;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerList(java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerSegmentStatusInfoList(java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> passengerSegmentStatusInfoList) {
            this.passengerSegmentStatusInfoList = passengerSegmentStatusInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> getPassengerSegmentStatusInfoList() {
            return this.passengerSegmentStatusInfoList;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList setReShopReasonInfoList(java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList> reShopReasonInfoList) {
            this.reShopReasonInfoList = reShopReasonInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListReShopReasonInfoList> getReShopReasonInfoList() {
            return this.reShopReasonInfoList;
        }

        public IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList setSegmentList(java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

    public static class IntlFlightReShopConsultResponseBodyModule extends TeaModel {
        @NameInMap("passenger_journey_group_info_list")
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList> passengerJourneyGroupInfoList;

        public static IntlFlightReShopConsultResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightReShopConsultResponseBodyModule self = new IntlFlightReShopConsultResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightReShopConsultResponseBodyModule setPassengerJourneyGroupInfoList(java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList> passengerJourneyGroupInfoList) {
            this.passengerJourneyGroupInfoList = passengerJourneyGroupInfoList;
            return this;
        }
        public java.util.List<IntlFlightReShopConsultResponseBodyModulePassengerJourneyGroupInfoList> getPassengerJourneyGroupInfoList() {
            return this.passengerJourneyGroupInfoList;
        }

    }

}
