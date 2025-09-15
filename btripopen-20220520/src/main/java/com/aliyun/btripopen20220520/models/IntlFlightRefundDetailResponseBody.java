// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightRefundDetailResponseBody extends TeaModel {
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
    public IntlFlightRefundDetailResponseBodyModule module;

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

    public static IntlFlightRefundDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightRefundDetailResponseBody self = new IntlFlightRefundDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public IntlFlightRefundDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IntlFlightRefundDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IntlFlightRefundDetailResponseBody setModule(IntlFlightRefundDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IntlFlightRefundDetailResponseBodyModule getModule() {
        return this.module;
    }

    public IntlFlightRefundDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IntlFlightRefundDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IntlFlightRefundDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21000</p>
         */
        @NameInMap("non_refundable_re_shop_handling_fee")
        public Long nonRefundableReShopHandlingFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("non_refundable_re_shop_upgrade_fee")
        public Long nonRefundableReShopUpgradeFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("non_refundable_tax_diff_fee")
        public Long nonRefundableTaxDiffFee;

        /**
         * <strong>example:</strong>
         * <p>10002340021</p>
         */
        @NameInMap("re_shop_apply_id")
        public String reShopApplyId;

        /**
         * <strong>example:</strong>
         * <p>14000</p>
         */
        @NameInMap("re_shop_refund_amount")
        public Long reShopRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>14000</p>
         */
        @NameInMap("re_shop_service_refund_amount")
        public Long reShopServiceRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("re_shop_upgrade_refund_amount")
        public Long reShopUpgradeRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("refund_tax_diff_amount")
        public Long refundTaxDiffAmount;

        public static IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList self = new IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setNonRefundableReShopHandlingFee(Long nonRefundableReShopHandlingFee) {
            this.nonRefundableReShopHandlingFee = nonRefundableReShopHandlingFee;
            return this;
        }
        public Long getNonRefundableReShopHandlingFee() {
            return this.nonRefundableReShopHandlingFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setNonRefundableReShopUpgradeFee(Long nonRefundableReShopUpgradeFee) {
            this.nonRefundableReShopUpgradeFee = nonRefundableReShopUpgradeFee;
            return this;
        }
        public Long getNonRefundableReShopUpgradeFee() {
            return this.nonRefundableReShopUpgradeFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setNonRefundableTaxDiffFee(Long nonRefundableTaxDiffFee) {
            this.nonRefundableTaxDiffFee = nonRefundableTaxDiffFee;
            return this;
        }
        public Long getNonRefundableTaxDiffFee() {
            return this.nonRefundableTaxDiffFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setReShopApplyId(String reShopApplyId) {
            this.reShopApplyId = reShopApplyId;
            return this;
        }
        public String getReShopApplyId() {
            return this.reShopApplyId;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setReShopRefundAmount(Long reShopRefundAmount) {
            this.reShopRefundAmount = reShopRefundAmount;
            return this;
        }
        public Long getReShopRefundAmount() {
            return this.reShopRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setReShopServiceRefundAmount(Long reShopServiceRefundAmount) {
            this.reShopServiceRefundAmount = reShopServiceRefundAmount;
            return this;
        }
        public Long getReShopServiceRefundAmount() {
            return this.reShopServiceRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setReShopUpgradeRefundAmount(Long reShopUpgradeRefundAmount) {
            this.reShopUpgradeRefundAmount = reShopUpgradeRefundAmount;
            return this;
        }
        public Long getReShopUpgradeRefundAmount() {
            return this.reShopUpgradeRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList setRefundTaxDiffAmount(Long refundTaxDiffAmount) {
            this.refundTaxDiffAmount = refundTaxDiffAmount;
            return this;
        }
        public Long getRefundTaxDiffAmount() {
            return this.refundTaxDiffAmount;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12400</p>
         */
        @NameInMap("already_used_total_amount")
        public Long alreadyUsedTotalAmount;

        /**
         * <strong>example:</strong>
         * <p>21000</p>
         */
        @NameInMap("non_refundable_re_shop_handling_fee")
        public Long nonRefundableReShopHandlingFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("non_refundable_re_shop_upgrade_fee")
        public Long nonRefundableReShopUpgradeFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("non_refundable_tax_diff_fee")
        public Long nonRefundableTaxDiffFee;

        /**
         * <strong>example:</strong>
         * <p>14000</p>
         */
        @NameInMap("re_shop_refund_amount")
        public Long reShopRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>14000</p>
         */
        @NameInMap("re_shop_service_refund_amount")
        public Long reShopServiceRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("re_shop_upgrade_refund_amount")
        public Long reShopUpgradeRefundAmount;

        @NameInMap("refund_re_shop_fee_detail_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList> refundReShopFeeDetailList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("refund_tax_diff_amount")
        public Long refundTaxDiffAmount;

        /**
         * <strong>example:</strong>
         * <p>45000</p>
         */
        @NameInMap("refund_tax_fee")
        public Long refundTaxFee;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("refund_ticket_fee")
        public Long refundTicketFee;

        @NameInMap("tax_refund_amount")
        public Long taxRefundAmount;

        @NameInMap("ticket_refund_amount")
        public Long ticketRefundAmount;

        @NameInMap("total_refund_amount")
        public Long totalRefundAmount;

        public static IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail self = new IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setAlreadyUsedTotalAmount(Long alreadyUsedTotalAmount) {
            this.alreadyUsedTotalAmount = alreadyUsedTotalAmount;
            return this;
        }
        public Long getAlreadyUsedTotalAmount() {
            return this.alreadyUsedTotalAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setNonRefundableReShopHandlingFee(Long nonRefundableReShopHandlingFee) {
            this.nonRefundableReShopHandlingFee = nonRefundableReShopHandlingFee;
            return this;
        }
        public Long getNonRefundableReShopHandlingFee() {
            return this.nonRefundableReShopHandlingFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setNonRefundableReShopUpgradeFee(Long nonRefundableReShopUpgradeFee) {
            this.nonRefundableReShopUpgradeFee = nonRefundableReShopUpgradeFee;
            return this;
        }
        public Long getNonRefundableReShopUpgradeFee() {
            return this.nonRefundableReShopUpgradeFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setNonRefundableTaxDiffFee(Long nonRefundableTaxDiffFee) {
            this.nonRefundableTaxDiffFee = nonRefundableTaxDiffFee;
            return this;
        }
        public Long getNonRefundableTaxDiffFee() {
            return this.nonRefundableTaxDiffFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setReShopRefundAmount(Long reShopRefundAmount) {
            this.reShopRefundAmount = reShopRefundAmount;
            return this;
        }
        public Long getReShopRefundAmount() {
            return this.reShopRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setReShopServiceRefundAmount(Long reShopServiceRefundAmount) {
            this.reShopServiceRefundAmount = reShopServiceRefundAmount;
            return this;
        }
        public Long getReShopServiceRefundAmount() {
            return this.reShopServiceRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setReShopUpgradeRefundAmount(Long reShopUpgradeRefundAmount) {
            this.reShopUpgradeRefundAmount = reShopUpgradeRefundAmount;
            return this;
        }
        public Long getReShopUpgradeRefundAmount() {
            return this.reShopUpgradeRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setRefundReShopFeeDetailList(java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList> refundReShopFeeDetailList) {
            this.refundReShopFeeDetailList = refundReShopFeeDetailList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetailRefundReShopFeeDetailList> getRefundReShopFeeDetailList() {
            return this.refundReShopFeeDetailList;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setRefundTaxDiffAmount(Long refundTaxDiffAmount) {
            this.refundTaxDiffAmount = refundTaxDiffAmount;
            return this;
        }
        public Long getRefundTaxDiffAmount() {
            return this.refundTaxDiffAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setRefundTaxFee(Long refundTaxFee) {
            this.refundTaxFee = refundTaxFee;
            return this;
        }
        public Long getRefundTaxFee() {
            return this.refundTaxFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setRefundTicketFee(Long refundTicketFee) {
            this.refundTicketFee = refundTicketFee;
            return this;
        }
        public Long getRefundTicketFee() {
            return this.refundTicketFee;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setTaxRefundAmount(Long taxRefundAmount) {
            this.taxRefundAmount = taxRefundAmount;
            return this;
        }
        public Long getTaxRefundAmount() {
            return this.taxRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setTicketRefundAmount(Long ticketRefundAmount) {
            this.ticketRefundAmount = ticketRefundAmount;
            return this;
        }
        public Long getTicketRefundAmount() {
            return this.ticketRefundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail setTotalRefundAmount(Long totalRefundAmount) {
            this.totalRefundAmount = totalRefundAmount;
            return this;
        }
        public Long getTotalRefundAmount() {
            return this.totalRefundAmount;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList extends TeaModel {
        @NameInMap("segment_key_list")
        public java.util.List<String> segmentKeyList;

        /**
         * <strong>example:</strong>
         * <p>784-3553845201</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        public static IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList self = new IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList setSegmentKeyList(java.util.List<String> segmentKeyList) {
            this.segmentKeyList = segmentKeyList;
            return this;
        }
        public java.util.List<String> getSegmentKeyList() {
            return this.segmentKeyList;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        @NameInMap("refund_fee_detail")
        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail refundFeeDetail;

        @NameInMap("ticket_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList> ticketList;

        public static IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList self = new IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList setRefundFeeDetail(IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail refundFeeDetail) {
            this.refundFeeDetail = refundFeeDetail;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListRefundFeeDetail getRefundFeeDetail() {
            return this.refundFeeDetail;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList setTicketList(java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList> ticketList) {
            this.ticketList = ticketList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailListTicketList> getTicketList() {
            return this.ticketList;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModulePassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1996-09-13</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>1001101</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        @NameInMap("nationality")
        public String nationality;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <strong>example:</strong>
         * <p>8432002</p>
         */
        @NameInMap("passenger_id")
        public Long passengerId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>btrip8432002</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightRefundDetailResponseBodyModulePassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModulePassengerList self = new IntlFlightRefundDetailResponseBodyModulePassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setPassengerId(Long passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public Long getPassengerId() {
            return this.passengerId;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightRefundDetailResponseBodyModulePassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-16 19:20:00</p>
         */
        @NameInMap("apply_time")
        public String applyTime;

        @NameInMap("close_reason")
        public String closeReason;

        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("handing_amount")
        public Long handingAmount;

        /**
         * <strong>example:</strong>
         * <p>2025011317110900006</p>
         */
        @NameInMap("out_refund_apply_id")
        public String outRefundApplyId;

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
         * <p>10200</p>
         */
        @NameInMap("refund_amount")
        public Long refundAmount;

        /**
         * <strong>example:</strong>
         * <p>1000000003437017</p>
         */
        @NameInMap("refund_apply_id")
        public String refundApplyId;

        /**
         * <strong>example:</strong>
         * <p>1000000003437020</p>
         */
        @NameInMap("relation_refund_apply_id")
        public Long relationRefundApplyId;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2025-06-16 20:20:00</p>
         */
        @NameInMap("success_time")
        public String successTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("voluntary")
        public Boolean voluntary;

        public static IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo self = new IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setApplyTime(String applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public String getApplyTime() {
            return this.applyTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setHandingAmount(Long handingAmount) {
            this.handingAmount = handingAmount;
            return this;
        }
        public Long getHandingAmount() {
            return this.handingAmount;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setOutRefundApplyId(String outRefundApplyId) {
            this.outRefundApplyId = outRefundApplyId;
            return this;
        }
        public String getOutRefundApplyId() {
            return this.outRefundApplyId;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setReasonDesc(String reasonDesc) {
            this.reasonDesc = reasonDesc;
            return this;
        }
        public String getReasonDesc() {
            return this.reasonDesc;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setRefundApplyId(String refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setRelationRefundApplyId(Long relationRefundApplyId) {
            this.relationRefundApplyId = relationRefundApplyId;
            return this;
        }
        public Long getRelationRefundApplyId() {
            return this.relationRefundApplyId;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setSuccessTime(String successTime) {
            this.successTime = successTime;
            return this;
        }
        public String getSuccessTime() {
            return this.successTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo setVoluntary(Boolean voluntary) {
            this.voluntary = voluntary;
            return this;
        }
        public Boolean getVoluntary() {
            return this.voluntary;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("short_name")
        public String shortName;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo setShortName(String shortName) {
            this.shortName = shortName;
            return this;
        }
        public String getShortName() {
            return this.shortName;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        /**
         * <strong>example:</strong>
         * <p>CA0001</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo setOperatingAirlineInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_airport_name")
        public String stopAirportName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:25</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:45</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("stop_time")
        public String stopTime;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList self = new IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopAirportName(String stopAirportName) {
            this.stopAirportName = stopAirportName;
            return this;
        }
        public String getStopAirportName() {
            return this.stopAirportName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList setStopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }
        public String getStopTime() {
            return this.stopTime;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_luggage_direct")
        public Integer depCityLuggageDirect;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stop_city_luggage_direct")
        public Integer stopCityLuggageDirect;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo self = new IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo setDepCityLuggageDirect(Integer depCityLuggageDirect) {
            this.depCityLuggageDirect = depCityLuggageDirect;
            return this;
        }
        public Integer getDepCityLuggageDirect() {
            return this.depCityLuggageDirect;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo setStopCityLuggageDirect(Integer stopCityLuggageDirect) {
            this.stopCityLuggageDirect = stopCityLuggageDirect;
            return this;
        }
        public Integer getStopCityLuggageDirect() {
            return this.stopCityLuggageDirect;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark extends TeaModel {
        @NameInMap("dep_city_visa_remark")
        public String depCityVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dep_city_visa_type")
        public Integer depCityVisaType;

        @NameInMap("stop_city_visa_remarks")
        public java.util.List<String> stopCityVisaRemarks;

        @NameInMap("stop_city_visa_types")
        public java.util.List<Integer> stopCityVisaTypes;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark self = new IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark setDepCityVisaRemark(String depCityVisaRemark) {
            this.depCityVisaRemark = depCityVisaRemark;
            return this;
        }
        public String getDepCityVisaRemark() {
            return this.depCityVisaRemark;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark setDepCityVisaType(Integer depCityVisaType) {
            this.depCityVisaType = depCityVisaType;
            return this;
        }
        public Integer getDepCityVisaType() {
            return this.depCityVisaType;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark setStopCityVisaRemarks(java.util.List<String> stopCityVisaRemarks) {
            this.stopCityVisaRemarks = stopCityVisaRemarks;
            return this;
        }
        public java.util.List<String> getStopCityVisaRemarks() {
            return this.stopCityVisaRemarks;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark setStopCityVisaTypes(java.util.List<Integer> stopCityVisaTypes) {
            this.stopCityVisaTypes = stopCityVisaTypes;
            return this;
        }
        public java.util.List<Integer> getStopCityVisaTypes() {
            return this.stopCityVisaTypes;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModuleSegmentList extends TeaModel {
        @NameInMap("airline_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo arrAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 09:25</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_airport_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>370100</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        /**
         * <strong>example:</strong>
         * <p>2023-08-13 07:25</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>NS8210</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList> flightStopInfoList;

        /**
         * <strong>example:</strong>
         * <p>787</p>
         */
        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("luggage_direct_info")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo luggageDirectInfo;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("one_more")
        public Integer oneMore;

        @NameInMap("one_more_show")
        public String oneMoreShow;

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

        @NameInMap("segment_visa_remark")
        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark segmentVisaRemark;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("total_time")
        public String totalTime;

        public static IntlFlightRefundDetailResponseBodyModuleSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModuleSegmentList self = new IntlFlightRefundDetailResponseBodyModuleSegmentList();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setAirlineInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setArrAirportInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setDepAirportInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setFlightShareInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setFlightStopInfoList(java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList> flightStopInfoList) {
            this.flightStopInfoList = flightStopInfoList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentListFlightStopInfoList> getFlightStopInfoList() {
            return this.flightStopInfoList;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setLuggageDirectInfo(IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo luggageDirectInfo) {
            this.luggageDirectInfo = luggageDirectInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListLuggageDirectInfo getLuggageDirectInfo() {
            return this.luggageDirectInfo;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setOneMore(Integer oneMore) {
            this.oneMore = oneMore;
            return this;
        }
        public Integer getOneMore() {
            return this.oneMore;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setOneMoreShow(String oneMoreShow) {
            this.oneMoreShow = oneMoreShow;
            return this;
        }
        public String getOneMoreShow() {
            return this.oneMoreShow;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setSegmentKey(String segmentKey) {
            this.segmentKey = segmentKey;
            return this;
        }
        public String getSegmentKey() {
            return this.segmentKey;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setSegmentVisaRemark(IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark segmentVisaRemark) {
            this.segmentVisaRemark = segmentVisaRemark;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleSegmentListSegmentVisaRemark getSegmentVisaRemark() {
            return this.segmentVisaRemark;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public IntlFlightRefundDetailResponseBodyModuleSegmentList setTotalTime(String totalTime) {
            this.totalTime = totalTime;
            return this;
        }
        public String getTotalTime() {
            return this.totalTime;
        }

    }

    public static class IntlFlightRefundDetailResponseBodyModule extends TeaModel {
        @NameInMap("passenge_refund_fee_detail_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList> passengeRefundFeeDetailList;

        @NameInMap("passenger_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengerList> passengerList;

        @NameInMap("refund_order_info")
        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo refundOrderInfo;

        @NameInMap("segment_list")
        public java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentList> segmentList;

        public static IntlFlightRefundDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightRefundDetailResponseBodyModule self = new IntlFlightRefundDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IntlFlightRefundDetailResponseBodyModule setPassengeRefundFeeDetailList(java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList> passengeRefundFeeDetailList) {
            this.passengeRefundFeeDetailList = passengeRefundFeeDetailList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengeRefundFeeDetailList> getPassengeRefundFeeDetailList() {
            return this.passengeRefundFeeDetailList;
        }

        public IntlFlightRefundDetailResponseBodyModule setPassengerList(java.util.List<IntlFlightRefundDetailResponseBodyModulePassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModulePassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IntlFlightRefundDetailResponseBodyModule setRefundOrderInfo(IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo refundOrderInfo) {
            this.refundOrderInfo = refundOrderInfo;
            return this;
        }
        public IntlFlightRefundDetailResponseBodyModuleRefundOrderInfo getRefundOrderInfo() {
            return this.refundOrderInfo;
        }

        public IntlFlightRefundDetailResponseBodyModule setSegmentList(java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentList> segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public java.util.List<IntlFlightRefundDetailResponseBodyModuleSegmentList> getSegmentList() {
            return this.segmentList;
        }

    }

}
