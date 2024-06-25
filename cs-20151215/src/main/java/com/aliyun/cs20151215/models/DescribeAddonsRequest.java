// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsRequest extends TeaModel {
    /**
     * <p>The cluster type. Valid values:</p>
     * <ul>
     * <li><code>Default</code>: ACK managed cluster</li>
     * <li><code>Serverless</code>: ACK Serverless cluster</li>
     * <li><code>Edge</code>: ACK Edge cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("cluster_profile")
    public String clusterProfile;

    /**
     * <p>The edition of the cluster. If you set the cluster type to <code>ManagedKubernetes</code>, the following editions are supported:</p>
     * <ul>
     * <li><code>ack.pro.small</code>: ACK Pro cluster</li>
     * <li><code>ack.standard</code>: ACK Basic cluster</li>
     * </ul>
     * <p>By default, this parameter is left empty. If you leave this parameter empty, clusters are not filtered by edition.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of cluster. Valid values:</p>
     * <ul>
     * <li><code>Kubernetes</code>: ACK dedicated cluster.</li>
     * <li><code>ManagedKubernetes</code>: ACK managed cluster. ACK managed clusters include ACK Pro clusters, ACK Basic clusters, ACK Serverless Pro clusters, ACK Serverless Basic clusters, ACK Edge Pro clusters, and ACK Edge Basic clusters.</li>
     * <li><code>ExternalKubernetes</code>: registered cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>kubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The cluster version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.24.6-aliyun.1</p>
     */
    @NameInMap("cluster_version")
    public String clusterVersion;

    /**
     * <p>The region ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
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
