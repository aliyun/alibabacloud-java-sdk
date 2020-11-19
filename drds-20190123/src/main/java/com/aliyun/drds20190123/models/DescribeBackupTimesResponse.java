// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBackupTimesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RestoreTime")
    @Validation(required = true)
    public DescribeBackupTimesResponseRestoreTime restoreTime;

    public static DescribeBackupTimesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTimesResponse self = new DescribeBackupTimesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTimesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupTimesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupTimesResponse setRestoreTime(DescribeBackupTimesResponseRestoreTime restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public DescribeBackupTimesResponseRestoreTime getRestoreTime() {
        return this.restoreTime;
    }

    public static class DescribeBackupTimesResponseRestoreTime extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeBackupTimesResponseRestoreTime build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupTimesResponseRestoreTime self = new DescribeBackupTimesResponseRestoreTime();
            return TeaModel.build(map, self);
        }

        public DescribeBackupTimesResponseRestoreTime setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeBackupTimesResponseRestoreTime setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

}
