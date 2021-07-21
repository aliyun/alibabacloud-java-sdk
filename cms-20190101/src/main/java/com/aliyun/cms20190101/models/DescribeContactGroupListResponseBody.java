// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactGroupListResponseBody extends TeaModel {
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

    @NameInMap("ContactGroups")
    public DescribeContactGroupListResponseBodyContactGroups contactGroups;

    @NameInMap("ContactGroupList")
    public DescribeContactGroupListResponseBodyContactGroupList contactGroupList;

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

    public DescribeContactGroupListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeContactGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeContactGroupListResponseBody setContactGroups(DescribeContactGroupListResponseBodyContactGroups contactGroups) {
        this.contactGroups = contactGroups;
        return this;
    }
    public DescribeContactGroupListResponseBodyContactGroups getContactGroups() {
        return this.contactGroups;
    }

    public DescribeContactGroupListResponseBody setContactGroupList(DescribeContactGroupListResponseBodyContactGroupList contactGroupList) {
        this.contactGroupList = contactGroupList;
        return this;
    }
    public DescribeContactGroupListResponseBodyContactGroupList getContactGroupList() {
        return this.contactGroupList;
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
        @NameInMap("Describe")
        public String describe;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("EnabledWeeklyReport")
        public Boolean enabledWeeklyReport;

        @NameInMap("Name")
        public String name;

        @NameInMap("EnableSubscribed")
        public Boolean enableSubscribed;

        @NameInMap("Contacts")
        public DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts contacts;

        public static DescribeContactGroupListResponseBodyContactGroupListContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseBodyContactGroupListContactGroup self = new DescribeContactGroupListResponseBodyContactGroupListContactGroup();
            return TeaModel.build(map, self);
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
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

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setEnableSubscribed(Boolean enableSubscribed) {
            this.enableSubscribed = enableSubscribed;
            return this;
        }
        public Boolean getEnableSubscribed() {
            return this.enableSubscribed;
        }

        public DescribeContactGroupListResponseBodyContactGroupListContactGroup setContacts(DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public DescribeContactGroupListResponseBodyContactGroupListContactGroupContacts getContacts() {
            return this.contacts;
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

}
