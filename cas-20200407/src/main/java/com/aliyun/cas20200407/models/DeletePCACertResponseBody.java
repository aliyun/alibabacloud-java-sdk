// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DeletePCACertResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePCACertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePCACertResponseBody self = new DeletePCACertResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePCACertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
