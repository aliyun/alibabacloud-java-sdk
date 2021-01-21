// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailByIdRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    public Long algorithmId;

    public static GetAlgorithmDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailByIdRequest self = new GetAlgorithmDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailByIdRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

}
