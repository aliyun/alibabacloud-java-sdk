// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Contacts")
    public DescribeContactListResponseBodyContacts contacts;

    public static DescribeContactListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListResponseBody self = new DescribeContactListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeContactListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContactListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContactListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeContactListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContactListResponseBody setContacts(DescribeContactListResponseBodyContacts contacts) {
        this.contacts = contacts;
        return this;
    }
    public DescribeContactListResponseBodyContacts getContacts() {
        return this.contacts;
    }

    public static class DescribeContactListResponseBodyContactsContactContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<String> contactGroup;

        public static DescribeContactListResponseBodyContactsContactContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContactContactGroups self = new DescribeContactListResponseBodyContactsContactContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeContactListResponseBodyContactsContactContactGroups setContactGroup(java.util.List<String> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DescribeContactListResponseBodyContactsContactChannels extends TeaModel {
        @NameInMap("Mail")
        public String mail;

        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        @NameInMap("SMS")
        public String SMS;

        public static DescribeContactListResponseBodyContactsContactChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContactChannels self = new DescribeContactListResponseBodyContactsContactChannels();
            return TeaModel.build(map, self);
        }

        public DescribeContactListResponseBodyContactsContactChannels setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public DescribeContactListResponseBodyContactsContactChannels setAliIM(String aliIM) {
            this.aliIM = aliIM;
            return this;
        }
        public String getAliIM() {
            return this.aliIM;
        }

        public DescribeContactListResponseBodyContactsContactChannels setDingWebHook(String dingWebHook) {
            this.dingWebHook = dingWebHook;
            return this;
        }
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        public DescribeContactListResponseBodyContactsContactChannels setSMS(String SMS) {
            this.SMS = SMS;
            return this;
        }
        public String getSMS() {
            return this.SMS;
        }

    }

    public static class DescribeContactListResponseBodyContactsContactChannelsState extends TeaModel {
        @NameInMap("Mail")
        public String mail;

        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        @NameInMap("SMS")
        public String SMS;

        public static DescribeContactListResponseBodyContactsContactChannelsState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContactChannelsState self = new DescribeContactListResponseBodyContactsContactChannelsState();
            return TeaModel.build(map, self);
        }

        public DescribeContactListResponseBodyContactsContactChannelsState setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public DescribeContactListResponseBodyContactsContactChannelsState setAliIM(String aliIM) {
            this.aliIM = aliIM;
            return this;
        }
        public String getAliIM() {
            return this.aliIM;
        }

        public DescribeContactListResponseBodyContactsContactChannelsState setDingWebHook(String dingWebHook) {
            this.dingWebHook = dingWebHook;
            return this;
        }
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        public DescribeContactListResponseBodyContactsContactChannelsState setSMS(String SMS) {
            this.SMS = SMS;
            return this;
        }
        public String getSMS() {
            return this.SMS;
        }

    }

    public static class DescribeContactListResponseBodyContactsContact extends TeaModel {
        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("ContactGroups")
        public DescribeContactListResponseBodyContactsContactContactGroups contactGroups;

        @NameInMap("Channels")
        public DescribeContactListResponseBodyContactsContactChannels channels;

        @NameInMap("ChannelsState")
        public DescribeContactListResponseBodyContactsContactChannelsState channelsState;

        public static DescribeContactListResponseBodyContactsContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContact self = new DescribeContactListResponseBodyContactsContact();
            return TeaModel.build(map, self);
        }

        public DescribeContactListResponseBodyContactsContact setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeContactListResponseBodyContactsContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContactListResponseBodyContactsContact setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeContactListResponseBodyContactsContact setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeContactListResponseBodyContactsContact setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeContactListResponseBodyContactsContact setContactGroups(DescribeContactListResponseBodyContactsContactContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DescribeContactListResponseBodyContactsContactContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DescribeContactListResponseBodyContactsContact setChannels(DescribeContactListResponseBodyContactsContactChannels channels) {
            this.channels = channels;
            return this;
        }
        public DescribeContactListResponseBodyContactsContactChannels getChannels() {
            return this.channels;
        }

        public DescribeContactListResponseBodyContactsContact setChannelsState(DescribeContactListResponseBodyContactsContactChannelsState channelsState) {
            this.channelsState = channelsState;
            return this;
        }
        public DescribeContactListResponseBodyContactsContactChannelsState getChannelsState() {
            return this.channelsState;
        }

    }

    public static class DescribeContactListResponseBodyContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<DescribeContactListResponseBodyContactsContact> contact;

        public static DescribeContactListResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContacts self = new DescribeContactListResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public DescribeContactListResponseBodyContacts setContact(java.util.List<DescribeContactListResponseBodyContactsContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<DescribeContactListResponseBodyContactsContact> getContact() {
            return this.contact;
        }

    }

}
