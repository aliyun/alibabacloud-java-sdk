// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundConsultResponseBody extends TeaModel {
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

    @NameInMap("module")
    public IntlFlightRefundConsultResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>210bc4b116835992457938931db4de</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IntlFlightRefundConsultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundConsultResponseBody self = new IntlFlightRefundConsultResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundConsultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightRefundConsultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightRefundConsultResponseBody setModule(IntlFlightRefundConsultResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightRefundConsultResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightRefundConsultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightRefundConsultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightRefundConsultResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        public static IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList self = new IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

    }

    public static class IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_refund")
        public Boolean canRefund;

        /**
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        /**
         * <strong>example:</strong>
         * <p>CZ5009PKXHKG0616</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        @NameInMap("un_refund_reason")
        public String unRefundReason;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("un_refund_reason_code")
        public String unRefundReasonCode;

        public static IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList self = new IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setCanRefund(Boolean canRefund) {
            this.canRefund = canRefund;
            return this;
        }
        public Boolean getCanRefund() {
            return this.canRefund;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setUnRefundReason(String unRefundReason) {
            this.unRefundReason = unRefundReason;
            return this;
        }
        public String getUnRefundReason() {
            return this.unRefundReason;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList setUnRefundReasonCode(String unRefundReasonCode) {
            this.unRefundReasonCode = unRefundReasonCode;
            return this;
        }
        public String getUnRefundReasonCode() {
            return this.unRefundReasonCode;
        }

    }

    public static class IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("reason_code")
        public String reasonCode;

        @NameInMap("reason_desc")
        public String reasonDesc;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("voluntary")
        public Boolean voluntary;

        public static IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList self = new IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList setReasonDesc(String reasonDesc) {
            this.reasonDesc = reasonDesc;
            return this;
        }
        public String getReasonDesc() {
            return this.reasonDesc;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList setVoluntary(Boolean voluntary) {
            this.voluntary = voluntary;
            return this;
        }
        public Boolean getVoluntary() {
            return this.voluntary;
        }

    }

    public static class IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>2025-06-16 19:20</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>CZ5009</p>
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

        /**
         * <strong>example:</strong>
         * <p>CZ5009PKXHKG0616</p>
         */
        @NameInMap("segment_key")
        public String segmentKey;

        public static IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList self = new IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

    }

    public static class IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>edcac4f4c79d40ccb141ddb6da567e65</p>
         */
        @NameInMap("passenger_journey_group_key")
        public String passengerJourneyGroupKey;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> passengerList;

        @NameInMap("passenger_segment_status_info_list")
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> passengerSegmentStatusInfoList;

        @NameInMap("refund_reason_info_list")
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList> refundReasonInfoList;

        @NameInMap("segment_list")
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> segmentList;

        public static IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList self = new IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerJourneyGroupKey(String passengerJourneyGroupKey) {
            this.passengerJourneyGroupKey = passengerJourneyGroupKey;
            return this;
        }
        public String getPassengerJourneyGroupKey() {
            return this.passengerJourneyGroupKey;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerList(java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList setPassengerSegmentStatusInfoList(java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> passengerSegmentStatusInfoList) {
            this.passengerSegmentStatusInfoList = passengerSegmentStatusInfoList;
            return this;
        }
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListPassengerSegmentStatusInfoList> getPassengerSegmentStatusInfoList() {
            return this.passengerSegmentStatusInfoList;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList setRefundReasonInfoList(java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList> refundReasonInfoList) {
            this.refundReasonInfoList = refundReasonInfoList;
            return this;
        }
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListRefundReasonInfoList> getRefundReasonInfoList() {
            return this.refundReasonInfoList;
        }

        public IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList setSegmentList(java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoListSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

    public static class IntlFlightRefundConsultResponseBodyModule extends TeaModel {
        @NameInMap("passenger_journey_group_info_list")
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList> passengerJourneyGroupInfoList;

        public static IntlFlightRefundConsultResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundConsultResponseBodyModule self = new IntlFlightRefundConsultResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundConsultResponseBodyModule setPassengerJourneyGroupInfoList(java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList> passengerJourneyGroupInfoList) {
            this.passengerJourneyGroupInfoList = passengerJourneyGroupInfoList;
            return this;
        }
        public java.util.List<IntlFlightRefundConsultResponseBodyModulePassengerJourneyGroupInfoList> getPassengerJourneyGroupInfoList() {
            return this.passengerJourneyGroupInfoList;
        }

    }

}
