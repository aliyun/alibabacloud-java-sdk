// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class StartInstanceRefreshRequest extends TeaModel {
    /**
     * <p>The duration of the pause when the refresh task checkpoint is entered.</p>
     * <ul>
     * <li>Unit: minutes</li>
     * <li>Valid values: 1 to 2880.</li>
     * <li>Default: 60.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CheckpointPauseTime")
    public Integer checkpointPauseTime;

    /**
     * <p>Refresh Task Checkpoint: specifies that the task is automatically suspended for CheckpointPauseTime minutes when the proportion of new instances reaches the specified value during instance refresh.</p>
     */
    @NameInMap("Checkpoints")
    public java.util.List<StartInstanceRefreshRequestCheckpoints> checkpoints;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25965.html">Ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The desired configurations of the instance refresh task.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>ScalingConfigurationId, ImageId, LaunchTemplateId, and Containers cannot be set at the same time. If you do not specify this parameter, the scaling group is refreshed based on the configurations that are in effect.</p>
     * </li>
     * <li><p>After the instance refresh task is complete, the scaling group uses the scaling configuration specified by this parameter.</p>
     * </li>
     * </ul>
     */
    @NameInMap("DesiredConfiguration")
    public StartInstanceRefreshRequestDesiredConfiguration desiredConfiguration;

    /**
     * <p>The ratio of instances that can exceed the upper limit of the scaling group capacity to all instances in the scaling group during instance refresh. Valid values: 100 to 200. Default value: 120.</p>
     * <blockquote>
     * <p> If you set MinHealthyPercentage and MaxHealthyPercentage to 100, Auto Scaling refreshes the configurations of one instance each time the instance refresh task starts.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxHealthyPercentage")
    public Integer maxHealthyPercentage;

    /**
     * <p>The ratio of instances that are in the In Service state to all instances in the scaling group during instance refresh. Valid values: 0 to 100. Default value: 80.</p>
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
     * <p>Specifies whether to skip instances that match the desired scaling configuration.</p>
     * <blockquote>
     * <p> The system determines the match based on the ID of the desired scaling configuration rather than individual configuration items.</p>
     * </blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: skips instances that match the desired scaling configuration. When you initiate an instance refresh task, the system checks the configurations of all instances. The refresh operation is skipped for instances created based on the desired scaling configuration.</li>
     * <li>false: does not skip instances that match the desired scaling configuration. When an instance refresh task is initiated, all instances in the scaling group at the time of initiation are refreshed.</li>
     * </ul>
     * <p>Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SkipMatching")
    public Boolean skipMatching;

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

    public static class StartInstanceRefreshRequestCheckpoints extends TeaModel {
        /**
         * <p>The percentage of new instances in the scaling group to the total number of instances. When this percentage is reached, the task is automatically suspended. Valid values: 1 to 100 (%).</p>
         * <blockquote>
         * <p> Requires a small to large setting, and the last progress percentage needs to be 100.</p>
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
         * <p> This parameter is unavailable for use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fieldPath</p>
         */
        @NameInMap("FieldRefFieldPath")
        public String fieldRefFieldPath;

        /**
         * <p>The name of the environment variable. It can be 1 to 128 characters in length. Format requirement:[0-9a-zA-Z], and underscores, cannot start with a number.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value must be 0 to 256 bits in length.</p>
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
         * <p>The argument that corresponds to the startup command of the container. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainersEnvironmentVars> environmentVars;

        /**
         * <p>The image in the container.</p>
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
         * <p>The instance type specified by using this parameter overwrites the instance type of the launch template.</p>
         * <blockquote>
         * <p> This parameter takes effect only if you specify LaunchTemplateId.</p>
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
         * <p>The containers in the elastic container instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter supports only scaling groups of the ECI type.</p>
         * </li>
         * <li><p>Only the containers in the scaling configuration list that are the same as those in the <code>Container.Name</code> are refreshed.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Containers")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationContainers> containers;

        /**
         * <p>The image ID.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>After the instance refresh task is complete, the active scaling configuration uses the image specified by this parameter.</p>
         * </li>
         * <li><p>If the instance configuration source of the scaling group is a launch template, you cannot specify this parameter.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>m-2ze8cqacj7opnf***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the launch template that you want to enable in the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-2ze2qli30u***</p>
         */
        @NameInMap("LaunchTemplateId")
        public String launchTemplateId;

        /**
         * <p>The information about the instance types that are extended in the launch template.</p>
         */
        @NameInMap("LaunchTemplateOverrides")
        public java.util.List<StartInstanceRefreshRequestDesiredConfigurationLaunchTemplateOverrides> launchTemplateOverrides;

        /**
         * <p>The version number of the launch template. Valid value:</p>
         * <ul>
         * <li>A fixed template version number.</li>
         * <li>Default: the default version of the template.</li>
         * <li>Latest: the latest version of the template.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the version to Default or Latest, the instance refresh task cannot be rolled back.</p>
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
