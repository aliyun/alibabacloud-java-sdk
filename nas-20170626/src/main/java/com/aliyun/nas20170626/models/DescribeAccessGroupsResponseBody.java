// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsResponseBody extends TeaModel {
    @NameInMap("AccessGroups")
    public DescribeAccessGroupsResponseBodyAccessGroups accessGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

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

    public DescribeAccessGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup extends TeaModel {
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AccessGroupType")
        public String accessGroupType;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("MountTargetCount")
        public Integer mountTargetCount;

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

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setAccessGroupType(String accessGroupType) {
            this.accessGroupType = accessGroupType;
            return this;
        }
        public String getAccessGroupType() {
            return this.accessGroupType;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setMountTargetCount(Integer mountTargetCount) {
            this.mountTargetCount = mountTargetCount;
            return this;
        }
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
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
