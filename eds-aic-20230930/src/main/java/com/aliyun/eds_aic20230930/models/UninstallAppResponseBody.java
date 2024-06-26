// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class UninstallAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E5138F7E-46B5-526A-8C99-82DEAE6B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallAppResponseBody self = new UninstallAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
