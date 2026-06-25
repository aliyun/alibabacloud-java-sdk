// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateRunRequest extends TeaModel {
    /**
     * <p>The ID of the experiment associated with the run.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-6thbb5xrbmp*****</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The list of labels for the run.</p>
     */
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <p>The name of the run. The naming convention is as follows:</p>
     * <ul>
     * <li><p>Starts with a lowercase or uppercase letter.</p>
     * </li>
     * <li><p>Can contain lowercase letters, uppercase letters, digits, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>The length must be 1 to 63 characters.</p>
     * </li>
     * </ul>
     * <p>If this parameter is left empty, the server-generated random ID (RunID) is used as the name.</p>
     * 
     * <strong>example:</strong>
     * <p>myName</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of parameters for the run.</p>
     */
    @NameInMap("Params")
    public java.util.List<RunParam> params;

    /**
     * <p>The ID of the PAI workload associated with the run.</p>
     * 
     * <strong>example:</strong>
     * <p>job-jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The source type of the PAI workload associated with the run. Options include TrainingService, DLC, or empty. This parameter is optional. The default value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>DLC</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRunRequest self = new CreateRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateRunRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public CreateRunRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRunRequest setParams(java.util.List<RunParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RunParam> getParams() {
        return this.params;
    }

    public CreateRunRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateRunRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
