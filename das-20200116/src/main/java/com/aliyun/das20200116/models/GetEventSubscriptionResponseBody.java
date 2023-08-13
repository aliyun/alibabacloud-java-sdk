// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventSubscriptionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetEventSubscriptionResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetEventSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEventSubscriptionResponseBody self = new GetEventSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEventSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEventSubscriptionResponseBody setData(GetEventSubscriptionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEventSubscriptionResponseBodyData getData() {
        return this.data;
    }

    public GetEventSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEventSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEventSubscriptionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetEventSubscriptionResponseBodyDataContactGroups extends TeaModel {
        /**
         * <p>The members of the alert contact group.</p>
         */
        @NameInMap("contacts")
        public String contacts;

        /**
         * <p>The description of the alert contact group.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetEventSubscriptionResponseBodyDataContactGroups build(java.util.Map<String, ?> map) throws Exception {
            GetEventSubscriptionResponseBodyDataContactGroups self = new GetEventSubscriptionResponseBodyDataContactGroups();
            return TeaModel.build(map, self);
        }

        public GetEventSubscriptionResponseBodyDataContactGroups setContacts(String contacts) {
            this.contacts = contacts;
            return this;
        }
        public String getContacts() {
            return this.contacts;
        }

        public GetEventSubscriptionResponseBodyDataContactGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEventSubscriptionResponseBodyDataContactGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEventSubscriptionResponseBodyDataContactGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetEventSubscriptionResponseBodyDataContacts extends TeaModel {
        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("dingtalkHook")
        public String dingtalkHook;

        /**
         * <p>The email address of the alert contact.</p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>The contact groups to which the alert contact belongs.</p>
         */
        @NameInMap("groups")
        public java.util.List<String> groups;

        /**
         * <p>Indicates whether the alert contact name is the same as the contact name on CloudMonitor.</p>
         * <br>
         * <p>* **true**</p>
         * <p>* **false**</p>
         */
        @NameInMap("isCmsReduplicated")
        public Boolean isCmsReduplicated;

        /**
         * <p>The name of the alert contact.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The mobile number of the alert contact.</p>
         */
        @NameInMap("phone")
        public String phone;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetEventSubscriptionResponseBodyDataContacts build(java.util.Map<String, ?> map) throws Exception {
            GetEventSubscriptionResponseBodyDataContacts self = new GetEventSubscriptionResponseBodyDataContacts();
            return TeaModel.build(map, self);
        }

        public GetEventSubscriptionResponseBodyDataContacts setDingtalkHook(String dingtalkHook) {
            this.dingtalkHook = dingtalkHook;
            return this;
        }
        public String getDingtalkHook() {
            return this.dingtalkHook;
        }

        public GetEventSubscriptionResponseBodyDataContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetEventSubscriptionResponseBodyDataContacts setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<String> getGroups() {
            return this.groups;
        }

        public GetEventSubscriptionResponseBodyDataContacts setIsCmsReduplicated(Boolean isCmsReduplicated) {
            this.isCmsReduplicated = isCmsReduplicated;
            return this;
        }
        public Boolean getIsCmsReduplicated() {
            return this.isCmsReduplicated;
        }

        public GetEventSubscriptionResponseBodyDataContacts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEventSubscriptionResponseBodyDataContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public GetEventSubscriptionResponseBodyDataContacts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetEventSubscriptionResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the event subscription feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: The event subscription feature is disabled.</p>
         * <p>*   **1**: The event subscription feature is enabled.</p>
         */
        @NameInMap("active")
        public Integer active;

        /**
         * <p>The notification method. Valid values:</p>
         * <br>
         * <p>*   **hdm_alarm_sms**: text message.</p>
         * <p>*   **dingtalk**: DingTalk chatbot.</p>
         * <p>*   **hdm_alarm_sms_and_email**: text message and email.</p>
         * <p>*   **hdm_alarm_sms,dingtalk**: text message and DingTalk chatbot.</p>
         */
        @NameInMap("channelType")
        public String channelType;

        /**
         * <p>The name of the contact group that receives alert notifications. Multiple names are separated by commas (,).</p>
         */
        @NameInMap("contactGroupName")
        public String contactGroupName;

        /**
         * <p>The alert contact groups.</p>
         */
        @NameInMap("contactGroups")
        public java.util.List<GetEventSubscriptionResponseBodyDataContactGroups> contactGroups;

        /**
         * <p>The name of the subscriber who receives alert notifications. Multiple names are separated by commas (,).</p>
         */
        @NameInMap("contactName")
        public String contactName;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("contacts")
        public java.util.List<GetEventSubscriptionResponseBodyDataContacts> contacts;

        /**
         * <p>The supported event scenarios. Only **AllContext** may be returned, which indicates that all scenarios are supported.</p>
         */
        @NameInMap("eventContext")
        public String eventContext;

        /**
         * <p>The supported event scenarios in which event subscription can be sent.</p>
         */
        @NameInMap("eventSendGroup")
        public java.util.List<String> eventSendGroup;

        /**
         * <p>The time when event subscription was enabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The time when the event subscription settings were most recently modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <p>The primary key ID of the database.</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>The language of event notifications. Only **zh-CN** may be returned, which indicates that event notifications are sent in Chinese.</p>
         */
        @NameInMap("lang")
        public String lang;

        /**
         * <p>The risk level of the events that trigger notifications. Valid values:</p>
         * <br>
         * <p>*   **Notice**</p>
         * <p>*   **Optimization**</p>
         * <p>*   **Warn**</p>
         * <p>*   **Critical**</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The minimum interval between event notifications. Unit: seconds.</p>
         */
        @NameInMap("minInterval")
        public String minInterval;

        /**
         * <p>The user ID.</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetEventSubscriptionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEventSubscriptionResponseBodyData self = new GetEventSubscriptionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEventSubscriptionResponseBodyData setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public GetEventSubscriptionResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public GetEventSubscriptionResponseBodyData setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public GetEventSubscriptionResponseBodyData setContactGroups(java.util.List<GetEventSubscriptionResponseBodyDataContactGroups> contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public java.util.List<GetEventSubscriptionResponseBodyDataContactGroups> getContactGroups() {
            return this.contactGroups;
        }

        public GetEventSubscriptionResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetEventSubscriptionResponseBodyData setContacts(java.util.List<GetEventSubscriptionResponseBodyDataContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<GetEventSubscriptionResponseBodyDataContacts> getContacts() {
            return this.contacts;
        }

        public GetEventSubscriptionResponseBodyData setEventContext(String eventContext) {
            this.eventContext = eventContext;
            return this;
        }
        public String getEventContext() {
            return this.eventContext;
        }

        public GetEventSubscriptionResponseBodyData setEventSendGroup(java.util.List<String> eventSendGroup) {
            this.eventSendGroup = eventSendGroup;
            return this;
        }
        public java.util.List<String> getEventSendGroup() {
            return this.eventSendGroup;
        }

        public GetEventSubscriptionResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEventSubscriptionResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetEventSubscriptionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetEventSubscriptionResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEventSubscriptionResponseBodyData setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public GetEventSubscriptionResponseBodyData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEventSubscriptionResponseBodyData setMinInterval(String minInterval) {
            this.minInterval = minInterval;
            return this;
        }
        public String getMinInterval() {
            return this.minInterval;
        }

        public GetEventSubscriptionResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
