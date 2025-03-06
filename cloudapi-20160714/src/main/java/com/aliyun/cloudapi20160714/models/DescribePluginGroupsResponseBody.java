// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginGroupsResponseBody extends TeaModel {
    /**
     * <p>Collection of group information</p>
     */
    @NameInMap("GroupSummarys")
    public DescribePluginGroupsResponseBodyGroupSummarys groupSummarys;

    /**
     * <p>Pagination parameter: current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Pagination parameter: number of items per page, default value 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>765BC99E-F583-5A80-9A42-42AC125C2CDC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of returned results</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePluginGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginGroupsResponseBody self = new DescribePluginGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginGroupsResponseBody setGroupSummarys(DescribePluginGroupsResponseBodyGroupSummarys groupSummarys) {
        this.groupSummarys = groupSummarys;
        return this;
    }
    public DescribePluginGroupsResponseBodyGroupSummarys getGroupSummarys() {
        return this.groupSummarys;
    }

    public DescribePluginGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary extends TeaModel {
        /**
         * <p>API root path</p>
         * 
         * <strong>example:</strong>
         * <p>/rpew</p>
         */
        @NameInMap("BasePath")
        public String basePath;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>API group ID</p>
         * 
         * <strong>example:</strong>
         * <p>4ed31575e2de43de8c51eb1217a1f56b</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>API group name</p>
         * 
         * <strong>example:</strong>
         * <p>ECP_API</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>Region ID where the API group is located</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Stage name Alias</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("StageAlias")
        public String stageAlias;

        /**
         * <p>Environment name, possible values:</p>
         * <ul>
         * <li><strong>RELEASE</strong>: Production</li>
         * <li><strong>PRE</strong>: Pre-release</li>
         * <li><strong>TEST</strong>: Testing</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RELEASE</p>
         */
        @NameInMap("StageName")
        public String stageName;

        public static DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary self = new DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary();
            return TeaModel.build(map, self);
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setStageAlias(String stageAlias) {
            this.stageAlias = stageAlias;
            return this;
        }
        public String getStageAlias() {
            return this.stageAlias;
        }

        public DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

    }

    public static class DescribePluginGroupsResponseBodyGroupSummarys extends TeaModel {
        @NameInMap("GroupPluginSummary")
        public java.util.List<DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary> groupPluginSummary;

        public static DescribePluginGroupsResponseBodyGroupSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginGroupsResponseBodyGroupSummarys self = new DescribePluginGroupsResponseBodyGroupSummarys();
            return TeaModel.build(map, self);
        }

        public DescribePluginGroupsResponseBodyGroupSummarys setGroupPluginSummary(java.util.List<DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary> groupPluginSummary) {
            this.groupPluginSummary = groupPluginSummary;
            return this;
        }
        public java.util.List<DescribePluginGroupsResponseBodyGroupSummarysGroupPluginSummary> getGroupPluginSummary() {
            return this.groupPluginSummary;
        }

    }

}
