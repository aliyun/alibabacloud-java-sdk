// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightRefundPreCalResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FlightRefundPreCalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalResponseBody self = new FlightRefundPreCalResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundPreCalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundPreCalResponseBody setModule(FlightRefundPreCalResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundPreCalResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundPreCalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundPreCalResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundPreCalResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundPreCalResponseBodyModuleMultiRefundCalList extends TeaModel {
        @NameInMap("can_apply_refund")
        public Boolean canApplyRefund;

        @NameInMap("name")
        public String name;

        @NameInMap("pre_refund_money")
        public Long preRefundMoney;

        @NameInMap("refund_fee")
        public Long refundFee;

        @NameInMap("user_id")
        public String userId;

        public static FlightRefundPreCalResponseBodyModuleMultiRefundCalList build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalResponseBodyModuleMultiRefundCalList self = new FlightRefundPreCalResponseBodyModuleMultiRefundCalList();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalResponseBodyModuleMultiRefundCalList setCanApplyRefund(Boolean canApplyRefund) {
            this.canApplyRefund = canApplyRefund;
            return this;
        }
        public Boolean getCanApplyRefund() {
            return this.canApplyRefund;
        }

        public FlightRefundPreCalResponseBodyModuleMultiRefundCalList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightRefundPreCalResponseBodyModuleMultiRefundCalList setPreRefundMoney(Long preRefundMoney) {
            this.preRefundMoney = preRefundMoney;
            return this;
        }
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        public FlightRefundPreCalResponseBodyModuleMultiRefundCalList setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public FlightRefundPreCalResponseBodyModuleMultiRefundCalList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class FlightRefundPreCalResponseBodyModuleReturnReason extends TeaModel {
        @NameInMap("extend_desc")
        public String extendDesc;

        @NameInMap("person")
        public Integer person;

        @NameInMap("reason_code")
        public Integer reasonCode;

        @NameInMap("reason_show")
        public String reasonShow;

        @NameInMap("reason_type")
        public Integer reasonType;

        @NameInMap("volunteer")
        public Integer volunteer;

        public static FlightRefundPreCalResponseBodyModuleReturnReason build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalResponseBodyModuleReturnReason self = new FlightRefundPreCalResponseBodyModuleReturnReason();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setExtendDesc(String extendDesc) {
            this.extendDesc = extendDesc;
            return this;
        }
        public String getExtendDesc() {
            return this.extendDesc;
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setPerson(Integer person) {
            this.person = person;
            return this;
        }
        public Integer getPerson() {
            return this.person;
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setReasonCode(Integer reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public Integer getReasonCode() {
            return this.reasonCode;
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setReasonShow(String reasonShow) {
            this.reasonShow = reasonShow;
            return this;
        }
        public String getReasonShow() {
            return this.reasonShow;
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setReasonType(Integer reasonType) {
            this.reasonType = reasonType;
            return this;
        }
        public Integer getReasonType() {
            return this.reasonType;
        }

        public FlightRefundPreCalResponseBodyModuleReturnReason setVolunteer(Integer volunteer) {
            this.volunteer = volunteer;
            return this;
        }
        public Integer getVolunteer() {
            return this.volunteer;
        }

    }

    public static class FlightRefundPreCalResponseBodyModule extends TeaModel {
        @NameInMap("flight_change")
        public Boolean flightChange;

        @NameInMap("item_unit_id")
        public String itemUnitId;

        @NameInMap("multi_refund_cal_list")
        public java.util.List<FlightRefundPreCalResponseBodyModuleMultiRefundCalList> multiRefundCalList;

        @NameInMap("pre_refund_money")
        public Long preRefundMoney;

        @NameInMap("refund_fee")
        public Long refundFee;

        @NameInMap("return_reason")
        public java.util.List<FlightRefundPreCalResponseBodyModuleReturnReason> returnReason;

        @NameInMap("session_id")
        public String sessionId;

        @NameInMap("tips")
        public String tips;

        public static FlightRefundPreCalResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalResponseBodyModule self = new FlightRefundPreCalResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalResponseBodyModule setFlightChange(Boolean flightChange) {
            this.flightChange = flightChange;
            return this;
        }
        public Boolean getFlightChange() {
            return this.flightChange;
        }

        public FlightRefundPreCalResponseBodyModule setItemUnitId(String itemUnitId) {
            this.itemUnitId = itemUnitId;
            return this;
        }
        public String getItemUnitId() {
            return this.itemUnitId;
        }

        public FlightRefundPreCalResponseBodyModule setMultiRefundCalList(java.util.List<FlightRefundPreCalResponseBodyModuleMultiRefundCalList> multiRefundCalList) {
            this.multiRefundCalList = multiRefundCalList;
            return this;
        }
        public java.util.List<FlightRefundPreCalResponseBodyModuleMultiRefundCalList> getMultiRefundCalList() {
            return this.multiRefundCalList;
        }

        public FlightRefundPreCalResponseBodyModule setPreRefundMoney(Long preRefundMoney) {
            this.preRefundMoney = preRefundMoney;
            return this;
        }
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        public FlightRefundPreCalResponseBodyModule setRefundFee(Long refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Long getRefundFee() {
            return this.refundFee;
        }

        public FlightRefundPreCalResponseBodyModule setReturnReason(java.util.List<FlightRefundPreCalResponseBodyModuleReturnReason> returnReason) {
            this.returnReason = returnReason;
            return this;
        }
        public java.util.List<FlightRefundPreCalResponseBodyModuleReturnReason> getReturnReason() {
            return this.returnReason;
        }

        public FlightRefundPreCalResponseBodyModule setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public FlightRefundPreCalResponseBodyModule setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

}
