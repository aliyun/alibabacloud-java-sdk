// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class UpdateNodeStatisticResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static UpdateNodeStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeStatisticResponseBody self = new UpdateNodeStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateNodeStatisticResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
