// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListAliyunOfficialEventSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAliyunOfficialEventSourcesResponseBody body;

    public static ListAliyunOfficialEventSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAliyunOfficialEventSourcesResponse self = new ListAliyunOfficialEventSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListAliyunOfficialEventSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAliyunOfficialEventSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAliyunOfficialEventSourcesResponse setBody(ListAliyunOfficialEventSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAliyunOfficialEventSourcesResponseBody getBody() {
        return this.body;
    }

}
