// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAppConsistentPointsResponseBody extends TeaModel {
    @NameInMap("AppConsistentPoints")
    public DescribeAppConsistentPointsResponseBodyAppConsistentPoints appConsistentPoints;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppConsistentPointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConsistentPointsResponseBody self = new DescribeAppConsistentPointsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppConsistentPointsResponseBody setAppConsistentPoints(DescribeAppConsistentPointsResponseBodyAppConsistentPoints appConsistentPoints) {
        this.appConsistentPoints = appConsistentPoints;
        return this;
    }
    public DescribeAppConsistentPointsResponseBodyAppConsistentPoints getAppConsistentPoints() {
        return this.appConsistentPoints;
    }

    public DescribeAppConsistentPointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAppConsistentPointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAppConsistentPointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppConsistentPointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeAppConsistentPointsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint extends TeaModel {
        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotTime")
        public Long snapshotTime;

        public static DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint self = new DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint();
            return TeaModel.build(map, self);
        }

        public DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint setSnapshotTime(Long snapshotTime) {
            this.snapshotTime = snapshotTime;
            return this;
        }
        public Long getSnapshotTime() {
            return this.snapshotTime;
        }

    }

    public static class DescribeAppConsistentPointsResponseBodyAppConsistentPoints extends TeaModel {
        @NameInMap("appConsistentPoint")
        public java.util.List<DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint> appConsistentPoint;

        public static DescribeAppConsistentPointsResponseBodyAppConsistentPoints build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppConsistentPointsResponseBodyAppConsistentPoints self = new DescribeAppConsistentPointsResponseBodyAppConsistentPoints();
            return TeaModel.build(map, self);
        }

        public DescribeAppConsistentPointsResponseBodyAppConsistentPoints setAppConsistentPoint(java.util.List<DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint> appConsistentPoint) {
            this.appConsistentPoint = appConsistentPoint;
            return this;
        }
        public java.util.List<DescribeAppConsistentPointsResponseBodyAppConsistentPointsAppConsistentPoint> getAppConsistentPoint() {
            return this.appConsistentPoint;
        }

    }

}
