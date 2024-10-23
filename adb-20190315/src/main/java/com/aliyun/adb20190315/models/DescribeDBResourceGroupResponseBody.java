// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDBResourceGroupResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1ub9grke1****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The queried resource groups.</p>
     */
    @NameInMap("GroupsInfo")
    public java.util.List<DescribeDBResourceGroupResponseBodyGroupsInfo> groupsInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBResourceGroupResponseBody self = new DescribeDBResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBResourceGroupResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
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
        /**
         * <p>The time when the resource group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-09 16:57:35.241</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFAULT</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The query execution mode. Valid values:</p>
         * <ul>
         * <li><strong>interactive</strong></li>
         * <li><strong>batch</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/189502.html">Query execution modes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The database accounts that are associated with the resource group.</p>
         */
        @NameInMap("GroupUserList")
        public java.util.List<String> groupUserList;

        /**
         * <p>The database accounts that are associated with the resource group. Multiple database accounts are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>testb,testc</p>
         */
        @NameInMap("GroupUsers")
        public String groupUsers;

        /**
         * <p>The number of nodes. Each node provides 16 cores and 64 GB memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeNum")
        public Integer nodeNum;

        /**
         * <p>The time when the resource group was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-09 16:57:35.241</p>
         */
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

        public DescribeDBResourceGroupResponseBodyGroupsInfo setGroupUserList(java.util.List<String> groupUserList) {
            this.groupUserList = groupUserList;
            return this;
        }
        public java.util.List<String> getGroupUserList() {
            return this.groupUserList;
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
