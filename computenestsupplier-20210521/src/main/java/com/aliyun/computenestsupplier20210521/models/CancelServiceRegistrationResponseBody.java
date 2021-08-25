// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CancelServiceRegistrationResponseBody extends TeaModel {
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
