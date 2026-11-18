// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the deletion was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the deleted application group.</p>
     */
    @NameInMap("Group")
    public DeleteMonitorGroupResponseBodyGroup group;

    /**
     * <p>The error message returned when the request fails. The example indicates that the required parameter GroupId is missing. No error message is returned when the deletion is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>GroupId is mandatory for this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400-e29b-41d4-a716-446655440000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the application group was deleted. A value of true indicates success, and a value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public DeleteMonitorGroupResponseBody setGroup(DeleteMonitorGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public DeleteMonitorGroupResponseBodyGroup getGroup() {
        return this.group;
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
        @NameInMap("ContactGroups")
        public DeleteMonitorGroupResponseBodyGroupContactGroups contactGroups;

        /**
         * <p>The name of the application group.</p>
         * 
         * <strong>example:</strong>
         * <p>生产应用分组</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static DeleteMonitorGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseBodyGroup self = new DeleteMonitorGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public DeleteMonitorGroupResponseBodyGroup setContactGroups(DeleteMonitorGroupResponseBodyGroupContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DeleteMonitorGroupResponseBodyGroupContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DeleteMonitorGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

}
