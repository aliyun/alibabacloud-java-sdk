// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderCreateRequest extends TeaModel {
    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("check_in")
    public String checkIn;

    @NameInMap("check_out")
    public String checkOut;

    @NameInMap("contract_email")
    public String contractEmail;

    @NameInMap("contract_name")
    public String contractName;

    @NameInMap("contract_phone")
    public String contractPhone;

    @NameInMap("corp_pay_price")
    public Long corpPayPrice;

    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("extra")
    public String extra;

    @NameInMap("invoice_info")
    public HotelOrderCreateRequestInvoiceInfo invoiceInfo;

    @NameInMap("item_id")
    public Long itemId;

    @NameInMap("itinerary_no")
    public String itineraryNo;

    @NameInMap("occupant_info_list")
    public java.util.List<HotelOrderCreateRequestOccupantInfoList> occupantInfoList;

    @NameInMap("person_pay_price")
    public Long personPayPrice;

    @NameInMap("promotion_info")
    public HotelOrderCreateRequestPromotionInfo promotionInfo;

    @NameInMap("rate_plan_id")
    public Long ratePlanId;

    @NameInMap("room_id")
    public Long roomId;

    @NameInMap("room_num")
    public Integer roomNum;

    @NameInMap("seller_id")
    public Long sellerId;

    @NameInMap("shid")
    public Long shid;

    @NameInMap("total_order_price")
    public Long totalOrderPrice;

    @NameInMap("validate_res_key")
    public String validateResKey;

    public static HotelOrderCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderCreateRequest self = new HotelOrderCreateRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderCreateRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderCreateRequest setCheckIn(String checkIn) {
        this.checkIn = checkIn;
        return this;
    }
    public String getCheckIn() {
        return this.checkIn;
    }

    public HotelOrderCreateRequest setCheckOut(String checkOut) {
        this.checkOut = checkOut;
        return this;
    }
    public String getCheckOut() {
        return this.checkOut;
    }

    public HotelOrderCreateRequest setContractEmail(String contractEmail) {
        this.contractEmail = contractEmail;
        return this;
    }
    public String getContractEmail() {
        return this.contractEmail;
    }

    public HotelOrderCreateRequest setContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }
    public String getContractName() {
        return this.contractName;
    }

    public HotelOrderCreateRequest setContractPhone(String contractPhone) {
        this.contractPhone = contractPhone;
        return this;
    }
    public String getContractPhone() {
        return this.contractPhone;
    }

    public HotelOrderCreateRequest setCorpPayPrice(Long corpPayPrice) {
        this.corpPayPrice = corpPayPrice;
        return this;
    }
    public Long getCorpPayPrice() {
        return this.corpPayPrice;
    }

    public HotelOrderCreateRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public HotelOrderCreateRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public HotelOrderCreateRequest setInvoiceInfo(HotelOrderCreateRequestInvoiceInfo invoiceInfo) {
        this.invoiceInfo = invoiceInfo;
        return this;
    }
    public HotelOrderCreateRequestInvoiceInfo getInvoiceInfo() {
        return this.invoiceInfo;
    }

    public HotelOrderCreateRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public HotelOrderCreateRequest setItineraryNo(String itineraryNo) {
        this.itineraryNo = itineraryNo;
        return this;
    }
    public String getItineraryNo() {
        return this.itineraryNo;
    }

    public HotelOrderCreateRequest setOccupantInfoList(java.util.List<HotelOrderCreateRequestOccupantInfoList> occupantInfoList) {
        this.occupantInfoList = occupantInfoList;
        return this;
    }
    public java.util.List<HotelOrderCreateRequestOccupantInfoList> getOccupantInfoList() {
        return this.occupantInfoList;
    }

    public HotelOrderCreateRequest setPersonPayPrice(Long personPayPrice) {
        this.personPayPrice = personPayPrice;
        return this;
    }
    public Long getPersonPayPrice() {
        return this.personPayPrice;
    }

    public HotelOrderCreateRequest setPromotionInfo(HotelOrderCreateRequestPromotionInfo promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }
    public HotelOrderCreateRequestPromotionInfo getPromotionInfo() {
        return this.promotionInfo;
    }

    public HotelOrderCreateRequest setRatePlanId(Long ratePlanId) {
        this.ratePlanId = ratePlanId;
        return this;
    }
    public Long getRatePlanId() {
        return this.ratePlanId;
    }

    public HotelOrderCreateRequest setRoomId(Long roomId) {
        this.roomId = roomId;
        return this;
    }
    public Long getRoomId() {
        return this.roomId;
    }

    public HotelOrderCreateRequest setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
        return this;
    }
    public Integer getRoomNum() {
        return this.roomNum;
    }

    public HotelOrderCreateRequest setSellerId(Long sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public Long getSellerId() {
        return this.sellerId;
    }

    public HotelOrderCreateRequest setShid(Long shid) {
        this.shid = shid;
        return this;
    }
    public Long getShid() {
        return this.shid;
    }

    public HotelOrderCreateRequest setTotalOrderPrice(Long totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
        return this;
    }
    public Long getTotalOrderPrice() {
        return this.totalOrderPrice;
    }

    public HotelOrderCreateRequest setValidateResKey(String validateResKey) {
        this.validateResKey = validateResKey;
        return this;
    }
    public String getValidateResKey() {
        return this.validateResKey;
    }

    public static class HotelOrderCreateRequestInvoiceInfo extends TeaModel {
        @NameInMap("buyer_add")
        public String buyerAdd;

        @NameInMap("buyer_bank_acc")
        public String buyerBankAcc;

        @NameInMap("buyer_bank_add")
        public String buyerBankAdd;

        @NameInMap("buyer_phone")
        public String buyerPhone;

        @NameInMap("buyer_tax_num")
        public String buyerTaxNum;

        @NameInMap("delivery_address")
        public String deliveryAddress;

        @NameInMap("delivery_area")
        public String deliveryArea;

        @NameInMap("delivery_city")
        public String deliveryCity;

        @NameInMap("delivery_province")
        public String deliveryProvince;

        @NameInMap("delivery_street")
        public String deliveryStreet;

        @NameInMap("email")
        public String email;

        @NameInMap("invoice_material")
        public Integer invoiceMaterial;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("receiver_name")
        public String receiverName;

        @NameInMap("receiver_phone")
        public String receiverPhone;

        @NameInMap("remark")
        public String remark;

        public static HotelOrderCreateRequestInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCreateRequestInvoiceInfo self = new HotelOrderCreateRequestInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderCreateRequestInvoiceInfo setBuyerAdd(String buyerAdd) {
            this.buyerAdd = buyerAdd;
            return this;
        }
        public String getBuyerAdd() {
            return this.buyerAdd;
        }

        public HotelOrderCreateRequestInvoiceInfo setBuyerBankAcc(String buyerBankAcc) {
            this.buyerBankAcc = buyerBankAcc;
            return this;
        }
        public String getBuyerBankAcc() {
            return this.buyerBankAcc;
        }

        public HotelOrderCreateRequestInvoiceInfo setBuyerBankAdd(String buyerBankAdd) {
            this.buyerBankAdd = buyerBankAdd;
            return this;
        }
        public String getBuyerBankAdd() {
            return this.buyerBankAdd;
        }

        public HotelOrderCreateRequestInvoiceInfo setBuyerPhone(String buyerPhone) {
            this.buyerPhone = buyerPhone;
            return this;
        }
        public String getBuyerPhone() {
            return this.buyerPhone;
        }

        public HotelOrderCreateRequestInvoiceInfo setBuyerTaxNum(String buyerTaxNum) {
            this.buyerTaxNum = buyerTaxNum;
            return this;
        }
        public String getBuyerTaxNum() {
            return this.buyerTaxNum;
        }

        public HotelOrderCreateRequestInvoiceInfo setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public HotelOrderCreateRequestInvoiceInfo setDeliveryArea(String deliveryArea) {
            this.deliveryArea = deliveryArea;
            return this;
        }
        public String getDeliveryArea() {
            return this.deliveryArea;
        }

        public HotelOrderCreateRequestInvoiceInfo setDeliveryCity(String deliveryCity) {
            this.deliveryCity = deliveryCity;
            return this;
        }
        public String getDeliveryCity() {
            return this.deliveryCity;
        }

        public HotelOrderCreateRequestInvoiceInfo setDeliveryProvince(String deliveryProvince) {
            this.deliveryProvince = deliveryProvince;
            return this;
        }
        public String getDeliveryProvince() {
            return this.deliveryProvince;
        }

        public HotelOrderCreateRequestInvoiceInfo setDeliveryStreet(String deliveryStreet) {
            this.deliveryStreet = deliveryStreet;
            return this;
        }
        public String getDeliveryStreet() {
            return this.deliveryStreet;
        }

        public HotelOrderCreateRequestInvoiceInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public HotelOrderCreateRequestInvoiceInfo setInvoiceMaterial(Integer invoiceMaterial) {
            this.invoiceMaterial = invoiceMaterial;
            return this;
        }
        public Integer getInvoiceMaterial() {
            return this.invoiceMaterial;
        }

        public HotelOrderCreateRequestInvoiceInfo setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public HotelOrderCreateRequestInvoiceInfo setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public HotelOrderCreateRequestInvoiceInfo setReceiverName(String receiverName) {
            this.receiverName = receiverName;
            return this;
        }
        public String getReceiverName() {
            return this.receiverName;
        }

        public HotelOrderCreateRequestInvoiceInfo setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public HotelOrderCreateRequestInvoiceInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class HotelOrderCreateRequestOccupantInfoList extends TeaModel {
        @NameInMap("card_no")
        public String cardNo;

        @NameInMap("card_type")
        public Integer cardType;

        @NameInMap("customer_type")
        public Integer customerType;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("department_name")
        public String departmentName;

        @NameInMap("email")
        public String email;

        @NameInMap("employee_type")
        public Integer employeeType;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

        @NameInMap("staff_no")
        public String staffNo;

        @NameInMap("user_type")
        public Integer userType;

        public static HotelOrderCreateRequestOccupantInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCreateRequestOccupantInfoList self = new HotelOrderCreateRequestOccupantInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderCreateRequestOccupantInfoList setCardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }
        public String getCardNo() {
            return this.cardNo;
        }

        public HotelOrderCreateRequestOccupantInfoList setCardType(Integer cardType) {
            this.cardType = cardType;
            return this;
        }
        public Integer getCardType() {
            return this.cardType;
        }

        public HotelOrderCreateRequestOccupantInfoList setCustomerType(Integer customerType) {
            this.customerType = customerType;
            return this;
        }
        public Integer getCustomerType() {
            return this.customerType;
        }

        public HotelOrderCreateRequestOccupantInfoList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public HotelOrderCreateRequestOccupantInfoList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public HotelOrderCreateRequestOccupantInfoList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public HotelOrderCreateRequestOccupantInfoList setEmployeeType(Integer employeeType) {
            this.employeeType = employeeType;
            return this;
        }
        public Integer getEmployeeType() {
            return this.employeeType;
        }

        public HotelOrderCreateRequestOccupantInfoList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public HotelOrderCreateRequestOccupantInfoList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public HotelOrderCreateRequestOccupantInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotelOrderCreateRequestOccupantInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public HotelOrderCreateRequestOccupantInfoList setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }
        public String getStaffNo() {
            return this.staffNo;
        }

        public HotelOrderCreateRequestOccupantInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList extends TeaModel {
        @NameInMap("check_status")
        public Boolean checkStatus;

        @NameInMap("need_check")
        public Boolean needCheck;

        @NameInMap("promotion_code")
        public String promotionCode;

        @NameInMap("promotion_id")
        public String promotionId;

        @NameInMap("promotion_name")
        public String promotionName;

        @NameInMap("promotion_price")
        public Long promotionPrice;

        @NameInMap("promotion_type")
        public String promotionType;

        public static HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList self = new HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setCheckStatus(Boolean checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Boolean getCheckStatus() {
            return this.checkStatus;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setNeedCheck(Boolean needCheck) {
            this.needCheck = needCheck;
            return this;
        }
        public Boolean getNeedCheck() {
            return this.needCheck;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setPromotionPrice(Long promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        public HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

    }

    public static class HotelOrderCreateRequestPromotionInfo extends TeaModel {
        @NameInMap("promotion_detail_info_list")
        public java.util.List<HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList> promotionDetailInfoList;

        @NameInMap("promotion_total_price")
        public Long promotionTotalPrice;

        public static HotelOrderCreateRequestPromotionInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderCreateRequestPromotionInfo self = new HotelOrderCreateRequestPromotionInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderCreateRequestPromotionInfo setPromotionDetailInfoList(java.util.List<HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList> promotionDetailInfoList) {
            this.promotionDetailInfoList = promotionDetailInfoList;
            return this;
        }
        public java.util.List<HotelOrderCreateRequestPromotionInfoPromotionDetailInfoList> getPromotionDetailInfoList() {
            return this.promotionDetailInfoList;
        }

        public HotelOrderCreateRequestPromotionInfo setPromotionTotalPrice(Long promotionTotalPrice) {
            this.promotionTotalPrice = promotionTotalPrice;
            return this;
        }
        public Long getPromotionTotalPrice() {
            return this.promotionTotalPrice;
        }

    }

}
