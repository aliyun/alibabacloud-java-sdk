// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordPackageConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvChangeRecordPackageConfigResponseBody body;

    public static ListEnvChangeRecordPackageConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordPackageConfigResponse self = new ListEnvChangeRecordPackageConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordPackageConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvChangeRecordPackageConfigResponse setBody(ListEnvChangeRecordPackageConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvChangeRecordPackageConfigResponseBody getBody() {
        return this.body;
    }

}
