// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsResponseBody extends TeaModel {
    /**
     * <p>The queried permission groups.</p>
     */
    @NameInMap("AccessGroups")
    public DescribeAccessGroupsResponseBodyAccessGroups accessGroups;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of permission groups returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of permission groups.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAccessGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessGroupsResponseBody self = new DescribeAccessGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessGroupsResponseBody setAccessGroups(DescribeAccessGroupsResponseBodyAccessGroups accessGroups) {
        this.accessGroups = accessGroups;
        return this;
    }
    public DescribeAccessGroupsResponseBodyAccessGroups getAccessGroups() {
        return this.accessGroups;
    }

    public DescribeAccessGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup extends TeaModel {
        /**
         * <p>The name of the permission group.</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The network type of the permission group. Valid value: **Vpc**.</p>
         */
        @NameInMap("AccessGroupType")
        public String accessGroupType;

        /**
         * <p>The time when the permission group was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the permission group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of mount targets to which the permission group is attached.</p>
         */
        @NameInMap("MountTargetCount")
        public Integer mountTargetCount;

        /**
         * <p>The total number of rules in the permission group.</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup self = new DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup();
            return TeaModel.build(map, self);
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setAccessGroupType(String accessGroupType) {
            this.accessGroupType = accessGroupType;
            return this;
        }
        public String getAccessGroupType() {
            return this.accessGroupType;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setMountTargetCount(Integer mountTargetCount) {
            this.mountTargetCount = mountTargetCount;
            return this;
        }
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

    public static class DescribeAccessGroupsResponseBodyAccessGroups extends TeaModel {
        @NameInMap("AccessGroup")
        public java.util.List<DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup> accessGroup;

        public static DescribeAccessGroupsResponseBodyAccessGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessGroupsResponseBodyAccessGroups self = new DescribeAccessGroupsResponseBodyAccessGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAccessGroupsResponseBodyAccessGroups setAccessGroup(java.util.List<DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup> accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public java.util.List<DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup> getAccessGroup() {
            return this.accessGroup;
        }

    }

}
