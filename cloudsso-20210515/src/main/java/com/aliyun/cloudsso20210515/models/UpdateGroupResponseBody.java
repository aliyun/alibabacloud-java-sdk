// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the group.</p>
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
         * <p>The time when the group was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the group. Valid values:</p>
         * <br>
         * <p>*   Manual: The group is manually created.</p>
         * <p>*   Synchronized: The user is synchronized from an external identity provider (IdP).</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The time when the information about the group was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static UpdateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseBodyGroup self = new UpdateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseBodyGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public UpdateGroupResponseBodyGroup setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public UpdateGroupResponseBodyGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
