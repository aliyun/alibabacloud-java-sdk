// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class UnbindUserDesktopResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5B7CF35-E078-5EBF-A010-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindUserDesktopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserDesktopResponseBody self = new UnbindUserDesktopResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindUserDesktopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
