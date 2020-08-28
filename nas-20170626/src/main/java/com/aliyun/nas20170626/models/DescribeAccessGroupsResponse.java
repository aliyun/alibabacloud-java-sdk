// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAccessGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("AccessGroups")
    @Validation(required = true)
    public DescribeAccessGroupsResponseAccessGroups accessGroups;

    public static DescribeAccessGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessGroupsResponse self = new DescribeAccessGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccessGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAccessGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAccessGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccessGroupsResponse setAccessGroups(DescribeAccessGroupsResponseAccessGroups accessGroups) {
        this.accessGroups = accessGroups;
        return this;
    }
    public DescribeAccessGroupsResponseAccessGroups getAccessGroups() {
        return this.accessGroups;
    }

    public static class DescribeAccessGroupsResponseAccessGroupsAccessGroup extends TeaModel {
        @NameInMap("AccessGroupName")
        @Validation(required = true)
        public String accessGroupName;

        @NameInMap("AccessGroupType")
        @Validation(required = true)
        public String accessGroupType;

        @NameInMap("RuleCount")
        @Validation(required = true)
        public Integer ruleCount;

        @NameInMap("MountTargetCount")
        @Validation(required = true)
        public Integer mountTargetCount;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        public static DescribeAccessGroupsResponseAccessGroupsAccessGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessGroupsResponseAccessGroupsAccessGroup self = new DescribeAccessGroupsResponseAccessGroupsAccessGroup();
            return TeaModel.build(map, self);
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setAccessGroupType(String accessGroupType) {
            this.accessGroupType = accessGroupType;
            return this;
        }
        public String getAccessGroupType() {
            return this.accessGroupType;
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setMountTargetCount(Integer mountTargetCount) {
            this.mountTargetCount = mountTargetCount;
            return this;
        }
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAccessGroupsResponseAccessGroupsAccessGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

    public static class DescribeAccessGroupsResponseAccessGroups extends TeaModel {
        @NameInMap("AccessGroup")
        @Validation(required = true)
        public java.util.List<DescribeAccessGroupsResponseAccessGroupsAccessGroup> accessGroup;

        public static DescribeAccessGroupsResponseAccessGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessGroupsResponseAccessGroups self = new DescribeAccessGroupsResponseAccessGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAccessGroupsResponseAccessGroups setAccessGroup(java.util.List<DescribeAccessGroupsResponseAccessGroupsAccessGroup> accessGroup) {
            this.accessGroup = accessGroup;
            return this;
        }
        public java.util.List<DescribeAccessGroupsResponseAccessGroupsAccessGroup> getAccessGroup() {
            return this.accessGroup;
        }

    }

}
