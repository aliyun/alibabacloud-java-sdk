// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPointsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RecoveryPoints")
    public DescribeRecoveryPointsResponseBodyRecoveryPoints recoveryPoints;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRecoveryPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPointsResponseBody self = new DescribeRecoveryPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoveryPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoveryPointsResponseBody setRecoveryPoints(DescribeRecoveryPointsResponseBodyRecoveryPoints recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }
    public DescribeRecoveryPointsResponseBodyRecoveryPoints getRecoveryPoints() {
        return this.recoveryPoints;
    }

    public DescribeRecoveryPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoveryPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecoveryPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint extends TeaModel {
        @NameInMap("ApplicationConsistent")
        public Boolean applicationConsistent;

        @NameInMap("DisableReason")
        public String disableReason;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("RecoveryPointId")
        public String recoveryPointId;

        @NameInMap("RecoveryPointTime")
        public Long recoveryPointTime;

        @NameInMap("Used")
        public Boolean used;

        public static DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint self = new DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setApplicationConsistent(Boolean applicationConsistent) {
            this.applicationConsistent = applicationConsistent;
            return this;
        }
        public Boolean getApplicationConsistent() {
            return this.applicationConsistent;
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setDisableReason(String disableReason) {
            this.disableReason = disableReason;
            return this;
        }
        public String getDisableReason() {
            return this.disableReason;
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setRecoveryPointId(String recoveryPointId) {
            this.recoveryPointId = recoveryPointId;
            return this;
        }
        public String getRecoveryPointId() {
            return this.recoveryPointId;
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setRecoveryPointTime(Long recoveryPointTime) {
            this.recoveryPointTime = recoveryPointTime;
            return this;
        }
        public Long getRecoveryPointTime() {
            return this.recoveryPointTime;
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

    public static class DescribeRecoveryPointsResponseBodyRecoveryPoints extends TeaModel {
        @NameInMap("recoveryPoint")
        public java.util.List<DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint> recoveryPoint;

        public static DescribeRecoveryPointsResponseBodyRecoveryPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPointsResponseBodyRecoveryPoints self = new DescribeRecoveryPointsResponseBodyRecoveryPoints();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPointsResponseBodyRecoveryPoints setRecoveryPoint(java.util.List<DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint> recoveryPoint) {
            this.recoveryPoint = recoveryPoint;
            return this;
        }
        public java.util.List<DescribeRecoveryPointsResponseBodyRecoveryPointsRecoveryPoint> getRecoveryPoint() {
            return this.recoveryPoint;
        }

    }

}
