// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FailureCount")
        public Integer failureCount;

        @NameInMap("WaitTimeCount")
        public Integer waitTimeCount;

        @NameInMap("RunningCount")
        public Integer runningCount;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("NotRunCount")
        public Integer notRunCount;

        @NameInMap("WaitResCount")
        public Integer waitResCount;

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

        public GetInstanceStatusCountResponseBodyStatusCount setWaitTimeCount(Integer waitTimeCount) {
            this.waitTimeCount = waitTimeCount;
            return this;
        }
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
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

        public GetInstanceStatusCountResponseBodyStatusCount setNotRunCount(Integer notRunCount) {
            this.notRunCount = notRunCount;
            return this;
        }
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        public GetInstanceStatusCountResponseBodyStatusCount setWaitResCount(Integer waitResCount) {
            this.waitResCount = waitResCount;
            return this;
        }
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

    }

}
