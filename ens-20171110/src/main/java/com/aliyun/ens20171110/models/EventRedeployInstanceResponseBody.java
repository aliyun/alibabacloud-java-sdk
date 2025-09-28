// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRedeployInstanceResponseBody extends TeaModel {
    /**
     * <p>RequestId。</p>
     * 
     * <strong>example:</strong>
     * <p>125B04C7-3D0D-4245-AF96-14E3758E3F06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EventRedeployInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EventRedeployInstanceResponseBody self = new EventRedeployInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public EventRedeployInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
