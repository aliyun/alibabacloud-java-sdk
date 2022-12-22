// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookRequest extends TeaModel {
    // The addresses in the address book. Separate multiple addresses with commas (,). If you set GroupType to **ip**, **port**, or **domain**, you must specify this parameter.
    // 
    // *   If you set GroupType to **ip**, you must specify IP addresses for the address book. Example: 1.2.XX.XX/32,1.2.XX.XX/24.
    // *   If you set GroupType to **port**, you must specify port numbers or port ranges for the address book. Example: 80/80,100/200.
    // *   If you set GroupType to **domain**, you must specify domain names for the address book. Example: demo1.aliyun.com,demo2.aliyun.com.
    @NameInMap("AddressList")
    public String addressList;

    // Specifies whether to automatically add public IP addresses of Elastic Compute Service (ECS) instances to the address book if the instances match the specified tags. Valid values:
    // 
    // *   **1**: yes
    // *   **0**: no
    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    // The description of the address book.
    @NameInMap("Description")
    public String description;

    // The name of the address book.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the address book.
    // 
    // >  To modify the address book, you must provide the ID of the address book. You can call the [DescribeAddressBook](~~138869~~) operation to query the ID.
    @NameInMap("GroupUuid")
    public String groupUuid;

    // The language of the content within the request and response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ECS tags that you want to match.
    @NameInMap("TagList")
    public java.util.List<ModifyAddressBookRequestTagList> tagList;

    // The logical relationship among ECS tags. Valid values:
    // 
    // *   **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.
    // *   **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.
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
        // The key of ECS tag N that you want to match.
        @NameInMap("TagKey")
        public String tagKey;

        // The value of ECS tag N that you want to match.
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
