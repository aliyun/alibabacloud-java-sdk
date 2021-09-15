// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLCollectorPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLCollectorPolicyResponseBody body;

    public static DescribeSQLCollectorPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLCollectorPolicyResponse self = new DescribeSQLCollectorPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLCollectorPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLCollectorPolicyResponse setBody(DescribeSQLCollectorPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLCollectorPolicyResponseBody getBody() {
        return this.body;
    }

}
