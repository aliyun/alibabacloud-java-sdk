// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteIpSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD61839A-5CC5-404B-8C6E-56066F0C432D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpSetResponseBody self = new DeleteIpSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
