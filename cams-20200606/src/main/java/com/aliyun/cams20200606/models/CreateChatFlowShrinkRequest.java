// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatFlowShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The source flowCode for creation.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CreateFromFlowCode")
    public String createFromFlowCode;

    /**
     * <p>The source flowVersion for creation.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CreateFromFlowVersion")
    public String createFromFlowVersion;

    /**
     * <p>The flow trigger type. Valid values:</p>
     * <ul>
     * <li>TriggeredManually</li>
     * <li>TriggeredByWhatsApp</li>
     * <li>TriggeredByMessenger</li>
     * <li>TriggeredByInstagram</li>
     * <li>TriggeredByViber</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TriggeredByWhatsApp</p>
     */
    @NameInMap("FlowTriggerType")
    public String flowTriggerType;

    /**
     * <p>The lifecycle extension input parameters.</p>
     */
    @NameInMap("LifeCycleExtendData")
    public String lifeCycleExtendDataShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The flow remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Send verification template triggered by API</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The flow title.</p>
     * 
     * <strong>example:</strong>
     * <p>WhatsApp auto-reply</p>
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

    public CreateChatFlowShrinkRequest setCreateFromFlowCode(String createFromFlowCode) {
        this.createFromFlowCode = createFromFlowCode;
        return this;
    }
    public String getCreateFromFlowCode() {
        return this.createFromFlowCode;
    }

    public CreateChatFlowShrinkRequest setCreateFromFlowVersion(String createFromFlowVersion) {
        this.createFromFlowVersion = createFromFlowVersion;
        return this;
    }
    public String getCreateFromFlowVersion() {
        return this.createFromFlowVersion;
    }

    public CreateChatFlowShrinkRequest setFlowTriggerType(String flowTriggerType) {
        this.flowTriggerType = flowTriggerType;
        return this;
    }
    public String getFlowTriggerType() {
        return this.flowTriggerType;
    }

    public CreateChatFlowShrinkRequest setLifeCycleExtendDataShrink(String lifeCycleExtendDataShrink) {
        this.lifeCycleExtendDataShrink = lifeCycleExtendDataShrink;
        return this;
    }
    public String getLifeCycleExtendDataShrink() {
        return this.lifeCycleExtendDataShrink;
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
