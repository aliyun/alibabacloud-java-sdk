// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentRequest extends TeaModel {
    /**
     * <p>The metadata of the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ActivityMetadata")
    public String activityMetadata;

    /**
     * <p>The type of the scaling policy. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: adds the specified number of ECS instances to or removes the specified number of ECS instances from the scaling group.</li>
     * <li>PercentChangeInCapacity: adds the specified percentage of ECS instances to or removes the specified percentage of ECS instances from the scaling group.</li>
     * <li>TotalCapacity: adjusts the number of ECS instances in the scaling group to a specified number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The number of instances in each adjustment. The number of ECS instances in each adjustment cannot exceed 1,000.</p>
     * <ul>
     * <li>Valid values if you set the AdjustmentType parameter to QuantityChangeInCapacity: -1000 to 1000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to PercentChangeInCapacity: -100 to 10000.</li>
     * <li>Valid values if you set the AdjustmentType parameter to TotalCapacity: 0 to 2000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The context of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookContext")
    public ScaleWithAdjustmentRequestLifecycleHookContext lifecycleHookContext;

    /**
     * <p>The minimum number of instances allowed in each adjustment. This parameter takes effect only if you set the <code>AdjustmentType</code> parameter to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    /**
     * <p>The overrides that allow you to adjust the scaling group of the Elastic Container Instance type during a scale-out event.</p>
     */
    @NameInMap("Overrides")
    public ScaleWithAdjustmentRequestOverrides overrides;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The ID of the scaling group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>asg-j6c1o397427hyjdc****</p>
     */
    @NameInMap("ScalingGroupId")
    public String scalingGroupId;

    /**
     * <p>Specifies whether to trigger the scaling activity in a synchronous manner. This parameter takes effect only on scaling groups for which you specified an expected number of instances. Valid values:</p>
     * <ul>
     * <li>true: triggers the scaling activity in a synchronous manner. The scaling activity is triggered at the time when the scaling rule is executed.</li>
     * <li>false: does not trigger the scaling activity in a synchronous manner. After you change the expected number of instances for the scaling group, Auto Scaling checks whether the total number of instances in the scaling group matches the new expected number of instances and determines whether to trigger the scaling activity based on the check result.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the Expected Number of Instances feature, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
     * </blockquote>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SyncActivity")
    public Boolean syncActivity;

    public static ScaleWithAdjustmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleWithAdjustmentRequest self = new ScaleWithAdjustmentRequest();
        return TeaModel.build(map, self);
    }

    public ScaleWithAdjustmentRequest setActivityMetadata(String activityMetadata) {
        this.activityMetadata = activityMetadata;
        return this;
    }
    public String getActivityMetadata() {
        return this.activityMetadata;
    }

    public ScaleWithAdjustmentRequest setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }
    public String getAdjustmentType() {
        return this.adjustmentType;
    }

    public ScaleWithAdjustmentRequest setAdjustmentValue(Integer adjustmentValue) {
        this.adjustmentValue = adjustmentValue;
        return this;
    }
    public Integer getAdjustmentValue() {
        return this.adjustmentValue;
    }

    public ScaleWithAdjustmentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ScaleWithAdjustmentRequest setLifecycleHookContext(ScaleWithAdjustmentRequestLifecycleHookContext lifecycleHookContext) {
        this.lifecycleHookContext = lifecycleHookContext;
        return this;
    }
    public ScaleWithAdjustmentRequestLifecycleHookContext getLifecycleHookContext() {
        return this.lifecycleHookContext;
    }

    public ScaleWithAdjustmentRequest setMinAdjustmentMagnitude(Integer minAdjustmentMagnitude) {
        this.minAdjustmentMagnitude = minAdjustmentMagnitude;
        return this;
    }
    public Integer getMinAdjustmentMagnitude() {
        return this.minAdjustmentMagnitude;
    }

    public ScaleWithAdjustmentRequest setOverrides(ScaleWithAdjustmentRequestOverrides overrides) {
        this.overrides = overrides;
        return this;
    }
    public ScaleWithAdjustmentRequestOverrides getOverrides() {
        return this.overrides;
    }

    public ScaleWithAdjustmentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ScaleWithAdjustmentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ScaleWithAdjustmentRequest setScalingGroupId(String scalingGroupId) {
        this.scalingGroupId = scalingGroupId;
        return this;
    }
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public ScaleWithAdjustmentRequest setSyncActivity(Boolean syncActivity) {
        this.syncActivity = syncActivity;
        return this;
    }
    public Boolean getSyncActivity() {
        return this.syncActivity;
    }

    public static class ScaleWithAdjustmentRequestLifecycleHookContext extends TeaModel {
        /**
         * <p>Specifies whether to disable the Lifecycle Hook feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableLifecycleHook")
        public Boolean disableLifecycleHook;

        /**
         * <p>The IDs of the lifecycle hooks that you want to disable.</p>
         */
        @NameInMap("IgnoredLifecycleHookIds")
        public java.util.List<String> ignoredLifecycleHookIds;

        public static ScaleWithAdjustmentRequestLifecycleHookContext build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentRequestLifecycleHookContext self = new ScaleWithAdjustmentRequestLifecycleHookContext();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentRequestLifecycleHookContext setDisableLifecycleHook(Boolean disableLifecycleHook) {
            this.disableLifecycleHook = disableLifecycleHook;
            return this;
        }
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        public ScaleWithAdjustmentRequestLifecycleHookContext setIgnoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
            this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
            return this;
        }
        public java.util.List<String> getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

    }

    public static class ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars extends TeaModel {
        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length and can contain letters, underscores (_), and digits. The name cannot start with a digit. Specify the value in the <code>[0-9a-zA-Z]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/local/tomcat</p>
         */
        @NameInMap("Value")
        public String value;

        public static ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars self = new ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ScaleWithAdjustmentRequestOverridesContainerOverrides extends TeaModel {
        /**
         * <p>The arguments that correspond to the startup commands of the container. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container startup commands. You can specify up to 20 commands. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs that you want to allocate to the container.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The information about the environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars> environmentVars;

        /**
         * <p>The memory size that you want to allocate to the container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The container name. If you specify ContainerOverrides, you must also specify Name. ContainerOverrides takes effect only when the container name specified by Name matches that specified in the scaling configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>container-1</p>
         */
        @NameInMap("Name")
        public String name;

        public static ScaleWithAdjustmentRequestOverridesContainerOverrides build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentRequestOverridesContainerOverrides self = new ScaleWithAdjustmentRequestOverridesContainerOverrides();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setArgs(java.util.List<String> args) {
            this.args = args;
            return this;
        }
        public java.util.List<String> getArgs() {
            return this.args;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setEnvironmentVars(java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars> environmentVars) {
            this.environmentVars = environmentVars;
            return this;
        }
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars> getEnvironmentVars() {
            return this.environmentVars;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ScaleWithAdjustmentRequestOverridesContainerOverrides setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ScaleWithAdjustmentRequestOverrides extends TeaModel {
        /**
         * <p>The list of parameters that you want to use to override specific configurations for containers.</p>
         */
        @NameInMap("ContainerOverrides")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverrides> containerOverrides;

        /**
         * <p>The number of vCPUs that you want to allocate to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The memory size that you want to allocate to the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        public static ScaleWithAdjustmentRequestOverrides build(java.util.Map<String, ?> map) throws Exception {
            ScaleWithAdjustmentRequestOverrides self = new ScaleWithAdjustmentRequestOverrides();
            return TeaModel.build(map, self);
        }

        public ScaleWithAdjustmentRequestOverrides setContainerOverrides(java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverrides> containerOverrides) {
            this.containerOverrides = containerOverrides;
            return this;
        }
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverrides> getContainerOverrides() {
            return this.containerOverrides;
        }

        public ScaleWithAdjustmentRequestOverrides setCpu(Float cpu) {
            this.cpu = cpu;
            return this;
        }
        public Float getCpu() {
            return this.cpu;
        }

        public ScaleWithAdjustmentRequestOverrides setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

    }

}
