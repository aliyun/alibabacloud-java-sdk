// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the alert contact groups.</p>
     */
    @NameInMap("ContactGroups")
    public java.util.List<SearchAlertContactGroupResponseBodyContactGroups> contactGroups;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the alert contact.</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The name of the alert contact.</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The time when the alert contact group list was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The webhook URL of the DingTalk chatbot.</p>
         */
        @NameInMap("DingRobot")
        public String dingRobot;

        /**
         * <p>The email address of the alert contact.</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number of the alert contact.</p>
         */
        @NameInMap("Phone")
        public String phone;

        /**
         * <p>Indicates whether the alert contact receives system notifications. Valid values:</p>
         * <br>
         * <p>*   true: receives system notifications.</p>
         * <p>*   false: does not receive system notifications.</p>
         */
        @NameInMap("SystemNoc")
        public Boolean systemNoc;

        /**
         * <p>The time when the alert contact group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         */
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
        /**
         * <p>The ID of the alert contact group.</p>
         */
        @NameInMap("ContactGroupId")
        public Long contactGroupId;

        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        /**
         * <p>The alert contact list.</p>
         */
        @NameInMap("Contacts")
        public java.util.List<SearchAlertContactGroupResponseBodyContactGroupsContacts> contacts;

        /**
         * <p>The time when the alert contact group list was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the alert contact group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user.</p>
         */
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
