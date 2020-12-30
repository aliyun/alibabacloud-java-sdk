// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoreIncrDetail")
    public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail restoreIncrDetail;

    public static DescribeRestoreIncrDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreIncrDetailResponseBody self = new DescribeRestoreIncrDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreIncrDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRestoreIncrDetailResponseBody setRestoreIncrDetail(DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail restoreIncrDetail) {
        this.restoreIncrDetail = restoreIncrDetail;
        return this;
    }
    public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail getRestoreIncrDetail() {
        return this.restoreIncrDetail;
    }

    public static class DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("RestoreStartTs")
        public String restoreStartTs;

        @NameInMap("State")
        public String state;

        @NameInMap("RestoredTs")
        public String restoredTs;

        @NameInMap("RestoreDelay")
        public String restoreDelay;

        public static DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail self = new DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoreStartTs(String restoreStartTs) {
            this.restoreStartTs = restoreStartTs;
            return this;
        }
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoredTs(String restoredTs) {
            this.restoredTs = restoredTs;
            return this;
        }
        public String getRestoredTs() {
            return this.restoredTs;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoreDelay(String restoreDelay) {
            this.restoreDelay = restoreDelay;
            return this;
        }
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

    }

}
