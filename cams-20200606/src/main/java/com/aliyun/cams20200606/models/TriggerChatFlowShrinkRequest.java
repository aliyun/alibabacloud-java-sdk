// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class TriggerChatFlowShrinkRequest extends TeaModel {
    /**
     * <p>The declared occurrence time of the event, usually the time when the request was constructed, in milliseconds timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1731502129000</p>
     */
    @NameInMap("ClaimTimeMillis")
    public Long claimTimeMillis;

    /**
     * <p>Input parameters in Key-Value format. The Key must match the input strategy configured at the start node of your flow.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;my_biz_data_0&quot;: &quot;hi&quot;, &quot;my_biz_data_1&quot;: &quot;1024&quot;}</p>
     */
    @NameInMap("Data")
    public String dataShrink;

    /**
     * <p>The time when the event should be discarded, i.e., the expiration time. If this field is specified, the message will be discarded if it exceeds this time, in milliseconds timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1731502729000</p>
     */
    @NameInMap("DiscardTimeMillis")
    public Long discardTimeMillis;

    /**
     * <p>Flow code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f4912c16943b4dfba44bd6fedacf8c70</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>External system transaction number, used to associate with external business system transactions. You can retrieve this parameter within the flow after triggering.</p>
     * 
     * <strong>example:</strong>
     * <p>8d4acf7e-e360-eb83-6d74-fcf9c4538fda</p>
     */
    @NameInMap("OutId")
    public String outId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Unique event ID used for idempotent triggers. Do not include any business semantics; you can retrieve this parameter within the flow after triggering.</p>
     * 
     * <strong>example:</strong>
     * <p>c68622e6-5f0d-c8a4-af41-e949c2a7580e</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static TriggerChatFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TriggerChatFlowShrinkRequest self = new TriggerChatFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TriggerChatFlowShrinkRequest setClaimTimeMillis(Long claimTimeMillis) {
        this.claimTimeMillis = claimTimeMillis;
        return this;
    }
    public Long getClaimTimeMillis() {
        return this.claimTimeMillis;
    }

    public TriggerChatFlowShrinkRequest setDataShrink(String dataShrink) {
        this.dataShrink = dataShrink;
        return this;
    }
    public String getDataShrink() {
        return this.dataShrink;
    }

    public TriggerChatFlowShrinkRequest setDiscardTimeMillis(Long discardTimeMillis) {
        this.discardTimeMillis = discardTimeMillis;
        return this;
    }
    public Long getDiscardTimeMillis() {
        return this.discardTimeMillis;
    }

    public TriggerChatFlowShrinkRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public TriggerChatFlowShrinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public TriggerChatFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TriggerChatFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TriggerChatFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TriggerChatFlowShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
