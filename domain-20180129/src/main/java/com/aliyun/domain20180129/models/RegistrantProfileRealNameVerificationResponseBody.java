// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class RegistrantProfileRealNameVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51D584A2-0CCD-4336-AD7D-1AD4C67B5545</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegistrantProfileRealNameVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegistrantProfileRealNameVerificationResponseBody self = new RegistrantProfileRealNameVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public RegistrantProfileRealNameVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
