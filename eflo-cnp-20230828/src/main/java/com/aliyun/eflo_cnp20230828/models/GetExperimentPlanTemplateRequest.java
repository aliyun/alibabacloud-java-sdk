// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentPlanTemplateRequest extends TeaModel {
    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>315797</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static GetExperimentPlanTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentPlanTemplateRequest self = new GetExperimentPlanTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentPlanTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
