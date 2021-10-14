// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RolloverDataStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static RolloverDataStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RolloverDataStreamResponseBody self = new RolloverDataStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public RolloverDataStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RolloverDataStreamResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
