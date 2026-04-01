// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UpdateClusterCertificateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eck-xxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static UpdateClusterCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterCertificateRequest self = new UpdateClusterCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateClusterCertificateRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
