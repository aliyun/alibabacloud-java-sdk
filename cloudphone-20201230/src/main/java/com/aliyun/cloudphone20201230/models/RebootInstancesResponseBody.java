// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RebootInstancesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponseBody self = new RebootInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
