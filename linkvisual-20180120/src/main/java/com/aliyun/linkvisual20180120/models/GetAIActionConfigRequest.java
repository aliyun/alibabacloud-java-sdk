// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionConfigRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("Algo")
    public String algo;

    @NameInMap("AlgoAction")
    public String algoAction;

    public static GetAIActionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionConfigRequest self = new GetAIActionConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAIActionConfigRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetAIActionConfigRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetAIActionConfigRequest setAlgo(String algo) {
        this.algo = algo;
        return this;
    }
    public String getAlgo() {
        return this.algo;
    }

    public GetAIActionConfigRequest setAlgoAction(String algoAction) {
        this.algoAction = algoAction;
        return this;
    }
    public String getAlgoAction() {
        return this.algoAction;
    }

}
