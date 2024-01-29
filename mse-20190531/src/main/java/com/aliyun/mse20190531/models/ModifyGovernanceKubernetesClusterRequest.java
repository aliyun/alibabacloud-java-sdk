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

    /**
     * <p>The information about the namespace for which Microservices Engine(MSE) Microservices Governance is enabled.</p>
     */
    @NameInMap("NamespaceInfos")
    public java.util.List<ModifyGovernanceKubernetesClusterRequestNamespaceInfos> namespaceInfos;

    /**
     * <p>The ID of the region in which the instance resides. The region is supported by MSE.</p>
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
        /**
         * <p>The microservice namespace. If you do not specify this parameter, Microservice Governance is not enabled for the namespace.</p>
         */
        @NameInMap("MseNamespace")
        public String mseNamespace;

        /**
         * <p>The name of the Kubernetes namespace.</p>
         */
        @NameInMap("Name")
        public String name;

        public static ModifyGovernanceKubernetesClusterRequestNamespaceInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyGovernanceKubernetesClusterRequestNamespaceInfos self = new ModifyGovernanceKubernetesClusterRequestNamespaceInfos();
            return TeaModel.build(map, self);
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
