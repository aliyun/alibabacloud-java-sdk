// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsResponseBody extends TeaModel {
    /**
     * <p>Account group list.</p>
     */
    @NameInMap("Groups")
    public java.util.List<ListGroupsResponseBodyGroups> groups;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of matched entries. The maximum number of entries returned in a single request is determined by pageSize.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsResponseBody self = new ListGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupsResponseBody setGroups(java.util.List<ListGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGroupsResponseBodyGroups extends TeaModel {
        /**
         * <p>Group creation time in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Group description.</p>
         * 
         * <strong>example:</strong>
         * <p>test group</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Group external ID, used for association with external systems. Defaults to the account group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupExternalId")
        public String groupExternalId;

        /**
         * <p>Group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group_d6sbsuumeta4h66ec3il7yxxxx</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Group name.</p>
         * 
         * <strong>example:</strong>
         * <p>group_name</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Group source ID. If created by importing from other sources, this is the external source ID. Defaults to the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("GroupSourceId")
        public String groupSourceId;

        /**
         * <p>Group source type. Currently, only self-built is supported. Valid values:</p>
         * <ul>
         * <li>build_in: self-built.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>build_in</p>
         */
        @NameInMap("GroupSourceType")
        public String groupSourceType;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Group last update time in Unix timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1652085686179</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupsResponseBodyGroups self = new ListGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupsResponseBodyGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupsResponseBodyGroups setGroupExternalId(String groupExternalId) {
            this.groupExternalId = groupExternalId;
            return this;
        }
        public String getGroupExternalId() {
            return this.groupExternalId;
        }

        public ListGroupsResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupsResponseBodyGroups setGroupSourceId(String groupSourceId) {
            this.groupSourceId = groupSourceId;
            return this;
        }
        public String getGroupSourceId() {
            return this.groupSourceId;
        }

        public ListGroupsResponseBodyGroups setGroupSourceType(String groupSourceType) {
            this.groupSourceType = groupSourceType;
            return this;
        }
        public String getGroupSourceType() {
            return this.groupSourceType;
        }

        public ListGroupsResponseBodyGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGroupsResponseBodyGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
