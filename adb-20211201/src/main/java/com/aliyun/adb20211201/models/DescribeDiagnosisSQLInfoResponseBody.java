// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    /**
     * <p>The execute details of the SQL statement, including the detailed SQL statement, statistics information, execute plan, and operator information.</p>
     */
    @NameInMap("DiagnosisSQLInfo")
    public String diagnosisSQLInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The staged execution information of the query.</p>
     */
    @NameInMap("StageInfos")
    public java.util.List<DescribeDiagnosisSQLInfoResponseBodyStageInfos> stageInfos;

    public static DescribeDiagnosisSQLInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSQLInfoResponseBody self = new DescribeDiagnosisSQLInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSQLInfoResponseBody setDiagnosisSQLInfo(String diagnosisSQLInfo) {
        this.diagnosisSQLInfo = diagnosisSQLInfo;
        return this;
    }
    public String getDiagnosisSQLInfo() {
        return this.diagnosisSQLInfo;
    }

    public DescribeDiagnosisSQLInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisSQLInfoResponseBody setStageInfos(java.util.List<DescribeDiagnosisSQLInfoResponseBodyStageInfos> stageInfos) {
        this.stageInfos = stageInfos;
        return this;
    }
    public java.util.List<DescribeDiagnosisSQLInfoResponseBodyStageInfos> getStageInfos() {
        return this.stageInfos;
    }

    public static class DescribeDiagnosisSQLInfoResponseBodyStageInfos extends TeaModel {
        /**
         * <p>The type of the SQL execution engine.</p>
         * 
         * <strong>example:</strong>
         * <p>Java</p>
         */
        @NameInMap("ExecutionType")
        public String executionType;

        /**
         * <p>The total amount of input data for the stage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("InputDataSize")
        public Long inputDataSize;

        /**
         * <p>The total number of input rows for the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("InputRows")
        public Long inputRows;

        /**
         * <p>The cumulative execution duration of operators for the stage. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("OperatorCost")
        public Long operatorCost;

        /**
         * <p>The total amount of output data for the stage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        /**
         * <p>The total number of output rows for the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("OutputRows")
        public Long outputRows;

        /**
         * <p>The peak memory usage for the stage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>2341</p>
         */
        @NameInMap("PeakMemory")
        public Long peakMemory;

        /**
         * <p>The execution progress of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Progress")
        public Double progress;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>Stage[26]</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The status of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("State")
        public String state;

        public static DescribeDiagnosisSQLInfoResponseBodyStageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisSQLInfoResponseBodyStageInfos self = new DescribeDiagnosisSQLInfoResponseBodyStageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setExecutionType(String executionType) {
            this.executionType = executionType;
            return this;
        }
        public String getExecutionType() {
            return this.executionType;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setInputDataSize(Long inputDataSize) {
            this.inputDataSize = inputDataSize;
            return this;
        }
        public Long getInputDataSize() {
            return this.inputDataSize;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setInputRows(Long inputRows) {
            this.inputRows = inputRows;
            return this;
        }
        public Long getInputRows() {
            return this.inputRows;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setOperatorCost(Long operatorCost) {
            this.operatorCost = operatorCost;
            return this;
        }
        public Long getOperatorCost() {
            return this.operatorCost;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setOutputDataSize(Long outputDataSize) {
            this.outputDataSize = outputDataSize;
            return this;
        }
        public Long getOutputDataSize() {
            return this.outputDataSize;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setOutputRows(Long outputRows) {
            this.outputRows = outputRows;
            return this;
        }
        public Long getOutputRows() {
            return this.outputRows;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setPeakMemory(Long peakMemory) {
            this.peakMemory = peakMemory;
            return this;
        }
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setProgress(Double progress) {
            this.progress = progress;
            return this;
        }
        public Double getProgress() {
            return this.progress;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribeDiagnosisSQLInfoResponseBodyStageInfos setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
