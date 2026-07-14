// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. The default value is ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>Business extension information. The default value is an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The trigger type for the flow. Valid values:</p>
     * <ul>
     * <li><p>TriggeredManually</p>
     * </li>
     * <li><p>TriggeredByWhatsApp</p>
     * </li>
     * <li><p>TriggeredByMessenger</p>
     * </li>
     * <li><p>TriggeredByInstagram</p>
     * </li>
     * <li><p>TriggeredByViber</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TriggeredByWhatsApp</p>
     */
    @NameInMap("FlowTriggerType")
    public String flowTriggerType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The remarks for the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>通过API触发下发验证模板</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The title of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>WhatsApp自动回复</p>
     */
    @NameInMap("Title")
    public String title;

    public static CreateChatFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatFlowShrinkRequest self = new CreateChatFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatFlowShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateChatFlowShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public CreateChatFlowShrinkRequest setFlowTriggerType(String flowTriggerType) {
        this.flowTriggerType = flowTriggerType;
        return this;
    }
    public String getFlowTriggerType() {
        return this.flowTriggerType;
    }

    public CreateChatFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateChatFlowShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateChatFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateChatFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateChatFlowShrinkRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
