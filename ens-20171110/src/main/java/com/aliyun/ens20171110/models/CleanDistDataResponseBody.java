// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CleanDistDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CleanDistDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CleanDistDataResponseBody self = new CleanDistDataResponseBody();
        return TeaModel.build(map, self);
    }

    public CleanDistDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
