// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class UnbindVerificationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B182C041-8C64-5F2F-A07B-FC67FAF89CF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindVerificationResponseBody self = new UnbindVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
