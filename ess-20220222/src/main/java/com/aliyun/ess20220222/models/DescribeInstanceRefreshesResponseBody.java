// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeInstanceRefreshesResponseBody extends TeaModel {
    /**
     * <p>The instance refresh tasks.</p>
     */
    @NameInMap("InstanceRefreshTasks")
    public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks> instanceRefreshTasks;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instance refresh tasks.</p>
     * 
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

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>fieldPath</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers extends TeaModel {
        @NameInMap("Args")
        public java.util.List<String> args;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        @NameInMap("EnvironmentVars")
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars> environmentVars;

        /**
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers setEnvironmentVars(java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecs.sn1ne.large</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration extends TeaModel {
        @NameInMap("Containers")
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers> containers;

        /**
         * <p>The ID of the image file that provides the image resource for Auto Scaling to create instances.</p>
         * 
         * <strong>example:</strong>
         * <p>m-uf6g5noisr****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <strong>example:</strong>
         * <p>lt-2ze5x4mp*****</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <strong>example:</strong>
         * <p>Latest</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-wz91ibkhfor****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setContainers(java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationContainers> getContainers() {
            return this.containers;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setLaunchTemplateOverrides(java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides> launchTemplateOverrides) {
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfigurationLaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
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
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("CheckpointPauseTime")
        public Integer checkpointPauseTime;

        @NameInMap("Checkpoints")
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints> checkpoints;

        /**
         * <p>The desired configurations of the instance refresh task.</p>
         */
        @NameInMap("DesiredConfiguration")
        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksDesiredConfiguration desiredConfiguration;

        /**
         * <p>The reason why the instance refresh task failed to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>The task exceeded its maximum run time of one week. So the task failed.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The end time of the instance refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22T02:09:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The refreshed number of instances in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FinishedUpdateCapacity")
        public Integer finishedUpdateCapacity;

        /**
         * <p>The ID of the instance refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>ir-1adfa123****</p>
         */
        @NameInMap("InstanceRefreshTaskId")
        public String instanceRefreshTaskId;

        /**
         * <p>The ratio by which the number of instances in the scaling group can exceed the upper limit for the number of instances in the scaling group during instance refresh.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MaxHealthyPercentage")
        public Integer maxHealthyPercentage;

        /**
         * <p>The ratio of the number of instances that provide services to the total number of instances in the scaling group during instance refresh.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("MinHealthyPercentage")
        public Integer minHealthyPercentage;

        /**
         * <p>The region ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp16pbfcr8j9*****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>Indicates whether instances that match the desired scaling configuration are skipped.</p>
         * <blockquote>
         * <p> The system determines the match based on the ID of the desired scaling configuration rather than individual configuration items.</p>
         * </blockquote>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Instances that match the desired scaling configuration are skipped. When you initiate an instance refresh task, the system checks the configurations of all instances. The refresh operation is skipped for instances created based on the desired scaling configuration.</li>
         * <li>false: Instances that match the desired scaling configuration are not skipped. When an instance refresh task is initiated, all instances in the scaling group at the time of initiation are refreshed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SkipMatching")
        public Boolean skipMatching;

        /**
         * <p>The start time of the instance refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-22T01:09:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the instance refresh task. Valid values:</p>
         * <ul>
         * <li>Pending: The instance refresh task is created and is waiting to be scheduled.</li>
         * <li>InProgress: The instance refresh task is being executed.</li>
         * <li>Paused: The instance refresh task is suspended.</li>
         * <li>Failed: The instance refresh task failed to be executed.</li>
         * <li>Successful: The instance refresh task is successful.</li>
         * <li>Cancelling: The instance refresh task is being canceled.</li>
         * <li>Cancelled: The instance refresh task is canceled.</li>
         * <li>RollbackInProgress: The instance refresh task is being rolled back.</li>
         * <li>RollbackSuccessful: The instance refresh task is rolled back.</li>
         * <li>RollbackFailed: The instance refresh task fails to be rolled back.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InProgress</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of instances whose configurations are refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalNeedUpdateCapacity")
        public Integer totalNeedUpdateCapacity;

        public static DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks self = new DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setCheckpointPauseTime(Integer checkpointPauseTime) {
            this.checkpointPauseTime = checkpointPauseTime;
            return this;
        }
        public Integer getCheckpointPauseTime() {
            return this.checkpointPauseTime;
        }

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setCheckpoints(java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints> checkpoints) {
            this.checkpoints = checkpoints;
            return this;
        }
        public java.util.List<DescribeInstanceRefreshesResponseBodyInstanceRefreshTasksCheckpoints> getCheckpoints() {
            return this.checkpoints;
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

        public DescribeInstanceRefreshesResponseBodyInstanceRefreshTasks setSkipMatching(Boolean skipMatching) {
            this.skipMatching = skipMatching;
            return this;
        }
        public Boolean getSkipMatching() {
            return this.skipMatching;
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
