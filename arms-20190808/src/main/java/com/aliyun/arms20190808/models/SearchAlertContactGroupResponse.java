// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertContactGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAlertContactGroupResponseBody body;

    public static SearchAlertContactGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertContactGroupResponse self = new SearchAlertContactGroupResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertContactGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertContactGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAlertContactGroupResponse setBody(SearchAlertContactGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertContactGroupResponseBody getBody() {
        return this.body;
    }

}
