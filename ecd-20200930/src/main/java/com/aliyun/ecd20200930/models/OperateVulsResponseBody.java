// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OperateVulsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsResponseBody self = new OperateVulsResponseBody();
        return TeaModel.build(map, self);
    }

    public OperateVulsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
