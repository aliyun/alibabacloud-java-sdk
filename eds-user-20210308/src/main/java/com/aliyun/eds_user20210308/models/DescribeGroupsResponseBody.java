// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupsResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("Groups")
    public java.util.List<DescribeGroupsResponseBodyGroups> groups;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsResponseBody self = new DescribeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeGroupsResponseBody setGroups(java.util.List<DescribeGroupsResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<DescribeGroupsResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public DescribeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeGroupsResponseBodyGroupsAttachedLoginPolicy extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public String policyId;

        public static DescribeGroupsResponseBodyGroupsAttachedLoginPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroupsAttachedLoginPolicy self = new DescribeGroupsResponseBodyGroupsAttachedLoginPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroupsAttachedLoginPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupsResponseBodyGroupsAttachedLoginPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

    }

    public static class DescribeGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("AttachedLoginPolicy")
        public DescribeGroupsResponseBodyGroupsAttachedLoginPolicy attachedLoginPolicy;

        @NameInMap("AuthedResources")
        public java.util.Map<String, String> authedResources;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ug-2412ojkwtybd****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("TransferFileNeedApproval")
        public Boolean transferFileNeedApproval;

        @NameInMap("UserCount")
        public Integer userCount;

        public static DescribeGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupsResponseBodyGroups self = new DescribeGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeGroupsResponseBodyGroups setAttachedLoginPolicy(DescribeGroupsResponseBodyGroupsAttachedLoginPolicy attachedLoginPolicy) {
            this.attachedLoginPolicy = attachedLoginPolicy;
            return this;
        }
        public DescribeGroupsResponseBodyGroupsAttachedLoginPolicy getAttachedLoginPolicy() {
            return this.attachedLoginPolicy;
        }

        public DescribeGroupsResponseBodyGroups setAuthedResources(java.util.Map<String, String> authedResources) {
            this.authedResources = authedResources;
            return this;
        }
        public java.util.Map<String, String> getAuthedResources() {
            return this.authedResources;
        }

        public DescribeGroupsResponseBodyGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGroupsResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeGroupsResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeGroupsResponseBodyGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeGroupsResponseBodyGroups setTransferFileNeedApproval(Boolean transferFileNeedApproval) {
            this.transferFileNeedApproval = transferFileNeedApproval;
            return this;
        }
        public Boolean getTransferFileNeedApproval() {
            return this.transferFileNeedApproval;
        }

        public DescribeGroupsResponseBodyGroups setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

}
