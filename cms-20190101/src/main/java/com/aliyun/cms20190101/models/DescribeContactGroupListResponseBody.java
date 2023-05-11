// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactGroupListResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the alert group.</p>
     */
    @NameInMap("ContactGroupList")
    public DescribeContactGroupListResponseBodyContactGroupList contactGroupList;

    /**
     * <p>The information about alert groups that were queried.</p>
     */
    @NameInMap("ContactGroups")
    public DescribeContactGroupListResponseBodyContactGroups contactGroups;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The total number of the returned entries.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The names of alert groups.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   true: The call was successful.</p>
     * <p>*   false: The call failed.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeContactGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupListResponseBody self = new DescribeContactGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeContactGroupListResponseBody setContactGroupList(DescribeContactGroupListResponseBodyContactGroupList contactGroupList) {
        this.contactGroupList = contactGroupList;
        return this;
    }
    public DescribeContactGroupListResponseBodyContactGroupList getContactGroupList() {
        return this.contactGroupList;
    }

    public DescribeContactGroupListResponseBody setContactGroups(DescribeContactGroupListResponseBodyContactGroups contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public DescribeContactGroupListResponseBodyContactGroups getContactGroups() {
        return this.contactGroups;
    }

    public DescribeContactGroupListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeContactGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeContactGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContactGroupListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<String> contact;

        public static DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts self = new DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts setContact(java.util.List<String> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<String> getContact() {
            return this.contact;
        }

    }

    public static class DescribeContactGroupListResponseBodyContactGroupListContactGroup extends TeaModel {
        /**
         * <p>Queries alert groups.</p>
         */
        @NameInMap("Contacts")
        public DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts contacts;

        /**
         * <p>Indicates whether the alert group can subscribe to weekly reports. Valid values:</p>
         * <br>
         * <p>*   true: The alert group can subscribe to weekly reports.</p>
         * <p>*   false: The alert group cannot subscribe to weekly reports.</p>
         * <br>
         * <p>>  The weekly report subscription feature is only available for Alibaba Cloud accounts with more than five Elastic Compute Service (ECS) instances.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the alert group was modified. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Describe")
        public String describe;

        /**
         * <p>The alert contacts in the alert group.</p>
         */
        @NameInMap("EnableSubscribed")
        public Boolean enableSubscribed;

        /**
         * <p>The name of the alert group.</p>
         */
        @NameInMap("EnabledWeeklyReport")
        public Boolean enabledWeeklyReport;

        /**
         * <p>Indicates whether the alert group subscribes to weekly reports. Valid values:</p>
         * <br>
         * <p>*   true: The alert group subscribes to weekly reports.</p>
         * <p>*   false: The alert group does not subscribe to weekly reports.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the alert group was created. This value is a UNIX timestamp that represents the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeContactGroupListResponseBodyContactGroupListContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseBodyContactGroupListContactGroup self = new DescribeContactGroupListResponseBodyContactGroupListContactGroup();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setContacts(DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts getContacts() {
            return this.contacts;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setEnableSubscribed(Boolean enableSubscribed) {
            this.enableSubscribed = enableSubscribed;
            return this;
        }
        public Boolean getEnableSubscribed() {
            return this.enableSubscribed;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setEnabledWeeklyReport(Boolean enabledWeeklyReport) {
            this.enabledWeeklyReport = enabledWeeklyReport;
            return this;
        }
        public Boolean getEnabledWeeklyReport() {
            return this.enabledWeeklyReport;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeContactGroupListResponseBodyContactGroupList extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<DescribeContactGroupListResponseBodyContactGroupListContactGroup> contactGroup;

        public static DescribeContactGroupListResponseBodyContactGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseBodyContactGroupList self = new DescribeContactGroupListResponseBodyContactGroupList();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupListResponseBodyContactGroupList setContactGroup(java.util.List<DescribeContactGroupListResponseBodyContactGroupListContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<DescribeContactGroupListResponseBodyContactGroupListContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DescribeContactGroupListResponseBodyContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<String> contactGroup;

        public static DescribeContactGroupListResponseBodyContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseBodyContactGroups self = new DescribeContactGroupListResponseBodyContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupListResponseBodyContactGroups setContactGroup(java.util.List<String> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<String> getContactGroup() {
            return this.contactGroup;
        }

    }

}
