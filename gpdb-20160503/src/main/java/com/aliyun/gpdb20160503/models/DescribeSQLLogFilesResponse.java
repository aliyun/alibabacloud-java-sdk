// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogFilesResponseBody body;

    public static DescribeSQLLogFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogFilesResponse self = new DescribeSQLLogFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogFilesResponse setBody(DescribeSQLLogFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogFilesResponseBody getBody() {
        return this.body;
    }

}
