// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchSetLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BatchSetLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetLiveDomainConfigsResponse self = new BatchSetLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetLiveDomainConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
