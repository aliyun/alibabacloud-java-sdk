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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of permission groups returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2514F97E-FFF0-4A1F-BF04-729CEAC6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of permission groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_VPC_GROUP_NAME</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The network type of the permission group. Valid value: <strong>Vpc</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Vpc</p>
         */
        @NameInMap("AccessGroupType")
        public String accessGroupType;

        /**
         * <p>The time when the permission group was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-01-05T16:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the permission group.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test access group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The type of the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>standard: General-purpose NAS</li>
         * <li>extreme: Extreme NAS</li>
         * <li>cpfs: CPFS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("FileSystemType")
        public String fileSystemType;

        /**
         * <p>The number of mount targets to which the permission group is attached.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MountTargetCount")
        public Integer mountTargetCount;

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The total number of rules in the permission group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setFileSystemType(String fileSystemType) {
            this.fileSystemType = fileSystemType;
            return this;
        }
        public String getFileSystemType() {
            return this.fileSystemType;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setMountTargetCount(Integer mountTargetCount) {
            this.mountTargetCount = mountTargetCount;
            return this;
        }
        public Integer getMountTargetCount() {
            return this.mountTargetCount;
        }

        public DescribeAccessGroupsResponseBodyAccessGroupsAccessGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
