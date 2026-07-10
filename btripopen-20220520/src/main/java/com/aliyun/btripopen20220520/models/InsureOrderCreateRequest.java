// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsureOrderCreateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("applicant")
    public InsureOrderCreateRequestApplicant applicant;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ins_person_and_segment_list")
    public java.util.List<InsureOrderCreateRequestInsPersonAndSegmentList> insPersonAndSegmentList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("out_ins_order_id")
    public String outInsOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("out_sub_order_id")
    public String outSubOrderId;

    @NameInMap("supplier_code")
    public String supplierCode;

    public static InsureOrderCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        InsureOrderCreateRequest self = new InsureOrderCreateRequest();
        return TeaModel.build(map, self);
    }

    public InsureOrderCreateRequest setApplicant(InsureOrderCreateRequestApplicant applicant) {
        this.applicant = applicant;
        return this;
    }
    public InsureOrderCreateRequestApplicant getApplicant() {
        return this.applicant;
    }

    public InsureOrderCreateRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public InsureOrderCreateRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public InsureOrderCreateRequest setInsPersonAndSegmentList(java.util.List<InsureOrderCreateRequestInsPersonAndSegmentList> insPersonAndSegmentList) {
        this.insPersonAndSegmentList = insPersonAndSegmentList;
        return this;
    }
    public java.util.List<InsureOrderCreateRequestInsPersonAndSegmentList> getInsPersonAndSegmentList() {
        return this.insPersonAndSegmentList;
    }

    public InsureOrderCreateRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public InsureOrderCreateRequest setOutInsOrderId(String outInsOrderId) {
        this.outInsOrderId = outInsOrderId;
        return this;
    }
    public String getOutInsOrderId() {
        return this.outInsOrderId;
    }

    public InsureOrderCreateRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public InsureOrderCreateRequest setOutSubOrderId(String outSubOrderId) {
        this.outSubOrderId = outSubOrderId;
        return this;
    }
    public String getOutSubOrderId() {
        return this.outSubOrderId;
    }

    public InsureOrderCreateRequest setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
        return this;
    }
    public String getSupplierCode() {
        return this.supplierCode;
    }

    public static class InsureOrderCreateRequestApplicant extends TeaModel {
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

        public static InsureOrderCreateRequestApplicant build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateRequestApplicant self = new InsureOrderCreateRequestApplicant();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateRequestApplicant setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public InsureOrderCreateRequestApplicant setBtripUserId(String btripUserId) {
            this.btripUserId = btripUserId;
            return this;
        }
        public String getBtripUserId() {
            return this.btripUserId;
        }

        public InsureOrderCreateRequestApplicant setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureOrderCreateRequestApplicant setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureOrderCreateRequestApplicant setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureOrderCreateRequestApplicant setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public InsureOrderCreateRequestApplicant setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment extends TeaModel {
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

        public static InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment self = new InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class InsureOrderCreateRequestInsPersonAndSegmentListInsured extends TeaModel {
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

        public static InsureOrderCreateRequestInsPersonAndSegmentListInsured build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateRequestInsPersonAndSegmentListInsured self = new InsureOrderCreateRequestInsPersonAndSegmentListInsured();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setBtripUserId(String btripUserId) {
            this.btripUserId = btripUserId;
            return this;
        }
        public String getBtripUserId() {
            return this.btripUserId;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentListInsured setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

    }

    public static class InsureOrderCreateRequestInsPersonAndSegmentList extends TeaModel {
        @NameInMap("insure_segment")
        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment insureSegment;

        @NameInMap("insured")
        public InsureOrderCreateRequestInsPersonAndSegmentListInsured insured;

        @NameInMap("out_sub_ins_order_id")
        public String outSubInsOrderId;

        public static InsureOrderCreateRequestInsPersonAndSegmentList build(java.util.Map<String, ?> map) throws Exception {
            InsureOrderCreateRequestInsPersonAndSegmentList self = new InsureOrderCreateRequestInsPersonAndSegmentList();
            return TeaModel.build(map, self);
        }

        public InsureOrderCreateRequestInsPersonAndSegmentList setInsureSegment(InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment insureSegment) {
            this.insureSegment = insureSegment;
            return this;
        }
        public InsureOrderCreateRequestInsPersonAndSegmentListInsureSegment getInsureSegment() {
            return this.insureSegment;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentList setInsured(InsureOrderCreateRequestInsPersonAndSegmentListInsured insured) {
            this.insured = insured;
            return this;
        }
        public InsureOrderCreateRequestInsPersonAndSegmentListInsured getInsured() {
            return this.insured;
        }

        public InsureOrderCreateRequestInsPersonAndSegmentList setOutSubInsOrderId(String outSubInsOrderId) {
            this.outSubInsOrderId = outSubInsOrderId;
            return this;
        }
        public String getOutSubInsOrderId() {
            return this.outSubInsOrderId;
        }

    }

}
