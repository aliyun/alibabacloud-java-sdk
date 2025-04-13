// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class ListMeasurePointListByNodeCodePageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMeasurePointListByNodeCodePageResponseBody body;

    public static ListMeasurePointListByNodeCodePageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMeasurePointListByNodeCodePageResponse self = new ListMeasurePointListByNodeCodePageResponse();
        return TeaModel.build(map, self);
    }

    public ListMeasurePointListByNodeCodePageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMeasurePointListByNodeCodePageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMeasurePointListByNodeCodePageResponse setBody(ListMeasurePointListByNodeCodePageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMeasurePointListByNodeCodePageResponseBody getBody() {
        return this.body;
    }

}
