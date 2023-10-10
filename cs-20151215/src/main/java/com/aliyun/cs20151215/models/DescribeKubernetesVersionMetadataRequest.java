// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataRequest extends TeaModel {
    /**
     * <p>The cluster type that you want to use. Valid values:</p>
     * <br>
     * <p>*   `Kubernetes`: ACK dedicated cluster</p>
     * <p>*   `ManagedKubernetes`: ACK managed cluster</p>
     * <p>*   `ExternalKubernetes`: registered cluster</p>
     */
    @NameInMap("ClusterType")
    public String clusterType;

    /**
     * <p>The Kubernetes version of the cluster. The Kubernetes versions supported by ACK are the same as the Kubernetes versions supported by open source Kubernetes. We recommend that you specify the latest Kubernetes version. If you do not set this parameter, the latest Kubernetes version is used.</p>
     * <br>
     * <p>You can create ACK clusters of the latest two Kubernetes versions in the ACK console. You can call the specific ACK API operation to create clusters of other Kubernetes versions. For more information about the Kubernetes versions supported by ACK, see [Release notes for Kubernetes versions](~~185269~~).</p>
     */
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    /**
     * <p>The query mode. Valid values:</p>
     * <br>
     * <p>*   `supported`: queries all supported versions.</p>
     * <p>*   `creatable`: queries only versions that allow you to create clusters.</p>
     * <br>
     * <p>If you specify `KubernetesVersion`, this parameter does not take effect.</p>
     * <br>
     * <p>Default value: creatable.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The scenario where clusters are used. Valid values:</p>
     * <br>
     * <p>*   `Default`: non-edge computing scenarios</p>
     * <p>*   `Edge`: edge computing scenarios</p>
     * <p>*   `Serverless`: serverless scenarios.</p>
     * <br>
     * <p>Default value: `Default`.</p>
     */
    @NameInMap("Profile")
    public String profile;

    /**
     * <p>The region ID of the cluster.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The container runtime type that you want to use. You can specify a runtime type to query only OS images that support the runtime type. Valid values:</p>
     * <br>
     * <p>*   `docker`: Docker</p>
     * <p>*   `containerd`: containerd</p>
     * <p>*   `Sandboxed-Container.runv`: Sandboxed-Container</p>
     * <br>
     * <p>If you specify a runtime type, only the OS images that support the specified runtime type are returned.</p>
     * <br>
     * <p>Otherwise, all OS images are returned.</p>
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
