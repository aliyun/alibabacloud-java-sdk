// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetInstanceRunSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunSummary")
    public GetInstanceRunSummaryResponseBodyRunSummary runSummary;

    public static GetInstanceRunSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRunSummaryResponseBody self = new GetInstanceRunSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceRunSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceRunSummaryResponseBody setRunSummary(GetInstanceRunSummaryResponseBodyRunSummary runSummary) {
        this.runSummary = runSummary;
        return this;
    }
    public GetInstanceRunSummaryResponseBodyRunSummary getRunSummary() {
        return this.runSummary;
    }

    public static class GetInstanceRunSummaryResponseBodyRunSummary extends TeaModel {
        @NameInMap("ActualState")
        public String actualState;

        @NameInMap("EngineJobHandler")
        public String engineJobHandler;

        @NameInMap("ExpectState")
        public String expectState;

        /**
         * <p>InstanceID</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("InputDelay")
        public Long inputDelay;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("LastErrorMessage")
        public String lastErrorMessage;

        @NameInMap("LastErrorTime")
        public Long lastErrorTime;

        public static GetInstanceRunSummaryResponseBodyRunSummary build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceRunSummaryResponseBodyRunSummary self = new GetInstanceRunSummaryResponseBodyRunSummary();
            return TeaModel.build(map, self);
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setActualState(String actualState) {
            this.actualState = actualState;
            return this;
        }
        public String getActualState() {
            return this.actualState;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setEngineJobHandler(String engineJobHandler) {
            this.engineJobHandler = engineJobHandler;
            return this;
        }
        public String getEngineJobHandler() {
            return this.engineJobHandler;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setExpectState(String expectState) {
            this.expectState = expectState;
            return this;
        }
        public String getExpectState() {
            return this.expectState;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setInputDelay(Long inputDelay) {
            this.inputDelay = inputDelay;
            return this;
        }
        public Long getInputDelay() {
            return this.inputDelay;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public GetInstanceRunSummaryResponseBodyRunSummary setLastErrorTime(Long lastErrorTime) {
            this.lastErrorTime = lastErrorTime;
            return this;
        }
        public Long getLastErrorTime() {
            return this.lastErrorTime;
        }

    }

}
