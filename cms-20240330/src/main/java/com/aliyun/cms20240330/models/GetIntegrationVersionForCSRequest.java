// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetIntegrationVersionForCSRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c502646fd0d1249baaf792b3a1b589e1b</p>
     */
    @NameInMap("clusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs.ack.cluster</p>
     */
    @NameInMap("clusterType")
    public String clusterType;

    public static GetIntegrationVersionForCSRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegrationVersionForCSRequest self = new GetIntegrationVersionForCSRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegrationVersionForCSRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetIntegrationVersionForCSRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

}
