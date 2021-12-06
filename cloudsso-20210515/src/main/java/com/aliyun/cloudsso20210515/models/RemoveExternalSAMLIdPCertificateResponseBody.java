// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveExternalSAMLIdPCertificateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveExternalSAMLIdPCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveExternalSAMLIdPCertificateResponseBody self = new RemoveExternalSAMLIdPCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveExternalSAMLIdPCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
