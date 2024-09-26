// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The alert contacts.</p>
     */
    @NameInMap("Contacts")
    public DescribeContactListResponseBodyContacts contacts;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The Request is not authorization.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>06D5ECC2-B9BE-42A4-8FA3-1A610FB08B83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
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
         * <p>The TradeManager ID of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=9bf44f8189597d07dfdd7a123455ffc112">https://oapi.dingtalk.com/robot/send?access_token=9bf44f8189597d07dfdd7a123455ffc112</a>****</p>
         */
        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The email address of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The phone number of the alert contac.</p>
         * 
         * <strong>example:</strong>
         * <p>1333333****</p>
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
         * <p>The status of the TradeManager ID.</p>
         * <p>Valid value: OK. The value OK indicates that the TradeManager ID is valid and can receive alert notifications.</p>
         * <blockquote>
         * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("AliIM")
        public String aliIM;

        /**
         * <p>The status of the DingTalk chatbot.</p>
         * <p>Valid value: OK. The value OK indicates that the DingTalk chatbot is normal and alert notifications can be received in a DingTalk group.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("DingWebHook")
        public String dingWebHook;

        /**
         * <p>The status of the email address. Valid values:</p>
         * <ul>
         * <li>PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.</li>
         * <li>OK: The phone number is activated and can receive alert notifications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The status of the phone number. Valid values:</p>
         * <ul>
         * <li>PENDING: The phone number is not activated. Alert notifications can be sent to the phone number by using text messages only after the phone number is activated.</li>
         * <li>OK: The phone number is activated and can receive alert notifications.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter applies only to the Alibaba Cloud China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
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
         * <p>The alert notification method.</p>
         */
        @NameInMap("Channels")
        public DescribeContactListResponseBodyContactsContactChannels channels;

        /**
         * <p>The status of the alert notification method. Valid values: PENDING and OK.</p>
         * <p>The email address must be activated after it is added as the value specified for the alert notification method. The value PENDING indicates that the email address is not activated. The value OK indicates that the email address is activated.</p>
         */
        @NameInMap("ChannelsState")
        public DescribeContactListResponseBodyContactsContactChannelsState channelsState;

        /**
         * <p>None.</p>
         */
        @NameInMap("ContactGroups")
        public DescribeContactListResponseBodyContactsContactContactGroups contactGroups;

        /**
         * <p>The timestamp when the alert contact was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1552356159000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The language in which the alert information is displayed. Valid values:</p>
         * <ul>
         * <li>zh-cn: simplified Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-cn</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The timestamp when the alert contact was updated.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1552356159000</p>
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
