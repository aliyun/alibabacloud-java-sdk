// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CB4D73A3-BAF4-4A9D-A631-15F219AF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchResponseBody self = new UpdateBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
