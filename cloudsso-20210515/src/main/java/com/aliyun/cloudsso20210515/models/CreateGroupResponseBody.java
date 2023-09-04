// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the group.</p>
     */
    @NameInMap("Group")
    public CreateGroupResponseBodyGroup group;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The type of the group. The value is fixed as Manual, which indicates that the group is manually created.</p>
         */
        @NameInMap("ProvisionType")
        public String provisionType;

        /**
         * <p>The time when the information about the group was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateGroupResponseBodyGroup self = new CreateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public CreateGroupResponseBodyGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public CreateGroupResponseBodyGroup setProvisionType(String provisionType) {
            this.provisionType = provisionType;
            return this;
        }
        public String getProvisionType() {
            return this.provisionType;
        }

        public CreateGroupResponseBodyGroup setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
