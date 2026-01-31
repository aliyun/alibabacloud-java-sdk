// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ApplyCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificateResponseBody self = new ApplyCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
