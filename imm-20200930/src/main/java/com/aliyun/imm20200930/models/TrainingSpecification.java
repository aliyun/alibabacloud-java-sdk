// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TrainingSpecification extends TeaModel {
    /**
     * <p>Name of the dataset</p>
     * 
     * <strong>example:</strong>
     * <p>test-dataset</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The endpoint of the storage where the dataset is stored.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://1111111111.mns.cn-hangzhou.aliyuncs.com">http://1111111111.mns.cn-hangzhou.aliyuncs.com</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The model specification details.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelSpecification")
    public ModelSpecification modelSpecification;

    /**
     * <p>The information about the runtime for model training.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Runtime")
    public Runtime runtime;

    /**
     * <p>URI of the dataset</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-alg-dataset-bj/cifar10/test_index.json</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>The storage path to the model data. Only an Object Storage Service (OSS) path is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-alg-dataset-bj/model_training_test/</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <p>Local preprocessing parameters for the dataset.</p>
     */
    @NameInMap("Transforms")
    public java.util.List<CustomParams> transforms;

    /**
     * <p>The URI of the evaluation dataset. You must specify this parameter or the ValidationSplit parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://imm-alg-dataset-bj/cifar10/test_index.json</p>
     */
    @NameInMap("ValidationSourceURI")
    public String validationSourceURI;

    /**
     * <p>The ratio for splitting the training dataset into the evaluation dataset. You must specify this parameter or the ValidationSourceURI parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.95</p>
     */
    @NameInMap("ValidationSplit")
    public Float validationSplit;

    public static TrainingSpecification build(java.util.Map<String, ?> map) throws Exception {
        TrainingSpecification self = new TrainingSpecification();
        return TeaModel.build(map, self);
    }

    public TrainingSpecification setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public TrainingSpecification setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public TrainingSpecification setModelSpecification(ModelSpecification modelSpecification) {
        this.modelSpecification = modelSpecification;
        return this;
    }
    public ModelSpecification getModelSpecification() {
        return this.modelSpecification;
    }

    public TrainingSpecification setRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }
    public Runtime getRuntime() {
        return this.runtime;
    }

    public TrainingSpecification setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public TrainingSpecification setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public TrainingSpecification setTransforms(java.util.List<CustomParams> transforms) {
        this.transforms = transforms;
        return this;
    }
    public java.util.List<CustomParams> getTransforms() {
        return this.transforms;
    }

    public TrainingSpecification setValidationSourceURI(String validationSourceURI) {
        this.validationSourceURI = validationSourceURI;
        return this;
    }
    public String getValidationSourceURI() {
        return this.validationSourceURI;
    }

    public TrainingSpecification setValidationSplit(Float validationSplit) {
        this.validationSplit = validationSplit;
        return this;
    }
    public Float getValidationSplit() {
        return this.validationSplit;
    }

}
