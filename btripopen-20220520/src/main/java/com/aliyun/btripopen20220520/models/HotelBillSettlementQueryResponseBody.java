// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelBillSettlementQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelBillSettlementQueryResponseBody self = new HotelBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelBillSettlementQueryResponseBody setModule(HotelBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public HotelBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <p>审批扩展自定义字段</p>
         */
        @NameInMap("apply_extend_field")
        public String applyExtendField;

        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("check_in_date")
        public String checkInDate;

        @NameInMap("checkout_date")
        public String checkoutDate;

        @NameInMap("city")
        public String city;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("corp_refund_fee")
        public Double corpRefundFee;

        @NameInMap("corp_total_fee")
        public Double corpTotalFee;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("fees")
        public Double fees;

        @NameInMap("fu_point_fee")
        public Double fuPointFee;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("is_negotiation")
        public String isNegotiation;

        @NameInMap("is_share_str")
        public String isShareStr;

        @NameInMap("nights")
        public Integer nights;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_price")
        public Double orderPrice;

        @NameInMap("order_type")
        public String orderType;

        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("person_refund_fee")
        public Double personRefundFee;

        @NameInMap("person_settle_price")
        public Double personSettlePrice;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("promotion_fee")
        public Double promotionFee;

        @NameInMap("remark")
        public String remark;

        @NameInMap("room_number")
        public Integer roomNumber;

        @NameInMap("room_price")
        public Double roomPrice;

        @NameInMap("room_type")
        public String roomType;

        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("settlement_fee")
        public Double settlementFee;

        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        @NameInMap("settlement_time")
        public String settlementTime;

        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("status")
        public Integer status;

        /**
         * <p>税率</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("total_nights")
        public Integer totalNights;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_name")
        public String travelerName;

        @NameInMap("voucher_type")
        public Integer voucherType;

        public static HotelBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            HotelBillSettlementQueryResponseBodyModuleDataList self = new HotelBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }
        public String getCheckInDate() {
            return this.checkInDate;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCheckoutDate(String checkoutDate) {
            this.checkoutDate = checkoutDate;
            return this;
        }
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCorpRefundFee(Double corpRefundFee) {
            this.corpRefundFee = corpRefundFee;
            return this;
        }
        public Double getCorpRefundFee() {
            return this.corpRefundFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCorpTotalFee(Double corpTotalFee) {
            this.corpTotalFee = corpTotalFee;
            return this;
        }
        public Double getCorpTotalFee() {
            return this.corpTotalFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setFees(Double fees) {
            this.fees = fees;
            return this;
        }
        public Double getFees() {
            return this.fees;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setFuPointFee(Double fuPointFee) {
            this.fuPointFee = fuPointFee;
            return this;
        }
        public Double getFuPointFee() {
            return this.fuPointFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setIsNegotiation(String isNegotiation) {
            this.isNegotiation = isNegotiation;
            return this;
        }
        public String getIsNegotiation() {
            return this.isNegotiation;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setIsShareStr(String isShareStr) {
            this.isShareStr = isShareStr;
            return this;
        }
        public String getIsShareStr() {
            return this.isShareStr;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setNights(Integer nights) {
            this.nights = nights;
            return this;
        }
        public Integer getNights() {
            return this.nights;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setPersonRefundFee(Double personRefundFee) {
            this.personRefundFee = personRefundFee;
            return this;
        }
        public Double getPersonRefundFee() {
            return this.personRefundFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setPromotionFee(Double promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setRoomPrice(Double roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }
        public Double getRoomPrice() {
            return this.roomPrice;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }
        public String getRoomType() {
            return this.roomType;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setTotalNights(Integer totalNights) {
            this.totalNights = totalNights;
            return this;
        }
        public Integer getTotalNights() {
            return this.totalNights;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public HotelBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class HotelBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<HotelBillSettlementQueryResponseBodyModuleDataList> dataList;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("total_num")
        public Long totalNum;

        public static HotelBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelBillSettlementQueryResponseBodyModule self = new HotelBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public HotelBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelBillSettlementQueryResponseBodyModule setDataList(java.util.List<HotelBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<HotelBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public HotelBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public HotelBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public HotelBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
