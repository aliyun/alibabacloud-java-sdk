// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshRequest extends TeaModel {
    /**
     * <p>The pause duration when a checkpoint of the refresh task is reached.</p>
     * <ul>
     * <li>Unit: minutes.</li>
     * <li>Valid values: 1 to 2880.</li>
     * <li>Default value: 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CheckpointPauseTime")
    public Integer checkpointPauseTime;

    /**
     * <p>The checkpoints for the refresh task. This parameter specifies that the task is automatically paused for the duration specified by CheckpointPauseTime in minutes when the percentage of new instances reaches the specified value during the instance refresh.</p>
     */
    @NameInMap("Checkpoints")
    public java.util.List<StartInstanceRefreshRequestCheckpoints> checkpoints;

    /**
     * <p>Ensures the idempotence of the request. You can generate the value on the client to ensure that the value is unique across different requests. The value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The desired configuration for the instance refresh.</p>
     * <blockquote>
     * <ul>
     * <li>ScalingConfigurationId, ImageId, LaunchTemplateId, and Containers cannot be specified at the same time. If this parameter is left empty, the instances are refreshed based on the active configuration of the scaling group.</li>
     * <li>After the instance refresh task is successfully executed, the active scaling configuration of the scaling group is updated to this configuration.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("DesiredConfiguration")
    public StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration;

    /**
     * <p>The maximum percentage by which the number of instances in the scaling group can exceed the scaling group capacity during the instance refresh. Valid values: 100 to 200.
     * Default value: 120.</p>
     * <blockquote>
     * <p>If both MinHealthyPercentage and MaxHealthyPercentage are set to 100, one instance is refreshed at a time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxHealthyPercentage")
    public Integer maxHealthyPercentage;

    /**
     * <p>The minimum percentage of the scaling group capacity that must remain in service during the instance refresh. Valid values: 0 to 100.
     * Default value: 80.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("MinHealthyPercentage")
    public Integer minHealthyPercentage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-bp18p2yfxow2dloq****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>Specifies whether to skip instances that match the desired configuration.</p>
     * <blockquote>
     * <p>The system determines whether an instance matches the desired configuration based on the ID of the desired scaling configuration, without comparing specific configuration items.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: skips the instances. When the instance refresh task is started, the system checks the configuration of each instance. Instances that are already created with the desired configuration are not refreshed.</li>
     * <li>false: does not skip the instances. After the instance refresh task is started, all instances in the scaling group are refreshed.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipMatching")
    public Boolean skipMatching;

    /**
     * <p>The execution strategy for the instance refresh task. Valid values:</p>
     * <ul>
     * <li><p>Rolling: refreshes instances by creating new instances and releasing old instances.</p>
     * </li>
     * <li><p>ReplaceSystemDisk: updates the system cloud disks of existing instances by specifying DesiredConfiguration.image.</p>
     * </li>
     * </ul>
     * <p>Default value: Rolling.</p>
     * 
     * <strong>example:</strong>
     * <p>Rolling</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    public static StartInstanceRefreshRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRefreshRequest self = new StartInstanceRefreshRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRefreshRequest setCheckpointPauseTime(Integer checkpointPauseTime) {
        this.checkpointPauseTime = checkpointPauseTime;
        return this;
    }
    public Integer getCheckpointPauseTime() {
        return this.checkpointPauseTime;
    }

    public StartInstanceRefreshRequest setCheckpoints(java.util.List<StartInstanceRefreshRequestCheckpoints> checkpoints) {
        this.checkpoints = checkpoints;
        return this;
    }
    public java.util.List<StartInstanceRefreshRequestCheckpoints> getCheckpoints() {
        return this.checkpoints;
    }

    public StartInstanceRefreshRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartInstanceRefreshRequest setDesiredConfiguration(StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration) {
        this.desiredConfiguration = desiredConfiguration;
        return this;
    }
    public StartInstanceRefreshRequestDesiredConfiguration getDesiredConfiguration() {
        return this.desiredConfiguration;
    }

    public StartInstanceRefreshRequest setMaxHealthyPercentage(Integer maxHealthyPercentage) {
        this.maxHealthyPercentage = maxHealthyPercentage;
        return this;
    }
    public Integer getMaxHealthyPercentage() {
        return this.maxHealthyPercentage;
    }

    public StartInstanceRefreshRequest setMinHealthyPercentage(Integer minHealthyPercentage) {
        this.minHealthyPercentage = minHealthyPercentage;
        return this;
    }
    public Integer getMinHealthyPercentage() {
        return this.minHealthyPercentage;
    }

    public StartInstanceRefreshRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartInstanceRefreshRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartInstanceRefreshRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartInstanceRefreshRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public StartInstanceRefreshRequest setSkipMatching(Boolean skipMatching) {
        this.skipMatching = skipMatching;
        return this;
    }
    public Boolean getSkipMatching() {
        return this.skipMatching;
    }

    public StartInstanceRefreshRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public static class StartInstanceRefreshRequestCheckpoints extends TeaModel {
        /**
         * <p>The percentage of new instances out of the total instances in the scaling group. When this percentage is reached, the task is automatically paused. Valid values: 1 to 100. Unit: %.</p>
         * <blockquote>
         * <p>The values must be set in ascending order, and the last percentage must be 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Percentage")
        public Integer percentage;

        public static StartInstanceRefreshRequestCheckpoints build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestCheckpoints self = new StartInstanceRefreshRequestCheckpoints();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestCheckpoints setPercentage(Integer percentage) {
            this.percentage = percentage;
            return this;
        }
        public Integer getPercentage() {
            return this.percentage;
        }

    }

    public static class StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is not available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fieldPath</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length. It can contain letters, digits, and underscores (_), and cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/bin</p>
         */
        @NameInMap("Value")
        public String value;

        public static StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars self = new StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars setFieldRefFieldPath(String fieldRefFieldPath) {
            this.fieldRefFieldPath = fieldRefFieldPath;
            return this;
        }
        public String getFieldRefFieldPath() {
            return this.fieldRefFieldPath;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class StartInstanceRefreshRequestDesiredConfigurationContainers extends TeaModel {
        /**
         * <p>The arguments for the container startup commands. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands for the container. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars> environmentVars;

        /**
         * <p>The container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry-vpc.cn-hangzhou.aliyuncs.com/eci_open/nginx:latest</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The custom name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Name")
        public String name;

        public static StartInstanceRefreshRequestDesiredConfigurationContainers build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestDesiredConfigurationContainers self = new StartInstanceRefreshRequestDesiredConfigurationContainers();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainers setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainers setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainers setEnvironmentVars(java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainers setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public StartInstanceRefreshRequestDesiredConfigurationContainers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides extends TeaModel {
        /**
         * <p>This parameter is used to specify the instance type, which overrides the instance type in the launch template.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.c5.2xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        public static StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides self = new StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

    public static class StartInstanceRefreshRequestDesiredConfiguration extends TeaModel {
        /**
         * <p>The list of containers included in the instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for Elastic Container Instance (ECI) scaling groups.</li>
         * <li>Only the container configurations whose Container.Name matches the container names in the current scaling configuration are refreshed.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Containers")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainers> containers;

        /**
         * <p>The ID of the image.</p>
         * <blockquote>
         * <ul>
         * <li>After the instance refresh task is successfully executed, the image configuration in the active configuration of the scaling group is updated to this image.</li>
         * <li>This parameter is not supported if the source of the active configuration of the scaling group is a launch template.</li>
         * <li>Images that contain data cloud disks are not supported.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m-2ze8cqacj7opnf***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the launch template. This parameter is used to specify that the scaling group obtains launch configurations from the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-2ze2qli30u***</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The instance type overrides for the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version of the launch template. Valid values:</p>
         * <ul>
         * <li>A specific template version number.</li>
         * <li>Default: always uses the default version of the template.</li>
         * <li>Latest: always uses the latest version of the template.</li>
         * </ul>
         * <blockquote>
         * <p>If the version is set to Default or Latest, the instance refresh task cannot be rolled back.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LaunchTemplateVersion")
        public String launchTemplateVersion;

        /**
         * <p>The ID of the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asc-2zed7lqn4ts4****</p>
         */
        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        public static StartInstanceRefreshRequestDesiredConfiguration build(java.util.Map<String, ?> map) throws Exception {
            StartInstanceRefreshRequestDesiredConfiguration self = new StartInstanceRefreshRequestDesiredConfiguration();
            return TeaModel.build(map, self);
        }

        public StartInstanceRefreshRequestDesiredConfiguration setContainers(java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainers> containers) {
            this.containers = containers;
            return this;
        }
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainers> getContainers() {
            return this.containers;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setLaunchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setLaunchTemplateOverrides(java.util.List<StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides> launchTemplateOverrides) {
            this.launchTemplateOverrides = launchTemplateOverrides;
            return this;
        }
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setLaunchTemplateVersion(String launchTemplateVersion) {
            this.launchTemplateVersion = launchTemplateVersion;
            return this;
        }
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        public StartInstanceRefreshRequestDesiredConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

    }

}
