// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSyntheticTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DeleteSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSyntheticTaskResponseBody self = new DeleteSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSyntheticTaskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
