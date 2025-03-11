// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupTimesResponseBody extends TeaModel {
    /**
     * <p>Indicates the ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4780A19F-5ECB-4C56-AD20-966A3FF9DE5R</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates the information about the time range within which the data of the instance can be restored to a point in time.</p>
     */
    @NameInMap("RestoreTime")
    public DescribeBackupTimesResponseBodyRestoreTime restoreTime;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeBackupTimesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTimesResponseBody self = new DescribeBackupTimesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTimesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTimesResponseBody setRestoreTime(DescribeBackupTimesResponseBodyRestoreTime restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public DescribeBackupTimesResponseBodyRestoreTime getRestoreTime() {
        return this.restoreTime;
    }

    public DescribeBackupTimesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBackupTimesResponseBodyRestoreTime extends TeaModel {
        /**
         * <p>Indicates the end time. The time is in the UNIX timestamp format. The time is in UTC. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1568636922671</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates the start time. The time is in the UNIX timestamp format. The time must be in UTC. Unit: ms.</p>
         * 
         * <strong>example:</strong>
         * <p>1568632853000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeBackupTimesResponseBodyRestoreTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTimesResponseBodyRestoreTime self = new DescribeBackupTimesResponseBodyRestoreTime();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTimesResponseBodyRestoreTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeBackupTimesResponseBodyRestoreTime setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
