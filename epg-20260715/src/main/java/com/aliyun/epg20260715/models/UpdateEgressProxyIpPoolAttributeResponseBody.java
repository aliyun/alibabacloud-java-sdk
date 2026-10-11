// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyIpPoolAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>019F3A67-2D1B-537B-B08D-B2DEB69E8E8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEgressProxyIpPoolAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyIpPoolAttributeResponseBody self = new UpdateEgressProxyIpPoolAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyIpPoolAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
