// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookShrinkRequest extends TeaModel {
    /**
     * <p>The list of pod labels in the ACK cluster.</p>
     * <blockquote>
     * <p>A maximum of 10 labels are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckLabels")
    public java.util.List<ModifyAddressBookShrinkRequestAckLabels> ackLabels;

    /**
     * <p>The list of pod namespaces in the ACK cluster.</p>
     * <blockquote>
     * <p>A maximum of 10 namespaces are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The list of addresses in the address book. Separate multiple addresses with commas (,). For each address element, separate the address and the description with a space. You must specify this parameter when GroupType is set to <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>.</p>
     * <ul>
     * <li><p>If GroupType is set to <strong>ip</strong>, enter IP addresses in the address list. Example: 1.2.XX.XX/32 Development CIDR block,10.0.0.X/24,1.2.XX.XX/24 Test CIDR block.</p>
     * </li>
     * <li><p>If GroupType is set to <strong>port</strong>, enter ports or port ranges in the address list. Example: 80/80 HTTP port,100/200,3306 Database port.</p>
     * </li>
     * <li><p>If GroupType is set to <strong>domain</strong>, enter domain names in the address list. Example: demo1.aliyun.com Test domain name,demo2.aliyun.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32 ,192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>The list of member accounts in the asset address book.</p>
     */
    @NameInMap("AssetMemberUids")
    public String assetMemberUidsShrink;

    /**
     * <p>The asset address book, region, and resource type list.</p>
     */
    @NameInMap("AssetRegionResourceTypes")
    public String assetRegionResourceTypesShrink;

    /**
     * <p>Specifies if the automatic addition of the public IP addresses of Elastic Compute Service (ECS) instances that match the new labels to the address book is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>ddadxefexxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bj-001</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The dry run mode.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The name of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bj-001</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The UUID of the address book.</p>
     * <blockquote>
     * <p>To obtain the value, call the <a href="~~DescribeAddressBook~~">DescribeAddressBook</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The modification mode.</p>
     * <blockquote>
     * <p>If GroupType is set to <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong> and this parameter is not specified, the <strong>Cover</strong> mode is used by default to modify the address book.
     * Notice: If GroupType is set to <strong>tag</strong>, this parameter must be left empty.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    /**
     * <p>The source IP address of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The list of ECS tags.</p>
     */
    @NameInMap("TagList")
    public java.util.List<ModifyAddressBookShrinkRequestTagList> tagList;

    /**
     * <p>The relationship between multiple ECS tags.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static ModifyAddressBookShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookShrinkRequest self = new ModifyAddressBookShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookShrinkRequest setAckLabels(java.util.List<ModifyAddressBookShrinkRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<ModifyAddressBookShrinkRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public ModifyAddressBookShrinkRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public ModifyAddressBookShrinkRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public ModifyAddressBookShrinkRequest setAssetMemberUidsShrink(String assetMemberUidsShrink) {
        this.assetMemberUidsShrink = assetMemberUidsShrink;
        return this;
    }
    public String getAssetMemberUidsShrink() {
        return this.assetMemberUidsShrink;
    }

    public ModifyAddressBookShrinkRequest setAssetRegionResourceTypesShrink(String assetRegionResourceTypesShrink) {
        this.assetRegionResourceTypesShrink = assetRegionResourceTypesShrink;
        return this;
    }
    public String getAssetRegionResourceTypesShrink() {
        return this.assetRegionResourceTypesShrink;
    }

    public ModifyAddressBookShrinkRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public ModifyAddressBookShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyAddressBookShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAddressBookShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ModifyAddressBookShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyAddressBookShrinkRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public ModifyAddressBookShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAddressBookShrinkRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    @Deprecated
    public ModifyAddressBookShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAddressBookShrinkRequest setTagList(java.util.List<ModifyAddressBookShrinkRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ModifyAddressBookShrinkRequestTagList> getTagList() {
        return this.tagList;
    }

    public ModifyAddressBookShrinkRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class ModifyAddressBookShrinkRequestAckLabels extends TeaModel {
        /**
         * <p>The key of the pod label in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the pod label in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyAddressBookShrinkRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookShrinkRequestAckLabels self = new ModifyAddressBookShrinkRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookShrinkRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAddressBookShrinkRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyAddressBookShrinkRequestTagList extends TeaModel {
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

        public static ModifyAddressBookShrinkRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookShrinkRequestTagList self = new ModifyAddressBookShrinkRequestTagList();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookShrinkRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ModifyAddressBookShrinkRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
