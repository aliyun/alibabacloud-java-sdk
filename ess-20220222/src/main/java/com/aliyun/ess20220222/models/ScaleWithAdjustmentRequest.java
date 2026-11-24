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
     * <p>The adjustment method for the scaling activity. Valid values:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: Increases or decreases a specified number of ECS instances.</li>
     * <li>PercentChangeInCapacity: Increases or decreases a specified percentage of ECS instances.</li>
     * <li>TotalCapacity: Adjusts the number of ECS instances in the current scaling group to a specified number.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The adjustment value for the scaling activity. In all cases, the number of ECS instances adjusted in a single operation cannot exceed 1,000. Otherwise, the adjustment fails. Valid values vary based on the adjustment method:</p>
     * <ul>
     * <li>QuantityChangeInCapacity: -1,000 to 1,000.</li>
     * <li>PercentChangeInCapacity: -100 to 10,000.</li>
     * <li>TotalCapacity: 0 to 2,000.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li>None: Not specified. Normal scaling is performed.</li>
     * <li>PlanOnly: Does not trigger scaling. Only elastic planning is executed. The planning results, including instance types, zone IDs, billing methods, and the number of instances to be created, are returned in PlanResult.</li>
     * </ul>
     * <p>Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>PlanOnly</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The context information of the lifecycle hook.</p>
     */
    @NameInMap("LifecycleHookContext")
    public ScaleWithAdjustmentRequestLifecycleHookContext lifecycleHookContext;

    /**
     * <p>The minimum number of instances to be adjusted in the scaling activity. This parameter takes effect only when <code>AdjustmentType</code> is set to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    /**
     * <p>The override parameters specified for scaling out an Elastic Container Instance (ECI) scaling group.</p>
     */
    @NameInMap("Overrides")
    public ScaleWithAdjustmentRequestOverrides overrides;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether the current scaling task supports concurrent execution.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ParallelTask")
    public Boolean parallelTask;

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
     * <p>Specifies whether to synchronously execute the scaling activity. This parameter is valid only for scaling groups that have the expected number of instances configured. Valid values:</p>
     * <ul>
     * <li>true: Synchronous process. When the scaling rule is executed, the scale-out or scale-in activity of the scaling group is directly triggered.</li>
     * <li>false: Asynchronous process. When the expected number of instances in the scaling group is modified, the actual scale-out or scale-in activity of the scaling group is not immediately triggered. The system automatically detects the difference between the expected number of instances and the current number of instances in the scaling group, and then triggers the scale-out or scale-in activity.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the expected number of instances, see <a href="https://help.aliyun.com/document_detail/146231.html">Expected number of instances</a>.</p>
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

    public ScaleWithAdjustmentRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
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

    public ScaleWithAdjustmentRequest setParallelTask(Boolean parallelTask) {
        this.parallelTask = parallelTask;
        return this;
    }
    public Boolean getParallelTask() {
        return this.parallelTask;
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
         * <p>Specifies whether to disable all lifecycle hooks for the scaling activity. Valid values:</p>
         * <ul>
         * <li>true: Disables all lifecycle hooks.</li>
         * <li>false: Does not disable lifecycle hooks.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableLifecycleHook")
        public Boolean disableLifecycleHook;

        /**
         * <p>The list of IDs of the lifecycle hooks that are disabled for the scaling activity.</p>
         */
        @NameInMap("IgnoredLifecycleHookIds")
        public java.util.List<String> ignoredLifecycleHookIds;

        /**
         * <p>The default execution result of the lifecycle hook in this scaling activity. If specified, this value overrides the original default execution result of the hook.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("LifecycleHookResult")
        public String lifecycleHookResult;

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

        public ScaleWithAdjustmentRequestLifecycleHookContext setLifecycleHookResult(String lifecycleHookResult) {
            this.lifecycleHookResult = lifecycleHookResult;
            return this;
        }
        public String getLifecycleHookResult() {
            return this.lifecycleHookResult;
        }

    }

    public static class ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars extends TeaModel {
        /**
         * <p>The name of the environment variable. The name must be 1 to 128 characters in length. It can contain letters, digits, and underscores (_), and cannot start with a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable. The value can be 0 to 256 characters in length.</p>
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
         * <p>The arguments for the container startup command. A maximum of 10 arguments can be specified.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The startup commands for the container. A maximum of 20 commands can be specified. Each command can contain up to 256 characters.</p>
         */
        @NameInMap("Commands")
        public java.util.List<String> commands;

        /**
         * <p>The number of vCPUs for the container. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars> environmentVars;

        /**
         * <p>The memory size of the container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container. When you need to override container parameters, you must specify the container name. The container parameters can be overridden only when the container name matches the container name in the scaling configuration.</p>
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
         * <p>The override parameters for the container list.</p>
         */
        @NameInMap("ContainerOverrides")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverrides> containerOverrides;

        /**
         * <p>The number of vCPUs at the instance level. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The memory size at the instance level. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The user data of the ECS instance. The user data must be encoded in Base64. The maximum size of the raw data before encoding is 32 KB.</p>
         * 
         * <strong>example:</strong>
         * <p>ZWNobyBoZWxsbyBlY3Mh</p>
         */
        @NameInMap("UserData")
        public String userData;

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

        public ScaleWithAdjustmentRequestOverrides setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
