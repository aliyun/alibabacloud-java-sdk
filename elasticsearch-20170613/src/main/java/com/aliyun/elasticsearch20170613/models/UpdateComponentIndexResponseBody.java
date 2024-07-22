// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateComponentIndexResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateComponentIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentIndexResponseBody self = new UpdateComponentIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateComponentIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
