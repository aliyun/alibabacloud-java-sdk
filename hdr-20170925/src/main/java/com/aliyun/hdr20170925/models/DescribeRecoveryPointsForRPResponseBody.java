// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPointsForRPResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RecoveryPoints")
    public DescribeRecoveryPointsForRPResponseBodyRecoveryPoints recoveryPoints;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRecoveryPointsForRPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPointsForRPResponseBody self = new DescribeRecoveryPointsForRPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPointsForRPResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRecoveryPointsForRPResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRecoveryPointsForRPResponseBody setRecoveryPoints(DescribeRecoveryPointsForRPResponseBodyRecoveryPoints recoveryPoints) {
        this.recoveryPoints = recoveryPoints;
        return this;
    }
    public DescribeRecoveryPointsForRPResponseBodyRecoveryPoints getRecoveryPoints() {
        return this.recoveryPoints;
    }

    public DescribeRecoveryPointsForRPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRecoveryPointsForRPResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRecoveryPointsForRPResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint extends TeaModel {
        @NameInMap("RecoveryPointTime")
        public Long recoveryPointTime;

        @NameInMap("Used")
        public Boolean used;

        public static DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint self = new DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint setRecoveryPointTime(Long recoveryPointTime) {
            this.recoveryPointTime = recoveryPointTime;
            return this;
        }
        public Long getRecoveryPointTime() {
            return this.recoveryPointTime;
        }

        public DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint setUsed(Boolean used) {
            this.used = used;
            return this;
        }
        public Boolean getUsed() {
            return this.used;
        }

    }

    public static class DescribeRecoveryPointsForRPResponseBodyRecoveryPoints extends TeaModel {
        @NameInMap("recoveryPoint")
        public java.util.List<DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint> recoveryPoint;

        public static DescribeRecoveryPointsForRPResponseBodyRecoveryPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeRecoveryPointsForRPResponseBodyRecoveryPoints self = new DescribeRecoveryPointsForRPResponseBodyRecoveryPoints();
            return TeaModel.build(map, self);
        }

        public DescribeRecoveryPointsForRPResponseBodyRecoveryPoints setRecoveryPoint(java.util.List<DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint> recoveryPoint) {
            this.recoveryPoint = recoveryPoint;
            return this;
        }
        public java.util.List<DescribeRecoveryPointsForRPResponseBodyRecoveryPointsRecoveryPoint> getRecoveryPoint() {
            return this.recoveryPoint;
        }

    }

}
