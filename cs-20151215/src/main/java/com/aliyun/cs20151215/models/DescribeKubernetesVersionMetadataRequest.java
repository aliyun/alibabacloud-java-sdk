// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataRequest extends TeaModel {
    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster, including ACK Pro clusters, ACK basic clusters, ACK Serverless Pro clusters, ACK Serverless basic clusters, ACK Edge Pro clusters, and ACK Edge basic clusters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The Kubernetes version of the cluster. This version is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
     * <p>For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Overview of Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.32.1-aliyun.1</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <p>The query mode. Valid values:</p>
     * <ul>
     * <li><code>supported</code>: Supported versions.</li>
     * <li><code>creatable</code>: Versions available for cluster creation.</li>
     * </ul>
     * <p>If you specify KubernetesVersion, the system ignores the query mode.</p>
     * <p>If you do not specify a query mode, the system returns versions available for cluster creation by default.</p>
     * 
     * <strong>example:</strong>
     * <p>supported</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The cluster profile. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: cluster for non-edge scenarios.</li>
     * <li><code>Edge</code>: cluster for edge scenarios.</li>
     * <li><code>Serverless</code>: ASK cluster.</li>
     * </ul>
     * <p>Default value: <code>Default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>Specifies whether to query the upgradable versions of the cluster version. This parameter takes effect only when the KubernetesVersion parameter is specified. Valid values:</p>
     * <ul>
     * <li>true: Queries upgradable versions.</li>
     * <li>false: Does not query upgradable versions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1.30.1-aliyun.1</p>
     */
    @NameInMap("QueryUpgradableVersion")
    public Boolean queryUpgradableVersion;

    /**
     * <p>The ID of the region where the cluster is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The runtime type. You can specify a runtime type to filter system images supported by the runtime. Valid values:</p>
     * <ul>
     * <li><code>docker</code>: Docker runtime.</li>
     * <li><code>containerd</code>: containerd runtime.</li>
     * <li><code>Sandboxed-Container.runv</code>: sandboxed container.</li>
     * </ul>
     * <p>If you specify a runtime type, the system returns the image versions supported by the specified runtime.</p>
     * <p>If you do not specify a runtime type, the system returns all images by default.</p>
     * 
     * <strong>example:</strong>
     * <p>containerd</p>
     */
    @NameInMap("runtime")
    public String runtime;

    public static DescribeKubernetesVersionMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesVersionMetadataRequest self = new DescribeKubernetesVersionMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesVersionMetadataRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeKubernetesVersionMetadataRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public DescribeKubernetesVersionMetadataRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public DescribeKubernetesVersionMetadataRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeKubernetesVersionMetadataRequest setQueryUpgradableVersion(Boolean queryUpgradableVersion) {
        this.queryUpgradableVersion = queryUpgradableVersion;
        return this;
    }
    public Boolean getQueryUpgradableVersion() {
        return this.queryUpgradableVersion;
    }

    public DescribeKubernetesVersionMetadataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeKubernetesVersionMetadataRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

}
