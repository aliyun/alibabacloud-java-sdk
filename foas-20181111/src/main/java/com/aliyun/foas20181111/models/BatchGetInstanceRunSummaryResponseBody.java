// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class BatchGetInstanceRunSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunSummarys")
    public BatchGetInstanceRunSummaryResponseBodyRunSummarys runSummarys;

    public static BatchGetInstanceRunSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetInstanceRunSummaryResponseBody self = new BatchGetInstanceRunSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetInstanceRunSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetInstanceRunSummaryResponseBody setRunSummarys(BatchGetInstanceRunSummaryResponseBodyRunSummarys runSummarys) {
        this.runSummarys = runSummarys;
        return this;
    }
    public BatchGetInstanceRunSummaryResponseBodyRunSummarys getRunSummarys() {
        return this.runSummarys;
    }

    public static class BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary extends TeaModel {
        @NameInMap("ActualState")
        public String actualState;

        @NameInMap("EngineJobHandler")
        public String engineJobHandler;

        @NameInMap("ExpectState")
        public String expectState;

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

        public static BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary build(java.util.Map<String, ?> map) throws Exception {
            BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary self = new BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary();
            return TeaModel.build(map, self);
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setActualState(String actualState) {
            this.actualState = actualState;
            return this;
        }
        public String getActualState() {
            return this.actualState;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setEngineJobHandler(String engineJobHandler) {
            this.engineJobHandler = engineJobHandler;
            return this;
        }
        public String getEngineJobHandler() {
            return this.engineJobHandler;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setExpectState(String expectState) {
            this.expectState = expectState;
            return this;
        }
        public String getExpectState() {
            return this.expectState;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setInputDelay(Long inputDelay) {
            this.inputDelay = inputDelay;
            return this;
        }
        public Long getInputDelay() {
            return this.inputDelay;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setLastErrorMessage(String lastErrorMessage) {
            this.lastErrorMessage = lastErrorMessage;
            return this;
        }
        public String getLastErrorMessage() {
            return this.lastErrorMessage;
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary setLastErrorTime(Long lastErrorTime) {
            this.lastErrorTime = lastErrorTime;
            return this;
        }
        public Long getLastErrorTime() {
            return this.lastErrorTime;
        }

    }

    public static class BatchGetInstanceRunSummaryResponseBodyRunSummarys extends TeaModel {
        @NameInMap("RunSummary")
        public java.util.List<BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary> runSummary;

        public static BatchGetInstanceRunSummaryResponseBodyRunSummarys build(java.util.Map<String, ?> map) throws Exception {
            BatchGetInstanceRunSummaryResponseBodyRunSummarys self = new BatchGetInstanceRunSummaryResponseBodyRunSummarys();
            return TeaModel.build(map, self);
        }

        public BatchGetInstanceRunSummaryResponseBodyRunSummarys setRunSummary(java.util.List<BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary> runSummary) {
            this.runSummary = runSummary;
            return this;
        }
        public java.util.List<BatchGetInstanceRunSummaryResponseBodyRunSummarysRunSummary> getRunSummary() {
            return this.runSummary;
        }

    }

}
