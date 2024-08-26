// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ResetQualificationVerificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetQualificationVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetQualificationVerificationResponseBody self = new ResetQualificationVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetQualificationVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
