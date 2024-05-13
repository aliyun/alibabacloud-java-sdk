// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsRequest extends TeaModel {
    /**
     * <p>The cluster type. Valid values:</p>
     * <br>
     * <p>*   `Default`: ACK managed cluster</p>
     * <p>*   `Serverless`: ACK Serverless cluster</p>
     * <p>*   `Edge`: ACK Edge cluster</p>
     */
    @NameInMap("cluster_profile")
    public String clusterProfile;

    /**
     * <p>The edition of the cluster. If you set the cluster type to `ManagedKubernetes`, the following editions are supported:</p>
     * <br>
     * <p>*   `ack.pro.small`: ACK Pro cluster</p>
     * <p>*   `ack.standard`: ACK Basic cluster</p>
     * <br>
     * <p>By default, this parameter is left empty. If you leave this parameter empty, clusters are not filtered by edition.</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of cluster. Valid values:</p>
     * <br>
     * <p>*   `Kubernetes`: ACK dedicated cluster.</p>
     * <p>*   `ManagedKubernetes`: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</p>
     * <p>*   `ExternalKubernetes`: registered cluster.</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The cluster version.</p>
     */
    @NameInMap("cluster_version")
    public String clusterVersion;

    /**
     * <p>The region ID of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("region")
    public String region;

    public static DescribeAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonsRequest self = new DescribeAddonsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonsRequest setClusterProfile(String clusterProfile) {
        this.clusterProfile = clusterProfile;
        return this;
    }
    public String getClusterProfile() {
        return this.clusterProfile;
    }

    public DescribeAddonsRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeAddonsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeAddonsRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public DescribeAddonsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
