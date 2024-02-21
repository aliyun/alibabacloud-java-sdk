// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateGlobalEventsStorageRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGlobalEventsStorageRegionResponseBody body;

    public static UpdateGlobalEventsStorageRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGlobalEventsStorageRegionResponse self = new UpdateGlobalEventsStorageRegionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGlobalEventsStorageRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGlobalEventsStorageRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGlobalEventsStorageRegionResponse setBody(UpdateGlobalEventsStorageRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGlobalEventsStorageRegionResponseBody getBody() {
        return this.body;
    }

}
