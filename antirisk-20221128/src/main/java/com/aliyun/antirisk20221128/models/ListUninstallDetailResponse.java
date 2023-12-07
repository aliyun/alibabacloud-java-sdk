// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antirisk20221128.models;

import com.aliyun.tea.*;

public class ListUninstallDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUninstallDetailResponseBody body;

    public static ListUninstallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUninstallDetailResponse self = new ListUninstallDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListUninstallDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUninstallDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUninstallDetailResponse setBody(ListUninstallDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUninstallDetailResponseBody getBody() {
        return this.body;
    }

}
