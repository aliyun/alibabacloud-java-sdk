// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    /**
     * <p>The information of the RAM user group.</p>
     */
    @NameInMap("Group")
    public UpdateGroupResponseBodyGroup group;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponseBody self = new UpdateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponseBody setGroup(UpdateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public UpdateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public UpdateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user group.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the RAM user group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the RAM user group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static UpdateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseBodyGroup self = new UpdateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseBodyGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public UpdateGroupResponseBodyGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public UpdateGroupResponseBodyGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public UpdateGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public UpdateGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateGroupResponseBodyGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
