// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateClusterCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F3B261DD-3858-4D3C-877D-303ADF374600</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateClusterCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterCertificateResponseBody self = new UpdateClusterCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateClusterCertificateResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateClusterCertificateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateClusterCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
