// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate the logs and troubleshoot problems.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status statistics of the instance.</p>
     */
    @NameInMap("StatusCount")
    public GetInstanceStatusCountResponseBodyStatusCount statusCount;

    public static GetInstanceStatusCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusCountResponseBody self = new GetInstanceStatusCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStatusCountResponseBody setStatusCount(GetInstanceStatusCountResponseBodyStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }
    public GetInstanceStatusCountResponseBodyStatusCount getStatusCount() {
        return this.statusCount;
    }

    public static class GetInstanceStatusCountResponseBodyStatusCount extends TeaModel {
        /**
         * <p>The number of failed instances.</p>
         */
        @NameInMap("FailureCount")
        public Integer failureCount;

        /**
         * <p>The number of instances that are not running.</p>
         */
        @NameInMap("NotRunCount")
        public Integer notRunCount;

        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <p>The number of successful instances.</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total number of instances.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The number of instances waiting for resources.</p>
         */
        @NameInMap("WaitResCount")
        public Integer waitResCount;

        /**
         * <p>The number of instances to be run that meet the conditions.</p>
         */
        @NameInMap("WaitTimeCount")
        public Integer waitTimeCount;

        public static GetInstanceStatusCountResponseBodyStatusCount build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStatusCountResponseBodyStatusCount self = new GetInstanceStatusCountResponseBodyStatusCount();
            return TeaModel.build(map, self);
        }

        public GetInstanceStatusCountResponseBodyStatusCount setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setNotRunCount(Integer notRunCount) {
            this.notRunCount = notRunCount;
            return this;
        }
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setWaitResCount(Integer waitResCount) {
            this.waitResCount = waitResCount;
            return this;
        }
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setWaitTimeCount(Integer waitTimeCount) {
            this.waitTimeCount = waitTimeCount;
            return this;
        }
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

    }

}
