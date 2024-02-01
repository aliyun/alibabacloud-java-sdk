// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlByTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDeviceVodUrlByTimeResponseBody body;

    public static QueryDeviceVodUrlByTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlByTimeResponse self = new QueryDeviceVodUrlByTimeResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlByTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeviceVodUrlByTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDeviceVodUrlByTimeResponse setBody(QueryDeviceVodUrlByTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeviceVodUrlByTimeResponseBody getBody() {
        return this.body;
    }

}
