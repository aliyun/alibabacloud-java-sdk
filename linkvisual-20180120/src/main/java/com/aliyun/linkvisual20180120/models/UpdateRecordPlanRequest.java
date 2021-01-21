// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRecordPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static UpdateRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordPlanRequest self = new UpdateRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
