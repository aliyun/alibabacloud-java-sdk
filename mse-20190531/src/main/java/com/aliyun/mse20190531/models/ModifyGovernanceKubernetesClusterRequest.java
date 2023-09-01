// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ModifyGovernanceKubernetesClusterRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NamespaceInfos")
    public java.util.List<ModifyGovernanceKubernetesClusterRequestNamespaceInfos> namespaceInfos;

    /**
     * <p>The region in which the cluster resides.</p>
     */
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

    public ModifyGovernanceKubernetesClusterRequest setNamespaceInfos(java.util.List<ModifyGovernanceKubernetesClusterRequestNamespaceInfos> namespaceInfos) {
        this.namespaceInfos = namespaceInfos;
        return this;
    }
    public java.util.List<ModifyGovernanceKubernetesClusterRequestNamespaceInfos> getNamespaceInfos() {
        return this.namespaceInfos;
    }

    public ModifyGovernanceKubernetesClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyGovernanceKubernetesClusterRequestNamespaceInfos extends TeaModel {
        @NameInMap("labels")
        public java.util.Map<String, String> labels;

        @NameInMap("mseNamespace")
        public String mseNamespace;

        @NameInMap("name")
        public String name;

        public static ModifyGovernanceKubernetesClusterRequestNamespaceInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyGovernanceKubernetesClusterRequestNamespaceInfos self = new ModifyGovernanceKubernetesClusterRequestNamespaceInfos();
            return TeaModel.build(map, self);
        }

        public ModifyGovernanceKubernetesClusterRequestNamespaceInfos setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public ModifyGovernanceKubernetesClusterRequestNamespaceInfos setMseNamespace(String mseNamespace) {
            this.mseNamespace = mseNamespace;
            return this;
        }
        public String getMseNamespace() {
            return this.mseNamespace;
        }

        public ModifyGovernanceKubernetesClusterRequestNamespaceInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
