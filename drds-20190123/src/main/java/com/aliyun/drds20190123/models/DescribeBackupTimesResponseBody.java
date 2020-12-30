// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupTimesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RestoreTime")
    public DescribeBackupTimesResponseBodyRestoreTime restoreTime;

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

    public DescribeBackupTimesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupTimesResponseBody setRestoreTime(DescribeBackupTimesResponseBodyRestoreTime restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public DescribeBackupTimesResponseBodyRestoreTime getRestoreTime() {
        return this.restoreTime;
    }

    public static class DescribeBackupTimesResponseBodyRestoreTime extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

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
