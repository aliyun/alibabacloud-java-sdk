// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CancelServiceRegistrationResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4A145D8-6F6C-532A-9001-9730CDA27578</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelServiceRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelServiceRegistrationResponseBody self = new CancelServiceRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelServiceRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
