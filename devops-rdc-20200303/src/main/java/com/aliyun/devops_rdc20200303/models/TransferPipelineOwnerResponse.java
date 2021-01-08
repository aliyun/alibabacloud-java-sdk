// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class TransferPipelineOwnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferPipelineOwnerResponseBody body;

    public static TransferPipelineOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferPipelineOwnerResponse self = new TransferPipelineOwnerResponse();
        return TeaModel.build(map, self);
    }

    public TransferPipelineOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferPipelineOwnerResponse setBody(TransferPipelineOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferPipelineOwnerResponseBody getBody() {
        return this.body;
    }

}
