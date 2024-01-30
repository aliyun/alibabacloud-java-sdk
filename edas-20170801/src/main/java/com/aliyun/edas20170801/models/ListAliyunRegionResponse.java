// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListAliyunRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAliyunRegionResponseBody body;

    public static ListAliyunRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunRegionResponse self = new ListAliyunRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListAliyunRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliyunRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAliyunRegionResponse setBody(ListAliyunRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliyunRegionResponseBody getBody() {
        return this.body;
    }

}
