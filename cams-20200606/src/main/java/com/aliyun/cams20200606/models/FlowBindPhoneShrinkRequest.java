// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowBindPhoneShrinkRequest extends TeaModel {
    /**
     * <p>The message channel code, which is the channel ID. View the channel ID in the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8c8*********</p>
     */
    @NameInMap("ChannelCode")
    public String channelCode;

    /**
     * <p>The message channel type. Valid values:</p>
     * <ul>
     * <li>INSTAGRAM</li>
     * <li>WHATSAPP</li>
     * <li>MESSENGER</li>
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
     * <p>The flow code. View the flow code in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. Click the flow name in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> page to enter the flow builder canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    /**
     * <p>The multi-WABA binding configuration.</p>
     */
    @NameInMap("MultiWabaPhoneNumbers")
    public String multiWabaPhoneNumbersShrink;

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
     * <li><p>If the ChannelType parameter is set to WHATSAPP, specify the WABA account ID. View the WABA account ID in <a href="https://chatapp.console.aliyun.com/ChannelsManagement"><strong>Channel Management</strong></a> &gt; <strong>Manage</strong> &gt; <strong>WABA Management</strong>.</p>
     * </li>
     * <li><p>If the ChannelType parameter is not set to WHATSAPP, specify the PageId for MESSENGER, the AccountId for INSTAGRAM&lt;props=&quot;intl&quot;&gt;, or the ServiceId for VIBER.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1952************</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static FlowBindPhoneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FlowBindPhoneShrinkRequest self = new FlowBindPhoneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FlowBindPhoneShrinkRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public FlowBindPhoneShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public FlowBindPhoneShrinkRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public FlowBindPhoneShrinkRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public FlowBindPhoneShrinkRequest setMultiWabaPhoneNumbersShrink(String multiWabaPhoneNumbersShrink) {
        this.multiWabaPhoneNumbersShrink = multiWabaPhoneNumbersShrink;
        return this;
    }
    public String getMultiWabaPhoneNumbersShrink() {
        return this.multiWabaPhoneNumbersShrink;
    }

    public FlowBindPhoneShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FlowBindPhoneShrinkRequest setPhoneNumbersShrink(String phoneNumbersShrink) {
        this.phoneNumbersShrink = phoneNumbersShrink;
        return this;
    }
    public String getPhoneNumbersShrink() {
        return this.phoneNumbersShrink;
    }

    public FlowBindPhoneShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FlowBindPhoneShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FlowBindPhoneShrinkRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
