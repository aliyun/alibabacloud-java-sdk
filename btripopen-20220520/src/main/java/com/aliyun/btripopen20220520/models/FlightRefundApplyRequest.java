// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundApplyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("corp_refund_price")
    public Long corpRefundPrice;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis123</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>refu123</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("display_refund_money")
    public String displayRefundMoney;

    @NameInMap("extra")
    public java.util.Map<String, String> extra;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FlightItem_9966772382</p>
     */
    @NameInMap("item_unit_ids")
    public String itemUnitIds;

    @NameInMap("passenger_segment_info_list")
    public java.util.List<FlightRefundApplyRequestPassengerSegmentInfoList> passengerSegmentInfoList;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("personal_refund_price")
    public Long personalRefundPrice;

    @NameInMap("reason_detail")
    public String reasonDetail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("reason_type")
    public Integer reasonType;

    @NameInMap("refund_voucher_info")
    public java.util.List<String> refundVoucherInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0f9418cd2ce34af49ab0de16fea166d1</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total_refund_price")
    public Long totalRefundPrice;

    public static FlightRefundApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundApplyRequest self = new FlightRefundApplyRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundApplyRequest setCorpRefundPrice(Long corpRefundPrice) {
        this.corpRefundPrice = corpRefundPrice;
        return this;
    }
    public Long getCorpRefundPrice() {
        return this.corpRefundPrice;
    }

    public FlightRefundApplyRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightRefundApplyRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public FlightRefundApplyRequest setDisplayRefundMoney(String displayRefundMoney) {
        this.displayRefundMoney = displayRefundMoney;
        return this;
    }
    public String getDisplayRefundMoney() {
        return this.displayRefundMoney;
    }

    public FlightRefundApplyRequest setExtra(java.util.Map<String, String> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, String> getExtra() {
        return this.extra;
    }

    public FlightRefundApplyRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public FlightRefundApplyRequest setItemUnitIds(String itemUnitIds) {
        this.itemUnitIds = itemUnitIds;
        return this;
    }
    public String getItemUnitIds() {
        return this.itemUnitIds;
    }

    public FlightRefundApplyRequest setPassengerSegmentInfoList(java.util.List<FlightRefundApplyRequestPassengerSegmentInfoList> passengerSegmentInfoList) {
        this.passengerSegmentInfoList = passengerSegmentInfoList;
        return this;
    }
    public java.util.List<FlightRefundApplyRequestPassengerSegmentInfoList> getPassengerSegmentInfoList() {
        return this.passengerSegmentInfoList;
    }

    public FlightRefundApplyRequest setPersonalRefundPrice(Long personalRefundPrice) {
        this.personalRefundPrice = personalRefundPrice;
        return this;
    }
    public Long getPersonalRefundPrice() {
        return this.personalRefundPrice;
    }

    public FlightRefundApplyRequest setReasonDetail(String reasonDetail) {
        this.reasonDetail = reasonDetail;
        return this;
    }
    public String getReasonDetail() {
        return this.reasonDetail;
    }

    public FlightRefundApplyRequest setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
        return this;
    }
    public Integer getReasonType() {
        return this.reasonType;
    }

    public FlightRefundApplyRequest setRefundVoucherInfo(java.util.List<String> refundVoucherInfo) {
        this.refundVoucherInfo = refundVoucherInfo;
        return this;
    }
    public java.util.List<String> getRefundVoucherInfo() {
        return this.refundVoucherInfo;
    }

    public FlightRefundApplyRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightRefundApplyRequest setTotalRefundPrice(Long totalRefundPrice) {
        this.totalRefundPrice = totalRefundPrice;
        return this;
    }
    public Long getTotalRefundPrice() {
        return this.totalRefundPrice;
    }

    public static class FlightRefundApplyRequestPassengerSegmentInfoList extends TeaModel {
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>1245</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static FlightRefundApplyRequestPassengerSegmentInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundApplyRequestPassengerSegmentInfoList self = new FlightRefundApplyRequestPassengerSegmentInfoList();
            return TeaModel.build(map, self);
        }

        public FlightRefundApplyRequestPassengerSegmentInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightRefundApplyRequestPassengerSegmentInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightRefundApplyRequestPassengerSegmentInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
