// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchAtiAgentRegisterInfoMarketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAtiAgentRegisterInfoMarketResponseBody body;

    public static SearchAtiAgentRegisterInfoMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAtiAgentRegisterInfoMarketResponse self = new SearchAtiAgentRegisterInfoMarketResponse();
        return TeaModel.build(map, self);
    }

    public SearchAtiAgentRegisterInfoMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAtiAgentRegisterInfoMarketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAtiAgentRegisterInfoMarketResponse setBody(SearchAtiAgentRegisterInfoMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAtiAgentRegisterInfoMarketResponseBody getBody() {
        return this.body;
    }

}
