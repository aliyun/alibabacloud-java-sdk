// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setGroupsInfo(java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo) {
        this.groupsInfo = groupsInfo;
        return this;
    }
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> getGroupsInfo() {
        return this.groupsInfo;
    }

    public DescribeDBResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBResourceGroupResponseBodyGroupsInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public String groupType;

        @NameInMap("GroupUsers")
        public String groupUsers;

        @NameInMap("NodeNum")
        public Integer nodeNum;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDBResourceGroupResponseBodyGroupsInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBResourceGroupResponseBodyGroupsInfo self = new DescribeDBResourceGroupResponseBodyGroupsInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUsers(String groupUsers) {
            this.groupUsers = groupUsers;
            return this;
        }
        public String getGroupUsers() {
            return this.groupUsers;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setNodeNum(Integer nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        public DescribeDBResourceGroupResponseBodyGroupsInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
