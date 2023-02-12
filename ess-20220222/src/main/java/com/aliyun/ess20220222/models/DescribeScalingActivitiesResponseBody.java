// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeScalingActivitiesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the scaling activities.</p>
     */
    @NameInMap("ScalingActivities")
    public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivities> scalingActivities;

    /**
     * <p>The total number of scaling activities.</p>
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

    public static class DescribeScalingActivitiesResponseBodyScalingActivities extends TeaModel {
        /**
         * <p>The total number of instances that were manually added to the scaling group after the scaling activity was complete.</p>
         */
        @NameInMap("AttachedCapacity")
        public String attachedCapacity;

        /**
         * <p>The total number of instances that were created by Auto Scaling after the scaling activity was complete.</p>
         */
        @NameInMap("AutoCreatedCapacity")
        public String autoCreatedCapacity;

        /**
         * <p>The reason why the scaling activity was triggered.</p>
         */
        @NameInMap("Cause")
        public String cause;

        /**
         * <p>The number of instances that were created during the scaling activity.</p>
         */
        @NameInMap("CreatedCapacity")
        public Integer createdCapacity;

        /**
         * <p>The instances that were created during the scaling activity.</p>
         */
        @NameInMap("CreatedInstances")
        public java.util.List<String> createdInstances;

        /**
         * <p>The description of the scaling activity.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The number of instances that were released during the scaling activity.</p>
         */
        @NameInMap("DestroyedCapacity")
        public Integer destroyedCapacity;

        /**
         * <p>The instances that were released during the scaling activity.</p>
         */
        @NameInMap("DestroyedInstances")
        public java.util.List<String> destroyedInstances;

        /**
         * <p>Details of the scaling activity.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time when the scaling activity was complete.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The error code that is returned when the scaling activity failed.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned when the scaling activity failed.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The execution progress of the scaling activity.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The ID of the scaling activity.</p>
         */
        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        /**
         * <p>The ID of the scaling group.</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        /**
         * <p>If the scaling activity is a scale-out activity, the value of this parameter indicates the number of instances that were created during the scaling activity or the number of instances that were started from Economical Mode.</p>
         * <br>
         * <p>If the scaling activity is a scale-in activity, the value of this parameter indicates the number of instances that were deleted during the scaling activity or the number of instances that were stopped in Economical Mode.</p>
         */
        @NameInMap("ScalingInstanceNumber")
        public Integer scalingInstanceNumber;

        /**
         * <p>The time when the scaling activity started.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The number of instances that were started from Economical Mode during the scaling activity.</p>
         */
        @NameInMap("StartedCapacity")
        public Integer startedCapacity;

        /**
         * <p>The instances that were started from Economical Mode during the scaling activity.</p>
         */
        @NameInMap("StartedInstances")
        public java.util.List<String> startedInstances;

        /**
         * <p>The status of the scaling activity. Valid values:</p>
         * <br>
         * <p>*   Successful: The scaling activity is successful.</p>
         * <p>*   Warning: The scaling activity is partially successful.</p>
         * <p>*   Failed: The scaling activity failed.</p>
         * <p>*   InProgress: The scaling activity is in progress.</p>
         * <p>*   Rejected: The request to trigger the scaling activity is rejected.</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The status message of the scaling activity.</p>
         */
        @NameInMap("StatusMessage")
        public String statusMessage;

        /**
         * <p>The number of instances that were stopped in Economical Mode during the scaling activity.</p>
         */
        @NameInMap("StoppedCapacity")
        public Integer stoppedCapacity;

        /**
         * <p>The instances that were stopped in Economical Mode during the scaling activity.</p>
         */
        @NameInMap("StoppedInstances")
        public java.util.List<String> stoppedInstances;

        /**
         * <p>The total number of instances in the scaling group after the scaling activity was complete.</p>
         */
        @NameInMap("TotalCapacity")
        public String totalCapacity;

        public static DescribeScalingActivitiesResponseBodyScalingActivities build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivities self = new DescribeScalingActivitiesResponseBodyScalingActivities();
            return TeaModel.build(map, self);
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

    }

}
