// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class GetPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static GetPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPersonResponseBody self = new GetPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
