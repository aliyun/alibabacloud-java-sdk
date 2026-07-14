// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowRebindPhoneShrinkRequest extends TeaModel {
    /**
     * <p>The message channel code, which is the channel ID. You can view the channel ID on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("ChannelCode")
    public String channelCode;

    /**
     * <p>The message channel type. Valid values:</p>
     * <ul>
     * <li><p>INSTAGRAM</p>
     * </li>
     * <li><p>WHATSAPP</p>
     * </li>
     * <li><p>MESSENGER</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;- VIBER</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The flow code. You can view it on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. On the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> page, click the flow name to open the flow builder canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of phone numbers, PageIds, or AccountIds&lt;props=&quot;intl&quot;&gt;, or ServiceIds under the channel instance.</p>
     */
    @NameInMap("PhoneNumbers")
    public String phoneNumbersShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The WABA account ID, PageId, or AccountId&lt;props=&quot;intl&quot;&gt;, or ServiceId.</p>
     * <ul>
     * <li><p>If ChannelType is set to WHATSAPP, specify the WABA account ID. You can view the WABA account ID on the Channel Management &gt; Manage &gt; WABA Management page.</p>
     * </li>
     * <li><p>If ChannelType is not set to WHATSAPP, specify the PageId for MESSENGER, the AccountId for INSTAGRAM&lt;props=&quot;intl&quot;&gt;, or the ServiceId for VIBER.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1952************</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static FlowRebindPhoneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlowRebindPhoneShrinkRequest self = new FlowRebindPhoneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlowRebindPhoneShrinkRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public FlowRebindPhoneShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public FlowRebindPhoneShrinkRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public FlowRebindPhoneShrinkRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public FlowRebindPhoneShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FlowRebindPhoneShrinkRequest setPhoneNumbersShrink(String phoneNumbersShrink) {
        this.phoneNumbersShrink = phoneNumbersShrink;
        return this;
    }
    public String getPhoneNumbersShrink() {
        return this.phoneNumbersShrink;
    }

    public FlowRebindPhoneShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FlowRebindPhoneShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FlowRebindPhoneShrinkRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
