// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // - zh: Chinese
    // - en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the cluster.
    @NameInMap("ClusterId")
    public String clusterId;

    // The ID of the region in which the cluster resides.
    @NameInMap("RegionId")
    public String regionId;

    public static GetGovernanceKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceKubernetesClusterRequest self = new GetGovernanceKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public GetGovernanceKubernetesClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetGovernanceKubernetesClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
