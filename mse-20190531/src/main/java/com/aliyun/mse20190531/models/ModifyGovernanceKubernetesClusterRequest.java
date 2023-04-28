// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyGovernanceKubernetesClusterRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NamespaceInfos")
    public String namespaceInfos;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyGovernanceKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyGovernanceKubernetesClusterRequest self = new ModifyGovernanceKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyGovernanceKubernetesClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ModifyGovernanceKubernetesClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyGovernanceKubernetesClusterRequest setNamespaceInfos(String namespaceInfos) {
        this.namespaceInfos = namespaceInfos;
        return this;
    }
    public String getNamespaceInfos() {
        return this.namespaceInfos;
    }

    public ModifyGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
