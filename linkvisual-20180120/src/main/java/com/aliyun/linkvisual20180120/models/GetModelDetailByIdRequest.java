// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailByIdRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("ModelId")
    public Long modelId;

    public static GetModelDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailByIdRequest self = new GetModelDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDetailByIdRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetModelDetailByIdRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetModelDetailByIdRequest setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
    public Long getModelId() {
        return this.modelId;
    }

}
