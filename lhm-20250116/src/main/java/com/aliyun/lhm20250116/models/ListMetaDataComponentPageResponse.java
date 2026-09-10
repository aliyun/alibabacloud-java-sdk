// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ListMetaDataComponentPageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMetaDataComponentPageResponseBody body;

    public static ListMetaDataComponentPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDataComponentPageResponse self = new ListMetaDataComponentPageResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaDataComponentPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMetaDataComponentPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMetaDataComponentPageResponse setBody(ListMetaDataComponentPageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMetaDataComponentPageResponseBody getBody() {
        return this.body;
    }

}
