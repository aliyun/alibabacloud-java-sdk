// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeInstanceRefreshesResponseBody extends TeaModel {
    @NameInMap("InstanceRefreshTasks")
    public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks> instanceRefreshTasks;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceRefreshesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRefreshesResponseBody self = new DescribeInstanceRefreshesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRefreshesResponseBody setInstanceRefreshTasks(java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks> instanceRefreshTasks) {
        this.instanceRefreshTasks = instanceRefreshTasks;
        return this;
    }
    public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks> getInstanceRefreshTasks() {
        return this.instanceRefreshTasks;
    }

    public DescribeInstanceRefreshesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceRefreshesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceRefreshesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRefreshesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>m-uf6g5noisr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>asc-wz91ibkhfor****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks extends TeaModel {
        @NameInMap("DesiredConfiguration")
        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration desiredConfiguration;

        /**
         * <strong>example:</strong>
         * <p>The task exceeded its maximum run time of one week. So the task failed.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>2024-08-22T02:09:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FinishedUpdateCapacity")
        public Integer finishedUpdateCapacity;

        /**
         * <strong>example:</strong>
         * <p>ir-1adfa123****</p>
         */
        @NameInMap("InstanceRefreshTaskId")
        public String instanceRefreshTaskId;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxHealthyPercentage")
        public Integer maxHealthyPercentage;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("MinHealthyPercentage")
        public Integer minHealthyPercentage;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>asg-bp16pbfcr8j9*****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <strong>example:</strong>
         * <p>2024-08-22T01:09:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalNeedUpdateCapacity")
        public Integer totalNeedUpdateCapacity;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setDesiredConfiguration(DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration desiredConfiguration) {
            this.desiredConfiguration = desiredConfiguration;
            return this;
        }
        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration getDesiredConfiguration() {
            return this.desiredConfiguration;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setFinishedUpdateCapacity(Integer finishedUpdateCapacity) {
            this.finishedUpdateCapacity = finishedUpdateCapacity;
            return this;
        }
        public Integer getFinishedUpdateCapacity() {
            return this.finishedUpdateCapacity;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setInstanceRefreshTaskId(String instanceRefreshTaskId) {
            this.instanceRefreshTaskId = instanceRefreshTaskId;
            return this;
        }
        public String getInstanceRefreshTaskId() {
            return this.instanceRefreshTaskId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setMaxHealthyPercentage(Integer maxHealthyPercentage) {
            this.maxHealthyPercentage = maxHealthyPercentage;
            return this;
        }
        public Integer getMaxHealthyPercentage() {
            return this.maxHealthyPercentage;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setMinHealthyPercentage(Integer minHealthyPercentage) {
            this.minHealthyPercentage = minHealthyPercentage;
            return this;
        }
        public Integer getMinHealthyPercentage() {
            return this.minHealthyPercentage;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setTotalNeedUpdateCapacity(Integer totalNeedUpdateCapacity) {
            this.totalNeedUpdateCapacity = totalNeedUpdateCapacity;
            return this;
        }
        public Integer getTotalNeedUpdateCapacity() {
            return this.totalNeedUpdateCapacity;
        }

    }

}
