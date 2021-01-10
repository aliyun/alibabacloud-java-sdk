// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByNameRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("Name")
    public String name;

    public static GetAlgorithmDetailByNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByNameRequest self = new GetAlgorithmDetailByNameRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByNameRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetAlgorithmDetailByNameRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetAlgorithmDetailByNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
