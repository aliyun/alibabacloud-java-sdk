// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05AB8-CA45-55FC-A2DE-041975EE9AF2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEgressProxyConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyConfigurationResponseBody self = new DeleteEgressProxyConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
