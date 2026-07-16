// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListAWSRegionInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAWSRegionInfosResponseBody body;

    public static ListAWSRegionInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAWSRegionInfosResponse self = new ListAWSRegionInfosResponse();
        return TeaModel.build(map, self);
    }

    public ListAWSRegionInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAWSRegionInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAWSRegionInfosResponse setBody(ListAWSRegionInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAWSRegionInfosResponseBody getBody() {
        return this.body;
    }

}
