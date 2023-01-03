// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetExploreUrlResponseBody extends TeaModel {
    // Response parameters
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static GetExploreUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExploreUrlResponseBody self = new GetExploreUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExploreUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetExploreUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
