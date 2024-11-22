// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteFunctionResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSiteFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteFunctionResponseBody self = new DeleteSiteFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSiteFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
