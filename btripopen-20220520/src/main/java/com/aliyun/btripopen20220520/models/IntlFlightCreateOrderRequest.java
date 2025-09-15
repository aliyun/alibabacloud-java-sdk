// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightCreateOrderRequest extends TeaModel {
    @NameInMap("async_create_order_key")
    public String asyncCreateOrderKey;

    @NameInMap("async_create_order_mode")
    public Boolean asyncCreateOrderMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZHANG/SAN</p>
     */
    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public IntlFlightCreateOrderRequestContactInfo contactInfo;

    @NameInMap("extra_info")
    public java.util.Map<String, String> extraInfo;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public java.util.List<IntlFlightCreateOrderRequestPassengerList> passengerList;

    @NameInMap("render_key")
    public String renderKey;

    public static IntlFlightCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightCreateOrderRequest self = new IntlFlightCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightCreateOrderRequest setAsyncCreateOrderKey(String asyncCreateOrderKey) {
        this.asyncCreateOrderKey = asyncCreateOrderKey;
        return this;
    }
    public String getAsyncCreateOrderKey() {
        return this.asyncCreateOrderKey;
    }

    public IntlFlightCreateOrderRequest setAsyncCreateOrderMode(Boolean asyncCreateOrderMode) {
        this.asyncCreateOrderMode = asyncCreateOrderMode;
        return this;
    }
    public Boolean getAsyncCreateOrderMode() {
        return this.asyncCreateOrderMode;
    }

    public IntlFlightCreateOrderRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightCreateOrderRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightCreateOrderRequest setContactInfo(IntlFlightCreateOrderRequestContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public IntlFlightCreateOrderRequestContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public IntlFlightCreateOrderRequest setExtraInfo(java.util.Map<String, String> extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public java.util.Map<String, String> getExtraInfo() {
        return this.extraInfo;
    }

    public IntlFlightCreateOrderRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightCreateOrderRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightCreateOrderRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightCreateOrderRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public IntlFlightCreateOrderRequest setPassengerList(java.util.List<IntlFlightCreateOrderRequestPassengerList> passengerList) {
        this.passengerList = passengerList;
        return this;
    }
    public java.util.List<IntlFlightCreateOrderRequestPassengerList> getPassengerList() {
        return this.passengerList;
    }

    public IntlFlightCreateOrderRequest setRenderKey(String renderKey) {
        this.renderKey = renderKey;
        return this;
    }
    public String getRenderKey() {
        return this.renderKey;
    }

    public static class IntlFlightCreateOrderRequestContactInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("contact_email")
        public String contactEmail;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("contact_name")
        public String contactName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        public static IntlFlightCreateOrderRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestContactInfo self = new IntlFlightCreateOrderRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestContactInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public IntlFlightCreateOrderRequestContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public IntlFlightCreateOrderRequestContactInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

    }

    public static class IntlFlightCreateOrderRequestPassengerListCertInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>E1234567</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2029-12-31</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>中国大陆</p>
         */
        @NameInMap("issue_place")
        public String issuePlace;

        public static IntlFlightCreateOrderRequestPassengerListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestPassengerListCertInfo self = new IntlFlightCreateOrderRequestPassengerListCertInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightCreateOrderRequestPassengerListCertInfo setIssuePlace(String issuePlace) {
            this.issuePlace = issuePlace;
            return this;
        }
        public String getIssuePlace() {
            return this.issuePlace;
        }

    }

    public static class IntlFlightCreateOrderRequestPassengerList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1998-12-28</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_info")
        public IntlFlightCreateOrderRequestPassengerListCertInfo certInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHANG/SAN</p>
         */
        @NameInMap("full_name")
        public String fullName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("gender")
        public Integer gender;

        /**
         * <strong>example:</strong>
         * <p>L5000924</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>中国大陆</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13100008888</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("type")
        public Integer type;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12292812036903456</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightCreateOrderRequestPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightCreateOrderRequestPassengerList self = new IntlFlightCreateOrderRequestPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightCreateOrderRequestPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightCreateOrderRequestPassengerList setCertInfo(IntlFlightCreateOrderRequestPassengerListCertInfo certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public IntlFlightCreateOrderRequestPassengerListCertInfo getCertInfo() {
            return this.certInfo;
        }

        public IntlFlightCreateOrderRequestPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightCreateOrderRequestPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightCreateOrderRequestPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightCreateOrderRequestPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightCreateOrderRequestPassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightCreateOrderRequestPassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IntlFlightCreateOrderRequestPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public IntlFlightCreateOrderRequestPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightCreateOrderRequestPassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
