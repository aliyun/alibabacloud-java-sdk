// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupResponseBody extends TeaModel {
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
     * <p>The alert contacts that receive alert notifications.</p>
     */
    @NameInMap("Contacts")
    public DescribeContactListByContactGroupResponseBodyContacts contacts;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>The group is not exists.</p>
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
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The TradeManager ID of the alert contact.</p>
         * <blockquote>
         * <p> This parameter can be returned only on the China site (aliyun.com).</p>
         * </blockquote>
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
         * <p><a href="mailto:alice@example.com">alice@example.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <p>The mobile number of the alert contact.</p>
         * <blockquote>
         * <p> This parameter can be returned only on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1333333****</p>
         */
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
        /**
         * <p>The alert notification methods.</p>
         */
        @NameInMap("Channels")
        public DescribeContactListByContactGroupResponseBodyContactsContactChannels channels;

        /**
         * <p>The time when the alert contact was created.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1552314252000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The name of the alert contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Alice</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the alert contact was modified.</p>
         * <p>Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1552314252000</p>
         */
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
