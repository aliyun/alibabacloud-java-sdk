// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class TrainingSpecification extends TeaModel {
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ModelSpecification")
    public ModelSpecification modelSpecification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Runtime")
    public Runtime runtime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("Transforms")
    public java.util.List<CustomParams> transforms;

    @NameInMap("ValidationSourceURI")
    public String validationSourceURI;

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
