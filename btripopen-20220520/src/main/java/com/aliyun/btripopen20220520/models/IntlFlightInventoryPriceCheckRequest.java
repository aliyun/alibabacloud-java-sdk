// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IntlFlightInventoryPriceCheckRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <strong>example:</strong>
     * <p>ZHANG/SAN</p>
     */
    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <strong>example:</strong>
     * <p>ZJTD</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>102000</p>
     */
    @NameInMap("order_price")
    public Long orderPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22111acaf9ea47c09ed0db6abc45be2d_0</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_list")
    public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> passengerList;

    public static IntlFlightInventoryPriceCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        IntlFlightInventoryPriceCheckRequest self = new IntlFlightInventoryPriceCheckRequest();
        return TeaModel.build(map, self);
    }

    public IntlFlightInventoryPriceCheckRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public IntlFlightInventoryPriceCheckRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IntlFlightInventoryPriceCheckRequest setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public IntlFlightInventoryPriceCheckRequest setOrderPrice(Long orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public Long getOrderPrice() {
        return this.orderPrice;
    }

    public IntlFlightInventoryPriceCheckRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public IntlFlightInventoryPriceCheckRequest setPassengerList(java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> passengerList) {
        this.passengerList = passengerList;
        return this;
    }
    public java.util.List<IntlFlightInventoryPriceCheckRequestPassengerList> getPassengerList() {
        return this.passengerList;
    }

    public static class IntlFlightInventoryPriceCheckRequestPassengerListCertInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>H123456</p>
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
         * <strong>example:</strong>
         * <p>2033-01-09</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <strong>example:</strong>
         * <p>中国大陆</p>
         */
        @NameInMap("issue_place")
        public String issuePlace;

        public static IntlFlightInventoryPriceCheckRequestPassengerListCertInfo build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckRequestPassengerListCertInfo self = new IntlFlightInventoryPriceCheckRequestPassengerListCertInfo();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo setIssuePlace(String issuePlace) {
            this.issuePlace = issuePlace;
            return this;
        }
        public String getIssuePlace() {
            return this.issuePlace;
        }

    }

    public static class IntlFlightInventoryPriceCheckRequestPassengerList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-01</p>
         */
        @NameInMap("birthday")
        public String birthday;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cert_info")
        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo certInfo;

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
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>18012341234</p>
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
         * <p>10001</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static IntlFlightInventoryPriceCheckRequestPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IntlFlightInventoryPriceCheckRequestPassengerList self = new IntlFlightInventoryPriceCheckRequestPassengerList();
            return TeaModel.build(map, self);
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setCertInfo(IntlFlightInventoryPriceCheckRequestPassengerListCertInfo certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public IntlFlightInventoryPriceCheckRequestPassengerListCertInfo getCertInfo() {
            return this.certInfo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IntlFlightInventoryPriceCheckRequestPassengerList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

}
