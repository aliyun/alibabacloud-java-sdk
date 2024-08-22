// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteMemoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6a71f2d9-f1c9-913b-818b-114029103cad</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteMemoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMemoryResponseBody self = new DeleteMemoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMemoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
