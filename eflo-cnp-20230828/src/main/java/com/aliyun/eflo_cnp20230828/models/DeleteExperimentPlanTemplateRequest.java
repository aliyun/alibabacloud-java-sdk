// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class DeleteExperimentPlanTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>346527</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static DeleteExperimentPlanTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentPlanTemplateRequest self = new DeleteExperimentPlanTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentPlanTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
