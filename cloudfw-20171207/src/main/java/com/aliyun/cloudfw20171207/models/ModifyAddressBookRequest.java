// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookRequest extends TeaModel {
    /**
     * <p>The addresses in the address book. Separate multiple addresses with commas (,). If you set GroupType to <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>, you must specify this parameter.</p>
     * <ul>
     * <li>If you set GroupType to <strong>ip</strong>, you must specify IP addresses for the address book. Example: 1.2.XX.XX/32,1.2.XX.XX/24.</li>
     * <li>If you set GroupType to <strong>port</strong>, you must specify port numbers or port ranges for the address book. Example: 80/80,100/200.</li>
     * <li>If you set GroupType to <strong>domain</strong>, you must specify domain names for the address book. Example: demo1.aliyun.com,demo2.aliyun.com.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32, 192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>Specifies whether to automatically add public IP addresses of Elastic Compute Service (ECS) instances to the address book if the instances match the specified tags. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong>: no</li>
     * </ul>
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
     * <p>The ID of the address book.</p>
     * <blockquote>
     * <p> To modify the address book, you must provide the ID of the address book. You can call the <a href="https://help.aliyun.com/document_detail/138869.html">DescribeAddressBook</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Modification mode with the following values:</p>
     * <ul>
     * <li><strong>Cover</strong>: Use the value of the AddressList parameter to overwrite the original address book.</li>
     * <li><strong>Append</strong>: After the original address book, append addresses using the value of the AddressList parameter.</li>
     * <li><strong>Delete</strong>: Delete addresses using the value of the AddressList parameter from the address book.</li>
     * </ul>
     * <blockquote>
     * <p>When GroupType is <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong>, if this parameter is not configured, the default is to use the <strong>Cover</strong> method to modify the address book.
     * Notice: When GroupType is <strong>tag</strong>, this parameter must be empty.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

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
     * <p>The ECS tags that you want to match.</p>
     */
    @NameInMap("TagList")
    public java.util.List<ModifyAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relationship among ECS tags. Valid values:</p>
     * <ul>
     * <li><strong>and</strong>: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
     * <li><strong>or</strong>: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.</li>
     * </ul>
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

    public static class ModifyAddressBookRequestTagList extends TeaModel {
        /**
         * <p>The key of ECS tag N that you want to match.</p>
         * 
         * <strong>example:</strong>
         * <p>TXY</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of ECS tag N that you want to match.</p>
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
