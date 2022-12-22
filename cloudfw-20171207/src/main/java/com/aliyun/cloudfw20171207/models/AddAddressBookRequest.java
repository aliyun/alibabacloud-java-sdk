// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookRequest extends TeaModel {
    // The addresses that you want to add to the address book. Separate multiple addresses with commas (,).
    // 
    // > If you set GroupType to `ip`, `port` or `domain`, you must specify the AddressList parameter.
    // >
    // > * If you set GroupType to `ip`, you must add IP addresses to the address book. Example: 192.0.XX.XX/32, 192.0.XX.XX/24.
    // > * If you set GroupType to `port`, you must add port numbers or port ranges to the address book. Example: 80, 100/200.
    // > * If you set GroupType to `domain`, you must add domain names to the address book. Example: example.com, aliyundoc.com.
    @NameInMap("AddressList")
    public String addressList;

    // Specifies whether to automatically add public IP addresses of ECS instances to the address book if the instances match the specified tags. Valid values:
    // 
    // *   **1**: yes
    // *   **0**: no (default)
    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    // The description of the address book.
    @NameInMap("Description")
    public String description;

    // The name of the address book.
    @NameInMap("GroupName")
    public String groupName;

    // The type of the address book. Valid values:
    // 
    // * **ip**: IP address book
    // * **domain**: domain address book
    // * **port**: port address book
    // * **tag**: ECS tag-based address book
    @NameInMap("GroupType")
    public String groupType;

    // The language of the content within the response. Valid values:
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
    public java.util.List<AddAddressBookRequestTagList> tagList;

    // The logical relation among the ECS tags that you want to match. Valid values:
    // 
    // *   **and**: Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book. This is the default value.
    // *   **or**: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.
    @NameInMap("TagRelation")
    public String tagRelation;

    public static AddAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookRequest self = new AddAddressBookRequest();
        return TeaModel.build(map, self);
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

    public static class AddAddressBookRequestTagList extends TeaModel {
        // The key of the tag.
        @NameInMap("TagKey")
        public String tagKey;

        // The value of the tag.
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
