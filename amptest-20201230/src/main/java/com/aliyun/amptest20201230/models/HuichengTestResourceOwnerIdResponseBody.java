// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengTestResourceOwnerIdResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static HuichengTestResourceOwnerIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HuichengTestResourceOwnerIdResponseBody self = new HuichengTestResourceOwnerIdResponseBody();
        return TeaModel.build(map, self);
    }

    public HuichengTestResourceOwnerIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
