// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteStreamPredictRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PredictId")
    public String predictId;

    public static DeleteStreamPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamPredictRequest self = new DeleteStreamPredictRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStreamPredictRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteStreamPredictRequest setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

}
