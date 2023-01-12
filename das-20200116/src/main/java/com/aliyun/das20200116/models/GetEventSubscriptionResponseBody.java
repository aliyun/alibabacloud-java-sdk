// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEventSubscriptionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEventSubscriptionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("contacts")
        public String contacts;

        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

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
        @NameInMap("dingtalkHook")
        public String dingtalkHook;

        @NameInMap("email")
        public String email;

        @NameInMap("groups")
        public java.util.List<String> groups;

        @NameInMap("isCmsReduplicated")
        public Boolean isCmsReduplicated;

        @NameInMap("name")
        public String name;

        @NameInMap("phone")
        public String phone;

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
        @NameInMap("active")
        public Integer active;

        @NameInMap("channelType")
        public String channelType;

        @NameInMap("contactGroupName")
        public String contactGroupName;

        @NameInMap("contactGroups")
        public java.util.List<GetEventSubscriptionResponseBodyDataContactGroups> contactGroups;

        @NameInMap("contactName")
        public String contactName;

        @NameInMap("contacts")
        public java.util.List<GetEventSubscriptionResponseBodyDataContacts> contacts;

        @NameInMap("eventContext")
        public String eventContext;

        @NameInMap("eventSendGroup")
        public java.util.List<String> eventSendGroup;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("instanceId")
        public String instanceId;

        @NameInMap("lang")
        public String lang;

        @NameInMap("level")
        public String level;

        @NameInMap("minInterval")
        public String minInterval;

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
