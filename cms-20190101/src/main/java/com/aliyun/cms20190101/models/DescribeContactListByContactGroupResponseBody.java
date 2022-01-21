// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Contacts")
    public DescribeContactListByContactGroupResponseBodyContacts contacts;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeContactListByContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListByContactGroupResponseBody self = new DescribeContactListByContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactListByContactGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeContactListByContactGroupResponseBody setContacts(DescribeContactListByContactGroupResponseBodyContacts contacts) {
        this.contacts = contacts;
        return this;
    }
    public DescribeContactListByContactGroupResponseBodyContacts getContacts() {
        return this.contacts;
    }

    public DescribeContactListByContactGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContactListByContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContactListByContactGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeContactListByContactGroupResponseBodyContactsContactChannels extends TeaModel {
        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        @NameInMap("Mail")
        public String mail;

        @NameInMap("SMS")
        public String SMS;

        public static DescribeContactListByContactGroupResponseBodyContactsContactChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseBodyContactsContactChannels self = new DescribeContactListByContactGroupResponseBodyContactsContactChannels();
            return TeaModel.build(map, self);
        }

        public DescribeContactListByContactGroupResponseBodyContactsContactChannels setAliIM(String aliIM) {
            this.aliIM = aliIM;
            return this;
        }
        public String getAliIM() {
            return this.aliIM;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContactChannels setDingWebHook(String dingWebHook) {
            this.dingWebHook = dingWebHook;
            return this;
        }
        public String getDingWebHook() {
            return this.dingWebHook;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContactChannels setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContactChannels setSMS(String SMS) {
            this.SMS = SMS;
            return this;
        }
        public String getSMS() {
            return this.SMS;
        }

    }

    public static class DescribeContactListByContactGroupResponseBodyContactsContact extends TeaModel {
        @NameInMap("Channels")
        public DescribeContactListByContactGroupResponseBodyContactsContactChannels channels;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Name")
        public String name;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeContactListByContactGroupResponseBodyContactsContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseBodyContactsContact self = new DescribeContactListByContactGroupResponseBodyContactsContact();
            return TeaModel.build(map, self);
        }

        public DescribeContactListByContactGroupResponseBodyContactsContact setChannels(DescribeContactListByContactGroupResponseBodyContactsContactChannels channels) {
            this.channels = channels;
            return this;
        }
        public DescribeContactListByContactGroupResponseBodyContactsContactChannels getChannels() {
            return this.channels;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContact setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContact setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContactListByContactGroupResponseBodyContactsContact setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeContactListByContactGroupResponseBodyContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<DescribeContactListByContactGroupResponseBodyContactsContact> contact;

        public static DescribeContactListByContactGroupResponseBodyContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListByContactGroupResponseBodyContacts self = new DescribeContactListByContactGroupResponseBodyContacts();
            return TeaModel.build(map, self);
        }

        public DescribeContactListByContactGroupResponseBodyContacts setContact(java.util.List<DescribeContactListByContactGroupResponseBodyContactsContact> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<DescribeContactListByContactGroupResponseBodyContactsContact> getContact() {
            return this.contact;
        }

    }

}
