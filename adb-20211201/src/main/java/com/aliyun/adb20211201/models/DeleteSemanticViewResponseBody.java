// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSemanticViewResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3A8F6106-6AFD-5A34-9C80-8DE2C42D06E8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSemanticViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSemanticViewResponseBody self = new DeleteSemanticViewResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSemanticViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
