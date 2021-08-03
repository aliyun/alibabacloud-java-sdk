// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSuspEventQuaraFilesResponseBody body;

    public static DescribeSuspEventQuaraFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesResponse self = new DescribeSuspEventQuaraFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSuspEventQuaraFilesResponse setBody(DescribeSuspEventQuaraFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSuspEventQuaraFilesResponseBody getBody() {
        return this.body;
    }

}
