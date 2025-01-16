// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookRequest extends TeaModel {
    /**
     * <p>The addresses that you want to add to the address book. Separate multiple addresses with commas (,).</p>
     * <blockquote>
     * <p> If you set GroupType to <code>ip</code>, <code>port</code> or <code>domain</code>, you must specify AddressList.</p>
     * </blockquote>
     * <ul>
     * <li>If you set GroupType to <code>ip</code>, you must add IP addresses to the address book. Example: 192.0.XX.XX/32,192.0.XX.XX/24.</li>
     * <li>If you set GroupType to <code>port</code>, you must add port numbers or port ranges to the address book. Example: 80,100/200.</li>
     * <li>If you set GroupType to <code>domain</code>, you must add domain names to the address book. Example: example.com,aliyundoc.com.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32, 192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>Specifies whether to automatically add public IP addresses of ECS instances to the address book if the instances match the specified tags. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: yes</li>
     * <li><strong>0</strong> (default): no</li>
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
     * <p>The type of the address book. Valid values:</p>
     * <ul>
     * <li><strong>ip</strong>: IP address book</li>
     * <li><strong>domain</strong>: domain address book</li>
     * <li><strong>port</strong>: port address book</li>
     * <li><strong>tag</strong>: ECS tag-based address book</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
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
     * <p>The ECS tags that you want to match.</p>
     */
    @NameInMap("TagList")
    public java.util.List<AddAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relation among the ECS tags that you want to match. Valid values:</p>
     * <ul>
     * <li><strong>and</strong> (default): Only the public IP addresses of ECS instances that match all the specified tags can be added to the address book.</li>
     * <li><strong>or</strong>: The public IP addresses of ECS instances that match one of the specified tags can be added to the address book.</li>
     * </ul>
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
