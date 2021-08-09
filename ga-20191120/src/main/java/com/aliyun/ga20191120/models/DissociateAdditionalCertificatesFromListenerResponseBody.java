// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateAdditionalCertificatesFromListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerResponseBody self = new DissociateAdditionalCertificatesFromListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
