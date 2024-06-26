// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DistributeImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>440D7342-5FC2-5E7C-B2DB-D0B4EAC2BDF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DistributeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DistributeImageResponseBody self = new DistributeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DistributeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
