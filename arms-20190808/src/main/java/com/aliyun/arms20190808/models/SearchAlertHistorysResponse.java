// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistorysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchAlertHistorysResponseBody body;

    public static SearchAlertHistorysResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistorysResponse self = new SearchAlertHistorysResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertHistorysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertHistorysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAlertHistorysResponse setBody(SearchAlertHistorysResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertHistorysResponseBody getBody() {
        return this.body;
    }

}
