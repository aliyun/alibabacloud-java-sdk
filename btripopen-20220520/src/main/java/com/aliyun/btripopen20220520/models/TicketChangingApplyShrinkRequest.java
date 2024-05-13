// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingApplyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_sub_order_id")
    public String disSubOrderId;

    @NameInMap("is_voluntary")
    public Integer isVoluntary;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modify_flight_info_list")
    public String modifyFlightInfoListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ota_item_id")
    public String otaItemId;

    @NameInMap("reason")
    public String reason;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("whether_retry")
    public Boolean whetherRetry;

    public static TicketChangingApplyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingApplyShrinkRequest self = new TicketChangingApplyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TicketChangingApplyShrinkRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public TicketChangingApplyShrinkRequest setDisSubOrderId(String disSubOrderId) {
        this.disSubOrderId = disSubOrderId;
        return this;
    }
    public String getDisSubOrderId() {
        return this.disSubOrderId;
    }

    public TicketChangingApplyShrinkRequest setIsVoluntary(Integer isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public Integer getIsVoluntary() {
        return this.isVoluntary;
    }

    public TicketChangingApplyShrinkRequest setModifyFlightInfoListShrink(String modifyFlightInfoListShrink) {
        this.modifyFlightInfoListShrink = modifyFlightInfoListShrink;
        return this;
    }
    public String getModifyFlightInfoListShrink() {
        return this.modifyFlightInfoListShrink;
    }

    public TicketChangingApplyShrinkRequest setOtaItemId(String otaItemId) {
        this.otaItemId = otaItemId;
        return this;
    }
    public String getOtaItemId() {
        return this.otaItemId;
    }

    public TicketChangingApplyShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public TicketChangingApplyShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public TicketChangingApplyShrinkRequest setWhetherRetry(Boolean whetherRetry) {
        this.whetherRetry = whetherRetry;
        return this;
    }
    public Boolean getWhetherRetry() {
        return this.whetherRetry;
    }

}
