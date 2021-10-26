// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchUpdateApisVpcAccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUpdateApisVpcAccessResponseBody body;

    public static BatchUpdateApisVpcAccessResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateApisVpcAccessResponse self = new BatchUpdateApisVpcAccessResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateApisVpcAccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateApisVpcAccessResponse setBody(BatchUpdateApisVpcAccessResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateApisVpcAccessResponseBody getBody() {
        return this.body;
    }

}
