// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StatusCount")
    @Validation(required = true)
    public GetInstanceStatusStatisticResponseStatusCount statusCount;

    public static GetInstanceStatusStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusStatisticResponse self = new GetInstanceStatusStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusStatisticResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStatusStatisticResponse setStatusCount(GetInstanceStatusStatisticResponseStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }
    public GetInstanceStatusStatisticResponseStatusCount getStatusCount() {
        return this.statusCount;
    }

    public static class GetInstanceStatusStatisticResponseStatusCount extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("NotRunCount")
        @Validation(required = true)
        public Integer notRunCount;

        @NameInMap("WaitTimeCount")
        @Validation(required = true)
        public Integer waitTimeCount;

        @NameInMap("WaitResCount")
        @Validation(required = true)
        public Integer waitResCount;

        @NameInMap("RunningCount")
        @Validation(required = true)
        public Integer runningCount;

        @NameInMap("FailureCount")
        @Validation(required = true)
        public Integer failureCount;

        @NameInMap("SuccessCount")
        @Validation(required = true)
        public Integer successCount;

        public static GetInstanceStatusStatisticResponseStatusCount build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStatusStatisticResponseStatusCount self = new GetInstanceStatusStatisticResponseStatusCount();
            return TeaModel.build(map, self);
        }

        public GetInstanceStatusStatisticResponseStatusCount setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setNotRunCount(Integer notRunCount) {
            this.notRunCount = notRunCount;
            return this;
        }
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setWaitTimeCount(Integer waitTimeCount) {
            this.waitTimeCount = waitTimeCount;
            return this;
        }
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setWaitResCount(Integer waitResCount) {
            this.waitResCount = waitResCount;
            return this;
        }
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public GetInstanceStatusStatisticResponseStatusCount setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
