// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataRequest extends TeaModel {
    /**
     * <p>The cluster type that you want to use. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not set this parameter, the latest Kubernetes version is used.</p>
     * <p>You can create ACK clusters of the latest two Kubernetes versions in the ACK console. You can call the specific ACK API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see <a href="https://help.aliyun.com/document_detail/185269.html">Release notes for Kubernetes versions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.16.9-aliyun.1</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <p>The query mode. Valid values:</p>
     * <ul>
     * <li><code>supported</code>: queries all supported versions.</li>
     * <li><code>creatable</code>: queries only versions that allow you to create clusters.</li>
     * </ul>
     * <p>If you specify <code>KubernetesVersion</code>, this parameter does not take effect.</p>
     * <p>Default value: creatable.</p>
     * 
     * <strong>example:</strong>
     * <p>supported</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The scenario where clusters are used. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: non-edge computing scenarios</li>
     * <li><code>Edge</code>: edge computing scenarios</li>
     * <li><code>Serverless</code>: serverless scenarios.</li>
     * </ul>
     * <p>Default value: <code>Default</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("Profile")
    public String profile;

    @NameInMap("QueryUpgradableVersion")
    public Boolean queryUpgradableVersion;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The container runtime type that you want to use. You can specify a runtime type to query only OS images that support the runtime type. Valid values:</p>
     * <ul>
     * <li><code>docker</code>: Docker</li>
     * <li><code>containerd</code>: containerd</li>
     * <li><code>Sandboxed-Container.runv</code>: Sandboxed-Container</li>
     * </ul>
     * <p>If you specify a runtime type, only the OS images that support the specified runtime type are returned.</p>
     * <p>Otherwise, all OS images are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>docker</p>
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
