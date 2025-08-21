// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ThirdImmediateMsgPushRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FLIGHT</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>changeDetail</p>
     */
    @NameInMap("ChangeDetail")
    public String changeDetail;

    /**
     * <strong>example:</strong>
     * <p>orderId</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>psgIds</p>
     */
    @NameInMap("PsgIds")
    public String psgIds;

    /**
     * <strong>example:</strong>
     * <p>trafficChangeType</p>
     */
    @NameInMap("TrafficChangeType")
    public String trafficChangeType;

    /**
     * <strong>example:</strong>
     * <p>trafficChangeTypeDesc</p>
     */
    @NameInMap("TrafficChangeTypeDesc")
    public String trafficChangeTypeDesc;

    /**
     * <strong>example:</strong>
     * <p>trafficJourneyIds</p>
     */
    @NameInMap("TrafficJourneyIds")
    public String trafficJourneyIds;

    /**
     * <strong>example:</strong>
     * <p>trafficSubOrderIds</p>
     */
    @NameInMap("TrafficSubOrderIds")
    public String trafficSubOrderIds;

    /**
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
