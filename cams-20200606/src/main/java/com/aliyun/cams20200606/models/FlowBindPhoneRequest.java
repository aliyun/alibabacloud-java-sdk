// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowBindPhoneRequest extends TeaModel {
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
    public java.util.List<FlowBindPhoneRequestMultiWabaPhoneNumbers> multiWabaPhoneNumbers;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The list of phone numbers, PageIds, or AccountIds&lt;props=&quot;intl&quot;&gt;, or ServiceIds under the channel instance.</p>
     */
    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

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

    public FlowBindPhoneRequest setMultiWabaPhoneNumbers(java.util.List<FlowBindPhoneRequestMultiWabaPhoneNumbers> multiWabaPhoneNumbers) {
        this.multiWabaPhoneNumbers = multiWabaPhoneNumbers;
        return this;
    }
    public java.util.List<FlowBindPhoneRequestMultiWabaPhoneNumbers> getMultiWabaPhoneNumbers() {
        return this.multiWabaPhoneNumbers;
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

    public static class FlowBindPhoneRequestMultiWabaPhoneNumbers extends TeaModel {
        /**
         * <p>The channel code.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ChannelCode")
        public String channelCode;

        /**
         * <p>The list of phone numbers.</p>
         */
        @NameInMap("PhoneNumbers")
        public java.util.List<String> phoneNumbers;

        /**
         * <p>wabaId</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("WabaId")
        public String wabaId;

        public static FlowBindPhoneRequestMultiWabaPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            FlowBindPhoneRequestMultiWabaPhoneNumbers self = new FlowBindPhoneRequestMultiWabaPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public FlowBindPhoneRequestMultiWabaPhoneNumbers setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public FlowBindPhoneRequestMultiWabaPhoneNumbers setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public FlowBindPhoneRequestMultiWabaPhoneNumbers setWabaId(String wabaId) {
            this.wabaId = wabaId;
            return this;
        }
        public String getWabaId() {
            return this.wabaId;
        }

    }

}
