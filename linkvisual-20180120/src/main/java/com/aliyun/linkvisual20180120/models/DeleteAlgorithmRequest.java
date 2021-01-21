// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmId")
    @Validation(required = true)
    public Long algorithmId;

    public static DeleteAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlgorithmRequest self = new DeleteAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlgorithmRequest setAlgorithmId(Long algorithmId) {
        this.algorithmId = algorithmId;
        return this;
    }
    public Long getAlgorithmId() {
        return this.algorithmId;
    }

}
