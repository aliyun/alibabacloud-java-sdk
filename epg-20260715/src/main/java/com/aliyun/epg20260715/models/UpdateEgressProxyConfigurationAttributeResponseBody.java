// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class UpdateEgressProxyConfigurationAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>019F3A67-2D1B-537B-B08D-B2DEB69E8E8B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEgressProxyConfigurationAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEgressProxyConfigurationAttributeResponseBody self = new UpdateEgressProxyConfigurationAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEgressProxyConfigurationAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
