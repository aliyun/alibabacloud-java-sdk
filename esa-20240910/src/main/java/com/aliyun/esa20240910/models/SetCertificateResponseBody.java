// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A666D44F-19D6-490E-97CF-1A64AB962C57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCertificateResponseBody self = new SetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
