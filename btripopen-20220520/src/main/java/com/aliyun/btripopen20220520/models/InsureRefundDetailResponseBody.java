// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureRefundDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsureRefundDetailResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static InsureRefundDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureRefundDetailResponseBody self = new InsureRefundDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureRefundDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureRefundDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureRefundDetailResponseBody setModule(InsureRefundDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsureRefundDetailResponseBodyModule getModule() {
        return this.module;
    }

    public InsureRefundDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureRefundDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureRefundDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsureRefundDetailResponseBodyModuleInsureOrderApplicant extends TeaModel {
        @NameInMap("cert_name")
        public String certName;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public String certType;

        @NameInMap("phone")
        public String phone;

        public static InsureRefundDetailResponseBodyModuleInsureOrderApplicant build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModuleInsureOrderApplicant self = new InsureRefundDetailResponseBodyModuleInsureOrderApplicant();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureRefundDetailResponseBodyModuleInsureOrder extends TeaModel {
        @NameInMap("applicant")
        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant applicant;

        @NameInMap("biz_order_id")
        public String bizOrderId;

        @NameInMap("biz_type")
        public Integer bizType;

        @NameInMap("close_time")
        public String closeTime;

        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("out_ins_order_id")
        public String outInsOrderId;

        @NameInMap("pay_time")
        public String payTime;

        @NameInMap("price")
        public Long price;

        @NameInMap("settle_type")
        public Integer settleType;

        @NameInMap("status")
        public String status;

        public static InsureRefundDetailResponseBodyModuleInsureOrder build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModuleInsureOrder self = new InsureRefundDetailResponseBodyModuleInsureOrder();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setApplicant(InsureRefundDetailResponseBodyModuleInsureOrderApplicant applicant) {
            this.applicant = applicant;
            return this;
        }
        public InsureRefundDetailResponseBodyModuleInsureOrderApplicant getApplicant() {
            return this.applicant;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setBizOrderId(String bizOrderId) {
            this.bizOrderId = bizOrderId;
            return this;
        }
        public String getBizOrderId() {
            return this.bizOrderId;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setCloseTime(String closeTime) {
            this.closeTime = closeTime;
            return this;
        }
        public String getCloseTime() {
            return this.closeTime;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setOutInsOrderId(String outInsOrderId) {
            this.outInsOrderId = outInsOrderId;
            return this;
        }
        public String getOutInsOrderId() {
            return this.outInsOrderId;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setSettleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }
        public Integer getSettleType() {
            return this.settleType;
        }

        public InsureRefundDetailResponseBodyModuleInsureOrder setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment extends TeaModel {
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_city")
        public String depCity;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("flight_no")
        public String flightNo;

        public static InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment self = new InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("btrip_user_id")
        public String btripUserId;

        @NameInMap("cert_name")
        public String certName;

        @NameInMap("cert_no")
        public String certNo;

        @NameInMap("cert_type")
        public String certType;

        @NameInMap("gender")
        public String gender;

        @NameInMap("phone")
        public String phone;

        public static InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured self = new InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setBtripUserId(String btripUserId) {
            this.btripUserId = btripUserId;
            return this;
        }
        public String getBtripUserId() {
            return this.btripUserId;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureRefundDetailResponseBodyModuleSubOrderRefundList extends TeaModel {
        @NameInMap("effective_end_time")
        public String effectiveEndTime;

        @NameInMap("effective_start_time")
        public String effectiveStartTime;

        @NameInMap("insure_segment")
        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment insureSegment;

        @NameInMap("insure_time")
        public String insureTime;

        @NameInMap("insured")
        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured insured;

        @NameInMap("out_sub_ins_order_id")
        public String outSubInsOrderId;

        @NameInMap("policy_no")
        public String policyNo;

        @NameInMap("policy_refund_no")
        public String policyRefundNo;

        @NameInMap("price")
        public Long price;

        @NameInMap("product_name")
        public String productName;

        @NameInMap("product_no")
        public String productNo;

        @NameInMap("refund_status")
        public String refundStatus;

        @NameInMap("refund_time")
        public String refundTime;

        @NameInMap("status")
        public String status;

        @NameInMap("sub_ins_order_id")
        public String subInsOrderId;

        public static InsureRefundDetailResponseBodyModuleSubOrderRefundList build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModuleSubOrderRefundList self = new InsureRefundDetailResponseBodyModuleSubOrderRefundList();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setInsureSegment(InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment insureSegment) {
            this.insureSegment = insureSegment;
            return this;
        }
        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsureSegment getInsureSegment() {
            return this.insureSegment;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setInsureTime(String insureTime) {
            this.insureTime = insureTime;
            return this;
        }
        public String getInsureTime() {
            return this.insureTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setInsured(InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured insured) {
            this.insured = insured;
            return this;
        }
        public InsureRefundDetailResponseBodyModuleSubOrderRefundListInsured getInsured() {
            return this.insured;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setOutSubInsOrderId(String outSubInsOrderId) {
            this.outSubInsOrderId = outSubInsOrderId;
            return this;
        }
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
            return this;
        }
        public String getPolicyNo() {
            return this.policyNo;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setPolicyRefundNo(String policyRefundNo) {
            this.policyRefundNo = policyRefundNo;
            return this;
        }
        public String getPolicyRefundNo() {
            return this.policyRefundNo;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setProductNo(String productNo) {
            this.productNo = productNo;
            return this;
        }
        public String getProductNo() {
            return this.productNo;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setRefundStatus(String refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public String getRefundStatus() {
            return this.refundStatus;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setRefundTime(String refundTime) {
            this.refundTime = refundTime;
            return this;
        }
        public String getRefundTime() {
            return this.refundTime;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InsureRefundDetailResponseBodyModuleSubOrderRefundList setSubInsOrderId(String subInsOrderId) {
            this.subInsOrderId = subInsOrderId;
            return this;
        }
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

    }

    public static class InsureRefundDetailResponseBodyModule extends TeaModel {
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("insure_order")
        public InsureRefundDetailResponseBodyModuleInsureOrder insureOrder;

        @NameInMap("out_apply_id")
        public String outApplyId;

        @NameInMap("sub_order_refund_list")
        public java.util.List<InsureRefundDetailResponseBodyModuleSubOrderRefundList> subOrderRefundList;

        public static InsureRefundDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsureRefundDetailResponseBodyModule self = new InsureRefundDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsureRefundDetailResponseBodyModule setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public InsureRefundDetailResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public InsureRefundDetailResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public InsureRefundDetailResponseBodyModule setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public InsureRefundDetailResponseBodyModule setInsureOrder(InsureRefundDetailResponseBodyModuleInsureOrder insureOrder) {
            this.insureOrder = insureOrder;
            return this;
        }
        public InsureRefundDetailResponseBodyModuleInsureOrder getInsureOrder() {
            return this.insureOrder;
        }

        public InsureRefundDetailResponseBodyModule setOutApplyId(String outApplyId) {
            this.outApplyId = outApplyId;
            return this;
        }
        public String getOutApplyId() {
            return this.outApplyId;
        }

        public InsureRefundDetailResponseBodyModule setSubOrderRefundList(java.util.List<InsureRefundDetailResponseBodyModuleSubOrderRefundList> subOrderRefundList) {
            this.subOrderRefundList = subOrderRefundList;
            return this;
        }
        public java.util.List<InsureRefundDetailResponseBodyModuleSubOrderRefundList> getSubOrderRefundList() {
            return this.subOrderRefundList;
        }

    }

}
