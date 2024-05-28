// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmMonitorTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchCloudGtmMonitorTemplatesResponseBody body;

    public static SearchCloudGtmMonitorTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmMonitorTemplatesResponse self = new SearchCloudGtmMonitorTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmMonitorTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchCloudGtmMonitorTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchCloudGtmMonitorTemplatesResponse setBody(SearchCloudGtmMonitorTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchCloudGtmMonitorTemplatesResponseBody getBody() {
        return this.body;
    }

}
