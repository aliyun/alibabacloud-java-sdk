// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DeleteAccountFactoryBaselineResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0F45D888-8C4D-55E5-ACA2-D1515159181D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAccountFactoryBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountFactoryBaselineResponseBody self = new DeleteAccountFactoryBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccountFactoryBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
