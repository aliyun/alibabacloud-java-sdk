// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactGroupListResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContactGroupList")
    @Validation(required = true)
    public DescribeContactGroupListResponseContactGroupList contactGroupList;

    @NameInMap("ContactGroups")
    @Validation(required = true)
    public DescribeContactGroupListResponseContactGroups contactGroups;

    public static DescribeContactGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupListResponse self = new DescribeContactGroupListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeContactGroupListResponseContactGroupListContactGroupContacts extends TeaModel {
        @NameInMap("Contact")
        @Validation(required = true)
        public java.util.List<String> contact;

        public static DescribeContactGroupListResponseContactGroupListContactGroupContacts build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseContactGroupListContactGroupContacts self = new DescribeContactGroupListResponseContactGroupListContactGroupContacts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactGroupListResponseContactGroupListContactGroup extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Describe")
        @Validation(required = true)
        public String describe;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("EnabledWeeklyReport")
        @Validation(required = true)
        public Boolean enabledWeeklyReport;

        @NameInMap("EnableSubscribed")
        @Validation(required = true)
        public Boolean enableSubscribed;

        @NameInMap("Contacts")
        @Validation(required = true)
        public DescribeContactGroupListResponseContactGroupListContactGroupContacts contacts;

        public static DescribeContactGroupListResponseContactGroupListContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseContactGroupListContactGroup self = new DescribeContactGroupListResponseContactGroupListContactGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactGroupListResponseContactGroupList extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<DescribeContactGroupListResponseContactGroupListContactGroup> contactGroup;

        public static DescribeContactGroupListResponseContactGroupList build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseContactGroupList self = new DescribeContactGroupListResponseContactGroupList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeContactGroupListResponseContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<String> contactGroup;

        public static DescribeContactGroupListResponseContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeContactGroupListResponseContactGroups self = new DescribeContactGroupListResponseContactGroups();
            return TeaModel.build(map, self);
        }

    }

}
