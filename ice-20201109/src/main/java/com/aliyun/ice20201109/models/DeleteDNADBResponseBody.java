// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteDNADBResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDNADBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDNADBResponseBody self = new DeleteDNADBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDNADBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
