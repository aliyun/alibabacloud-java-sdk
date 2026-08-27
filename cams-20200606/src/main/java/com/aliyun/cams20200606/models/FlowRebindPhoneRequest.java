// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class FlowRebindPhoneRequest extends TeaModel {
    /**
     * <p>The message channel code, which is the channel ID. You can view the channel ID in the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> console.</p>
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
     * <p>The flow code. You can view this in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The flow version. In the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a> console, click the flow name to open the flow editor canvas and view the flow version.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowVersion")
    public String flowVersion;

    /**
     * <p>The multi-WABA binding configurations.</p>
     */
    @NameInMap("MultiWabaPhoneNumbers")
    public java.util.List<FlowRebindPhoneRequestMultiWabaPhoneNumbers> multiWabaPhoneNumbers;

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
     * <li><p>If ChannelType is set to WHATSAPP, specify the WABA account ID. You can view the WABA account ID in Channel Management &gt; Manage &gt; WABA Management.</p>
     * </li>
     * <li><p>If ChannelType is not set to WHATSAPP, specify the PageId for MESSENGER, the AccountId for INSTAGRAM&lt;props=&quot;intl&quot;&gt;, or the ServiceId for VIBER.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1952************</p>
     */
    @NameInMap("WabaId")
    public String wabaId;

    public static FlowRebindPhoneRequest build(java.util.Map<String, ?> map) throws Exception {
        FlowRebindPhoneRequest self = new FlowRebindPhoneRequest();
        return TeaModel.build(map, self);
    }

    public FlowRebindPhoneRequest setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public FlowRebindPhoneRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public FlowRebindPhoneRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public FlowRebindPhoneRequest setFlowVersion(String flowVersion) {
        this.flowVersion = flowVersion;
        return this;
    }
    public String getFlowVersion() {
        return this.flowVersion;
    }

    public FlowRebindPhoneRequest setMultiWabaPhoneNumbers(java.util.List<FlowRebindPhoneRequestMultiWabaPhoneNumbers> multiWabaPhoneNumbers) {
        this.multiWabaPhoneNumbers = multiWabaPhoneNumbers;
        return this;
    }
    public java.util.List<FlowRebindPhoneRequestMultiWabaPhoneNumbers> getMultiWabaPhoneNumbers() {
        return this.multiWabaPhoneNumbers;
    }

    public FlowRebindPhoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public FlowRebindPhoneRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public FlowRebindPhoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public FlowRebindPhoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public FlowRebindPhoneRequest setWabaId(String wabaId) {
        this.wabaId = wabaId;
        return this;
    }
    public String getWabaId() {
        return this.wabaId;
    }

    public static class FlowRebindPhoneRequestMultiWabaPhoneNumbers extends TeaModel {
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

        public static FlowRebindPhoneRequestMultiWabaPhoneNumbers build(java.util.Map<String, ?> map) throws Exception {
            FlowRebindPhoneRequestMultiWabaPhoneNumbers self = new FlowRebindPhoneRequestMultiWabaPhoneNumbers();
            return TeaModel.build(map, self);
        }

        public FlowRebindPhoneRequestMultiWabaPhoneNumbers setChannelCode(String channelCode) {
            this.channelCode = channelCode;
            return this;
        }
        public String getChannelCode() {
            return this.channelCode;
        }

        public FlowRebindPhoneRequestMultiWabaPhoneNumbers setPhoneNumbers(java.util.List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }
        public java.util.List<String> getPhoneNumbers() {
            return this.phoneNumbers;
        }

        public FlowRebindPhoneRequestMultiWabaPhoneNumbers setWabaId(String wabaId) {
            this.wabaId = wabaId;
            return this;
        }
        public String getWabaId() {
            return this.wabaId;
        }

    }

}
