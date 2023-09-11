// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerResponseBody extends TeaModel {
    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateAdditionalCertificatesWithListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerResponseBody self = new AssociateAdditionalCertificatesWithListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateAdditionalCertificatesWithListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public AssociateAdditionalCertificatesWithListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
