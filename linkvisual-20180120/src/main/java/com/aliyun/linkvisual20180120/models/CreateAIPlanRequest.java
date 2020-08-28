// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIPlanRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("PlanTemplateId")
    @Validation(required = true)
    public String planTemplateId;

    @NameInMap("Description")
    public String description;

    public static CreateAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIPlanRequest self = new CreateAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIPlanRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateAIPlanRequest setPlanTemplateId(String planTemplateId) {
        this.planTemplateId = planTemplateId;
        return this;
    }
    public String getPlanTemplateId() {
        return this.planTemplateId;
    }

    public CreateAIPlanRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
