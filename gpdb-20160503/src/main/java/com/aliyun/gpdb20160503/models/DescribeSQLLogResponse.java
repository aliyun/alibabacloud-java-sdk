// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogResponseBody body;

    public static DescribeSQLLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogResponse self = new DescribeSQLLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogResponse setBody(DescribeSQLLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogResponseBody getBody() {
        return this.body;
    }

}
