// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Group")
    @Validation(required = true)
    public DeleteMonitorGroupResponseGroup group;

    public static DeleteMonitorGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupResponse self = new DeleteMonitorGroupResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMonitorGroupResponseGroupContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DeleteMonitorGroupResponseGroupContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseGroupContactGroupsContactGroup self = new DeleteMonitorGroupResponseGroupContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DeleteMonitorGroupResponseGroupContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<DeleteMonitorGroupResponseGroupContactGroupsContactGroup> contactGroup;

        public static DeleteMonitorGroupResponseGroupContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseGroupContactGroups self = new DeleteMonitorGroupResponseGroupContactGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DeleteMonitorGroupResponseGroup extends TeaModel {
        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public DeleteMonitorGroupResponseGroupContactGroups contactGroups;

        public static DeleteMonitorGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteMonitorGroupResponseGroup self = new DeleteMonitorGroupResponseGroup();
            return TeaModel.build(map, self);
        }

    }

}
