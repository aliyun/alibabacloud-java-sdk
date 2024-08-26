// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CancelTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>010E55C9-C64C-4C85-9BB2-7C225ADA6C86</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelTaskResponseBody self = new CancelTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
