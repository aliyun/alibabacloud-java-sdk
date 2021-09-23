// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateGovernanceKubernetesClusterRequest extends TeaModel {
    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("K8sVersion")
    public String k8sVersion;

    @NameInMap("PilotStartTime")
    public Long pilotStartTime;

    @NameInMap("NameSpaceInfos")
    public String nameSpaceInfos;

    public static CreateGovernanceKubernetesClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGovernanceKubernetesClusterRequest self = new CreateGovernanceKubernetesClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateGovernanceKubernetesClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateGovernanceKubernetesClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGovernanceKubernetesClusterRequest setK8sVersion(String k8sVersion) {
        this.k8sVersion = k8sVersion;
        return this;
    }
    public String getK8sVersion() {
        return this.k8sVersion;
    }

    public CreateGovernanceKubernetesClusterRequest setPilotStartTime(Long pilotStartTime) {
        this.pilotStartTime = pilotStartTime;
        return this;
    }
    public Long getPilotStartTime() {
        return this.pilotStartTime;
    }

    public CreateGovernanceKubernetesClusterRequest setNameSpaceInfos(String nameSpaceInfos) {
        this.nameSpaceInfos = nameSpaceInfos;
        return this;
    }
    public String getNameSpaceInfos() {
        return this.nameSpaceInfos;
    }

}
