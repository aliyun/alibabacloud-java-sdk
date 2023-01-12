// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAdditionalCertificateWithListenerResponseBody extends TeaModel {
    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAdditionalCertificateWithListenerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdditionalCertificateWithListenerResponseBody self = new UpdateAdditionalCertificateWithListenerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdditionalCertificateWithListenerResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateAdditionalCertificateWithListenerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
