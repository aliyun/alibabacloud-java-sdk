// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetClusterAllUrlResponseBody extends TeaModel {
    // The response parameters in the JSON format.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetClusterAllUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterAllUrlResponseBody self = new GetClusterAllUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterAllUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetClusterAllUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
