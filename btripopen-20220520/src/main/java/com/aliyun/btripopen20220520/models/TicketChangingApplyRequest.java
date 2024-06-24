// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingApplyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dis1234</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mid1243</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modify_flight_info_list")
    public java.util.List<TicketChangingApplyRequestModifyFlightInfoList> modifyFlightInfoList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1s8837sh991hsj92h</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("reason")
    public String reason;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>us88s2bsbin22hjusd8i</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("whether_retry")
    public Boolean whetherRetry;

    public static TicketChangingApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingApplyRequest self = new TicketChangingApplyRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingApplyRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingApplyRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public TicketChangingApplyRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public TicketChangingApplyRequest setModifyFlightInfoList(java.util.List<TicketChangingApplyRequestModifyFlightInfoList> modifyFlightInfoList) {
        this.modifyFlightInfoList = modifyFlightInfoList;
        return this;
    }
    public java.util.List<TicketChangingApplyRequestModifyFlightInfoList> getModifyFlightInfoList() {
        return this.modifyFlightInfoList;
    }

    public TicketChangingApplyRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public TicketChangingApplyRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public TicketChangingApplyRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public TicketChangingApplyRequest setWhetherRetry(Boolean whetherRetry) {
        this.whetherRetry = whetherRetry;
        return this;
    }
    public Boolean getWhetherRetry() {
        return this.whetherRetry;
    }

    public static class TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CA1703</p>
         */
        @NameInMap("origin_flight_no")
        public String originFlightNo;

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
         */
        @NameInMap("passenger_name")
        public String passengerName;

        public static TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList self = new TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList setOriginFlightNo(String originFlightNo) {
            this.originFlightNo = originFlightNo;
            return this;
        }
        public String getOriginFlightNo() {
            return this.originFlightNo;
        }

        public TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList setOutUserId(String outUserId) {
            this.outUserId = outUserId;
            return this;
        }
        public String getOutUserId() {
            return this.outUserId;
        }

        public TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TicketChangingApplyRequestModifyFlightInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-00-00 00:00:00</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_info_list")
        public java.util.List<TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList> passengerInfoList;

        public static TicketChangingApplyRequestModifyFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingApplyRequestModifyFlightInfoList self = new TicketChangingApplyRequestModifyFlightInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingApplyRequestModifyFlightInfoList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public TicketChangingApplyRequestModifyFlightInfoList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public TicketChangingApplyRequestModifyFlightInfoList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public TicketChangingApplyRequestModifyFlightInfoList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public TicketChangingApplyRequestModifyFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public TicketChangingApplyRequestModifyFlightInfoList setPassengerInfoList(java.util.List<TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList> passengerInfoList) {
            this.passengerInfoList = passengerInfoList;
            return this;
        }
        public java.util.List<TicketChangingApplyRequestModifyFlightInfoListPassengerInfoList> getPassengerInfoList() {
            return this.passengerInfoList;
        }

    }

}
