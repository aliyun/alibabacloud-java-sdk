// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreIncrDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D0FE2717-E194-465A-B27B-7373F96E580B</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:44Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>0/0</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <strong>example:</strong>
         * <p>0 ms</p>
         */
        @NameInMap("RestoreDelay")
        public String restoreDelay;

        /**
         * <strong>example:</strong>
         * <p>2020-11-02T18:00:00Z</p>
         */
        @NameInMap("RestoreStartTs")
        public String restoreStartTs;

        /**
         * <strong>example:</strong>
         * <p>\&quot;\&quot;</p>
         */
        @NameInMap("RestoredTs")
        public String restoredTs;

        /**
         * <strong>example:</strong>
         * <p>2020-11-05T06:45:44Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("State")
        public String state;

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

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoreDelay(String restoreDelay) {
            this.restoreDelay = restoreDelay;
            return this;
        }
        public String getRestoreDelay() {
            return this.restoreDelay;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoreStartTs(String restoreStartTs) {
            this.restoreStartTs = restoreStartTs;
            return this;
        }
        public String getRestoreStartTs() {
            return this.restoreStartTs;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setRestoredTs(String restoredTs) {
            this.restoredTs = restoredTs;
            return this;
        }
        public String getRestoredTs() {
            return this.restoredTs;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreIncrDetailResponseBodyRestoreIncrDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
