// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeApplyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123122</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3685792244476194816</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("room_info_list")
    public java.util.List<HotelOrderChangeApplyRequestRoomInfoList> roomInfoList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1402002197440511306</p>
     */
    @NameInMap("sale_order_id")
    public String saleOrderId;

    public static HotelOrderChangeApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeApplyRequest self = new HotelOrderChangeApplyRequest();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeApplyRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public HotelOrderChangeApplyRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public HotelOrderChangeApplyRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public HotelOrderChangeApplyRequest setRoomInfoList(java.util.List<HotelOrderChangeApplyRequestRoomInfoList> roomInfoList) {
        this.roomInfoList = roomInfoList;
        return this;
    }
    public java.util.List<HotelOrderChangeApplyRequestRoomInfoList> getRoomInfoList() {
        return this.roomInfoList;
    }

    public HotelOrderChangeApplyRequest setSaleOrderId(String saleOrderId) {
        this.saleOrderId = saleOrderId;
        return this;
    }
    public String getSaleOrderId() {
        return this.saleOrderId;
    }

    public static class HotelOrderChangeApplyRequestRoomInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cancel_date")
        public java.util.List<String> cancelDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>112</p>
         */
        @NameInMap("room_no")
        public Integer roomNo;

        public static HotelOrderChangeApplyRequestRoomInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderChangeApplyRequestRoomInfoList self = new HotelOrderChangeApplyRequestRoomInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderChangeApplyRequestRoomInfoList setCancelDate(java.util.List<String> cancelDate) {
            this.cancelDate = cancelDate;
            return this;
        }
        public java.util.List<String> getCancelDate() {
            return this.cancelDate;
        }

        public HotelOrderChangeApplyRequestRoomInfoList setRoomNo(Integer roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public Integer getRoomNo() {
            return this.roomNo;
        }

    }

}
