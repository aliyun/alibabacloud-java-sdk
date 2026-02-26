// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Hyperparameters extends TeaModel {
    /**
     * <p>The frequency at which the model configuration is saved. If you set this parameter to 1, model configuration is saved every epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BackupInterval")
    public Long backupInterval;

    /**
     * <p>The batch size for model training.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("BatchSize")
    public Long batchSize;

    /**
     * <p>The number of threads used to read the training data.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("DataLoaderWorkers")
    public Long dataLoaderWorkers;

    /**
     * <p>The custom parameters for model training.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Evaluator")
    public CustomParams evaluator;

    /**
     * <p>The image size. The array contains the width and height of the image.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputSize")
    public java.util.List<Long> inputSize;

    /**
     * <p>The number of epochs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxEpoch")
    public Long maxEpoch;

    /**
     * <p>The optimization algorithm.</p>
     */
    @NameInMap("Optimization")
    public Optimization optimization;

    /**
     * <p>The learning rate scheduler.</p>
     */
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
