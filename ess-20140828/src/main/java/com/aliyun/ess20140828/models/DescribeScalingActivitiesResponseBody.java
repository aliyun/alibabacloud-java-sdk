// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeScalingActivitiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("ScalingActivities")
    public DescribeScalingActivitiesResponseBodyScalingActivities scalingActivities;

    public static DescribeScalingActivitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingActivitiesResponseBody self = new DescribeScalingActivitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingActivitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public DescribeScalingActivitiesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeScalingActivitiesResponseBody setScalingActivities(DescribeScalingActivitiesResponseBodyScalingActivities scalingActivities) {
        this.scalingActivities = scalingActivities;
        return this;
    }
    public DescribeScalingActivitiesResponseBodyScalingActivities getScalingActivities() {
        return this.scalingActivities;
    }

    public static class DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity extends TeaModel {
        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ScalingInstanceNumber")
        public Integer scalingInstanceNumber;

        @NameInMap("AttachedCapacity")
        public String attachedCapacity;

        @NameInMap("TotalCapacity")
        public String totalCapacity;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("AutoCreatedCapacity")
        public String autoCreatedCapacity;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("StatusCode")
        public String statusCode;

        @NameInMap("Cause")
        public String cause;

        @NameInMap("ScalingActivityId")
        public String scalingActivityId;

        @NameInMap("StatusMessage")
        public String statusMessage;

        public static DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity self = new DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setScalingInstanceNumber(Integer scalingInstanceNumber) {
            this.scalingInstanceNumber = scalingInstanceNumber;
            return this;
        }
        public Integer getScalingInstanceNumber() {
            return this.scalingInstanceNumber;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setAttachedCapacity(String attachedCapacity) {
            this.attachedCapacity = attachedCapacity;
            return this;
        }
        public String getAttachedCapacity() {
            return this.attachedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setTotalCapacity(String totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public String getTotalCapacity() {
            return this.totalCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setAutoCreatedCapacity(String autoCreatedCapacity) {
            this.autoCreatedCapacity = autoCreatedCapacity;
            return this;
        }
        public String getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setCause(String cause) {
            this.cause = cause;
            return this;
        }
        public String getCause() {
            return this.cause;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setScalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }
        public String getScalingActivityId() {
            return this.scalingActivityId;
        }

        public DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public String getStatusMessage() {
            return this.statusMessage;
        }

    }

    public static class DescribeScalingActivitiesResponseBodyScalingActivities extends TeaModel {
        @NameInMap("ScalingActivity")
        public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity> scalingActivity;

        public static DescribeScalingActivitiesResponseBodyScalingActivities build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingActivitiesResponseBodyScalingActivities self = new DescribeScalingActivitiesResponseBodyScalingActivities();
            return TeaModel.build(map, self);
        }

        public DescribeScalingActivitiesResponseBodyScalingActivities setScalingActivity(java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity> scalingActivity) {
            this.scalingActivity = scalingActivity;
            return this;
        }
        public java.util.List<DescribeScalingActivitiesResponseBodyScalingActivitiesScalingActivity> getScalingActivity() {
            return this.scalingActivity;
        }

    }

}
