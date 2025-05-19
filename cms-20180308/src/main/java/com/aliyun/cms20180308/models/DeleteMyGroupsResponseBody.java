// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class DeleteMyGroupsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Group")
    public DeleteMyGroupsResponseBodyGroup group;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMyGroupsResponseBody self = new DeleteMyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMyGroupsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteMyGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteMyGroupsResponseBody setGroup(DeleteMyGroupsResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public DeleteMyGroupsResponseBodyGroup getGroup() {
        return this.group;
    }

    public DeleteMyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMyGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup self = new DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

        public DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteMyGroupsResponseBodyGroupContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup> contactGroup;

        public static DeleteMyGroupsResponseBodyGroupContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DeleteMyGroupsResponseBodyGroupContactGroups self = new DeleteMyGroupsResponseBodyGroupContactGroups();
            return TeaModel.build(map, self);
        }

        public DeleteMyGroupsResponseBodyGroupContactGroups setContactGroup(java.util.List<DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<DeleteMyGroupsResponseBodyGroupContactGroupsContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DeleteMyGroupsResponseBodyGroup extends TeaModel {
        @NameInMap("BindUrls")
        public String bindUrls;

        @NameInMap("ContactGroups")
        public DeleteMyGroupsResponseBodyGroupContactGroups contactGroups;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("Type")
        public String type;

        public static DeleteMyGroupsResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMyGroupsResponseBodyGroup self = new DeleteMyGroupsResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public DeleteMyGroupsResponseBodyGroup setBindUrls(String bindUrls) {
            this.bindUrls = bindUrls;
            return this;
        }
        public String getBindUrls() {
            return this.bindUrls;
        }

        public DeleteMyGroupsResponseBodyGroup setContactGroups(DeleteMyGroupsResponseBodyGroupContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DeleteMyGroupsResponseBodyGroupContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DeleteMyGroupsResponseBodyGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DeleteMyGroupsResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DeleteMyGroupsResponseBodyGroup setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public DeleteMyGroupsResponseBodyGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
