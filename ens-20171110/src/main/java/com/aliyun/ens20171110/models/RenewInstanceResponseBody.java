// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RenewInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RenewInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponseBody self = new RenewInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RenewInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
