// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightBillSettlementQueryResponseBody extends TeaModel {
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
    public FlightBillSettlementQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-<strong><strong>-</strong></strong>-****-9D1AB7218B27</p>
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
     * <p>21041ce********056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightBillSettlementQueryResponseBody self = new FlightBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightBillSettlementQueryResponseBody setModule(FlightBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FlightBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
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
         * <p>中国东方航空</p>
         */
        @NameInMap("airline_corp_name")
        public String airlineCorpName;

        /**
         * <strong>example:</strong>
         * <p>20230********000</p>
         */
        @NameInMap("alipay_id")
        public String alipayId;

        /**
         * <strong>example:</strong>
         * <p>20211********456080520</p>
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
         * <strong>example:</strong>
         * <p>补充说明</p>
         */
        @NameInMap("apply_extend_field")
        public String applyExtendField;

        /**
         * <strong>example:</strong>
         * <p>103****54</p>
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
         * <p>广州</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        /**
         * <strong>example:</strong>
         * <p>白云国际机场</p>
         */
        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>14:30:00</p>
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
         * <p>012-002145</p>
         */
        @NameInMap("before_ticket_no")
        public String beforeTicketNo;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01T00:00Z</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        /**
         * <strong>example:</strong>
         * <p>移动端</p>
         */
        @NameInMap("book_channel")
        public String bookChannel;

        /**
         * <strong>example:</strong>
         * <p>线上（自助预订）</p>
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
         * <p>user_1234</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>job_1234</p>
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
         * <p>50</p>
         */
        @NameInMap("build_fee")
        public Double buildFee;

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
         * <p>Y</p>
         */
        @NameInMap("cabin_class_code")
        public String cabinClassCode;

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
         * <p>国内机票</p>
         */
        @NameInMap("category_desc")
        public String categoryDesc;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("change_fee")
        public Double changeFee;

        /**
         * <strong>example:</strong>
         * <p>001</p>
         */
        @NameInMap("change_reason_code")
        public String changeReasonCode;

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
         * <p>10.0</p>
         */
        @NameInMap("corp_settle_price")
        public Double corpSettlePrice;

        /**
         * <strong>example:</strong>
         * <p>运营部成本中心</p>
         */
        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>cost_1234</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>code2</p>
         */
        @NameInMap("cost_department")
        public String costDepartment;

        /**
         * <strong>example:</strong>
         * <p>5</p>
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
         * <p>1.23</p>
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
         * <p>华北营运大区</p>
         */
        @NameInMap("department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>depart_1234</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        /**
         * <strong>example:</strong>
         * <p>南昌</p>
         */
        @NameInMap("dept_city")
        public String deptCity;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("dept_date")
        public String deptDate;

        /**
         * <strong>example:</strong>
         * <p>昌北国际机场</p>
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
         * <p>80%</p>
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
         * <p>10101</p>
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
         * <p>拼接往返</p>
         */
        @NameInMap("flight_trip_type")
        public String flightTripType;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("foreigners_tag")
        public String foreignersTag;

        /**
         * <strong>example:</strong>
         * <p>45***47</p>
         */
        @NameInMap("index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>1002************464</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        /**
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("insurance_fee")
        public Double insuranceFee;

        /**
         * <strong>example:</strong>
         * <p>100**************101</p>
         */
        @NameInMap("insurance_number")
        public String insuranceNumber;

        /**
         * <strong>example:</strong>
         * <p>飞小猪有限公司</p>
         */
        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>直达</p>
         */
        @NameInMap("item_type")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>53****21</p>
         */
        @NameInMap("itinerary_num")
        public String itineraryNum;

        /**
         * <strong>example:</strong>
         * <p>460</p>
         */
        @NameInMap("itinerary_price")
        public Double itineraryPrice;

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
         * <p>1200</p>
         */
        @NameInMap("mileage")
        public String mileage;

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
         * <p>原因为：xxxxx。</p>
         */
        @NameInMap("most_difference_reason")
        public String mostDifferenceReason;

        /**
         * <strong>example:</strong>
         * <p>400</p>
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
         * <p>线下改签</p>
         */
        @NameInMap("offline_status")
        public String offlineStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("oil_fee")
        public Double oilFee;

        /**
         * <strong>example:</strong>
         * <p>1002************464</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>123-23423587</p>
         */
        @NameInMap("order_ticket_no")
        public String orderTicketNo;

        /**
         * <strong>example:</strong>
         * <p>2343****23</p>
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
         * <p>1.0</p>
         */
        @NameInMap("person_settle_price")
        public Double personSettlePrice;

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
         * <p>紧急业务，无法提前预定</p>
         */
        @NameInMap("pre_book_tip")
        public String preBookTip;

        /**
         * <strong>example:</strong>
         * <p>45***47</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        /**
         * <strong>example:</strong>
         * <p>www122</p>
         */
        @NameInMap("processor_oa_code")
        public String processorOaCode;

        /**
         * <strong>example:</strong>
         * <p>project_1234</p>
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
         * <p>企业</p>
         */
        @NameInMap("refund_affiliate_no")
        public String refundAffiliateNo;

        /**
         * <strong>example:</strong>
         * <p>4753********7527127</p>
         */
        @NameInMap("refund_apply_id")
        public String refundApplyId;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        /**
         * <strong>example:</strong>
         * <p>002</p>
         */
        @NameInMap("refund_reason_code")
        public String refundReasonCode;

        /**
         * <strong>example:</strong>
         * <p>因公退票,因工作原因取消计划</p>
         */
        @NameInMap("refund_result")
        public String refundResult;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_upgrade_cost")
        public Double refundUpgradeCost;

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
         * <p>123</p>
         */
        @NameInMap("scene_id")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>福利</p>
         */
        @NameInMap("scene_name")
        public String sceneName;

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
         * <p>30</p>
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
         * <p>460</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>5.67</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01 00:00:00</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>781-65********24</p>
         */
        @NameInMap("ticket_id")
        public String ticketId;

        /**
         * <strong>example:</strong>
         * <p>PEK-HGH</p>
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
         * <p>user_1234</p>
         */
        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>job_1234</p>
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
         * <p>张三</p>
         */
        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("upgrade_cost")
        public Double upgradeCost;

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

        public static FlightBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            FlightBillSettlementQueryResponseBodyModuleDataList self = new FlightBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAdjustTime(String adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public String getAdjustTime() {
            return this.adjustTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAdvanceDay(Integer advanceDay) {
            this.advanceDay = advanceDay;
            return this;
        }
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpCode(String airlineCorpCode) {
            this.airlineCorpCode = airlineCorpCode;
            return this;
        }
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpName(String airlineCorpName) {
            this.airlineCorpName = airlineCorpName;
            return this;
        }
        public String getAirlineCorpName() {
            return this.airlineCorpName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAlipayId(String alipayId) {
            this.alipayId = alipayId;
            return this;
        }
        public String getAlipayId() {
            return this.alipayId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApproverEmail(String approverEmail) {
            this.approverEmail = approverEmail;
            return this;
        }
        public String getApproverEmail() {
            return this.approverEmail;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBaseLocation(String baseLocation) {
            this.baseLocation = baseLocation;
            return this;
        }
        public String getBaseLocation() {
            return this.baseLocation;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBeforeTicketNo(String beforeTicketNo) {
            this.beforeTicketNo = beforeTicketNo;
            return this;
        }
        public String getBeforeTicketNo() {
            return this.beforeTicketNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookChannel(String bookChannel) {
            this.bookChannel = bookChannel;
            return this;
        }
        public String getBookChannel() {
            return this.bookChannel;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBtripCouponFee(Double btripCouponFee) {
            this.btripCouponFee = btripCouponFee;
            return this;
        }
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBuildFee(Double buildFee) {
            this.buildFee = buildFee;
            return this;
        }
        public Double getBuildFee() {
            return this.buildFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCabinClassCode(String cabinClassCode) {
            this.cabinClassCode = cabinClassCode;
            return this;
        }
        public String getCabinClassCode() {
            return this.cabinClassCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setChangeReasonCode(String changeReasonCode) {
            this.changeReasonCode = changeReasonCode;
            return this;
        }
        public String getChangeReasonCode() {
            return this.changeReasonCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCorpPayOrderFee(Double corpPayOrderFee) {
            this.corpPayOrderFee = corpPayOrderFee;
            return this;
        }
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCorpSettlePrice(Double corpSettlePrice) {
            this.corpSettlePrice = corpSettlePrice;
            return this;
        }
        public Double getCorpSettlePrice() {
            return this.corpSettlePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCostDepartment(String costDepartment) {
            this.costDepartment = costDepartment;
            return this;
        }
        public String getCostDepartment() {
            return this.costDepartment;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeductibleTax(Double deductibleTax) {
            this.deductibleTax = deductibleTax;
            return this;
        }
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFeeTypeDesc(String feeTypeDesc) {
            this.feeTypeDesc = feeTypeDesc;
            return this;
        }
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFlightTripType(String flightTripType) {
            this.flightTripType = flightTripType;
            return this;
        }
        public String getFlightTripType() {
            return this.flightTripType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setForeignersTag(String foreignersTag) {
            this.foreignersTag = foreignersTag;
            return this;
        }
        public String getForeignersTag() {
            return this.foreignersTag;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsuranceFee(Double insuranceFee) {
            this.insuranceFee = insuranceFee;
            return this;
        }
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
            return this;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItineraryNum(String itineraryNum) {
            this.itineraryNum = itineraryNum;
            return this;
        }
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItineraryPrice(Double itineraryPrice) {
            this.itineraryPrice = itineraryPrice;
            return this;
        }
        public Double getItineraryPrice() {
            return this.itineraryPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMappingCompanyCode(String mappingCompanyCode) {
            this.mappingCompanyCode = mappingCompanyCode;
            return this;
        }
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMileage(String mileage) {
            this.mileage = mileage;
            return this;
        }
        public String getMileage() {
            return this.mileage;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDeptTime(String mostDifferenceDeptTime) {
            this.mostDifferenceDeptTime = mostDifferenceDeptTime;
            return this;
        }
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDiscount(String mostDifferenceDiscount) {
            this.mostDifferenceDiscount = mostDifferenceDiscount;
            return this;
        }
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceFlightNo(String mostDifferenceFlightNo) {
            this.mostDifferenceFlightNo = mostDifferenceFlightNo;
            return this;
        }
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferencePrice(Double mostDifferencePrice) {
            this.mostDifferencePrice = mostDifferencePrice;
            return this;
        }
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceReason(String mostDifferenceReason) {
            this.mostDifferenceReason = mostDifferenceReason;
            return this;
        }
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostPrice(Double mostPrice) {
            this.mostPrice = mostPrice;
            return this;
        }
        public Double getMostPrice() {
            return this.mostPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setNegotiationCouponFee(Double negotiationCouponFee) {
            this.negotiationCouponFee = negotiationCouponFee;
            return this;
        }
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOfflineStatus(String offlineStatus) {
            this.offlineStatus = offlineStatus;
            return this;
        }
        public String getOfflineStatus() {
            return this.offlineStatus;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOilFee(Double oilFee) {
            this.oilFee = oilFee;
            return this;
        }
        public Double getOilFee() {
            return this.oilFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOrderTicketNo(String orderTicketNo) {
            this.orderTicketNo = orderTicketNo;
            return this;
        }
        public String getOrderTicketNo() {
            return this.orderTicketNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPositionLevel(String positionLevel) {
            this.positionLevel = positionLevel;
            return this;
        }
        public String getPositionLevel() {
            return this.positionLevel;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPreBookTip(String preBookTip) {
            this.preBookTip = preBookTip;
            return this;
        }
        public String getPreBookTip() {
            return this.preBookTip;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setProcessorOaCode(String processorOaCode) {
            this.processorOaCode = processorOaCode;
            return this;
        }
        public String getProcessorOaCode() {
            return this.processorOaCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundAffiliateNo(String refundAffiliateNo) {
            this.refundAffiliateNo = refundAffiliateNo;
            return this;
        }
        public String getRefundAffiliateNo() {
            return this.refundAffiliateNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundApplyId(String refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundReasonCode(String refundReasonCode) {
            this.refundReasonCode = refundReasonCode;
            return this;
        }
        public String getRefundReasonCode() {
            return this.refundReasonCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundResult(String refundResult) {
            this.refundResult = refundResult;
            return this;
        }
        public String getRefundResult() {
            return this.refundResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundUpgradeCost(Double refundUpgradeCost) {
            this.refundUpgradeCost = refundUpgradeCost;
            return this;
        }
        public Double getRefundUpgradeCost() {
            return this.refundUpgradeCost;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRepeatRefund(String repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSealPrice(Double sealPrice) {
            this.sealPrice = sealPrice;
            return this;
        }
        public Double getSealPrice() {
            return this.sealPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSegmentList(String segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public String getSegmentList() {
            return this.segmentList;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettleTypeDesc(String settleTypeDesc) {
            this.settleTypeDesc = settleTypeDesc;
            return this;
        }
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSio(String sio) {
            this.sio = sio;
            return this;
        }
        public String getSio() {
            return this.sio;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTrade(String trade) {
            this.trade = trade;
            return this;
        }
        public String getTrade() {
            return this.trade;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTradeActionDesc(String tradeActionDesc) {
            this.tradeActionDesc = tradeActionDesc;
            return this;
        }
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerEmail(String travelerEmail) {
            this.travelerEmail = travelerEmail;
            return this;
        }
        public String getTravelerEmail() {
            return this.travelerEmail;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setUpgradeCost(Double upgradeCost) {
            this.upgradeCost = upgradeCost;
            return this;
        }
        public Double getUpgradeCost() {
            return this.upgradeCost;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setVoucherTypeDesc(String voucherTypeDesc) {
            this.voucherTypeDesc = voucherTypeDesc;
            return this;
        }
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setVoyageName(String voyageName) {
            this.voyageName = voyageName;
            return this;
        }
        public String getVoyageName() {
            return this.voyageName;
        }

    }

    public static class FlightBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>btripiws********12ofjm</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> dataList;

        /**
         * <strong>example:</strong>
         * <p>2000-01-02</p>
         */
        @NameInMap("period_end")
        public String periodEnd;

        /**
         * <strong>example:</strong>
         * <p>2000-01-01</p>
         */
        @NameInMap("period_start")
        public String periodStart;

        /**
         * <strong>example:</strong>
         * <p>1qesf</p>
         */
        @NameInMap("scroll_id")
        public String scrollId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        public static FlightBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightBillSettlementQueryResponseBodyModule self = new FlightBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public FlightBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightBillSettlementQueryResponseBodyModule setDataList(java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public FlightBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public FlightBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public FlightBillSettlementQueryResponseBodyModule setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public FlightBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
