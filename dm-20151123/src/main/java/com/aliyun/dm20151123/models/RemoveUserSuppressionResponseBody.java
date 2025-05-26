// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class RemoveUserSuppressionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1A846D66-5EC7-551B-9687-5BF1963DCFC1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveUserSuppressionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserSuppressionResponseBody self = new RemoveUserSuppressionResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveUserSuppressionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
