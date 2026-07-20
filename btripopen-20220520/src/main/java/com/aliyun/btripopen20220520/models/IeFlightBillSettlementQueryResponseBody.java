// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeFlightBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IeFlightBillSettlementQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("more_page")
    public Boolean morePage;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>210e842b16611337974412836dae27</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IeFlightBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IeFlightBillSettlementQueryResponseBody self = new IeFlightBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public IeFlightBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IeFlightBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IeFlightBillSettlementQueryResponseBody setModule(IeFlightBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IeFlightBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public IeFlightBillSettlementQueryResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public IeFlightBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IeFlightBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IeFlightBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IeFlightBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-01-01 00:00:00</p>
         */
        @NameInMap("adjust_time")
        public String adjustTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("advance_day")
        public Integer advanceDay;

        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_corp_code")
        public String airlineCorpCode;

        /**
         * <strong>example:</strong>
         * <p>中国国航</p>
         */
        @NameInMap("airline_corp_name")
        public String airlineCorpName;

        /**
         * <strong>example:</strong>
         * <p>2021123432260</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>MDG</p>
         */
        @NameInMap("apply_arr_city_code")
        public String applyArrCityCode;

        /**
         * <strong>example:</strong>
         * <p>牡丹江</p>
         */
        @NameInMap("apply_arr_city_name")
        public String applyArrCityName;

        /**
         * <strong>example:</strong>
         * <p>HRB</p>
         */
        @NameInMap("apply_dep_city_code")
        public String applyDepCityCode;

        /**
         * <strong>example:</strong>
         * <p>哈尔滨</p>
         */
        @NameInMap("apply_dep_city_name")
        public String applyDepCityName;

        /**
         * <p>审批扩展自定义字段</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;memo&quot;:&quot;备注&quot;}</p>
         */
        @NameInMap("apply_extend_field")
        public String applyExtendField;

        /**
         * <strong>example:</strong>
         * <p>103189557</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@123.com">abc@123.com</a></p>
         */
        @NameInMap("approver_email")
        public String approverEmail;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("approver_id")
        public String approverId;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("approver_name")
        public String approverName;

        /**
         * <strong>example:</strong>
         * <p>CAN</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        /**
         * <strong>example:</strong>
         * <p>巴黎</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>中国</p>
         */
        @NameInMap("arr_country")
        public String arrCountry;

        /**
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("arr_country_code")
        public String arrCountryCode;

        /**
         * <strong>example:</strong>
         * <p>2021-10-02</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        /**
         * <strong>example:</strong>
         * <p>Paris Charles de Gaulle Airport</p>
         */
        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>13:30:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("base_location")
        public String baseLocation;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T20:18Z</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        /**
         * <strong>example:</strong>
         * <p>线上（自助预订）；</p>
         */
        @NameInMap("book_mode")
        public String bookMode;

        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:17:05</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        /**
         * <strong>example:</strong>
         * <p>al_xinuan.zsy</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>70022164</p>
         */
        @NameInMap("booker_job_no")
        public String bookerJobNo;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("booker_name")
        public String bookerName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("btrip_coupon_fee")
        public Double btripCouponFee;

        /**
         * <strong>example:</strong>
         * <p>因公司要求，需要到XX同XX公司谈业务</p>
         */
        @NameInMap("business_trip_result")
        public String businessTripResult;

        /**
         * <strong>example:</strong>
         * <p>R</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>经济舱</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("capital_direction")
        public String capitalDirection;

        /**
         * <strong>example:</strong>
         * <p>商旅事业群-运营部-华北营运大区</p>
         */
        @NameInMap("cascade_department")
        public String cascadeDepartment;

        /**
         * <strong>example:</strong>
         * <p>国际城市以及中国香港、中国澳门、中国台湾机票</p>
         */
        @NameInMap("category_desc")
        public String categoryDesc;

        /**
         * <strong>example:</strong>
         * <p>23.0</p>
         */
        @NameInMap("change_fee")
        public Double changeFee;

        /**
         * <strong>example:</strong>
         * <p>原航班时间与预计不符</p>
         */
        @NameInMap("change_result")
        public String changeResult;

        /**
         * <strong>example:</strong>
         * <p>460</p>
         */
        @NameInMap("corp_pay_order_fee")
        public Double corpPayOrderFee;

        /**
         * <strong>example:</strong>
         * <p>运营部成本中心</p>
         */
        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>8b7f3cd-24324-097</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>code1</p>
         */
        @NameInMap("cost_department")
        public String costDepartment;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("coupon")
        public Double coupon;

        /**
         * <strong>example:</strong>
         * <p>&quot;{\&quot;key1\&quot;:\&quot;value1\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;,\&quot;key3\&quot;:\&quot;value3\&quot;}&quot;</p>
         */
        @NameInMap("custom_content")
        public String customContent;

        /**
         * <strong>example:</strong>
         * <p>1.2</p>
         */
        @NameInMap("deductible_tax")
        public Double deductibleTax;

        /**
         * <strong>example:</strong>
         * <p>KHN</p>
         */
        @NameInMap("dep_airport_code")
        public String depAirportCode;

        /**
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>美国</p>
         */
        @NameInMap("dep_country")
        public String depCountry;

        /**
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("dep_country_code")
        public String depCountryCode;

        /**
         * <strong>example:</strong>
         * <p>华北运营大区</p>
         */
        @NameInMap("department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>2345866</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("dept_city")
        public String deptCity;

        /**
         * <strong>example:</strong>
         * <p>2021-10-02</p>
         */
        @NameInMap("dept_date")
        public String deptDate;

        /**
         * <strong>example:</strong>
         * <p>北京首都国际机场</p>
         */
        @NameInMap("dept_station")
        public String deptStation;

        /**
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        @NameInMap("dept_time")
        public String deptTime;

        /**
         * <strong>example:</strong>
         * <p>51%</p>
         */
        @NameInMap("discount")
        public String discount;

        /**
         * <strong>example:</strong>
         * <p>无低价机票，故超标购买</p>
         */
        @NameInMap("exceed_reason")
        public String exceedReason;

        /**
         * <strong>example:</strong>
         * <p>20101</p>
         */
        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>赔付</p>
         */
        @NameInMap("fee_type_desc")
        public String feeTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>MU9684</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("foreigners_tag")
        public String foreignersTag;

        /**
         * <strong>example:</strong>
         * <p>4564547</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>343458349722002</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("insurance_fee")
        public Double insuranceFee;

        /**
         * <strong>example:</strong>
         * <p>15548214852</p>
         */
        @NameInMap("insurance_number")
        public String insuranceNumber;

        /**
         * <strong>example:</strong>
         * <p>旅游意外险</p>
         */
        @NameInMap("insurance_product_name")
        public String insuranceProductName;

        /**
         * <strong>example:</strong>
         * <p>飞小猪有限公司。</p>
         */
        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>116.385449,39.997733</p>
         */
        @NameInMap("location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>q1</p>
         */
        @NameInMap("mapping_company_code")
        public String mappingCompanyCode;

        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:17:13</p>
         */
        @NameInMap("most_difference_dept_time")
        public String mostDifferenceDeptTime;

        /**
         * <strong>example:</strong>
         * <p>23%</p>
         */
        @NameInMap("most_difference_discount")
        public String mostDifferenceDiscount;

        /**
         * <strong>example:</strong>
         * <p>MU9684</p>
         */
        @NameInMap("most_difference_flight_no")
        public String mostDifferenceFlightNo;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("most_difference_price")
        public Double mostDifferencePrice;

        /**
         * <strong>example:</strong>
         * <p>原因为：xxx</p>
         */
        @NameInMap("most_difference_reason")
        public String mostDifferenceReason;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("most_price")
        public Double mostPrice;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("negotiation_coupon_fee")
        public Double negotiationCouponFee;

        /**
         * <strong>example:</strong>
         * <p>234223423423</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        /**
         * <strong>example:</strong>
         * <p>234324324423</p>
         */
        @NameInMap("over_apply_id")
        public String overApplyId;

        /**
         * <strong>example:</strong>
         * <p>depart_1234</p>
         */
        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        /**
         * <strong>example:</strong>
         * <p>运营部</p>
         */
        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>开发</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <strong>example:</strong>
         * <p>初级</p>
         */
        @NameInMap("position_level")
        public String positionLevel;

        /**
         * <strong>example:</strong>
         * <p>4564547</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        /**
         * <strong>example:</strong>
         * <p>www123</p>
         */
        @NameInMap("processor_oa_code")
        public String processorOaCode;

        /**
         * <strong>example:</strong>
         * <p>23423432423</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>运营生产项目</p>
         */
        @NameInMap("project_name")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_change_cost")
        public Double refundChangeCost;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        /**
         * <strong>example:</strong>
         * <p>因公退票,因工作原因取消计划</p>
         */
        @NameInMap("refund_result")
        public String refundResult;

        /**
         * <strong>example:</strong>
         * <p>线下改签</p>
         */
        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>是</p>
         */
        @NameInMap("repeat_refund")
        public String repeatRefund;

        /**
         * <strong>example:</strong>
         * <p>410</p>
         */
        @NameInMap("seal_price")
        public Double sealPrice;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;voyage&quot;: &quot;PKX-CAN&quot;, &quot;arrCity&quot;: &quot;广州&quot;, &quot;arrDate&quot;: &quot;2025-03-20&quot;, &quot;arrTime&quot;: &quot;14:45:00&quot;, &quot;depCity&quot;: &quot;北京&quot;, &quot;depDate&quot;: &quot;2025-03-20&quot;, &quot;depTime&quot;: &quot;11:30:00&quot;, &quot;flightNo&quot;: &quot;CZ3112&quot;, &quot;cabinClass&quot;: &quot;经济舱&quot;, &quot;voyageName&quot;: &quot;北京-广州&quot;, &quot;arrCityCode&quot;: &quot;BJS&quot;, &quot;depCityCode&quot;: &quot;CAN&quot;, &quot;airlineCompany&quot;: &quot;南方航空&quot;, &quot;arrAirportCode&quot;: &quot;CAN&quot;, &quot;arrAirportName&quot;: &quot;白云国际机场&quot;, &quot;cabinClassCode&quot;: &quot;K&quot;, &quot;depAirportCode&quot;: &quot;PKX&quot;, &quot;depAirportName&quot;: &quot;大兴国际机场&quot;, &quot;airlineCompanyCode&quot;: &quot;CZ&quot;}, {&quot;voyage&quot;: &quot;CAN-BKK&quot;, &quot;arrCity&quot;: &quot;曼谷&quot;, &quot;arrDate&quot;: &quot;2025-03-20&quot;, &quot;arrTime&quot;: &quot;19:20:00&quot;, &quot;depCity&quot;: &quot;广州&quot;, &quot;depDate&quot;: &quot;2025-03-20&quot;, &quot;depTime&quot;: &quot;17:20:00&quot;, &quot;flightNo&quot;: &quot;CZ8019&quot;, &quot;cabinClass&quot;: &quot;经济舱&quot;, &quot;voyageName&quot;: &quot;广州-曼谷&quot;, &quot;arrCityCode&quot;: &quot;CAN&quot;, &quot;depCityCode&quot;: &quot;BKK&quot;, &quot;airlineCompany&quot;: &quot;南方航空&quot;, &quot;arrAirportCode&quot;: &quot;BKK&quot;, &quot;arrAirportName&quot;: &quot;素万那普国际机场&quot;, &quot;cabinClassCode&quot;: &quot;K&quot;, &quot;depAirportCode&quot;: &quot;CAN&quot;, &quot;depAirportName&quot;: &quot;白云国际机场&quot;, &quot;airlineCompanyCode&quot;: &quot;CZ&quot;}]</p>
         */
        @NameInMap("segment_list")
        public String segmentList;

        /**
         * <strong>example:</strong>
         * <p>洲际</p>
         */
        @NameInMap("segment_type")
        public String segmentType;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>企业月结</p>
         */
        @NameInMap("settle_type_desc")
        public String settleTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>6.11</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2021-10-08 23:39:01</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("settlement_type")
        public String settlementType;

        /**
         * <strong>example:</strong>
         * <p>sio</p>
         */
        @NameInMap("sio")
        public String sio;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>入账成功</p>
         */
        @NameInMap("status_desc")
        public String statusDesc;

        /**
         * <strong>example:</strong>
         * <p>123123232</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        /**
         * <strong>example:</strong>
         * <p>125.6</p>
         */
        @NameInMap("tax_fee")
        public Double taxFee;

        /**
         * <p>税率</p>
         * 
         * <strong>example:</strong>
         * <p>6%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        /**
         * <strong>example:</strong>
         * <p>AB0-<strong><strong>-</strong></strong>-****1011</p>
         */
        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        /**
         * <strong>example:</strong>
         * <p>781-6586234234324</p>
         */
        @NameInMap("ticket_id")
        public String ticketId;

        /**
         * <strong>example:</strong>
         * <p>CAN-KUL-BKK</p>
         */
        @NameInMap("trade")
        public String trade;

        /**
         * <strong>example:</strong>
         * <p>支出</p>
         */
        @NameInMap("trade_action_desc")
        public String tradeActionDesc;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:abc@123.com">abc@123.com</a></p>
         */
        @NameInMap("traveler_email")
        public String travelerEmail;

        /**
         * <strong>example:</strong>
         * <p>54463464</p>
         */
        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>326246</p>
         */
        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        /**
         * <strong>example:</strong>
         * <p>内部员工</p>
         */
        @NameInMap("traveler_member_type")
        public String travelerMemberType;

        /**
         * <strong>example:</strong>
         * <p>内部员工</p>
         */
        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        /**
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("voucher_type")
        public Integer voucherType;

        /**
         * <strong>example:</strong>
         * <p>增值税发票</p>
         */
        @NameInMap("voucher_type_desc")
        public String voucherTypeDesc;

        /**
         * <strong>example:</strong>
         * <p>北京-杭州-上海</p>
         */
        @NameInMap("voyage_name")
        public String voyageName;

        public static IeFlightBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            IeFlightBillSettlementQueryResponseBodyModuleDataList self = new IeFlightBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAdjustTime(String adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public String getAdjustTime() {
            return this.adjustTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAdvanceDay(Integer advanceDay) {
            this.advanceDay = advanceDay;
            return this;
        }
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpCode(String airlineCorpCode) {
            this.airlineCorpCode = airlineCorpCode;
            return this;
        }
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpName(String airlineCorpName) {
            this.airlineCorpName = airlineCorpName;
            return this;
        }
        public String getAirlineCorpName() {
            return this.airlineCorpName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverEmail(String approverEmail) {
            this.approverEmail = approverEmail;
            return this;
        }
        public String getApproverEmail() {
            return this.approverEmail;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCountry(String arrCountry) {
            this.arrCountry = arrCountry;
            return this;
        }
        public String getArrCountry() {
            return this.arrCountry;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCountryCode(String arrCountryCode) {
            this.arrCountryCode = arrCountryCode;
            return this;
        }
        public String getArrCountryCode() {
            return this.arrCountryCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBaseLocation(String baseLocation) {
            this.baseLocation = baseLocation;
            return this;
        }
        public String getBaseLocation() {
            return this.baseLocation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBtripCouponFee(Double btripCouponFee) {
            this.btripCouponFee = btripCouponFee;
            return this;
        }
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCorpPayOrderFee(Double corpPayOrderFee) {
            this.corpPayOrderFee = corpPayOrderFee;
            return this;
        }
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostDepartment(String costDepartment) {
            this.costDepartment = costDepartment;
            return this;
        }
        public String getCostDepartment() {
            return this.costDepartment;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeductibleTax(Double deductibleTax) {
            this.deductibleTax = deductibleTax;
            return this;
        }
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCountry(String depCountry) {
            this.depCountry = depCountry;
            return this;
        }
        public String getDepCountry() {
            return this.depCountry;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCountryCode(String depCountryCode) {
            this.depCountryCode = depCountryCode;
            return this;
        }
        public String getDepCountryCode() {
            return this.depCountryCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFeeTypeDesc(String feeTypeDesc) {
            this.feeTypeDesc = feeTypeDesc;
            return this;
        }
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setForeignersTag(String foreignersTag) {
            this.foreignersTag = foreignersTag;
            return this;
        }
        public String getForeignersTag() {
            return this.foreignersTag;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceFee(Double insuranceFee) {
            this.insuranceFee = insuranceFee;
            return this;
        }
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
            return this;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceProductName(String insuranceProductName) {
            this.insuranceProductName = insuranceProductName;
            return this;
        }
        public String getInsuranceProductName() {
            return this.insuranceProductName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMappingCompanyCode(String mappingCompanyCode) {
            this.mappingCompanyCode = mappingCompanyCode;
            return this;
        }
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDeptTime(String mostDifferenceDeptTime) {
            this.mostDifferenceDeptTime = mostDifferenceDeptTime;
            return this;
        }
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDiscount(String mostDifferenceDiscount) {
            this.mostDifferenceDiscount = mostDifferenceDiscount;
            return this;
        }
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceFlightNo(String mostDifferenceFlightNo) {
            this.mostDifferenceFlightNo = mostDifferenceFlightNo;
            return this;
        }
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferencePrice(Double mostDifferencePrice) {
            this.mostDifferencePrice = mostDifferencePrice;
            return this;
        }
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceReason(String mostDifferenceReason) {
            this.mostDifferenceReason = mostDifferenceReason;
            return this;
        }
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostPrice(Double mostPrice) {
            this.mostPrice = mostPrice;
            return this;
        }
        public Double getMostPrice() {
            return this.mostPrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setNegotiationCouponFee(Double negotiationCouponFee) {
            this.negotiationCouponFee = negotiationCouponFee;
            return this;
        }
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPositionLevel(String positionLevel) {
            this.positionLevel = positionLevel;
            return this;
        }
        public String getPositionLevel() {
            return this.positionLevel;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProcessorOaCode(String processorOaCode) {
            this.processorOaCode = processorOaCode;
            return this;
        }
        public String getProcessorOaCode() {
            return this.processorOaCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundChangeCost(Double refundChangeCost) {
            this.refundChangeCost = refundChangeCost;
            return this;
        }
        public Double getRefundChangeCost() {
            return this.refundChangeCost;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundResult(String refundResult) {
            this.refundResult = refundResult;
            return this;
        }
        public String getRefundResult() {
            return this.refundResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRepeatRefund(String repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSealPrice(Double sealPrice) {
            this.sealPrice = sealPrice;
            return this;
        }
        public Double getSealPrice() {
            return this.sealPrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSegmentList(String segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public String getSegmentList() {
            return this.segmentList;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSegmentType(String segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public String getSegmentType() {
            return this.segmentType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettleTypeDesc(String settleTypeDesc) {
            this.settleTypeDesc = settleTypeDesc;
            return this;
        }
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSio(String sio) {
            this.sio = sio;
            return this;
        }
        public String getSio() {
            return this.sio;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTaxFee(Double taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public Double getTaxFee() {
            return this.taxFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTrade(String trade) {
            this.trade = trade;
            return this;
        }
        public String getTrade() {
            return this.trade;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTradeActionDesc(String tradeActionDesc) {
            this.tradeActionDesc = tradeActionDesc;
            return this;
        }
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerEmail(String travelerEmail) {
            this.travelerEmail = travelerEmail;
            return this;
        }
        public String getTravelerEmail() {
            return this.travelerEmail;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoucherTypeDesc(String voucherTypeDesc) {
            this.voucherTypeDesc = voucherTypeDesc;
            return this;
        }
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoyageName(String voyageName) {
            this.voyageName = voyageName;
            return this;
        }
        public String getVoyageName() {
            return this.voyageName;
        }

    }

    public static class IeFlightBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>corp1</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> dataList;

        /**
         * <strong>example:</strong>
         * <p>2021-10-14</p>
         */
        @NameInMap("period_end")
        public String periodEnd;

        /**
         * <strong>example:</strong>
         * <p>2021-10-13</p>
         */
        @NameInMap("period_start")
        public String periodStart;

        /**
         * <strong>example:</strong>
         * <p>1qwe</p>
         */
        @NameInMap("scroll_id")
        public String scrollId;

        /**
         * <strong>example:</strong>
         * <p>1402</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        public static IeFlightBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IeFlightBillSettlementQueryResponseBodyModule self = new IeFlightBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IeFlightBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setDataList(java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
