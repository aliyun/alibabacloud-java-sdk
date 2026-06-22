// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookRequest extends TeaModel {
    /**
     * <p>The ACK cluster connector ID. You can obtain the value from:</p>
     * <ul>
     * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: queries a list of ACK cluster connectors.</li>
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
    public java.util.List<AddAddressBookRequestAckLabels> ackLabels;

    /**
     * <p>The list of ACK cluster pod namespaces.</p>
     * <blockquote>
     * <p>A maximum of 10 namespaces are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The address list of the address book. Multiple addresses are separated by commas, and within each address element, the address and its description are separated by a space.</p>
     * <blockquote>
     * <p>This parameter is required when GroupType is set to <code>ip</code>, <code>port</code>, or <code>domain</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p>When GroupType is set to <code>ip</code>, enter IP addresses in the address list. Example: 192.0.XX.XX/32 development network segment, 10.0.0.X/24,192.0.XX.XX/24 test network segment.</p>
     * </li>
     * <li><p>When GroupType is set to <code>port</code>, enter ports or port ranges in the address list. Example: 80 HTTP port, 100/200,3306 database port.</p>
     * </li>
     * <li><p>When GroupType is set to <code>domain</code>, enter domain names in the address list. Example: example.com test domain, aliyundoc.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
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
    public java.util.List<AddAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relationship among multiple ECS tags to be matched.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static AddAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookRequest self = new AddAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressBookRequest setAckClusterConnectorId(String ackClusterConnectorId) {
        this.ackClusterConnectorId = ackClusterConnectorId;
        return this;
    }
    public String getAckClusterConnectorId() {
        return this.ackClusterConnectorId;
    }

    public AddAddressBookRequest setAckLabels(java.util.List<AddAddressBookRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<AddAddressBookRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public AddAddressBookRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public AddAddressBookRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public AddAddressBookRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public AddAddressBookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddAddressBookRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddAddressBookRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public AddAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    @Deprecated
    public AddAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddAddressBookRequest setTagList(java.util.List<AddAddressBookRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<AddAddressBookRequestTagList> getTagList() {
        return this.tagList;
    }

    public AddAddressBookRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class AddAddressBookRequestAckLabels extends TeaModel {
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

        public static AddAddressBookRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAckLabels self = new AddAddressBookRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAddressBookRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddAddressBookRequestTagList extends TeaModel {
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

        public static AddAddressBookRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestTagList self = new AddAddressBookRequestTagList();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public AddAddressBookRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
