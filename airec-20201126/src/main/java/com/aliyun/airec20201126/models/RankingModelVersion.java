// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RankingModelVersion extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>模型A_t1638964800000</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("RunLog")
    public String runLog;

    @NameInMap("RunResult")
    public RankingModelVersionRunResult runResult;

    /**
     * <strong>example:</strong>
     * <p>2021-12-08T20:00:00.0Z</p>
     */
    @NameInMap("RunTime")
    public String runTime;

    /**
     * <strong>example:</strong>
     * <p>TRAINING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>a-a-a</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <strong>example:</strong>
     * <p>模型A</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static RankingModelVersion build(java.util.Map<String, ?> map) throws Exception {
        RankingModelVersion self = new RankingModelVersion();
        return TeaModel.build(map, self);
    }

    public RankingModelVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RankingModelVersion setRunLog(String runLog) {
        this.runLog = runLog;
        return this;
    }
    public String getRunLog() {
        return this.runLog;
    }

    public RankingModelVersion setRunResult(RankingModelVersionRunResult runResult) {
        this.runResult = runResult;
        return this;
    }
    public RankingModelVersionRunResult getRunResult() {
        return this.runResult;
    }

    public RankingModelVersion setRunTime(String runTime) {
        this.runTime = runTime;
        return this;
    }
    public String getRunTime() {
        return this.runTime;
    }

    public RankingModelVersion setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public RankingModelVersion setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public RankingModelVersion setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class RankingModelVersionRunResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("AssessAuc")
        public String assessAuc;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("AssessGauc")
        public String assessGauc;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("AssessLoss")
        public String assessLoss;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("TrainAuc")
        public String trainAuc;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("TrainGauc")
        public String trainGauc;

        /**
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("TrainLoss")
        public String trainLoss;

        public static RankingModelVersionRunResult build(java.util.Map<String, ?> map) throws Exception {
            RankingModelVersionRunResult self = new RankingModelVersionRunResult();
            return TeaModel.build(map, self);
        }

        public RankingModelVersionRunResult setAssessAuc(String assessAuc) {
            this.assessAuc = assessAuc;
            return this;
        }
        public String getAssessAuc() {
            return this.assessAuc;
        }

        public RankingModelVersionRunResult setAssessGauc(String assessGauc) {
            this.assessGauc = assessGauc;
            return this;
        }
        public String getAssessGauc() {
            return this.assessGauc;
        }

        public RankingModelVersionRunResult setAssessLoss(String assessLoss) {
            this.assessLoss = assessLoss;
            return this;
        }
        public String getAssessLoss() {
            return this.assessLoss;
        }

        public RankingModelVersionRunResult setTrainAuc(String trainAuc) {
            this.trainAuc = trainAuc;
            return this;
        }
        public String getTrainAuc() {
            return this.trainAuc;
        }

        public RankingModelVersionRunResult setTrainGauc(String trainGauc) {
            this.trainGauc = trainGauc;
            return this;
        }
        public String getTrainGauc() {
            return this.trainGauc;
        }

        public RankingModelVersionRunResult setTrainLoss(String trainLoss) {
            this.trainLoss = trainLoss;
            return this;
        }
        public String getTrainLoss() {
            return this.trainLoss;
        }

    }

}
