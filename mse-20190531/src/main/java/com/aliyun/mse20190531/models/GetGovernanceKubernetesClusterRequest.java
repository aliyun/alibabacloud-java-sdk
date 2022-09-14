// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGovernanceKubernetesClusterRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("MseSessionId")
    public String mseSessionId;

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

    public GetGovernanceKubernetesClusterRequest setMseSessionId(String mseSessionId) {
        this.mseSessionId = mseSessionId;
        return this;
    }
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public GetGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
