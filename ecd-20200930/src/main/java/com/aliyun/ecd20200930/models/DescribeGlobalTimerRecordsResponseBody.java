// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGlobalTimerRecordsResponseBody extends TeaModel {
    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6mnFXZiT7NdvGNgkInJ****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>63740E03-1B4B-5A18-AC27-2745A4F2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Results")
    public java.util.List<DescribeGlobalTimerRecordsResponseBodyResults> results;

    public static DescribeGlobalTimerRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalTimerRecordsResponseBody self = new DescribeGlobalTimerRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalTimerRecordsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeGlobalTimerRecordsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGlobalTimerRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGlobalTimerRecordsResponseBody setResults(java.util.List<DescribeGlobalTimerRecordsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<DescribeGlobalTimerRecordsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class DescribeGlobalTimerRecordsResponseBodyResults extends TeaModel {
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The ID of the batch in which the scheduled task is executed.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-0cvfvf6u1enx1****</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        @NameInMap("Context")
        public String context;

        /**
         * <p>The time when the execution record was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-08-03T08:27:29Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cloud computer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-0c951fy9arnk9****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The cloud computer name.</p>
         * 
         * <strong>example:</strong>
         * <p>DesktopName</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The time when the scheduled task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-21T02:00:45Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the scheduled task group.</p>
         * 
         * <strong>example:</strong>
         * <p>ccg-xxxx</p>
         */
        @NameInMap("TimerGroupId")
        public String timerGroupId;

        /**
         * <p>The execution result of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TimerResult")
        public String timerResult;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerBoot</p>
         */
        @NameInMap("TimerType")
        public String timerType;

        public static DescribeGlobalTimerRecordsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeGlobalTimerRecordsResponseBodyResults self = new DescribeGlobalTimerRecordsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setTimerGroupId(String timerGroupId) {
            this.timerGroupId = timerGroupId;
            return this;
        }
        public String getTimerGroupId() {
            return this.timerGroupId;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setTimerResult(String timerResult) {
            this.timerResult = timerResult;
            return this;
        }
        public String getTimerResult() {
            return this.timerResult;
        }

        public DescribeGlobalTimerRecordsResponseBodyResults setTimerType(String timerType) {
            this.timerType = timerType;
            return this;
        }
        public String getTimerType() {
            return this.timerType;
        }

    }

}
