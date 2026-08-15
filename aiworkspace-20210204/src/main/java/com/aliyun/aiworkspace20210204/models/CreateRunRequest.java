// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateRunRequest extends TeaModel {
    /**
     * <p>The experiment ID associated with the run.</p>
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
     * <p>The name of the run. Naming rules:</p>
     * <ul>
     * <li>Must start with a lowercase or uppercase letter.</li>
     * <li>Can contain uppercase and lowercase letters, digits, underscores (_), or hyphens (-).</li>
     * <li>Must be 1 to 63 characters in length.</li>
     * </ul>
     * <p>If the name is left empty during creation, the server-generated random ID (RunID) is used as the name.</p>
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
     * <p>The PAI workload ID associated with the run.</p>
     * 
     * <strong>example:</strong>
     * <p>job-jdnhf***fnrimv</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of PAI workload source associated with the run. Valid values: TrainingService, DLC, or empty. This parameter is optional and defaults to empty.</p>
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
