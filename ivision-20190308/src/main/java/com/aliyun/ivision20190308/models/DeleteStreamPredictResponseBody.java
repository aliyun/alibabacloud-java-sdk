// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class DeleteStreamPredictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PredictId")
    public String predictId;

    public static DeleteStreamPredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStreamPredictResponseBody self = new DeleteStreamPredictResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStreamPredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteStreamPredictResponseBody setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

}
