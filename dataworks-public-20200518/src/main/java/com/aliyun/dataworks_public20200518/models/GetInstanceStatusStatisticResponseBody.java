// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("FailureCount")
        public Integer failureCount;

        @NameInMap("NotRunCount")
        public Integer notRunCount;

        @NameInMap("RunningCount")
        public Integer runningCount;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("WaitResCount")
        public Integer waitResCount;

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
