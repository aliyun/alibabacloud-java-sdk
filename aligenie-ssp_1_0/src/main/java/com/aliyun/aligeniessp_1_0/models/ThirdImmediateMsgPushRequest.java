// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ThirdImmediateMsgPushRequest extends TeaModel {
    /**
     * <p>Business type (FLIGHT: flight, TRAIN: train)</p>
     * 
     * <strong>example:</strong>
     * <p>FLIGHT</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>Change details (JSON-formatted change data)</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ChangeDetail")
    public String changeDetail;

    /**
     * <p>Order ID</p>
     * 
     * <strong>example:</strong>
     * <p>orderId</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Passenger IDs to change</p>
     * 
     * <strong>example:</strong>
     * <p>psgIds</p>
     */
    @NameInMap("PsgIds")
    public String psgIds;

    /**
     * <p>Request source</p>
     * 
     * <strong>example:</strong>
     * <p>source</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>change type (TRAIN_ISSUED, FLIGHT_CHANGED)</p>
     * 
     * <strong>example:</strong>
     * <p>TRAIN_ISSUED</p>
     */
    @NameInMap("TrafficChangeType")
    public String trafficChangeType;

    /**
     * <p>change type description (ticket issued, rebooked)</p>
     * 
     * <strong>example:</strong>
     * <p>已出票</p>
     */
    @NameInMap("TrafficChangeTypeDesc")
    public String trafficChangeTypeDesc;

    /**
     * <p>Journey IDs to change</p>
     * 
     * <strong>example:</strong>
     * <p>trafficJourneyIds</p>
     */
    @NameInMap("TrafficJourneyIds")
    public String trafficJourneyIds;

    /**
     * <p>sub-order ID of the changed train request</p>
     * 
     * <strong>example:</strong>
     * <p>trafficSubOrderIds</p>
     */
    @NameInMap("TrafficSubOrderIds")
    public String trafficSubOrderIds;

    /**
     * <p>user ID</p>
     * 
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ThirdImmediateMsgPushRequest build(java.util.Map<String, ?> map) throws Exception {
        ThirdImmediateMsgPushRequest self = new ThirdImmediateMsgPushRequest();
        return TeaModel.build(map, self);
    }

    public ThirdImmediateMsgPushRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ThirdImmediateMsgPushRequest setChangeDetail(String changeDetail) {
        this.changeDetail = changeDetail;
        return this;
    }
    public String getChangeDetail() {
        return this.changeDetail;
    }

    public ThirdImmediateMsgPushRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ThirdImmediateMsgPushRequest setPsgIds(String psgIds) {
        this.psgIds = psgIds;
        return this;
    }
    public String getPsgIds() {
        return this.psgIds;
    }

    public ThirdImmediateMsgPushRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ThirdImmediateMsgPushRequest setTrafficChangeType(String trafficChangeType) {
        this.trafficChangeType = trafficChangeType;
        return this;
    }
    public String getTrafficChangeType() {
        return this.trafficChangeType;
    }

    public ThirdImmediateMsgPushRequest setTrafficChangeTypeDesc(String trafficChangeTypeDesc) {
        this.trafficChangeTypeDesc = trafficChangeTypeDesc;
        return this;
    }
    public String getTrafficChangeTypeDesc() {
        return this.trafficChangeTypeDesc;
    }

    public ThirdImmediateMsgPushRequest setTrafficJourneyIds(String trafficJourneyIds) {
        this.trafficJourneyIds = trafficJourneyIds;
        return this;
    }
    public String getTrafficJourneyIds() {
        return this.trafficJourneyIds;
    }

    public ThirdImmediateMsgPushRequest setTrafficSubOrderIds(String trafficSubOrderIds) {
        this.trafficSubOrderIds = trafficSubOrderIds;
        return this;
    }
    public String getTrafficSubOrderIds() {
        return this.trafficSubOrderIds;
    }

    public ThirdImmediateMsgPushRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
