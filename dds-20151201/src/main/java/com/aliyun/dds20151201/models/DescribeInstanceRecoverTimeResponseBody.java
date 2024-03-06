// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceRecoverTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreRanges")
    public java.util.List<DescribeInstanceRecoverTimeResponseBodyRestoreRanges> restoreRanges;

    public static DescribeInstanceRecoverTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRecoverTimeResponseBody self = new DescribeInstanceRecoverTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRecoverTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceRecoverTimeResponseBody setRestoreRanges(java.util.List<DescribeInstanceRecoverTimeResponseBodyRestoreRanges> restoreRanges) {
        this.restoreRanges = restoreRanges;
        return this;
    }
    public java.util.List<DescribeInstanceRecoverTimeResponseBodyRestoreRanges> getRestoreRanges() {
        return this.restoreRanges;
    }

    public static class DescribeInstanceRecoverTimeResponseBodyRestoreRanges extends TeaModel {
        @NameInMap("RestoreBeginTime")
        public String restoreBeginTime;

        @NameInMap("RestoreEndTime")
        public String restoreEndTime;

        @NameInMap("RestoreType")
        public String restoreType;

        public static DescribeInstanceRecoverTimeResponseBodyRestoreRanges build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceRecoverTimeResponseBodyRestoreRanges self = new DescribeInstanceRecoverTimeResponseBodyRestoreRanges();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceRecoverTimeResponseBodyRestoreRanges setRestoreBeginTime(String restoreBeginTime) {
            this.restoreBeginTime = restoreBeginTime;
            return this;
        }
        public String getRestoreBeginTime() {
            return this.restoreBeginTime;
        }

        public DescribeInstanceRecoverTimeResponseBodyRestoreRanges setRestoreEndTime(String restoreEndTime) {
            this.restoreEndTime = restoreEndTime;
            return this;
        }
        public String getRestoreEndTime() {
            return this.restoreEndTime;
        }

        public DescribeInstanceRecoverTimeResponseBodyRestoreRanges setRestoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }
        public String getRestoreType() {
            return this.restoreType;
        }

    }

}
