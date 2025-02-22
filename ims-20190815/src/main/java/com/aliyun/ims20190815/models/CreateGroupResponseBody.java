// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the RAM user group.</p>
     */
    @NameInMap("Group")
    public CreateGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C38192B-7BF8-45DA-8F0A-E670EA51426C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGroup(CreateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public CreateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-19T16:15:17Z</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The display name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>740317625433843****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-10-19T16:15:17Z</p>
         */
        @NameInMap("UpdateDate")
        public String updateDate;

        public static CreateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyGroup self = new CreateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyGroup setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public CreateGroupResponseBodyGroup setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public CreateGroupResponseBodyGroup setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateGroupResponseBodyGroup setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
