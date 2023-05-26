// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupResponseBody extends TeaModel {
    @NameInMap("ContactGroups")
    public java.util.List<SearchAlertContactGroupResponseBodyContactGroups> contactGroups;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupResponseBody self = new SearchAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactGroupResponseBody setContactGroups(java.util.List<SearchAlertContactGroupResponseBodyContactGroups> contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public java.util.List<SearchAlertContactGroupResponseBodyContactGroups> getContactGroups() {
        return this.contactGroups;
    }

    public SearchAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SearchAlertContactGroupResponseBodyContactGroupsContacts extends TeaModel {
        @NameInMap("ContactId")
        public Long contactId;

        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DingRobot")
        public String dingRobot;

        @NameInMap("Email")
        public String email;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("SystemNoc")
        public Boolean systemNoc;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static SearchAlertContactGroupResponseBodyContactGroupsContacts build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactGroupResponseBodyContactGroupsContacts self = new SearchAlertContactGroupResponseBodyContactGroupsContacts();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setDingRobot(String dingRobot) {
            this.dingRobot = dingRobot;
            return this;
        }
        public String getDingRobot() {
            return this.dingRobot;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setSystemNoc(Boolean systemNoc) {
            this.systemNoc = systemNoc;
            return this;
        }
        public Boolean getSystemNoc() {
            return this.systemNoc;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertContactGroupResponseBodyContactGroupsContacts setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class SearchAlertContactGroupResponseBodyContactGroups extends TeaModel {
        @NameInMap("ContactGroupId")
        public Long contactGroupId;

        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Contacts")
        public java.util.List<SearchAlertContactGroupResponseBodyContactGroupsContacts> contacts;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static SearchAlertContactGroupResponseBodyContactGroups build(java.util.Map<String, ?> map) throws Exception {
            SearchAlertContactGroupResponseBodyContactGroups self = new SearchAlertContactGroupResponseBodyContactGroups();
            return TeaModel.build(map, self);
        }

        public SearchAlertContactGroupResponseBodyContactGroups setContactGroupId(Long contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public Long getContactGroupId() {
            return this.contactGroupId;
        }

        public SearchAlertContactGroupResponseBodyContactGroups setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public SearchAlertContactGroupResponseBodyContactGroups setContacts(java.util.List<SearchAlertContactGroupResponseBodyContactGroupsContacts> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<SearchAlertContactGroupResponseBodyContactGroupsContacts> getContacts() {
            return this.contacts;
        }

        public SearchAlertContactGroupResponseBodyContactGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public SearchAlertContactGroupResponseBodyContactGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public SearchAlertContactGroupResponseBodyContactGroups setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
