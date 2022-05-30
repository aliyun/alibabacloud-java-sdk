// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsOnSliceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSQLLogsOnSliceResponseBody body;

    public static DescribeSQLLogsOnSliceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsOnSliceResponse self = new DescribeSQLLogsOnSliceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsOnSliceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogsOnSliceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogsOnSliceResponse setBody(DescribeSQLLogsOnSliceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogsOnSliceResponseBody getBody() {
        return this.body;
    }

}
