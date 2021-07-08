// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class GetPrometheusRemoteActionTokenResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public String data;

    public static GetPrometheusRemoteActionTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrometheusRemoteActionTokenResponseBody self = new GetPrometheusRemoteActionTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrometheusRemoteActionTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPrometheusRemoteActionTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
