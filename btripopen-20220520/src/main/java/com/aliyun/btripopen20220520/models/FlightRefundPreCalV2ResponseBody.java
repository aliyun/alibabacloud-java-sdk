// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightRefundPreCalV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>92359A00-85D8-16C4-AED0-249618DEEC17</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightRefundPreCalV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalV2ResponseBody self = new FlightRefundPreCalV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightRefundPreCalV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightRefundPreCalV2ResponseBody setModule(FlightRefundPreCalV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightRefundPreCalV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightRefundPreCalV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightRefundPreCalV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightRefundPreCalV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3243028</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("pre_refund_money")
        public Long preRefundMoney;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_charge_fee")
        public Long refundChargeFee;

        public static FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS self = new FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS setPreRefundMoney(Long preRefundMoney) {
            this.preRefundMoney = preRefundMoney;
            return this;
        }
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        public FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS setRefundChargeFee(Long refundChargeFee) {
            this.refundChargeFee = refundChargeFee;
            return this;
        }
        public Long getRefundChargeFee() {
            return this.refundChargeFee;
        }

    }

    public static class FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS extends TeaModel {
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("reason_type")
        public Integer reasonType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("volunteer")
        public Boolean volunteer;

        public static FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS self = new FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS setReasonType(Integer reasonType) {
            this.reasonType = reasonType;
            return this;
        }
        public Integer getReasonType() {
            return this.reasonType;
        }

        public FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS setVolunteer(Boolean volunteer) {
            this.volunteer = volunteer;
            return this;
        }
        public Boolean getVolunteer() {
            return this.volunteer;
        }

    }

    public static class FlightRefundPreCalV2ResponseBodyModule extends TeaModel {
        @NameInMap("multi_refund_fee_d_t_o_s")
        public java.util.List<FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS> multiRefundFeeDTOS;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("pre_refund_money")
        public Long preRefundMoney;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_charge_fee")
        public Long refundChargeFee;

        @NameInMap("refund_reason_option_d_t_o_s")
        public java.util.List<FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS> refundReasonOptionDTOS;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("service_charge_fee")
        public Long serviceChargeFee;

        public static FlightRefundPreCalV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalV2ResponseBodyModule self = new FlightRefundPreCalV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalV2ResponseBodyModule setMultiRefundFeeDTOS(java.util.List<FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS> multiRefundFeeDTOS) {
            this.multiRefundFeeDTOS = multiRefundFeeDTOS;
            return this;
        }
        public java.util.List<FlightRefundPreCalV2ResponseBodyModuleMultiRefundFeeDTOS> getMultiRefundFeeDTOS() {
            return this.multiRefundFeeDTOS;
        }

        public FlightRefundPreCalV2ResponseBodyModule setPreRefundMoney(Long preRefundMoney) {
            this.preRefundMoney = preRefundMoney;
            return this;
        }
        public Long getPreRefundMoney() {
            return this.preRefundMoney;
        }

        public FlightRefundPreCalV2ResponseBodyModule setRefundChargeFee(Long refundChargeFee) {
            this.refundChargeFee = refundChargeFee;
            return this;
        }
        public Long getRefundChargeFee() {
            return this.refundChargeFee;
        }

        public FlightRefundPreCalV2ResponseBodyModule setRefundReasonOptionDTOS(java.util.List<FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS> refundReasonOptionDTOS) {
            this.refundReasonOptionDTOS = refundReasonOptionDTOS;
            return this;
        }
        public java.util.List<FlightRefundPreCalV2ResponseBodyModuleRefundReasonOptionDTOS> getRefundReasonOptionDTOS() {
            return this.refundReasonOptionDTOS;
        }

        public FlightRefundPreCalV2ResponseBodyModule setServiceChargeFee(Long serviceChargeFee) {
            this.serviceChargeFee = serviceChargeFee;
            return this;
        }
        public Long getServiceChargeFee() {
            return this.serviceChargeFee;
        }

    }

}
