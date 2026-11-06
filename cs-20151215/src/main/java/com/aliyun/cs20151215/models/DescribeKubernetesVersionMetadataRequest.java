// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataRequest extends TeaModel {
    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster, including ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Kubernetes</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The Kubernetes version of the cluster, which is consistent with the Kubernetes community baseline version. We recommend that you select the latest version. If you do not specify this parameter, the latest version is used by default.</p>
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
     * <li><code>supported</code>: queries supported versions.</li>
     * <li><code>creatable</code>: queries versions available for cluster creation.</li>
     * </ul>
     * <p>If you specify KubernetesVersion, the query mode is ignored.</p>
     * <p>If you do not specify a query mode, versions available for cluster creation are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>supported</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The cluster profile used to differentiate cluster scenarios. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: non-edge cluster.</li>
     * <li><code>Edge</code>: edge cluster.</li>
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
     * <li><p>true: queries upgradable versions.</p>
     * </li>
     * <li><p>false: does not query upgradable versions.</p>
     * </li>
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
     * <p>The version support policy. The value is case-sensitive. Valid values:</p>
     * <ul>
     * <li>Standard: standard support. This is the default value.</li>
     * <li>Extended: extended support.
     * If you set this parameter to Extended: when Mode is set to <code>supported</code>, versions in the extended support period are additionally returned; when Mode is set to <code>creatable</code>, the latest extended support patch version of the major version in the extended support period is additionally returned; upgradable_versions returns the extended support patch versions of the major version.
     * Extended support applies only to ACK Pro managed clusters (where ClusterSpec is set to <code>ack.pro.*</code> and Profile is set to <code>Default</code>). Other cluster types (ACK Standard, ACS, ACK Edge managed, and ACK dedicated clusters) do not support extended support. If you specify a version in the extended support period to create or upgrade these clusters, the request will be rejected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Extended</p>
     */
    @NameInMap("SupportPolicy")
    public String supportPolicy;

    /**
     * <p>The runtime type. You can specify a runtime type to filter the system images supported by the runtime. Valid values:</p>
     * <ul>
     * <li><code>docker</code>: Docker runtime.</li>
     * <li><code>containerd</code>: containerd runtime.</li>
     * <li><code>Sandboxed-Container.runv</code>: sandboxed container.</li>
     * </ul>
     * <p>If you specify a runtime type, the image versions supported by the specified runtime are returned.</p>
     * <p>If you do not specify a runtime type, all images are returned by default.</p>
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

    public DescribeKubernetesVersionMetadataRequest setSupportPolicy(String supportPolicy) {
        this.supportPolicy = supportPolicy;
        return this;
    }
    public String getSupportPolicy() {
        return this.supportPolicy;
    }

    public DescribeKubernetesVersionMetadataRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

}
