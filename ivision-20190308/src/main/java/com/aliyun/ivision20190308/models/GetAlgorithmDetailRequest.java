// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    public static GetAlgorithmDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailRequest self = new GetAlgorithmDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

}
