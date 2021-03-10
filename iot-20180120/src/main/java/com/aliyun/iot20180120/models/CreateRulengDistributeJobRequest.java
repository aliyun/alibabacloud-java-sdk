// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateRulengDistributeJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    public static CreateRulengDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRulengDistributeJobRequest self = new CreateRulengDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRulengDistributeJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateRulengDistributeJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateRulengDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRulengDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateRulengDistributeJobRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

}
