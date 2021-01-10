// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetLiveDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetLiveDomainConfigsResponseBody self = new BatchSetLiveDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetLiveDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
