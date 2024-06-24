// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderDetailInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>succeed in handling request</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelOrderDetailInfoResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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

    public static HotelOrderDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderDetailInfoResponseBody self = new HotelOrderDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderDetailInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderDetailInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderDetailInfoResponseBody setModule(HotelOrderDetailInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderDetailInfoResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderDetailInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("hour")
        public Long hour;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("value")
        public Long value;

        public static HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList self = new HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setHour(Long hour) {
            this.hour = hour;
            return this;
        }
        public Long getHour() {
            return this.hour;
        }

        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @NameInMap("cancel_policy_type")
        public Integer cancelPolicyType;

        public static HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO self = new HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO setBtripHotelCancelPolicyInfoDTOList(java.util.List<HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
            this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
            return this;
        }
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO setCancelPolicyType(Integer cancelPolicyType) {
            this.cancelPolicyType = cancelPolicyType;
            return this;
        }
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleCancelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-29</p>
         */
        @NameInMap("cancel_end_time")
        public String cancelEndTime;

        /**
         * <strong>example:</strong>
         * <p>2022-01-29</p>
         */
        @NameInMap("cancel_start_time")
        public String cancelStartTime;

        public static HotelOrderDetailInfoResponseBodyModuleCancelInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleCancelInfo self = new HotelOrderDetailInfoResponseBodyModuleCancelInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleCancelInfo setCancelEndTime(String cancelEndTime) {
            this.cancelEndTime = cancelEndTime;
            return this;
        }
        public String getCancelEndTime() {
            return this.cancelEndTime;
        }

        public HotelOrderDetailInfoResponseBodyModuleCancelInfo setCancelStartTime(String cancelStartTime) {
            this.cancelStartTime = cancelStartTime;
            return this;
        }
        public String getCancelStartTime() {
            return this.cancelStartTime;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>0571-87217</p>
         */
        @NameInMap("hotel_tel")
        public String hotelTel;

        /**
         * <strong>example:</strong>
         * <p>2198781</p>
         */
        @NameInMap("shid")
        public Long shid;

        public static HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo self = new HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo setHotelTel(String hotelTel) {
            this.hotelTel = hotelTel;
            return this;
        }
        public String getHotelTel() {
            return this.hotelTel;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo setShid(Long shid) {
            this.shid = shid;
            return this;
        }
        public Long getShid() {
            return this.shid;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos extends TeaModel {
        @NameInMap("checkin_date")
        public String checkinDate;

        @NameInMap("checkout_date")
        public String checkoutDate;

        @NameInMap("penal_sum")
        public Long penalSum;

        @NameInMap("real_checkout_date")
        public String realCheckoutDate;

        @NameInMap("refund_status")
        public Integer refundStatus;

        @NameInMap("room_no")
        public Integer roomNo;

        @NameInMap("room_price")
        public Long roomPrice;

        @NameInMap("room_refund_price")
        public Long roomRefundPrice;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_name")
        public String travelerName;

        public static HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos self = new HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setCheckinDate(String checkinDate) {
            this.checkinDate = checkinDate;
            return this;
        }
        public String getCheckinDate() {
            return this.checkinDate;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setCheckoutDate(String checkoutDate) {
            this.checkoutDate = checkoutDate;
            return this;
        }
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setPenalSum(Long penalSum) {
            this.penalSum = penalSum;
            return this;
        }
        public Long getPenalSum() {
            return this.penalSum;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setRealCheckoutDate(String realCheckoutDate) {
            this.realCheckoutDate = realCheckoutDate;
            return this;
        }
        public String getRealCheckoutDate() {
            return this.realCheckoutDate;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setRefundStatus(Integer refundStatus) {
            this.refundStatus = refundStatus;
            return this;
        }
        public Integer getRefundStatus() {
            return this.refundStatus;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setRoomNo(Integer roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public Integer getRoomNo() {
            return this.roomNo;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setRoomPrice(Long roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }
        public Long getRoomPrice() {
            return this.roomPrice;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setRoomRefundPrice(Long roomRefundPrice) {
            this.roomRefundPrice = roomRefundPrice;
            return this;
        }
        public Long getRoomRefundPrice() {
            return this.roomRefundPrice;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleInvoiceInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("billing_money")
        public Long billingMoney;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("buyer_add")
        public String buyerAdd;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("buyer_bank_acc")
        public String buyerBankAcc;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("buyer_bank_add")
        public String buyerBankAdd;

        /**
         * <strong>example:</strong>
         * <p>0571-82321777</p>
         */
        @NameInMap("buyer_phone")
        public String buyerPhone;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("invoice_material")
        public Integer invoiceMaterial;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("invoice_type")
        public Integer invoiceType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("postage")
        public Long postage;

        @NameInMap("receiver_name")
        public String receiverName;

        /**
         * <strong>example:</strong>
         * <p>0571-82321777</p>
         */
        @NameInMap("receiver_phone")
        public String receiverPhone;

        /**
         * <strong>example:</strong>
         * <p>tmf closeCloneTask</p>
         */
        @NameInMap("remark")
        public String remark;

        public static HotelOrderDetailInfoResponseBodyModuleInvoiceInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleInvoiceInfo self = new HotelOrderDetailInfoResponseBodyModuleInvoiceInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBillingMoney(Long billingMoney) {
            this.billingMoney = billingMoney;
            return this;
        }
        public Long getBillingMoney() {
            return this.billingMoney;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBuyerAdd(String buyerAdd) {
            this.buyerAdd = buyerAdd;
            return this;
        }
        public String getBuyerAdd() {
            return this.buyerAdd;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBuyerBankAcc(String buyerBankAcc) {
            this.buyerBankAcc = buyerBankAcc;
            return this;
        }
        public String getBuyerBankAcc() {
            return this.buyerBankAcc;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBuyerBankAdd(String buyerBankAdd) {
            this.buyerBankAdd = buyerBankAdd;
            return this;
        }
        public String getBuyerBankAdd() {
            return this.buyerBankAdd;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBuyerPhone(String buyerPhone) {
            this.buyerPhone = buyerPhone;
            return this;
        }
        public String getBuyerPhone() {
            return this.buyerPhone;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setBuyerTaxNum(String buyerTaxNum) {
            this.buyerTaxNum = buyerTaxNum;
            return this;
        }
        public String getBuyerTaxNum() {
            return this.buyerTaxNum;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setDeliveryArea(String deliveryArea) {
            this.deliveryArea = deliveryArea;
            return this;
        }
        public String getDeliveryArea() {
            return this.deliveryArea;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setDeliveryCity(String deliveryCity) {
            this.deliveryCity = deliveryCity;
            return this;
        }
        public String getDeliveryCity() {
            return this.deliveryCity;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setDeliveryProvince(String deliveryProvince) {
            this.deliveryProvince = deliveryProvince;
            return this;
        }
        public String getDeliveryProvince() {
            return this.deliveryProvince;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setDeliveryStreet(String deliveryStreet) {
            this.deliveryStreet = deliveryStreet;
            return this;
        }
        public String getDeliveryStreet() {
            return this.deliveryStreet;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setInvoiceMaterial(Integer invoiceMaterial) {
            this.invoiceMaterial = invoiceMaterial;
            return this;
        }
        public Integer getInvoiceMaterial() {
            return this.invoiceMaterial;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setPostage(Long postage) {
            this.postage = postage;
            return this;
        }
        public Long getPostage() {
            return this.postage;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setReceiverName(String receiverName) {
            this.receiverName = receiverName;
            return this;
        }
        public String getReceiverName() {
            return this.receiverName;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setReceiverPhone(String receiverPhone) {
            this.receiverPhone = receiverPhone;
            return this;
        }
        public String getReceiverPhone() {
            return this.receiverPhone;
        }

        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_id")
        public String costCenterId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_no")
        public String costCenterNo;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_prices")
        public Long costCenterPrices;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_ratios")
        public Long costCenterRatios;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_subject_code")
        public String costCenterSubjectCode;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("cost_center_subject_name")
        public String costCenterSubjectName;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("settle_subject_id")
        public String settleSubjectId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("settle_subject_name")
        public String settleSubjectName;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("settle_subject_no")
        public String settleSubjectNo;

        public static HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList self = new HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterNo(String costCenterNo) {
            this.costCenterNo = costCenterNo;
            return this;
        }
        public String getCostCenterNo() {
            return this.costCenterNo;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterPrices(Long costCenterPrices) {
            this.costCenterPrices = costCenterPrices;
            return this;
        }
        public Long getCostCenterPrices() {
            return this.costCenterPrices;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterRatios(Long costCenterRatios) {
            this.costCenterRatios = costCenterRatios;
            return this;
        }
        public Long getCostCenterRatios() {
            return this.costCenterRatios;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterSubjectCode(String costCenterSubjectCode) {
            this.costCenterSubjectCode = costCenterSubjectCode;
            return this;
        }
        public String getCostCenterSubjectCode() {
            return this.costCenterSubjectCode;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setCostCenterSubjectName(String costCenterSubjectName) {
            this.costCenterSubjectName = costCenterSubjectName;
            return this;
        }
        public String getCostCenterSubjectName() {
            return this.costCenterSubjectName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setSettleSubjectId(String settleSubjectId) {
            this.settleSubjectId = settleSubjectId;
            return this;
        }
        public String getSettleSubjectId() {
            return this.settleSubjectId;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setSettleSubjectName(String settleSubjectName) {
            this.settleSubjectName = settleSubjectName;
            return this;
        }
        public String getSettleSubjectName() {
            return this.settleSubjectName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList setSettleSubjectNo(String settleSubjectNo) {
            this.settleSubjectNo = settleSubjectNo;
            return this;
        }
        public String getSettleSubjectNo() {
            return this.settleSubjectNo;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleOccupantInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1235615612424222</p>
         */
        @NameInMap("card_no")
        public String cardNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("card_type")
        public Integer cardType;

        @NameInMap("cost_center_info_list")
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList> costCenterInfoList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("customer_type")
        public Integer customerType;

        /**
         * <strong>example:</strong>
         * <p>123112</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("department_name")
        public String departmentName;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("employee_type")
        public Integer employeeType;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("first_name")
        public String firstName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_booker")
        public Boolean isBooker;

        /**
         * <strong>example:</strong>
         * <p>zhang</p>
         */
        @NameInMap("last_name")
        public String lastName;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0571-872237</p>
         */
        @NameInMap("phone")
        public String phone;

        @NameInMap("room_no")
        public Integer roomNo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("selected")
        public Boolean selected;

        /**
         * <strong>example:</strong>
         * <p>12817218</p>
         */
        @NameInMap("staff_no")
        public String staffNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static HotelOrderDetailInfoResponseBodyModuleOccupantInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleOccupantInfoList self = new HotelOrderDetailInfoResponseBodyModuleOccupantInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setCardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }
        public String getCardNo() {
            return this.cardNo;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setCardType(Integer cardType) {
            this.cardType = cardType;
            return this;
        }
        public Integer getCardType() {
            return this.cardType;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setCostCenterInfoList(java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList> costCenterInfoList) {
            this.costCenterInfoList = costCenterInfoList;
            return this;
        }
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoListCostCenterInfoList> getCostCenterInfoList() {
            return this.costCenterInfoList;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setCustomerType(Integer customerType) {
            this.customerType = customerType;
            return this;
        }
        public Integer getCustomerType() {
            return this.customerType;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setEmployeeType(Integer employeeType) {
            this.employeeType = employeeType;
            return this;
        }
        public Integer getEmployeeType() {
            return this.employeeType;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setIsBooker(Boolean isBooker) {
            this.isBooker = isBooker;
            return this;
        }
        public Boolean getIsBooker() {
            return this.isBooker;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setRoomNo(Integer roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public Integer getRoomNo() {
            return this.roomNo;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setStaffNo(String staffNo) {
            this.staffNo = staffNo;
            return this;
        }
        public String getStaffNo() {
            return this.staffNo;
        }

        public HotelOrderDetailInfoResponseBodyModuleOccupantInfoList setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList extends TeaModel {
        @NameInMap("board")
        public String board;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("board_num")
        public Integer boardNum;

        /**
         * <strong>example:</strong>
         * <p>1677600000000</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>1399417428510</p>
         */
        @NameInMap("rate_plan_id")
        public String ratePlanId;

        @NameInMap("rate_plan_name")
        public String ratePlanName;

        /**
         * <strong>example:</strong>
         * <p>545993154510</p>
         */
        @NameInMap("room_id")
        public String roomId;

        @NameInMap("room_name")
        public String roomName;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("room_price")
        public Long roomPrice;

        public static HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList self = new HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setBoard(String board) {
            this.board = board;
            return this;
        }
        public String getBoard() {
            return this.board;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setBoardNum(Integer boardNum) {
            this.boardNum = boardNum;
            return this;
        }
        public Integer getBoardNum() {
            return this.boardNum;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setRatePlanId(String ratePlanId) {
            this.ratePlanId = ratePlanId;
            return this;
        }
        public String getRatePlanId() {
            return this.ratePlanId;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setRatePlanName(String ratePlanName) {
            this.ratePlanName = ratePlanName;
            return this;
        }
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setRoomName(String roomName) {
            this.roomName = roomName;
            return this;
        }
        public String getRoomName() {
            return this.roomName;
        }

        public HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList setRoomPrice(Long roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }
        public Long getRoomPrice() {
            return this.roomPrice;
        }

    }

    public static class HotelOrderDetailInfoResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-29</p>
         */
        @NameInMap("actual_check_in_time")
        public String actualCheckInTime;

        /**
         * <strong>example:</strong>
         * <p>2022-01-29</p>
         */
        @NameInMap("actual_check_out_time")
        public String actualCheckOutTime;

        @NameInMap("btrip_hotel_cancel_policy_d_t_o")
        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("btrip_order_id")
        public String btripOrderId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("cancel_fine")
        public Long cancelFine;

        @NameInMap("cancel_info")
        public HotelOrderDetailInfoResponseBodyModuleCancelInfo cancelInfo;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("check_out")
        public String checkOut;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("confirm_order_time")
        public String confirmOrderTime;

        @NameInMap("contract_name")
        public String contractName;

        /**
         * <strong>example:</strong>
         * <p>12316261873</p>
         */
        @NameInMap("contract_tel")
        public String contractTel;

        /**
         * <strong>example:</strong>
         * <p>2020-01-21</p>
         */
        @NameInMap("create_order_time")
        public String createOrderTime;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("early_arrival_time")
        public String earlyArrivalTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("early_departure")
        public Boolean earlyDeparture;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("guest_count")
        public Integer guestCount;

        @NameInMap("hotel_detail_info")
        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo hotelDetailInfo;

        @NameInMap("hotel_sale_order_room_infos")
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos> hotelSaleOrderRoomInfos;

        @NameInMap("invoice_info")
        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo invoiceInfo;

        /**
         * <strong>example:</strong>
         * <p>1289918</p>
         */
        @NameInMap("item_id")
        public String itemId;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("last_arrival_time")
        public String lastArrivalTime;

        @NameInMap("occupant_info_list")
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoList> occupantInfoList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("out_confirm_code")
        public String outConfirmCode;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("pay_time")
        public String payTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("product_type")
        public Integer productType;

        /**
         * <strong>example:</strong>
         * <p>100328718728171</p>
         */
        @NameInMap("purchase_order_id")
        public String purchaseOrderId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("refund_reason")
        public String refundReason;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("refund_service_fee")
        public Long refundServiceFee;

        @NameInMap("room_night_price_info_list")
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList> roomNightPriceInfoList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("room_number")
        public Integer roomNumber;

        @NameInMap("room_type_name")
        public String roomTypeName;

        /**
         * <strong>example:</strong>
         * <p>2088441675613762</p>
         */
        @NameInMap("seller_id")
        public String sellerId;

        /**
         * <strong>example:</strong>
         * <p>taobao</p>
         */
        @NameInMap("seller_name")
        public String sellerName;

        /**
         * <strong>example:</strong>
         * <p>1.02</p>
         */
        @NameInMap("service_fee")
        public Long serviceFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("settle_type")
        public String settleType;

        /**
         * <strong>example:</strong>
         * <p>dis123</p>
         */
        @NameInMap("supplier_order_id")
        public String supplierOrderId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_price")
        public Long totalPrice;

        public static HotelOrderDetailInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderDetailInfoResponseBodyModule self = new HotelOrderDetailInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderDetailInfoResponseBodyModule setActualCheckInTime(String actualCheckInTime) {
            this.actualCheckInTime = actualCheckInTime;
            return this;
        }
        public String getActualCheckInTime() {
            return this.actualCheckInTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setActualCheckOutTime(String actualCheckOutTime) {
            this.actualCheckOutTime = actualCheckOutTime;
            return this;
        }
        public String getActualCheckOutTime() {
            return this.actualCheckOutTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setBtripHotelCancelPolicyDTO(HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
            this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
            return this;
        }
        public HotelOrderDetailInfoResponseBodyModuleBtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        public HotelOrderDetailInfoResponseBodyModule setBtripOrderId(String btripOrderId) {
            this.btripOrderId = btripOrderId;
            return this;
        }
        public String getBtripOrderId() {
            return this.btripOrderId;
        }

        public HotelOrderDetailInfoResponseBodyModule setCancelFine(Long cancelFine) {
            this.cancelFine = cancelFine;
            return this;
        }
        public Long getCancelFine() {
            return this.cancelFine;
        }

        public HotelOrderDetailInfoResponseBodyModule setCancelInfo(HotelOrderDetailInfoResponseBodyModuleCancelInfo cancelInfo) {
            this.cancelInfo = cancelInfo;
            return this;
        }
        public HotelOrderDetailInfoResponseBodyModuleCancelInfo getCancelInfo() {
            return this.cancelInfo;
        }

        public HotelOrderDetailInfoResponseBodyModule setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelOrderDetailInfoResponseBodyModule setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelOrderDetailInfoResponseBodyModule setConfirmOrderTime(String confirmOrderTime) {
            this.confirmOrderTime = confirmOrderTime;
            return this;
        }
        public String getConfirmOrderTime() {
            return this.confirmOrderTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setContractName(String contractName) {
            this.contractName = contractName;
            return this;
        }
        public String getContractName() {
            return this.contractName;
        }

        public HotelOrderDetailInfoResponseBodyModule setContractTel(String contractTel) {
            this.contractTel = contractTel;
            return this;
        }
        public String getContractTel() {
            return this.contractTel;
        }

        public HotelOrderDetailInfoResponseBodyModule setCreateOrderTime(String createOrderTime) {
            this.createOrderTime = createOrderTime;
            return this;
        }
        public String getCreateOrderTime() {
            return this.createOrderTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setEarlyArrivalTime(String earlyArrivalTime) {
            this.earlyArrivalTime = earlyArrivalTime;
            return this;
        }
        public String getEarlyArrivalTime() {
            return this.earlyArrivalTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setEarlyDeparture(Boolean earlyDeparture) {
            this.earlyDeparture = earlyDeparture;
            return this;
        }
        public Boolean getEarlyDeparture() {
            return this.earlyDeparture;
        }

        public HotelOrderDetailInfoResponseBodyModule setGuestCount(Integer guestCount) {
            this.guestCount = guestCount;
            return this;
        }
        public Integer getGuestCount() {
            return this.guestCount;
        }

        public HotelOrderDetailInfoResponseBodyModule setHotelDetailInfo(HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo hotelDetailInfo) {
            this.hotelDetailInfo = hotelDetailInfo;
            return this;
        }
        public HotelOrderDetailInfoResponseBodyModuleHotelDetailInfo getHotelDetailInfo() {
            return this.hotelDetailInfo;
        }

        public HotelOrderDetailInfoResponseBodyModule setHotelSaleOrderRoomInfos(java.util.List<HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos> hotelSaleOrderRoomInfos) {
            this.hotelSaleOrderRoomInfos = hotelSaleOrderRoomInfos;
            return this;
        }
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleHotelSaleOrderRoomInfos> getHotelSaleOrderRoomInfos() {
            return this.hotelSaleOrderRoomInfos;
        }

        public HotelOrderDetailInfoResponseBodyModule setInvoiceInfo(HotelOrderDetailInfoResponseBodyModuleInvoiceInfo invoiceInfo) {
            this.invoiceInfo = invoiceInfo;
            return this;
        }
        public HotelOrderDetailInfoResponseBodyModuleInvoiceInfo getInvoiceInfo() {
            return this.invoiceInfo;
        }

        public HotelOrderDetailInfoResponseBodyModule setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public HotelOrderDetailInfoResponseBodyModule setLastArrivalTime(String lastArrivalTime) {
            this.lastArrivalTime = lastArrivalTime;
            return this;
        }
        public String getLastArrivalTime() {
            return this.lastArrivalTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setOccupantInfoList(java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoList> occupantInfoList) {
            this.occupantInfoList = occupantInfoList;
            return this;
        }
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleOccupantInfoList> getOccupantInfoList() {
            return this.occupantInfoList;
        }

        public HotelOrderDetailInfoResponseBodyModule setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public HotelOrderDetailInfoResponseBodyModule setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public HotelOrderDetailInfoResponseBodyModule setOutConfirmCode(String outConfirmCode) {
            this.outConfirmCode = outConfirmCode;
            return this;
        }
        public String getOutConfirmCode() {
            return this.outConfirmCode;
        }

        public HotelOrderDetailInfoResponseBodyModule setPayTime(String payTime) {
            this.payTime = payTime;
            return this;
        }
        public String getPayTime() {
            return this.payTime;
        }

        public HotelOrderDetailInfoResponseBodyModule setProductType(Integer productType) {
            this.productType = productType;
            return this;
        }
        public Integer getProductType() {
            return this.productType;
        }

        public HotelOrderDetailInfoResponseBodyModule setPurchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        public HotelOrderDetailInfoResponseBodyModule setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public HotelOrderDetailInfoResponseBodyModule setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public HotelOrderDetailInfoResponseBodyModule setRefundServiceFee(Long refundServiceFee) {
            this.refundServiceFee = refundServiceFee;
            return this;
        }
        public Long getRefundServiceFee() {
            return this.refundServiceFee;
        }

        public HotelOrderDetailInfoResponseBodyModule setRoomNightPriceInfoList(java.util.List<HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList> roomNightPriceInfoList) {
            this.roomNightPriceInfoList = roomNightPriceInfoList;
            return this;
        }
        public java.util.List<HotelOrderDetailInfoResponseBodyModuleRoomNightPriceInfoList> getRoomNightPriceInfoList() {
            return this.roomNightPriceInfoList;
        }

        public HotelOrderDetailInfoResponseBodyModule setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        public HotelOrderDetailInfoResponseBodyModule setRoomTypeName(String roomTypeName) {
            this.roomTypeName = roomTypeName;
            return this;
        }
        public String getRoomTypeName() {
            return this.roomTypeName;
        }

        public HotelOrderDetailInfoResponseBodyModule setSellerId(String sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public String getSellerId() {
            return this.sellerId;
        }

        public HotelOrderDetailInfoResponseBodyModule setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }
        public String getSellerName() {
            return this.sellerName;
        }

        public HotelOrderDetailInfoResponseBodyModule setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public HotelOrderDetailInfoResponseBodyModule setSettleType(String settleType) {
            this.settleType = settleType;
            return this;
        }
        public String getSettleType() {
            return this.settleType;
        }

        public HotelOrderDetailInfoResponseBodyModule setSupplierOrderId(String supplierOrderId) {
            this.supplierOrderId = supplierOrderId;
            return this;
        }
        public String getSupplierOrderId() {
            return this.supplierOrderId;
        }

        public HotelOrderDetailInfoResponseBodyModule setTotalPrice(Long totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Long getTotalPrice() {
            return this.totalPrice;
        }

    }

}
