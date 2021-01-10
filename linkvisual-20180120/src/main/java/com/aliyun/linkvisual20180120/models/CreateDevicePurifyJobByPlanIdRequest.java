// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateDevicePurifyJobByPlanIdRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("PlanId")
    public String planId;

    @NameInMap("Utc")
    public Long utc;

    public static CreateDevicePurifyJobByPlanIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicePurifyJobByPlanIdRequest self = new CreateDevicePurifyJobByPlanIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicePurifyJobByPlanIdRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateDevicePurifyJobByPlanIdRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateDevicePurifyJobByPlanIdRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public CreateDevicePurifyJobByPlanIdRequest setUtc(Long utc) {
        this.utc = utc;
        return this;
    }
    public Long getUtc() {
        return this.utc;
    }

}
