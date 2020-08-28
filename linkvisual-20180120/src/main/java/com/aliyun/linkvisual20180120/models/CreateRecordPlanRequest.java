// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRecordPlanRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("TemplateId")
    @Validation(required = true)
    public String templateId;

    public static CreateRecordPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordPlanRequest self = new CreateRecordPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordPlanRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRecordPlanRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
