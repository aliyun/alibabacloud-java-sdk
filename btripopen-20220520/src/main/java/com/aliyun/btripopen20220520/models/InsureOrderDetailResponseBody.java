// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsureOrderDetailResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>4498BDAB-2AAF-5B6F-942A-3C1C935345C9</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsureOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderDetailResponseBody self = new InsureOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public InsureOrderDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsureOrderDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsureOrderDetailResponseBody setModule(InsureOrderDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsureOrderDetailResponseBodyModule getModule() {
        return this.module;
    }

    public InsureOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsureOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsureOrderDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsureOrderDetailResponseBodyModuleApplicant extends TeaModel {
        @NameInMap("cert_name")
        public String certName;

        /**
         * <strong>example:</strong>
         * <p>3300000000000</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cert_type")
        public String certType;

        /**
         * <strong>example:</strong>
         * <p>13000000000</p>
         */
        @NameInMap("phone")
        public String phone;

        public static InsureOrderDetailResponseBodyModuleApplicant build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderDetailResponseBodyModuleApplicant self = new InsureOrderDetailResponseBodyModuleApplicant();
            return TeaModel.build(map, self);
        }

        public InsureOrderDetailResponseBodyModuleApplicant setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureOrderDetailResponseBodyModuleApplicant setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureOrderDetailResponseBodyModuleApplicant setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureOrderDetailResponseBodyModuleApplicant setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TYN</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        /**
         * <strong>example:</strong>
         * <p>HYN</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>SYX</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>2023-10-11 11:30:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>TYN</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        /**
         * <strong>example:</strong>
         * <p>CTU</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>LXA</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>2023-10-11 11:30:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>CZ3501</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment self = new InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment();
            return TeaModel.build(map, self);
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1983-11-25</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("btrip_user_id")
        public String btripUserId;

        @NameInMap("cert_name")
        public String certName;

        /**
         * <strong>example:</strong>
         * <p>30000000000</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cert_type")
        public String certType;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>130000000</p>
         */
        @NameInMap("phone")
        public String phone;

        public static InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured self = new InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured();
            return TeaModel.build(map, self);
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setBtripUserId(String btripUserId) {
            this.btripUserId = btripUserId;
            return this;
        }
        public String getBtripUserId() {
            return this.btripUserId;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureOrderDetailResponseBodyModuleInsureOrderDetailList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-10-12 10:00:00</p>
         */
        @NameInMap("effective_end_time")
        public String effectiveEndTime;

        /**
         * <strong>example:</strong>
         * <p>2023-10-11 10:00:00</p>
         */
        @NameInMap("effective_start_time")
        public String effectiveStartTime;

        @NameInMap("insure_segment")
        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment insureSegment;

        /**
         * <strong>example:</strong>
         * <p>2023-10-11 11:30:00</p>
         */
        @NameInMap("insure_time")
        public String insureTime;

        @NameInMap("insured")
        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured insured;

        /**
         * <strong>example:</strong>
         * <p>1021000196440356922</p>
         */
        @NameInMap("out_sub_ins_order_id")
        public String outSubInsOrderId;

        /**
         * <strong>example:</strong>
         * <p>22222222222</p>
         */
        @NameInMap("policy_no")
        public String policyNo;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("price")
        public Long price;

        @NameInMap("product_name")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>008801.accident.flight.104000</p>
         */
        @NameInMap("product_no")
        public String productNo;

        /**
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1021000196440356901</p>
         */
        @NameInMap("sub_ins_order_id")
        public String subInsOrderId;

        public static InsureOrderDetailResponseBodyModuleInsureOrderDetailList build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderDetailResponseBodyModuleInsureOrderDetailList self = new InsureOrderDetailResponseBodyModuleInsureOrderDetailList();
            return TeaModel.build(map, self);
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setEffectiveEndTime(String effectiveEndTime) {
            this.effectiveEndTime = effectiveEndTime;
            return this;
        }
        public String getEffectiveEndTime() {
            return this.effectiveEndTime;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setEffectiveStartTime(String effectiveStartTime) {
            this.effectiveStartTime = effectiveStartTime;
            return this;
        }
        public String getEffectiveStartTime() {
            return this.effectiveStartTime;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setInsureSegment(InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment insureSegment) {
            this.insureSegment = insureSegment;
            return this;
        }
        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsureSegment getInsureSegment() {
            return this.insureSegment;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setInsureTime(String insureTime) {
            this.insureTime = insureTime;
            return this;
        }
        public String getInsureTime() {
            return this.insureTime;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setInsured(InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured insured) {
            this.insured = insured;
            return this;
        }
        public InsureOrderDetailResponseBodyModuleInsureOrderDetailListInsured getInsured() {
            return this.insured;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setOutSubInsOrderId(String outSubInsOrderId) {
            this.outSubInsOrderId = outSubInsOrderId;
            return this;
        }
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
            return this;
        }
        public String getPolicyNo() {
            return this.policyNo;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setProductNo(String productNo) {
            this.productNo = productNo;
            return this;
        }
        public String getProductNo() {
            return this.productNo;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public InsureOrderDetailResponseBodyModuleInsureOrderDetailList setSubInsOrderId(String subInsOrderId) {
            this.subInsOrderId = subInsOrderId;
            return this;
        }
        public String getSubInsOrderId() {
            return this.subInsOrderId;
        }

    }

    public static class InsureOrderDetailResponseBodyModule extends TeaModel {
        @NameInMap("applicant")
        public InsureOrderDetailResponseBodyModuleApplicant applicant;

        /**
         * <strong>example:</strong>
         * <p>1021000196440356901</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("insure_order_detail_list")
        public java.util.List<InsureOrderDetailResponseBodyModuleInsureOrderDetailList> insureOrderDetailList;

        /**
         * <strong>example:</strong>
         * <p>CLOSED</p>
         */
        @NameInMap("status")
        public String status;

        public static InsureOrderDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderDetailResponseBodyModule self = new InsureOrderDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsureOrderDetailResponseBodyModule setApplicant(InsureOrderDetailResponseBodyModuleApplicant applicant) {
            this.applicant = applicant;
            return this;
        }
        public InsureOrderDetailResponseBodyModuleApplicant getApplicant() {
            return this.applicant;
        }

        public InsureOrderDetailResponseBodyModule setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public InsureOrderDetailResponseBodyModule setInsureOrderDetailList(java.util.List<InsureOrderDetailResponseBodyModuleInsureOrderDetailList> insureOrderDetailList) {
            this.insureOrderDetailList = insureOrderDetailList;
            return this;
        }
        public java.util.List<InsureOrderDetailResponseBodyModuleInsureOrderDetailList> getInsureOrderDetailList() {
            return this.insureOrderDetailList;
        }

        public InsureOrderDetailResponseBodyModule setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
