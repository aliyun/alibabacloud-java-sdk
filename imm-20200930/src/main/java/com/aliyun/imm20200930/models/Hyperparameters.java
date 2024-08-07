// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Hyperparameters extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackupInterval")
    public Long backupInterval;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("BatchSize")
    public Long batchSize;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DataLoaderWorkers")
    public Long dataLoaderWorkers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Evaluator")
    public CustomParams evaluator;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputSize")
    public java.util.List<Long> inputSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxEpoch")
    public Long maxEpoch;

    @NameInMap("Optimization")
    public Optimization optimization;

    @NameInMap("Schedule")
    public Schedule schedule;

    public static Hyperparameters build(java.util.Map<String, ?> map) throws Exception {
        Hyperparameters self = new Hyperparameters();
        return TeaModel.build(map, self);
    }

    public Hyperparameters setBackupInterval(Long backupInterval) {
        this.backupInterval = backupInterval;
        return this;
    }
    public Long getBackupInterval() {
        return this.backupInterval;
    }

    public Hyperparameters setBatchSize(Long batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Long getBatchSize() {
        return this.batchSize;
    }

    public Hyperparameters setDataLoaderWorkers(Long dataLoaderWorkers) {
        this.dataLoaderWorkers = dataLoaderWorkers;
        return this;
    }
    public Long getDataLoaderWorkers() {
        return this.dataLoaderWorkers;
    }

    public Hyperparameters setEvaluator(CustomParams evaluator) {
        this.evaluator = evaluator;
        return this;
    }
    public CustomParams getEvaluator() {
        return this.evaluator;
    }

    public Hyperparameters setInputSize(java.util.List<Long> inputSize) {
        this.inputSize = inputSize;
        return this;
    }
    public java.util.List<Long> getInputSize() {
        return this.inputSize;
    }

    public Hyperparameters setMaxEpoch(Long maxEpoch) {
        this.maxEpoch = maxEpoch;
        return this;
    }
    public Long getMaxEpoch() {
        return this.maxEpoch;
    }

    public Hyperparameters setOptimization(Optimization optimization) {
        this.optimization = optimization;
        return this;
    }
    public Optimization getOptimization() {
        return this.optimization;
    }

    public Hyperparameters setSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }
    public Schedule getSchedule() {
        return this.schedule;
    }

}
