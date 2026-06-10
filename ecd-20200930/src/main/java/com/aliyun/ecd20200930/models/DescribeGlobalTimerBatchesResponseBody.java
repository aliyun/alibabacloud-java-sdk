// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerBatchesResponseBody extends TeaModel {
    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The token to use to retrieve the next page of results. This parameter is returned only when more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E54EB497-D7B7-5F04-B744-D8DFA7B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of batches.</p>
     */
    @NameInMap("Results")
    public java.util.List<DescribeGlobalTimerBatchesResponseBodyResults> results;

    public static DescribeGlobalTimerBatchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerBatchesResponseBody self = new DescribeGlobalTimerBatchesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerBatchesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeGlobalTimerBatchesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalTimerBatchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalTimerBatchesResponseBody setResults(java.util.List<DescribeGlobalTimerBatchesResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DescribeGlobalTimerBatchesResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DescribeGlobalTimerBatchesResponseBodyResults extends TeaModel {
        /**
         * <p>The ID of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0cvfvf6u1enx1****</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <p>The time when the batch was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-03T08:27:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <p>The number of running tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <p>The number of skipped tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SkippedCount")
        public Integer skippedCount;

        /**
         * <p>The number of successfully executed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SucceedCount")
        public Integer succeedCount;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static DescribeGlobalTimerBatchesResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalTimerBatchesResponseBodyResults self = new DescribeGlobalTimerBatchesResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setSkippedCount(Integer skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }
        public Integer getSkippedCount() {
            return this.skippedCount;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setSucceedCount(Integer succeedCount) {
            this.succeedCount = succeedCount;
            return this;
        }
        public Integer getSucceedCount() {
            return this.succeedCount;
        }

        public DescribeGlobalTimerBatchesResponseBodyResults setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

}
