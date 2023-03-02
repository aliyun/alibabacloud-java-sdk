// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The numbers of instances in different states.</p>
     */
    @NameInMap("StatusCount")
    public GetInstanceStatusStatisticResponseBodyStatusCount statusCount;

    public static GetInstanceStatusStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusStatisticResponseBody self = new GetInstanceStatusStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStatusStatisticResponseBody setStatusCount(GetInstanceStatusStatisticResponseBodyStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }
    public GetInstanceStatusStatisticResponseBodyStatusCount getStatusCount() {
        return this.statusCount;
    }

    public static class GetInstanceStatusStatisticResponseBodyStatusCount extends TeaModel {
        /**
         * <p>The number of instances that failed to run.</p>
         */
        @NameInMap("FailureCount")
        public Integer failureCount;

        /**
         * <p>The number of instances that are not run.</p>
         */
        @NameInMap("NotRunCount")
        public Integer notRunCount;

        /**
         * <p>The number of instances that are running.</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <p>The number of instances that are successfully run.</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The total number of instances.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The number of instances that are waiting for resources.</p>
         */
        @NameInMap("WaitResCount")
        public Integer waitResCount;

        /**
         * <p>The number of instances that are waiting to run.</p>
         */
        @NameInMap("WaitTimeCount")
        public Integer waitTimeCount;

        public static GetInstanceStatusStatisticResponseBodyStatusCount build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStatusStatisticResponseBodyStatusCount self = new GetInstanceStatusStatisticResponseBodyStatusCount();
            return TeaModel.build(map, self);
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setNotRunCount(Integer notRunCount) {
            this.notRunCount = notRunCount;
            return this;
        }
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setWaitResCount(Integer waitResCount) {
            this.waitResCount = waitResCount;
            return this;
        }
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        public GetInstanceStatusStatisticResponseBodyStatusCount setWaitTimeCount(Integer waitTimeCount) {
            this.waitTimeCount = waitTimeCount;
            return this;
        }
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

    }

}
