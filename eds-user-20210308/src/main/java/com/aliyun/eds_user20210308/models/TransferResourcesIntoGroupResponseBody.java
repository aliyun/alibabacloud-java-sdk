// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesIntoGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AA8D67CB-345D-5CDA-986E-FFAC7D0****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransferResourcesIntoGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesIntoGroupResponseBody self = new TransferResourcesIntoGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferResourcesIntoGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
