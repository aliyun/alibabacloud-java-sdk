// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetMyGroupsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Group")
    public GetMyGroupsResponseBodyGroup group;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMyGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMyGroupsResponseBody self = new GetMyGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMyGroupsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetMyGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMyGroupsResponseBody setGroup(GetMyGroupsResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetMyGroupsResponseBodyGroup getGroup() {
        return this.group;
    }

    public GetMyGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMyGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMyGroupsResponseBodyGroupContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static GetMyGroupsResponseBodyGroupContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            GetMyGroupsResponseBodyGroupContactGroupsContactGroup self = new GetMyGroupsResponseBodyGroupContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

        public GetMyGroupsResponseBodyGroupContactGroupsContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetMyGroupsResponseBodyGroupContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<GetMyGroupsResponseBodyGroupContactGroupsContactGroup> contactGroup;

        public static GetMyGroupsResponseBodyGroupContactGroups build(java.util.Map<String, ?> map) throws Exception {
            GetMyGroupsResponseBodyGroupContactGroups self = new GetMyGroupsResponseBodyGroupContactGroups();
            return TeaModel.build(map, self);
        }

        public GetMyGroupsResponseBodyGroupContactGroups setContactGroup(java.util.List<GetMyGroupsResponseBodyGroupContactGroupsContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<GetMyGroupsResponseBodyGroupContactGroupsContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class GetMyGroupsResponseBodyGroup extends TeaModel {
        @NameInMap("BindUrl")
        public String bindUrl;

        @NameInMap("ContactGroups")
        public GetMyGroupsResponseBodyGroupContactGroups contactGroups;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ServiceId")
        public Long serviceId;

        @NameInMap("Type")
        public String type;

        public static GetMyGroupsResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetMyGroupsResponseBodyGroup self = new GetMyGroupsResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetMyGroupsResponseBodyGroup setBindUrl(String bindUrl) {
            this.bindUrl = bindUrl;
            return this;
        }
        public String getBindUrl() {
            return this.bindUrl;
        }

        public GetMyGroupsResponseBodyGroup setContactGroups(GetMyGroupsResponseBodyGroupContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public GetMyGroupsResponseBodyGroupContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public GetMyGroupsResponseBodyGroup setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetMyGroupsResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetMyGroupsResponseBodyGroup setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetMyGroupsResponseBodyGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
