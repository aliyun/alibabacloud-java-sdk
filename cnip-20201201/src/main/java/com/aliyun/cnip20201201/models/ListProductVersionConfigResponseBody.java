// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListProductVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigResponseBody self = new ListProductVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
