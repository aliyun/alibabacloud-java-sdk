// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class CreateStreamPredictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PredictId")
    public String predictId;

    public static CreateStreamPredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPredictResponseBody self = new CreateStreamPredictResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamPredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStreamPredictResponseBody setPredictId(String predictId) {
        this.predictId = predictId;
        return this;
    }
    public String getPredictId() {
        return this.predictId;
    }

}
