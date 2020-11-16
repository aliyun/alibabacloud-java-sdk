// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class BatchDeleteLiveDomainConfigsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static BatchDeleteLiveDomainConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteLiveDomainConfigsResponse self = new BatchDeleteLiveDomainConfigsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteLiveDomainConfigsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
