// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingConfigurationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVodPackagingConfigurationsResponseBody body;

    public static ListVodPackagingConfigurationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingConfigurationsResponse self = new ListVodPackagingConfigurationsResponse();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingConfigurationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVodPackagingConfigurationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVodPackagingConfigurationsResponse setBody(ListVodPackagingConfigurationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVodPackagingConfigurationsResponseBody getBody() {
        return this.body;
    }

}
