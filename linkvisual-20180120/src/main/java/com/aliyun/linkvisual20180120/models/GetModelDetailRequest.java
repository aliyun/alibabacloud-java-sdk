// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetModelDetailRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("AlgorithmId")
    public Long algorithmId;

    @NameInMap("Version")
    public String version;

    public static GetModelDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelDetailRequest self = new GetModelDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetModelDetailRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetModelDetailRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetModelDetailRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

    public GetModelDetailRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
