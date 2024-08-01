// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeInstanceRecoverTimeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8CA8312-530A-413A-9129-F2BB32A8D404</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time ranges to which data can be restored. The time ranges include those used for point-in-time data restoration.</p>
     */
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
        /**
         * <p>The beginning of the time range to which data can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:33:20Z</p>
         */
        @NameInMap("RestoreBeginTime")
        public String restoreBeginTime;

        /**
         * <p>The end of the time range to which data can be restored.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T19:43:20Z</p>
         */
        @NameInMap("RestoreEndTime")
        public String restoreEndTime;

        /**
         * <p>The method used to restore data. Valid value:</p>
         * <ul>
         * <li>PointInTime (default): Data is restored to a point in time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PointInTime</p>
         */
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
