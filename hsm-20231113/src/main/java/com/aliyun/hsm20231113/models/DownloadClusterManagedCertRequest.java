// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class DownloadClusterManagedCertRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster-001***hui</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    public static DownloadClusterManagedCertRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadClusterManagedCertRequest self = new DownloadClusterManagedCertRequest();
        return TeaModel.build(map, self);
    }

    public DownloadClusterManagedCertRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
