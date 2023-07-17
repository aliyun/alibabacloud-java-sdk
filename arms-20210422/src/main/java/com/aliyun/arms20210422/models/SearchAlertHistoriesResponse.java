// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAlertHistoriesResponseBody body;

    public static SearchAlertHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesResponse self = new SearchAlertHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertHistoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAlertHistoriesResponse setBody(SearchAlertHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertHistoriesResponseBody getBody() {
        return this.body;
    }

}
