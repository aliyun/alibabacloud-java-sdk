// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSyncReportOutliersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSyncReportOutliersResponseBody body;

    public static DescribeSyncReportOutliersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportOutliersResponse self = new DescribeSyncReportOutliersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportOutliersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncReportOutliersResponse setBody(DescribeSyncReportOutliersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncReportOutliersResponseBody getBody() {
        return this.body;
    }

}
