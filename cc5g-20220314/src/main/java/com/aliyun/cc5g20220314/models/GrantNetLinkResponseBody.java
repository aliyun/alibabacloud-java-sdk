// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GrantNetLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E6B58AF9-F1BF-5894-B898-6CE2108463C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantNetLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantNetLinkResponseBody self = new GrantNetLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantNetLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
