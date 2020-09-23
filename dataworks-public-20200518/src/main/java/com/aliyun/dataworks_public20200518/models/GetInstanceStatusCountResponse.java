// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StatusCount")
    @Validation(required = true)
    public GetInstanceStatusCountResponseStatusCount statusCount;

    public static GetInstanceStatusCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusCountResponse self = new GetInstanceStatusCountResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceStatusCountResponse setStatusCount(GetInstanceStatusCountResponseStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }
    public GetInstanceStatusCountResponseStatusCount getStatusCount() {
        return this.statusCount;
    }

    public static class GetInstanceStatusCountResponseStatusCount extends TeaModel {
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

        public static GetInstanceStatusCountResponseStatusCount build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceStatusCountResponseStatusCount self = new GetInstanceStatusCountResponseStatusCount();
            return TeaModel.build(map, self);
        }

        public GetInstanceStatusCountResponseStatusCount setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetInstanceStatusCountResponseStatusCount setNotRunCount(Integer notRunCount) {
            this.notRunCount = notRunCount;
            return this;
        }
        public Integer getNotRunCount() {
            return this.notRunCount;
        }

        public GetInstanceStatusCountResponseStatusCount setWaitTimeCount(Integer waitTimeCount) {
            this.waitTimeCount = waitTimeCount;
            return this;
        }
        public Integer getWaitTimeCount() {
            return this.waitTimeCount;
        }

        public GetInstanceStatusCountResponseStatusCount setWaitResCount(Integer waitResCount) {
            this.waitResCount = waitResCount;
            return this;
        }
        public Integer getWaitResCount() {
            return this.waitResCount;
        }

        public GetInstanceStatusCountResponseStatusCount setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public GetInstanceStatusCountResponseStatusCount setFailureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }
        public Integer getFailureCount() {
            return this.failureCount;
        }

        public GetInstanceStatusCountResponseStatusCount setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

}
