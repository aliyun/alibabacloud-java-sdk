// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyIpPoolResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>01A05ABB-C838-53FE-A5BB-D8475117BE6D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEgressProxyIpPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyIpPoolResponseBody self = new DeleteEgressProxyIpPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyIpPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
