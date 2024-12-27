// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class BatchApplyAdviceByIdListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86F92D26-B774-5FA1-8E53-82CBEEEBB012</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchApplyAdviceByIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchApplyAdviceByIdListResponseBody self = new BatchApplyAdviceByIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchApplyAdviceByIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
