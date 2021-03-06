// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("AddressList")
    public String addressList;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("GroupUuid")
    public String groupUuid;

    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    @NameInMap("TagRelation")
    public String tagRelation;

    @NameInMap("TagList")
    public java.util.List<ModifyAddressBookRequestTagList> tagList;

    public static ModifyAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookRequest self = new ModifyAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAddressBookRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
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

    public ModifyAddressBookRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public ModifyAddressBookRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public ModifyAddressBookRequest setTagList(java.util.List<ModifyAddressBookRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestTagList> getTagList() {
        return this.tagList;
    }

    public static class ModifyAddressBookRequestTagList extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("TagKey")
        public String tagKey;

        public static ModifyAddressBookRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestTagList self = new ModifyAddressBookRequestTagList();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ModifyAddressBookRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
