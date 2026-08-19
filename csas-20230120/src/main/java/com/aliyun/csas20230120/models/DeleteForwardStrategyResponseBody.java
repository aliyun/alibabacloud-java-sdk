// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteForwardStrategyResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5A232DC6-0A2E-5754-B9E6-C9A8E9EF784A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteForwardStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardStrategyResponseBody self = new DeleteForwardStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteForwardStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
