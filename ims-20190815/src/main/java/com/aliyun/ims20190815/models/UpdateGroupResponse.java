// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public UpdateGroupResponseGroup group;

    public static UpdateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponse self = new UpdateGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateGroupResponse setGroup(UpdateGroupResponseGroup group) {
        this.group = group;
        return this;
    }
    public UpdateGroupResponseGroup getGroup() {
        return this.group;
    }

    public static class UpdateGroupResponseGroup extends TeaModel {
        @NameInMap("DisplayName")
        @Validation(required = true)
        public String displayName;

        @NameInMap("Comments")
        @Validation(required = true)
        public String comments;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        @NameInMap("UpdateDate")
        @Validation(required = true)
        public String updateDate;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        public static UpdateGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseGroup self = new UpdateGroupResponseGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateGroupResponseGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public UpdateGroupResponseGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateGroupResponseGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public UpdateGroupResponseGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGroupResponseGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
