// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class ScaleWithAdjustmentRequest extends TeaModel {
    /**
     * <p>The metadata for the scaling activity.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("ActivityMetadata")
    public String activityMetadata;

    /**
     * <p>The method used to adjust the number of instances in a scaling activity. Valid values:</p>
     * <ul>
     * <li><p><code>QuantityChangeInCapacity</code>: Adds or removes a specified number of ECS instances.</p>
     * </li>
     * <li><p><code>PercentChangeInCapacity</code>: Adds or removes a specified percentage of ECS instances.</p>
     * </li>
     * <li><p><code>TotalCapacity</code>: Adjusts the number of ECS instances in the scaling group to a specified number.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QuantityChangeInCapacity</p>
     */
    @NameInMap("AdjustmentType")
    public String adjustmentType;

    /**
     * <p>The adjustment value for the scaling activity. A single adjustment cannot add or remove more than 1,000 ECS instances. The valid range depends on <code>AdjustmentType</code>:</p>
     * <ul>
     * <li><p><code>QuantityChangeInCapacity</code>: -1000 to 1000.</p>
     * </li>
     * <li><p><code>PercentChangeInCapacity</code>: -100 to 10000.</p>
     * </li>
     * <li><p><code>TotalCapacity</code>: 0 to 2000.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AdjustmentValue")
    public Integer adjustmentValue;

    /**
     * <p>A client-generated token to ensure the idempotence of the request. This token must be a unique string of up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li><p><code>None</code>: Executes a standard scaling activity.</p>
     * </li>
     * <li><p><code>PlanOnly</code>: Only performs elastic planning and returns the results in <code>PlanResult</code> without triggering the scaling activity. The results include details such as instance types, availability zones, billing methods, and the number of new instances.</p>
     * </li>
     * </ul>
     * <p>Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>PlanOnly</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The lifecycle hook context.</p>
     */
    @NameInMap("LifecycleHookContext")
    public ScaleWithAdjustmentRequestLifecycleHookContext lifecycleHookContext;

    /**
     * <p>The minimum number of instances to adjust in a scaling activity. This parameter takes effect only when <code>AdjustmentType</code> is set to <code>PercentChangeInCapacity</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MinAdjustmentMagnitude")
    public Integer minAdjustmentMagnitude;

    /**
     * <p>The parameters to override when scaling out an ECI scaling group.</p>
     */
    @NameInMap("Overrides")
    public ScaleWithAdjustmentRequestOverrides overrides;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether the current scaling activity supports concurrency.</p>
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
     * <p>Specifies whether to execute the scaling activity synchronously. This parameter applies only to scaling groups that are configured with an expected number of instances. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: Synchronous execution. The scaling activity is triggered immediately.</p>
     * </li>
     * <li><p><code>false</code>: Asynchronous execution. The call updates the expected number of instances without immediately triggering the scaling activity. The activity occurs when the system detects a discrepancy between the new expected number and the current number of instances.</p>
     * </li>
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
         * <li><p><code>true</code>: Disables all lifecycle hooks.</p>
         * </li>
         * <li><p><code>false</code>: Does not disable lifecycle hooks.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DisableLifecycleHook")
        public Boolean disableLifecycleHook;

        /**
         * <p>A list of lifecycle hook IDs to ignore during the scaling activity.</p>
         */
        @NameInMap("IgnoredLifecycleHookIds")
        public java.util.List<String> ignoredLifecycleHookIds;

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
         * <p>The name of the environment variable. It must be 1 to 128 characters long, cannot start with a digit, and can contain only letters (a-z, A-Z), digits (0-9), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>PATH</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the environment variable, up to 256 characters long.</p>
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
         * <p>The arguments for the container\&quot;s startup command. You can specify up to 10 arguments.</p>
         */
        @NameInMap("Args")
        public java.util.List<String> args;

        /**
         * <p>The container\&quot;s startup command, specified as an array of strings. You can specify up to 20 strings, and each can be up to 256 characters long.</p>
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
         * <p>Environment variables to set in the container.</p>
         */
        @NameInMap("EnvironmentVars")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverridesEnvironmentVars> environmentVars;

        /**
         * <p>The memory size for the container. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The name of the container to override. The override takes effect only if this name matches a container name in the scaling configuration.</p>
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
         * <p>A list of container-specific overrides.</p>
         */
        @NameInMap("ContainerOverrides")
        public java.util.List<ScaleWithAdjustmentRequestOverridesContainerOverrides> containerOverrides;

        /**
         * <p>The number of vCPUs for the instance. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Float cpu;

        /**
         * <p>The memory size for the instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The user data for the ECS instance. It must be Base64-encoded, and the raw data cannot exceed 32 KB.</p>
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
