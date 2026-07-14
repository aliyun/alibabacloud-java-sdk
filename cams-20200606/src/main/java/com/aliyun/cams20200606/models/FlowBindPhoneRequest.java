// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowBindPhoneRequest extends TeaModel {
    /**
     * <p>The message channel code. This is the channel ID. View the channel ID on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
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
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>VIBER</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The flow code. View the flow code on the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. On the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> page, click the flow name to go to the flow editor canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>A list of phone numbers, PageIds, AccountIds&lt;props=&quot;intl&quot;&gt;, or ServiceIds for the channel instance.</p>
     */
    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The WABA account ID, PageId, AccountId&lt;props=&quot;intl&quot;&gt;, or ServiceId.</p>
     * <ul>
     * <li><p>If \<code>ChannelType\\</code> is \<code>WHATSAPP\\</code>, pass the WABA account ID. View the WABA account ID on the <strong>WABA Management</strong> page by navigating to <strong>Channel Management</strong> &gt; <strong>Manage</strong>.</p>
     * </li>
     * <li><p>If \<code>ChannelType\\</code> is not \<code>WHATSAPP\\</code>, pass the PageId for \<code>MESSENGER\\</code> or the AccountId for \<code>INSTAGRAM\\</code>&lt;props=&quot;intl&quot;&gt;. For \<code>VIBER\\</code>, pass the ServiceId.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1952************</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static FlowBindPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        FlowBindPhoneRequest self = new FlowBindPhoneRequest();
        return TeaModel.build(map, self);
    }

    public FlowBindPhoneRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public FlowBindPhoneRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public FlowBindPhoneRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public FlowBindPhoneRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public FlowBindPhoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FlowBindPhoneRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public FlowBindPhoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FlowBindPhoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FlowBindPhoneRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

}
