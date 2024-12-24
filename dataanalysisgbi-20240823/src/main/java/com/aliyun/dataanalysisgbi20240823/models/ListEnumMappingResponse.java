// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListEnumMappingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEnumMappingResponseBody body;

    public static ListEnumMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnumMappingResponse self = new ListEnumMappingResponse();
        return TeaModel.build(map, self);
    }

    public ListEnumMappingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnumMappingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnumMappingResponse setBody(ListEnumMappingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnumMappingResponseBody getBody() {
        return this.body;
    }

}
