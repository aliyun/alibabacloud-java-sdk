// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Group")
    @Validation(required = true)
    public CreateGroupResponseGroup group;

    public static CreateGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponse self = new CreateGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupResponse setGroup(CreateGroupResponseGroup group) {
        this.group = group;
        return this;
    }
    public CreateGroupResponseGroup getGroup() {
        return this.group;
    }

    public static class CreateGroupResponseGroup extends TeaModel {
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

        public static CreateGroupResponseGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseGroup self = new CreateGroupResponseGroup();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateGroupResponseGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public CreateGroupResponseGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateGroupResponseGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

        public CreateGroupResponseGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGroupResponseGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

}
