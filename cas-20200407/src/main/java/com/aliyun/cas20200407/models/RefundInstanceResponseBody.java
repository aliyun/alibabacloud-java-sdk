// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RefundInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D3F1FA43-1C26-50A2-8F0F-7A03851DBB46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefundInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceResponseBody self = new RefundInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RefundInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
