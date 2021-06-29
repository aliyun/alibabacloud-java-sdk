// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class StopStreamPredictRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PredictId")
    public String predictId;

    public static StopStreamPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        StopStreamPredictRequest self = new StopStreamPredictRequest();
        return TeaModel.build(map, self);
    }

    public StopStreamPredictRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StopStreamPredictRequest setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

}
