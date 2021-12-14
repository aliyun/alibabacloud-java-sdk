// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyDownloadQualificationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyDownloadQualificationsResponseBody body;

    public static ApplyDownloadQualificationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDownloadQualificationsResponse self = new ApplyDownloadQualificationsResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDownloadQualificationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyDownloadQualificationsResponse setBody(ApplyDownloadQualificationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyDownloadQualificationsResponseBody getBody() {
        return this.body;
    }

}
