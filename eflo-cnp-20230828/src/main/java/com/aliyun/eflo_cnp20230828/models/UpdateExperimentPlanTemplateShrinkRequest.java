// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class UpdateExperimentPlanTemplateShrinkRequest extends TeaModel {
    /**
     * <p>Template code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>349623</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>Template pipeline</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplatePipeline")
    public String templatePipelineShrink;

    public static UpdateExperimentPlanTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentPlanTemplateShrinkRequest self = new UpdateExperimentPlanTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentPlanTemplateShrinkRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateExperimentPlanTemplateShrinkRequest setTemplatePipelineShrink(String templatePipelineShrink) {
        this.templatePipelineShrink = templatePipelineShrink;
        return this;
    }
    public String getTemplatePipelineShrink() {
        return this.templatePipelineShrink;
    }

}
