// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePipelineDetailRequest extends TeaModel {
    @NameInMap("PipelineInstanceId")
    @Validation(required = true)
    public String pipelineInstanceId;

    @NameInMap("ShowArtifact")
    @Validation(required = true)
    public Boolean showArtifact;

    @NameInMap("ShowDslJson")
    public Boolean showDslJson;

    @NameInMap("PipelineDefinitionId")
    public String pipelineDefinitionId;

    public static DescribePipelineDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineDetailRequest self = new DescribePipelineDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePipelineDetailRequest setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public DescribePipelineDetailRequest setShowArtifact(Boolean showArtifact) {
        this.showArtifact = showArtifact;
        return this;
    }
    public Boolean getShowArtifact() {
        return this.showArtifact;
    }

    public DescribePipelineDetailRequest setShowDslJson(Boolean showDslJson) {
        this.showDslJson = showDslJson;
        return this;
    }
    public Boolean getShowDslJson() {
        return this.showDslJson;
    }

    public DescribePipelineDetailRequest setPipelineDefinitionId(String pipelineDefinitionId) {
        this.pipelineDefinitionId = pipelineDefinitionId;
        return this;
    }
    public String getPipelineDefinitionId() {
        return this.pipelineDefinitionId;
    }

}
