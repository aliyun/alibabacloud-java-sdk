// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSQLInfoResponseBody extends TeaModel {
    @NameInMap("DiagnosisSQLInfo")
    public String diagnosisSQLInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InputDataSize")
        public Long inputDataSize;

        @NameInMap("InputRows")
        public Long inputRows;

        @NameInMap("OperatorCost")
        public Long operatorCost;

        @NameInMap("OutputDataSize")
        public Long outputDataSize;

        @NameInMap("OutputRows")
        public Long outputRows;

        @NameInMap("PeakMemory")
        public Long peakMemory;

        @NameInMap("Progress")
        public Double progress;

        /**
         * <p>StageID。</p>
         */
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("State")
        public String state;

        public static DescribeDiagnosisSQLInfoResponseBodyStageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisSQLInfoResponseBodyStageInfos self = new DescribeDiagnosisSQLInfoResponseBodyStageInfos();
            return TeaModel.build(map, self);
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
