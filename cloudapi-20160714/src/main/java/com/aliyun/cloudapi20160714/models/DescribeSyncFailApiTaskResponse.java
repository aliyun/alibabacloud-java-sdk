// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeSyncFailApiTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSyncFailApiTaskResponseBody body;

    public static DescribeSyncFailApiTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncFailApiTaskResponse self = new DescribeSyncFailApiTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncFailApiTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncFailApiTaskResponse setBody(DescribeSyncFailApiTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncFailApiTaskResponseBody getBody() {
        return this.body;
    }

}
