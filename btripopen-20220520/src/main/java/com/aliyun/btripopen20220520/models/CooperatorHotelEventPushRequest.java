// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorHotelEventPushRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("change_order_status")
    public Integer changeOrderStatus;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_order_status_desc")
    public String changeOrderStatusDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>coop_123456</p>
     */
    @NameInMap("cooperator_order_id")
    public String cooperatorOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_LEAVE</p>
     */
    @NameInMap("event")
    public String event;

    @NameInMap("event_desc")
    public String eventDesc;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>204-09-01 10:55:20</p>
     */
    @NameInMap("event_time")
    public String eventTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("order_id")
    public String orderId;

    public static CooperatorHotelEventPushRequest build(java.util.Map<String, ?> map) throws Exception {
        CooperatorHotelEventPushRequest self = new CooperatorHotelEventPushRequest();
        return TeaModel.build(map, self);
    }

    public CooperatorHotelEventPushRequest setChangeOrderStatus(Integer changeOrderStatus) {
        this.changeOrderStatus = changeOrderStatus;
        return this;
    }
    public Integer getChangeOrderStatus() {
        return this.changeOrderStatus;
    }

    public CooperatorHotelEventPushRequest setChangeOrderStatusDesc(String changeOrderStatusDesc) {
        this.changeOrderStatusDesc = changeOrderStatusDesc;
        return this;
    }
    public String getChangeOrderStatusDesc() {
        return this.changeOrderStatusDesc;
    }

    public CooperatorHotelEventPushRequest setCooperatorOrderId(String cooperatorOrderId) {
        this.cooperatorOrderId = cooperatorOrderId;
        return this;
    }
    public String getCooperatorOrderId() {
        return this.cooperatorOrderId;
    }

    public CooperatorHotelEventPushRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public CooperatorHotelEventPushRequest setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
        return this;
    }
    public String getEventDesc() {
        return this.eventDesc;
    }

    public CooperatorHotelEventPushRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public CooperatorHotelEventPushRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
