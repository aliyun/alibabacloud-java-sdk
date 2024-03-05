// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class InitializeEHPCResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InitializeEHPCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeEHPCResponseBody self = new InitializeEHPCResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeEHPCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
