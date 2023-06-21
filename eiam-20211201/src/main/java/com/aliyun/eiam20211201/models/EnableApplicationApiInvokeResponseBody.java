// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationApiInvokeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationApiInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationApiInvokeResponseBody self = new EnableApplicationApiInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationApiInvokeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
