// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestartNodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ECBCA991-XXXX-XXXX-834C-B3E8007F33AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartNodeResponseBody self = new RestartNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
