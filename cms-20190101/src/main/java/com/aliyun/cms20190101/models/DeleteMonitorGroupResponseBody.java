// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Group")
    public DeleteMonitorGroupResponseBodyGroup group;

    public static DeleteMonitorGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupResponseBody self = new DeleteMonitorGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteMonitorGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMonitorGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMonitorGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteMonitorGroupResponseBody setGroup(DeleteMonitorGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public DeleteMonitorGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public static class DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup self = new DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

        public DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DeleteMonitorGroupResponseBodyGroupContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup> contactGroup;

        public static DeleteMonitorGroupResponseBodyGroupContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseBodyGroupContactGroups self = new DeleteMonitorGroupResponseBodyGroupContactGroups();
            return TeaModel.build(map, self);
        }

        public DeleteMonitorGroupResponseBodyGroupContactGroups setContactGroup(java.util.List<DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<DeleteMonitorGroupResponseBodyGroupContactGroupsContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DeleteMonitorGroupResponseBodyGroup extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("ContactGroups")
        public DeleteMonitorGroupResponseBodyGroupContactGroups contactGroups;

        public static DeleteMonitorGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseBodyGroup self = new DeleteMonitorGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public DeleteMonitorGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DeleteMonitorGroupResponseBodyGroup setContactGroups(DeleteMonitorGroupResponseBodyGroupContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DeleteMonitorGroupResponseBodyGroupContactGroups getContactGroups() {
            return this.contactGroups;
        }

    }

}
