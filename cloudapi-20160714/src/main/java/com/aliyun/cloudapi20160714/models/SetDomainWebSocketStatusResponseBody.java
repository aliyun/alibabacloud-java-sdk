// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetDomainWebSocketStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>61A16D46-EC04-5288-8A18-811B0F536CC2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetDomainWebSocketStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainWebSocketStatusResponseBody self = new SetDomainWebSocketStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainWebSocketStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
