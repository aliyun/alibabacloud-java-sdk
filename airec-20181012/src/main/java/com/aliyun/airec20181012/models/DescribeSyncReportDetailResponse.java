// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSyncReportDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSyncReportDetailResponseBody body;

    public static DescribeSyncReportDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncReportDetailResponse self = new DescribeSyncReportDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncReportDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncReportDetailResponse setBody(DescribeSyncReportDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncReportDetailResponseBody getBody() {
        return this.body;
    }

}
