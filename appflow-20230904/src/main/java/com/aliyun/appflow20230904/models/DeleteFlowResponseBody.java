// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class DeleteFlowResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6382BE4-9F02-5F03-B26E-BF74FC521842</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowResponseBody self = new DeleteFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
