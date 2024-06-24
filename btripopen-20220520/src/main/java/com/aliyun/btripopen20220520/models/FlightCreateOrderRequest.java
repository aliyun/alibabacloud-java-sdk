// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightCreateOrderRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("arr_airport_code")
    public String arrAirportCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HGH</p>
     */
    @NameInMap("arr_city_code")
    public String arrCityCode;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("auto_pay")
    public Integer autoPay;

    @NameInMap("buyer_name")
    public String buyerName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("buyer_unique_key")
    public String buyerUniqueKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public FlightCreateOrderRequestContactInfo contactInfo;

    /**
     * <strong>example:</strong>
     * <p>PEK</p>
     */
    @NameInMap("dep_airport_code")
    public String depAirportCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BJS</p>
     */
    @NameInMap("dep_city_code")
    public String depCityCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000-00-00 00:00:00</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("order_attr")
    public java.util.Map<String, ?> orderAttr;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000_1_0</p>
     */
    @NameInMap("order_params")
    public String orderParams;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7fb731deeb4510b86c17e8c8c25740_11</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("price")
    public Long price;

    @NameInMap("receipt_address")
    public String receiptAddress;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("receipt_target")
    public Integer receiptTarget;

    @NameInMap("receipt_title")
    public String receiptTitle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("traveler_info_list")
    public java.util.List<FlightCreateOrderRequestTravelerInfoList> travelerInfoList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("trip_type")
    public Integer tripType;

    public static FlightCreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightCreateOrderRequest self = new FlightCreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public FlightCreateOrderRequest setArrAirportCode(String arrAirportCode) {
        this.arrAirportCode = arrAirportCode;
        return this;
    }
    public String getArrAirportCode() {
        return this.arrAirportCode;
    }

    public FlightCreateOrderRequest setArrCityCode(String arrCityCode) {
        this.arrCityCode = arrCityCode;
        return this;
    }
    public String getArrCityCode() {
        return this.arrCityCode;
    }

    public FlightCreateOrderRequest setAutoPay(Integer autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Integer getAutoPay() {
        return this.autoPay;
    }

    public FlightCreateOrderRequest setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public FlightCreateOrderRequest setBuyerUniqueKey(String buyerUniqueKey) {
        this.buyerUniqueKey = buyerUniqueKey;
        return this;
    }
    public String getBuyerUniqueKey() {
        return this.buyerUniqueKey;
    }

    public FlightCreateOrderRequest setContactInfo(FlightCreateOrderRequestContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public FlightCreateOrderRequestContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public FlightCreateOrderRequest setDepAirportCode(String depAirportCode) {
        this.depAirportCode = depAirportCode;
        return this;
    }
    public String getDepAirportCode() {
        return this.depAirportCode;
    }

    public FlightCreateOrderRequest setDepCityCode(String depCityCode) {
        this.depCityCode = depCityCode;
        return this;
    }
    public String getDepCityCode() {
        return this.depCityCode;
    }

    public FlightCreateOrderRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public FlightCreateOrderRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightCreateOrderRequest setOrderAttr(java.util.Map<String, ?> orderAttr) {
        this.orderAttr = orderAttr;
        return this;
    }
    public java.util.Map<String, ?> getOrderAttr() {
        return this.orderAttr;
    }

    public FlightCreateOrderRequest setOrderParams(String orderParams) {
        this.orderParams = orderParams;
        return this;
    }
    public String getOrderParams() {
        return this.orderParams;
    }

    public FlightCreateOrderRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public FlightCreateOrderRequest setPrice(Long price) {
        this.price = price;
        return this;
    }
    public Long getPrice() {
        return this.price;
    }

    public FlightCreateOrderRequest setReceiptAddress(String receiptAddress) {
        this.receiptAddress = receiptAddress;
        return this;
    }
    public String getReceiptAddress() {
        return this.receiptAddress;
    }

    public FlightCreateOrderRequest setReceiptTarget(Integer receiptTarget) {
        this.receiptTarget = receiptTarget;
        return this;
    }
    public Integer getReceiptTarget() {
        return this.receiptTarget;
    }

    public FlightCreateOrderRequest setReceiptTitle(String receiptTitle) {
        this.receiptTitle = receiptTitle;
        return this;
    }
    public String getReceiptTitle() {
        return this.receiptTitle;
    }

    public FlightCreateOrderRequest setTravelerInfoList(java.util.List<FlightCreateOrderRequestTravelerInfoList> travelerInfoList) {
        this.travelerInfoList = travelerInfoList;
        return this;
    }
    public java.util.List<FlightCreateOrderRequestTravelerInfoList> getTravelerInfoList() {
        return this.travelerInfoList;
    }

    public FlightCreateOrderRequest setTripType(Integer tripType) {
        this.tripType = tripType;
        return this;
    }
    public Integer getTripType() {
        return this.tripType;
    }

    public static class FlightCreateOrderRequestContactInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>******@alibaba-inc.com</p>
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
         * 
         * <strong>example:</strong>
         * <p>12312345211</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        public static FlightCreateOrderRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderRequestContactInfo self = new FlightCreateOrderRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderRequestContactInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public FlightCreateOrderRequestContactInfo setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public FlightCreateOrderRequestContactInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

    }

    public static class FlightCreateOrderRequestTravelerInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2000-00-00</p>
         */
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("cert_nation")
        public String certNation;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1262651555151</p>
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
        public String certType;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00</p>
         */
        @NameInMap("cert_valid_date")
        public String certValidDate;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>国籍</p>
         * 
         * <strong>example:</strong>
         * <p>中国大陆</p>
         */
        @NameInMap("nationality")
        public String nationality;

        /**
         * <p>国籍二字码</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("nationality_code")
        public String nationalityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("out_user_id")
        public String outUserId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12341231232</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("sex")
        public Integer sex;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public String type;

        public static FlightCreateOrderRequestTravelerInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightCreateOrderRequestTravelerInfoList self = new FlightCreateOrderRequestTravelerInfoList();
            return TeaModel.build(map, self);
        }

        public FlightCreateOrderRequestTravelerInfoList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public FlightCreateOrderRequestTravelerInfoList setCertNation(String certNation) {
            this.certNation = certNation;
            return this;
        }
        public String getCertNation() {
            return this.certNation;
        }

        public FlightCreateOrderRequestTravelerInfoList setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public FlightCreateOrderRequestTravelerInfoList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public FlightCreateOrderRequestTravelerInfoList setCertValidDate(String certValidDate) {
            this.certValidDate = certValidDate;
            return this;
        }
        public String getCertValidDate() {
            return this.certValidDate;
        }

        public FlightCreateOrderRequestTravelerInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FlightCreateOrderRequestTravelerInfoList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public FlightCreateOrderRequestTravelerInfoList setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public FlightCreateOrderRequestTravelerInfoList setOutUserId(String outUserId) {
            this.outUserId = outUserId;
            return this;
        }
        public String getOutUserId() {
            return this.outUserId;
        }

        public FlightCreateOrderRequestTravelerInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public FlightCreateOrderRequestTravelerInfoList setSex(Integer sex) {
            this.sex = sex;
            return this;
        }
        public Integer getSex() {
            return this.sex;
        }

        public FlightCreateOrderRequestTravelerInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
