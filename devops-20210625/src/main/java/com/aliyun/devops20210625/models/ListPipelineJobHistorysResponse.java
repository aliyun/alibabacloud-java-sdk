// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListPipelineJobHistorysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPipelineJobHistorysResponseBody body;

    public static ListPipelineJobHistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineJobHistorysResponse self = new ListPipelineJobHistorysResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineJobHistorysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPipelineJobHistorysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPipelineJobHistorysResponse setBody(ListPipelineJobHistorysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPipelineJobHistorysResponseBody getBody() {
        return this.body;
    }

}
