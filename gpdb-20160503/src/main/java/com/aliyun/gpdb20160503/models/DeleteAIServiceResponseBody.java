// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteAIServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIServiceResponseBody self = new DeleteAIServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
