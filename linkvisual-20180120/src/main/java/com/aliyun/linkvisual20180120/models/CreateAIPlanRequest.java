// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateAIPlanRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("PlanTemplateId")
    public String planTemplateId;

    @NameInMap("Description")
    public String description;

    public static CreateAIPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAIPlanRequest self = new CreateAIPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateAIPlanRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateAIPlanRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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
