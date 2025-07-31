// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceApiImpactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataServiceApiImpactsResponseBody body;

    public static ListDataServiceApiImpactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiImpactsResponse self = new ListDataServiceApiImpactsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiImpactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataServiceApiImpactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataServiceApiImpactsResponse setBody(ListDataServiceApiImpactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataServiceApiImpactsResponseBody getBody() {
        return this.body;
    }

}
