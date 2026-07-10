// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderChangeDetailResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelOrderChangeDetailResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderChangeDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderChangeDetailResponseBody self = new HotelOrderChangeDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderChangeDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderChangeDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderChangeDetailResponseBody setModule(HotelOrderChangeDetailResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderChangeDetailResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderChangeDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderChangeDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderChangeDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos extends TeaModel {
        @NameInMap("check_in_date")
        public String checkInDate;

        @NameInMap("penalty_price")
        public Long penaltyPrice;

        @NameInMap("price")
        public Long price;

        @NameInMap("refund_price")
        public Long refundPrice;

        public static HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos self = new HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos();
            return TeaModel.build(map, self);
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }
        public String getCheckInDate() {
            return this.checkInDate;
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos setPenaltyPrice(Long penaltyPrice) {
            this.penaltyPrice = penaltyPrice;
            return this;
        }
        public Long getPenaltyPrice() {
            return this.penaltyPrice;
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

    }

    public static class HotelOrderChangeDetailResponseBodyModuleRoomInfoList extends TeaModel {
        @NameInMap("cancel_date")
        public java.util.List<String> cancelDate;

        @NameInMap("room_daily_refund_infos")
        public java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos> roomDailyRefundInfos;

        @NameInMap("room_no")
        public Integer roomNo;

        public static HotelOrderChangeDetailResponseBodyModuleRoomInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderChangeDetailResponseBodyModuleRoomInfoList self = new HotelOrderChangeDetailResponseBodyModuleRoomInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoList setCancelDate(java.util.List<String> cancelDate) {
            this.cancelDate = cancelDate;
            return this;
        }
        public java.util.List<String> getCancelDate() {
            return this.cancelDate;
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoList setRoomDailyRefundInfos(java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos> roomDailyRefundInfos) {
            this.roomDailyRefundInfos = roomDailyRefundInfos;
            return this;
        }
        public java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoListRoomDailyRefundInfos> getRoomDailyRefundInfos() {
            return this.roomDailyRefundInfos;
        }

        public HotelOrderChangeDetailResponseBodyModuleRoomInfoList setRoomNo(Integer roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public Integer getRoomNo() {
            return this.roomNo;
        }

    }

    public static class HotelOrderChangeDetailResponseBodyModule extends TeaModel {
        @NameInMap("change_order_id")
        public String changeOrderId;

        @NameInMap("change_type")
        public Integer changeType;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("dis_order_id")
        public String disOrderId;

        @NameInMap("gmt_create")
        public String gmtCreate;

        @NameInMap("gmt_modified")
        public String gmtModified;

        @NameInMap("reason")
        public String reason;

        @NameInMap("remarks")
        public String remarks;

        @NameInMap("room_info_list")
        public java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoList> roomInfoList;

        @NameInMap("sale_order_id")
        public String saleOrderId;

        @NameInMap("source")
        public Integer source;

        @NameInMap("status")
        public Integer status;

        @NameInMap("work_order_id")
        public String workOrderId;

        public static HotelOrderChangeDetailResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderChangeDetailResponseBodyModule self = new HotelOrderChangeDetailResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderChangeDetailResponseBodyModule setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public HotelOrderChangeDetailResponseBodyModule setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public HotelOrderChangeDetailResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelOrderChangeDetailResponseBodyModule setDisOrderId(String disOrderId) {
            this.disOrderId = disOrderId;
            return this;
        }
        public String getDisOrderId() {
            return this.disOrderId;
        }

        public HotelOrderChangeDetailResponseBodyModule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public HotelOrderChangeDetailResponseBodyModule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public HotelOrderChangeDetailResponseBodyModule setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public HotelOrderChangeDetailResponseBodyModule setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public HotelOrderChangeDetailResponseBodyModule setRoomInfoList(java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoList> roomInfoList) {
            this.roomInfoList = roomInfoList;
            return this;
        }
        public java.util.List<HotelOrderChangeDetailResponseBodyModuleRoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

        public HotelOrderChangeDetailResponseBodyModule setSaleOrderId(String saleOrderId) {
            this.saleOrderId = saleOrderId;
            return this;
        }
        public String getSaleOrderId() {
            return this.saleOrderId;
        }

        public HotelOrderChangeDetailResponseBodyModule setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public HotelOrderChangeDetailResponseBodyModule setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelOrderChangeDetailResponseBodyModule setWorkOrderId(String workOrderId) {
            this.workOrderId = workOrderId;
            return this;
        }
        public String getWorkOrderId() {
            return this.workOrderId;
        }

    }

}
