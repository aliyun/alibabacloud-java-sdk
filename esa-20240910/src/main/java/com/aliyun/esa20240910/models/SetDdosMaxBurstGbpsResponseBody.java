// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetDdosMaxBurstGbpsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDdosMaxBurstGbpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDdosMaxBurstGbpsResponseBody self = new SetDdosMaxBurstGbpsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDdosMaxBurstGbpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
