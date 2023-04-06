// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetGroupResponseBody extends TeaModel {
    @NameInMap("Group")
    public GetGroupResponseBodyGroup group;

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
         * <p>组创建时间, Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>组描述。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>组外部标识。</p>
         */
        @NameInMap("GroupExternalId")
        public String groupExternalId;

        /**
         * <p>组ID。</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>组名称。</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>组来源ID。</p>
         */
        @NameInMap("GroupSourceId")
        public String groupSourceId;

        /**
         * <p>组来源类型，build_in[自建],ding_talk[钉钉导入],ad[AD导入],ldap[LDAP导入]。</p>
         */
        @NameInMap("GroupSourceType")
        public String groupSourceType;

        /**
         * <p>实例ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>组最近一次更新时间，Unix时间戳格式，单位为毫秒。</p>
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
