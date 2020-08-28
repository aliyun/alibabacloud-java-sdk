// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIActionConfigRequest extends TeaModel {
    @NameInMap("Algo")
    @Validation(required = true)
    public String algo;

    @NameInMap("AlgoAction")
    @Validation(required = true)
    public String algoAction;

    public static GetAIActionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIActionConfigRequest self = new GetAIActionConfigRequest();
        return TeaModel.build(map, self);
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
