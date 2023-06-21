// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the account group.</p>
     */
    @NameInMap("Group")
    public GetGroupResponseBodyGroup group;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGroupResponseBody self = new GetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGroupResponseBody setGroup(GetGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public GetGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public GetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetGroupResponseBodyGroup extends TeaModel {
        /**
         * <p>The time at which the group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The external ID of the group, which can be used to associate the group with an external system. By default, the external ID is the group ID.</p>
         */
        @NameInMap("GroupExternalId")
        public String groupExternalId;

        /**
         * <p>The group ID.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The source ID of the group. By default, the source ID is the instance ID.</p>
         */
        @NameInMap("GroupSourceId")
        public String groupSourceId;

        /**
         * <p>The source type of the group. Only build_in may be returned, which indicates that the group was created in IDaaS.</p>
         * <br>
         * <p>*</p>
         */
        @NameInMap("GroupSourceType")
        public String groupSourceType;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time at which the group was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            GetGroupResponseBodyGroup self = new GetGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public GetGroupResponseBodyGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetGroupResponseBodyGroup setGroupExternalId(String groupExternalId) {
            this.groupExternalId = groupExternalId;
            return this;
        }
        public String getGroupExternalId() {
            return this.groupExternalId;
        }

        public GetGroupResponseBodyGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetGroupResponseBodyGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetGroupResponseBodyGroup setGroupSourceId(String groupSourceId) {
            this.groupSourceId = groupSourceId;
            return this;
        }
        public String getGroupSourceId() {
            return this.groupSourceId;
        }

        public GetGroupResponseBodyGroup setGroupSourceType(String groupSourceType) {
            this.groupSourceType = groupSourceType;
            return this;
        }
        public String getGroupSourceType() {
            return this.groupSourceType;
        }

        public GetGroupResponseBodyGroup setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGroupResponseBodyGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
