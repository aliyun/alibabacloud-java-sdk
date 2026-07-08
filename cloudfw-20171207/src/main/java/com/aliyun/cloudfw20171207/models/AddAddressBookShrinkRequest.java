// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookShrinkRequest extends TeaModel {
    /**
     * <p>The ACK cluster connector ID. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Lists ACK cluster connectors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ac-7c1bad6c3cc84c33baab1</p>
     */
    @NameInMap("AckClusterConnectorId")
    public String ackClusterConnectorId;

    /**
     * <p>The list of ACK cluster pod labels.</p>
     * <blockquote>
     * <p>A maximum of 10 labels are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckLabels")
    public java.util.List<AddAddressBookShrinkRequestAckLabels> ackLabels;

    /**
     * <p>The list of ACK cluster pod namespaces.</p>
     * <blockquote>
     * <p>A maximum of 10 namespaces are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The addresses in the address book. Separate multiple addresses with commas (,). Use a space to separate an address from its description within a single address element.</p>
     * <blockquote>
     * <p>This parameter is required when GroupType is set to <code>ip</code>, <code>port</code>, or <code>domain</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p>When GroupType is set to <code>ip</code>, enter IP addresses in the address list. Example: 192.0.XX.XX/32 Development CIDR block,10.0.0.X/24,192.0.XX.XX/24 Test CIDR block.</p>
     * </li>
     * <li><p>When GroupType is set to <code>port</code>, enter ports or port ranges in the address list. Example: 80 HTTP port,100/200,3306 Database port.</p>
     * </li>
     * <li><p>When GroupType is set to <code>domain</code>, enter domain names in the address list. Example: example.com Test domain name,aliyundoc.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32 ,192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>The list of member accounts for the asset address book.</p>
     */
    @NameInMap("AssetMemberUids")
    public String assetMemberUidsShrink;

    /**
     * <p>The list of regions and resource types for the asset address book.</p>
     */
    @NameInMap("AssetRegionResourceTypes")
    public String assetRegionResourceTypesShrink;

    /**
     * <p>Indicates whether to automatically add the public IP addresses of Elastic Compute Service (ECS) instances that match the specified tags to the address book.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    /**
     * <p>The description of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sz-001</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sz-001</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The language type of the address book description.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The ECS tag list.</p>
     */
    @NameInMap("TagList")
    public java.util.List<AddAddressBookShrinkRequestTagList> tagList;

    /**
     * <p>The logical relationship among multiple ECS tags to match.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static AddAddressBookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookShrinkRequest self = new AddAddressBookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressBookShrinkRequest setAckClusterConnectorId(String ackClusterConnectorId) {
        this.ackClusterConnectorId = ackClusterConnectorId;
        return this;
    }
    public String getAckClusterConnectorId() {
        return this.ackClusterConnectorId;
    }

    public AddAddressBookShrinkRequest setAckLabels(java.util.List<AddAddressBookShrinkRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<AddAddressBookShrinkRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public AddAddressBookShrinkRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public AddAddressBookShrinkRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public AddAddressBookShrinkRequest setAssetMemberUidsShrink(String assetMemberUidsShrink) {
        this.assetMemberUidsShrink = assetMemberUidsShrink;
        return this;
    }
    public String getAssetMemberUidsShrink() {
        return this.assetMemberUidsShrink;
    }

    public AddAddressBookShrinkRequest setAssetRegionResourceTypesShrink(String assetRegionResourceTypesShrink) {
        this.assetRegionResourceTypesShrink = assetRegionResourceTypesShrink;
        return this;
    }
    public String getAssetRegionResourceTypesShrink() {
        return this.assetRegionResourceTypesShrink;
    }

    public AddAddressBookShrinkRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public AddAddressBookShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddAddressBookShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddAddressBookShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public AddAddressBookShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    @Deprecated
    public AddAddressBookShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddAddressBookShrinkRequest setTagList(java.util.List<AddAddressBookShrinkRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<AddAddressBookShrinkRequestTagList> getTagList() {
        return this.tagList;
    }

    public AddAddressBookShrinkRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class AddAddressBookShrinkRequestAckLabels extends TeaModel {
        /**
         * <p>The key of the ACK cluster pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the ACK cluster pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddAddressBookShrinkRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookShrinkRequestAckLabels self = new AddAddressBookShrinkRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public AddAddressBookShrinkRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAddressBookShrinkRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddAddressBookShrinkRequestTagList extends TeaModel {
        /**
         * <p>The key of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TXY</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static AddAddressBookShrinkRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookShrinkRequestTagList self = new AddAddressBookShrinkRequestTagList();
            return TeaModel.build(map, self);
        }

        public AddAddressBookShrinkRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public AddAddressBookShrinkRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
