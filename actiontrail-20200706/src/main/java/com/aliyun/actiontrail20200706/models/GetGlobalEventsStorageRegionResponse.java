// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetGlobalEventsStorageRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGlobalEventsStorageRegionResponseBody body;

    public static GetGlobalEventsStorageRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGlobalEventsStorageRegionResponse self = new GetGlobalEventsStorageRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetGlobalEventsStorageRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGlobalEventsStorageRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGlobalEventsStorageRegionResponse setBody(GetGlobalEventsStorageRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGlobalEventsStorageRegionResponseBody getBody() {
        return this.body;
    }

}
