// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivitiesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CC107349-57B7-4405-B1BF-9BF5AF7F2A46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scaling activities.</p>
     */
    @NameInMap("ScalingActivities")
    public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivities> scalingActivities;

    /**
     * <p>The total number of scaling activities.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivitiesResponseBody self = new DescribeScalingActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivitiesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingActivitiesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingActivitiesResponseBody setScalingActivities(java.util.List<DescribeScalingActivitiesResponseBodyScalingActivities> scalingActivities) {
        this.scalingActivities = scalingActivities;
        return this;
    }
    public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivities> getScalingActivities() {
        return this.scalingActivities;
    }

    public DescribeScalingActivitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages extends TeaModel {
        /**
         * <p>The error code that is returned when the scaling activity failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationDenied.NoStock</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The description of the scaling activity exception.</p>
         * 
         * <strong>example:</strong>
         * <p>Fail to create instances into scaling group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IDs of the instances included in the failed scaling activities.</p>
         */
        @NameInMap("FailedInstanceIds")
        public java.util.List<String> failedInstanceIds;

        /**
         * <p>The error message that is returned when the scaling activity failed or is partially successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource is out of stock in the specified zone. Please try other types, or choose other regions and zones.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages self = new DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages setFailedInstanceIds(java.util.List<String> failedInstanceIds) {
            this.failedInstanceIds = failedInstanceIds;
            return this;
        }
        public java.util.List<String> getFailedInstanceIds() {
            return this.failedInstanceIds;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext extends TeaModel {
        /**
         * <p>Indicates whether all lifecycle hooks are disabled when the scaling activity is triggered. Valid values:</p>
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
         * <p>The IDs of the lifecycle hooks that are disabled.</p>
         */
        @NameInMap("IgnoredLifecycleHookIds")
        public java.util.List<String> ignoredLifecycleHookIds;

        public static DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext self = new DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext setDisableLifecycleHook(Boolean disableLifecycleHook) {
            this.disableLifecycleHook = disableLifecycleHook;
            return this;
        }
        public Boolean getDisableLifecycleHook() {
            return this.disableLifecycleHook;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext setIgnoredLifecycleHookIds(java.util.List<String> ignoredLifecycleHookIds) {
            this.ignoredLifecycleHookIds = ignoredLifecycleHookIds;
            return this;
        }
        public java.util.List<String> getIgnoredLifecycleHookIds() {
            return this.ignoredLifecycleHookIds;
        }

    }

    public static class DescribeScalingActivitiesResponseBodyScalingActivities extends TeaModel {
        /**
         * <p>The metadata of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;goatscaler.io/managed\&quot;:\&quot;true\&quot;}</p>
         */
        @NameInMap("ActivityMetadata")
        public String activityMetadata;

        /**
         * <p>The total number of instances that are manually added to the scaling group after the scaling activity is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttachedCapacity")
        public String attachedCapacity;

        /**
         * <p>The total number of instances that are created by Auto Scaling after the scaling activity was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AutoCreatedCapacity")
        public String autoCreatedCapacity;

        /**
         * <p>The reason why the scaling activity was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>A user requests to execute scaling rule \&quot;asr-bp12tcnol686y1ik****\&quot;, changing the Total Capacity from \&quot;1\&quot; to \&quot;2\&quot;.</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The number of instances that are created during the scale-out event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreatedCapacity")
        public Integer createdCapacity;

        /**
         * <p>The instances that are created during the scale-out event.</p>
         */
        @NameInMap("CreatedInstances")
        public java.util.List<String> createdInstances;

        /**
         * <p>The description of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Add \&quot;1\&quot; ECS instance</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of instances that are released during the scale-in event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DestroyedCapacity")
        public Integer destroyedCapacity;

        /**
         * <p>The instances that are released during the scale-in event.</p>
         */
        @NameInMap("DestroyedInstances")
        public java.util.List<String> destroyedInstances;

        /**
         * <p>Details of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;new ECS instances &quot;i-j6c8ilerw, i-j6c8iler4mx&quot; are created.&quot;</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the scaling activity was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-10T09:54Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The error code that is returned when the scaling activity failed.</p>
         * 
         * <strong>example:</strong>
         * <p>OperationDenied.NoStock</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned when the scaling activity failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified ECS resource is out of stock in this region. Please try again later.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The error messages that are returned when the scaling activities failed or are partially successful.</p>
         */
        @NameInMap("ErrorMessages")
        public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages> errorMessages;

        /**
         * <p>The ID of the instance refresh task.</p>
         * 
         * <strong>example:</strong>
         * <p>ir-asdf12adsxg*****</p>
         */
        @NameInMap("InstanceRefreshTaskId")
        public String instanceRefreshTaskId;

        /**
         * <p>The context of the lifecycle hook.</p>
         */
        @NameInMap("LifecycleHookContext")
        public DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext lifecycleHookContext;

        /**
         * <p>The execution progress of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp161xudmuxdzofe****</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <ul>
         * <li>If you query a scale-out activity, the value of this parameter indicates the number of instances that are created or the number of instances that are started from Economical Mode.</li>
         * <li>If you query a scale-in activity, the value of this parameter indicates the number of instances that are deleted or the number of instances that are stopped in Economical Mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScalingInstanceNumber")
        public Integer scalingInstanceNumber;

        /**
         * <p>The time when the scaling activity was started.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-10T09:54Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The number of instances that are started from the Economical Mode during the scale-out event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StartedCapacity")
        public Integer startedCapacity;

        /**
         * <p>The instances that are started from the Economical Mode during the scale-out event.</p>
         */
        @NameInMap("StartedInstances")
        public java.util.List<String> startedInstances;

        /**
         * <p>The status of the scaling activity. Valid values:</p>
         * <ul>
         * <li>Successful: The scaling activity is successful.</li>
         * <li>Warning: The scaling activity is partially successful.</li>
         * <li>Failed: The scaling activity failed.</li>
         * <li>InProgress: The scaling activity is in progress.</li>
         * <li>Rejected: The request to trigger the scaling activity is rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The status message of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>\&quot;1\&quot; ECS instances are added</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The number of instances that are stopped in the Economical Mode during the scale-in event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        /**
         * <p>The instances that are stopped in the Economical Mode during the scale-in event.</p>
         */
        @NameInMap("StoppedInstances")
        public java.util.List<String> stoppedInstances;

        /**
         * <p>The total number of instances in the scaling group after the scaling activity was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCapacity")
        public String totalCapacity;

        /**
         * <p>The ID of the trigger source of the scaling activity. Valid values:</p>
         * <ul>
         * <li>If the scaling activity is triggered by an event-triggered task, the ID of the trigger source is the ID of the event-triggered task.</li>
         * <li>If the scaling activity is triggered by calling an API operation, the ID of the trigger source is the ID of the Alibaba Cloud account or Resource Access Management (RAM) user that you use to call the API operation.</li>
         * <li>If the scaling activity is triggered by Auto Scaling, the ID of the trigger source is null.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2346366580*****</p>
         */
        @NameInMap("TriggerSourceId")
        public String triggerSourceId;

        /**
         * <p>The type of the trigger source of the scaling activity. Valid values:</p>
         * <ul>
         * <li>Cms: The scaling activity is triggered by an event-triggered task.</li>
         * <li>APIs: The scaling activity is triggered by calling an API operation.</li>
         * <li>Ess: The scaling activity is triggered by Auto Scaling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Api</p>
         */
        @NameInMap("TriggerSourceType")
        public String triggerSourceType;

        public static DescribeScalingActivitiesResponseBodyScalingActivities build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivities self = new DescribeScalingActivitiesResponseBodyScalingActivities();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setActivityMetadata(String activityMetadata) {
            this.activityMetadata = activityMetadata;
            return this;
        }
        public String getActivityMetadata() {
            return this.activityMetadata;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setAttachedCapacity(String attachedCapacity) {
            this.attachedCapacity = attachedCapacity;
            return this;
        }
        public String getAttachedCapacity() {
            return this.attachedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setAutoCreatedCapacity(String autoCreatedCapacity) {
            this.autoCreatedCapacity = autoCreatedCapacity;
            return this;
        }
        public String getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setCreatedCapacity(Integer createdCapacity) {
            this.createdCapacity = createdCapacity;
            return this;
        }
        public Integer getCreatedCapacity() {
            return this.createdCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setCreatedInstances(java.util.List<String> createdInstances) {
            this.createdInstances = createdInstances;
            return this;
        }
        public java.util.List<String> getCreatedInstances() {
            return this.createdInstances;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setDestroyedCapacity(Integer destroyedCapacity) {
            this.destroyedCapacity = destroyedCapacity;
            return this;
        }
        public Integer getDestroyedCapacity() {
            return this.destroyedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setDestroyedInstances(java.util.List<String> destroyedInstances) {
            this.destroyedInstances = destroyedInstances;
            return this;
        }
        public java.util.List<String> getDestroyedInstances() {
            return this.destroyedInstances;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setErrorMessages(java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages> errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }
        public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesErrorMessages> getErrorMessages() {
            return this.errorMessages;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setInstanceRefreshTaskId(String instanceRefreshTaskId) {
            this.instanceRefreshTaskId = instanceRefreshTaskId;
            return this;
        }
        public String getInstanceRefreshTaskId() {
            return this.instanceRefreshTaskId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setLifecycleHookContext(DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext lifecycleHookContext) {
            this.lifecycleHookContext = lifecycleHookContext;
            return this;
        }
        public DescribeScalingActivitiesResponseBodyScalingActivitiesLifecycleHookContext getLifecycleHookContext() {
            return this.lifecycleHookContext;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setScalingInstanceNumber(Integer scalingInstanceNumber) {
            this.scalingInstanceNumber = scalingInstanceNumber;
            return this;
        }
        public Integer getScalingInstanceNumber() {
            return this.scalingInstanceNumber;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStartedCapacity(Integer startedCapacity) {
            this.startedCapacity = startedCapacity;
            return this;
        }
        public Integer getStartedCapacity() {
            return this.startedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStartedInstances(java.util.List<String> startedInstances) {
            this.startedInstances = startedInstances;
            return this;
        }
        public java.util.List<String> getStartedInstances() {
            return this.startedInstances;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStoppedCapacity(Integer stoppedCapacity) {
            this.stoppedCapacity = stoppedCapacity;
            return this;
        }
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setStoppedInstances(java.util.List<String> stoppedInstances) {
            this.stoppedInstances = stoppedInstances;
            return this;
        }
        public java.util.List<String> getStoppedInstances() {
            return this.stoppedInstances;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setTotalCapacity(String totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setTriggerSourceId(String triggerSourceId) {
            this.triggerSourceId = triggerSourceId;
            return this;
        }
        public String getTriggerSourceId() {
            return this.triggerSourceId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setTriggerSourceType(String triggerSourceType) {
            this.triggerSourceType = triggerSourceType;
            return this;
        }
        public String getTriggerSourceType() {
            return this.triggerSourceType;
        }

    }

}
