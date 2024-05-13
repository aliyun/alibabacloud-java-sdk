// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderV2Request extends TeaModel {
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public FlightCreateOrderV2RequestContactInfo contactInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("total_price_cent")
    public Long totalPriceCent;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("travelers")
    public java.util.List<FlightCreateOrderV2RequestTravelers> travelers;

    public static FlightCreateOrderV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderV2Request self = new FlightCreateOrderV2Request();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderV2Request setAsyncCreateOrderKey(String asyncCreateOrderKey) {
        this.asyncCreateOrderKey = asyncCreateOrderKey;
        return this;
    }
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    public FlightCreateOrderV2Request setAsyncCreateOrderMode(Boolean asyncCreateOrderMode) {
        this.asyncCreateOrderMode = asyncCreateOrderMode;
        return this;
    }
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    public FlightCreateOrderV2Request setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public FlightCreateOrderV2Request setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public FlightCreateOrderV2Request setContactInfo(FlightCreateOrderV2RequestContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public FlightCreateOrderV2RequestContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public FlightCreateOrderV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightCreateOrderV2Request setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public FlightCreateOrderV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightCreateOrderV2Request setTotalPriceCent(Long totalPriceCent) {
        this.totalPriceCent = totalPriceCent;
        return this;
    }
    public Long getTotalPriceCent() {
        return this.totalPriceCent;
    }

    public FlightCreateOrderV2Request setTravelers(java.util.List<FlightCreateOrderV2RequestTravelers> travelers) {
        this.travelers = travelers;
        return this;
    }
    public java.util.List<FlightCreateOrderV2RequestTravelers> getTravelers() {
        return this.travelers;
    }

    public static class FlightCreateOrderV2RequestContactInfo extends TeaModel {
        @NameInMap("contact_email")
        public String contactEmail;

        @NameInMap("contact_name")
        public String contactName;

        @NameInMap("contact_phone")
        public String contactPhone;

        @NameInMap("send_msg_to_passenger")
        public Boolean sendMsgToPassenger;

        public static FlightCreateOrderV2RequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderV2RequestContactInfo self = new FlightCreateOrderV2RequestContactInfo();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderV2RequestContactInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightCreateOrderV2RequestContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightCreateOrderV2RequestContactInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public FlightCreateOrderV2RequestContactInfo setSendMsgToPassenger(Boolean sendMsgToPassenger) {
            this.sendMsgToPassenger = sendMsgToPassenger;
            return this;
        }
        public Boolean getSendMsgToPassenger() {
            return this.sendMsgToPassenger;
        }

    }

    public static class FlightCreateOrderV2RequestTravelers extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("cert_valid_date")
        public String certValidDate;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("dept_id")
        public String deptId;

        @NameInMap("dept_name")
        public String deptName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("gender")
        public Integer gender;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_type")
        public Integer userType;

        public static FlightCreateOrderV2RequestTravelers build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderV2RequestTravelers self = new FlightCreateOrderV2RequestTravelers();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderV2RequestTravelers setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public FlightCreateOrderV2RequestTravelers setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public FlightCreateOrderV2RequestTravelers setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightCreateOrderV2RequestTravelers setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public FlightCreateOrderV2RequestTravelers setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public FlightCreateOrderV2RequestTravelers setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public FlightCreateOrderV2RequestTravelers setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public FlightCreateOrderV2RequestTravelers setDeptId(String deptId) {
            this.deptId = deptId;
            return this;
        }
        public String getDeptId() {
            return this.deptId;
        }

        public FlightCreateOrderV2RequestTravelers setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public FlightCreateOrderV2RequestTravelers setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public FlightCreateOrderV2RequestTravelers setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public FlightCreateOrderV2RequestTravelers setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public FlightCreateOrderV2RequestTravelers setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public FlightCreateOrderV2RequestTravelers setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightCreateOrderV2RequestTravelers setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public FlightCreateOrderV2RequestTravelers setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightCreateOrderV2RequestTravelers setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FlightCreateOrderV2RequestTravelers setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public FlightCreateOrderV2RequestTravelers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public FlightCreateOrderV2RequestTravelers setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
