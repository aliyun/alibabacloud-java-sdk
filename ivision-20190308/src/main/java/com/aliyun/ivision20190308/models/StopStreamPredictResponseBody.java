// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class StopStreamPredictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PredictId")
    public String predictId;

    public static StopStreamPredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopStreamPredictResponseBody self = new StopStreamPredictResponseBody();
        return TeaModel.build(map, self);
    }

    public StopStreamPredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopStreamPredictResponseBody setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

}
