// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeMeterImsLiveSnapshotUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMeterImsLiveSnapshotUsageResponseBody body;

    public static DescribeMeterImsLiveSnapshotUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterImsLiveSnapshotUsageResponse self = new DescribeMeterImsLiveSnapshotUsageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeterImsLiveSnapshotUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMeterImsLiveSnapshotUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMeterImsLiveSnapshotUsageResponse setBody(DescribeMeterImsLiveSnapshotUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMeterImsLiveSnapshotUsageResponseBody getBody() {
        return this.body;
    }

}
