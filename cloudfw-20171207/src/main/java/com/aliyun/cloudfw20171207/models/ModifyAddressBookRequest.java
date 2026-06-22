// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookRequest extends TeaModel {
    /**
     * <p>The list of ACK cluster pod labels.</p>
     * <blockquote>
     * <p>Maximum of 10 entries.</p>
     * </blockquote>
     */
    @NameInMap("AckLabels")
    public java.util.List<ModifyAddressBookRequestAckLabels> ackLabels;

    /**
     * <p>The list of ACK cluster pod namespaces.</p>
     * <blockquote>
     * <p>Maximum of 10 entries.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The list of addresses in the address book. Multiple addresses are separated by commas, and each address element uses a space to separate the address from its description. You must configure this parameter when GroupType is <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>.</p>
     * <ul>
     * <li><p>When GroupType is <strong>ip</strong>, enter IP addresses in the address list. Example: 1.2.XX.XX/32 Development network segment, 10.0.0.X/24,1.2.XX.XX/24 Test network segment.</p>
     * </li>
     * <li><p>When GroupType is <strong>port</strong>, enter ports or port ranges in the address list. Example: 80/80 HTTP port, 100/200,3306 Database port.</p>
     * </li>
     * <li><p>When GroupType is <strong>domain</strong>, enter domain names in the address list. Example: demo1.aliyun.com Test domain, demo2.aliyun.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32 ,192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>Specifies whether to automatically add the public IP addresses of ECS instances that match new tags to the address book.</p>
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
     * <p>bj-001</p>
     */
    @NameInMap("Description")
    public String description;

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
     * <p>The unique ID of the address book.</p>
     * <blockquote>
     * <p>Value source: <a href="~~DescribeAddressBook~~">Query Address Book List</a>.</p>
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
     * <p>The modification method.</p>
     * <blockquote>
     * <p>When GroupType is <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong>, and this parameter is not configured, the address book is modified using the <strong>Cover</strong> method by default.
     * Notice: When GroupType is <strong>tag</strong>, this parameter must be empty.</p>
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
    public java.util.List<ModifyAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relationship among multiple ECS tags.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static ModifyAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookRequest self = new ModifyAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookRequest setAckLabels(java.util.List<ModifyAddressBookRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public ModifyAddressBookRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public ModifyAddressBookRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public ModifyAddressBookRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public ModifyAddressBookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAddressBookRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyAddressBookRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public ModifyAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAddressBookRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    @Deprecated
    public ModifyAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAddressBookRequest setTagList(java.util.List<ModifyAddressBookRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestTagList> getTagList() {
        return this.tagList;
    }

    public ModifyAddressBookRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class ModifyAddressBookRequestAckLabels extends TeaModel {
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

        public static ModifyAddressBookRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAckLabels self = new ModifyAddressBookRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAddressBookRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyAddressBookRequestTagList extends TeaModel {
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

        public static ModifyAddressBookRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestTagList self = new ModifyAddressBookRequestTagList();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ModifyAddressBookRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
