// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateBasicIpSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateBasicIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBasicIpSetResponseBody self = new UpdateBasicIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBasicIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
