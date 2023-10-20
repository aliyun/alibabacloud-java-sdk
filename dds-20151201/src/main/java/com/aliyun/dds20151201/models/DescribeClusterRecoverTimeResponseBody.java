// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeClusterRecoverTimeResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreRanges")
    public java.util.List<DescribeClusterRecoverTimeResponseBodyRestoreRanges> restoreRanges;

    public static DescribeClusterRecoverTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterRecoverTimeResponseBody self = new DescribeClusterRecoverTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterRecoverTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterRecoverTimeResponseBody setRestoreRanges(java.util.List<DescribeClusterRecoverTimeResponseBodyRestoreRanges> restoreRanges) {
        this.restoreRanges = restoreRanges;
        return this;
    }
    public java.util.List<DescribeClusterRecoverTimeResponseBodyRestoreRanges> getRestoreRanges() {
        return this.restoreRanges;
    }

    public static class DescribeClusterRecoverTimeResponseBodyRestoreRanges extends TeaModel {
        @NameInMap("RestoreBeginTime")
        public String restoreBeginTime;

        @NameInMap("RestoreEndTime")
        public String restoreEndTime;

        @NameInMap("RestoreType")
        public String restoreType;

        public static DescribeClusterRecoverTimeResponseBodyRestoreRanges build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterRecoverTimeResponseBodyRestoreRanges self = new DescribeClusterRecoverTimeResponseBodyRestoreRanges();
            return TeaModel.build(map, self);
        }

        public DescribeClusterRecoverTimeResponseBodyRestoreRanges setRestoreBeginTime(String restoreBeginTime) {
            this.restoreBeginTime = restoreBeginTime;
            return this;
        }
        public String getRestoreBeginTime() {
            return this.restoreBeginTime;
        }

        public DescribeClusterRecoverTimeResponseBodyRestoreRanges setRestoreEndTime(String restoreEndTime) {
            this.restoreEndTime = restoreEndTime;
            return this;
        }
        public String getRestoreEndTime() {
            return this.restoreEndTime;
        }

        public DescribeClusterRecoverTimeResponseBodyRestoreRanges setRestoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }
        public String getRestoreType() {
            return this.restoreType;
        }

    }

}
