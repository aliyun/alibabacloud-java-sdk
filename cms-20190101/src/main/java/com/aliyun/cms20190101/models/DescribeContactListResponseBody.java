// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponseBody extends TeaModel {
    /**
     * <p>The description of the alert contact.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The status of the phone number. Valid values:</p>
     * <br>
     * <p>*   PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.</p>
     * <p>*   OK: The phone number is activated and can receive alert notifications.</p>
     * <br>
     * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
     */
    @NameInMap("Contacts")
    public DescribeContactListResponseBodyContacts contacts;

    /**
     * <p>The language in which the alert information is displayed. Valid values:</p>
     * <br>
     * <p>*   zh-cn: simplified Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The TradeManager ID of the alert contact.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("Total")
    public Integer total;

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

    public DescribeContactListResponseBody setContacts(DescribeContactListResponseBodyContacts contacts) {
        this.contacts = contacts;
        return this;
    }
    public DescribeContactListResponseBodyContacts getContacts() {
        return this.contacts;
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

    public DescribeContactListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContactListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeContactListResponseBodyContactsContactChannels extends TeaModel {
        /**
         * <p>The alert notification method. Valid values:</p>
         * <br>
         * <p>*   Mail: emails</p>
         * <p>*   DingWebHook: DingTalk chatbots</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        /**
         * <p>The timestamp when the alert contact was updated.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The alert contact groups.</p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("SMS")
        public String SMS;

        public static DescribeContactListResponseBodyContactsContactChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContactChannels self = new DescribeContactListResponseBodyContactsContactChannels();
            return TeaModel.build(map, self);
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

        public DescribeContactListResponseBodyContactsContactChannels setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
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
        /**
         * <p>Queries alert contacts.</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The status of the DingTalk chatbot.</p>
         * <br>
         * <p>Valid value: OK. The value OK indicates that the DingTalk chatbot is normal and alert notifications can be received in a DingTalk group.</p>
         */
        @NameInMap("Mail")
        public String mail;

        @NameInMap("SMS")
        public String SMS;

        public static DescribeContactListResponseBodyContactsContactChannelsState build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContactChannelsState self = new DescribeContactListResponseBodyContactsContactChannelsState();
            return TeaModel.build(map, self);
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

        public DescribeContactListResponseBodyContactsContactChannelsState setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public DescribeContactListResponseBodyContactsContactChannelsState setSMS(String SMS) {
            this.SMS = SMS;
            return this;
        }
        public String getSMS() {
            return this.SMS;
        }

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

    public static class DescribeContactListResponseBodyContactsContact extends TeaModel {
        /**
         * <p>The status of the email address. Valid values:</p>
         * <br>
         * <p>*   PENDING: The email address is not activated. Alert notifications can be sent to the email address only after the email address is activated.</p>
         * <p>*   OK: The email address is activated and can receive alert notifications.</p>
         */
        @NameInMap("Channels")
        public DescribeContactListResponseBodyContactsContactChannels channels;

        /**
         * <p>The status of the alert notification method. Valid values: PENDING and OK.</p>
         * <br>
         * <p>The email address must be activated after it is added as the value specified for the alert notification method. The value PENDING indicates that the email address is not activated. The value OK indicates that the email address is activated.</p>
         */
        @NameInMap("ChannelsState")
        public DescribeContactListResponseBodyContactsContactChannelsState channelsState;

        /**
         * <p>The alert notification method.</p>
         */
        @NameInMap("ContactGroups")
        public DescribeContactListResponseBodyContactsContactContactGroups contactGroups;

        /**
         * <p>The name of the alert contact.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The alert contacts.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The timestamp when the alert contact was created.</p>
         * <br>
         * <p>Unit: milliseconds.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The number of the page to return.</p>
         * <br>
         * <p>Default value: 1.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The email address of the alert contact.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeContactListResponseBodyContactsContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactListResponseBodyContactsContact self = new DescribeContactListResponseBodyContactsContact();
            return TeaModel.build(map, self);
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

        public DescribeContactListResponseBodyContactsContact setContactGroups(DescribeContactListResponseBodyContactsContactContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DescribeContactListResponseBodyContactsContactContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DescribeContactListResponseBodyContactsContact setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeContactListResponseBodyContactsContact setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeContactListResponseBodyContactsContact setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public DescribeContactListResponseBodyContactsContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContactListResponseBodyContactsContact setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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
