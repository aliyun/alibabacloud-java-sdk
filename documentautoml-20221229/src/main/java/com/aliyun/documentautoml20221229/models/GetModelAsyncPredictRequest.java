// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class GetModelAsyncPredictRequest extends TeaModel {
    @NameInMap("AsyncPredictId")
    public Long asyncPredictId;

    public static GetModelAsyncPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelAsyncPredictRequest self = new GetModelAsyncPredictRequest();
        return TeaModel.build(map, self);
    }

    public GetModelAsyncPredictRequest setAsyncPredictId(Long asyncPredictId) {
        this.asyncPredictId = asyncPredictId;
        return this;
    }
    public Long getAsyncPredictId() {
        return this.asyncPredictId;
    }

}
