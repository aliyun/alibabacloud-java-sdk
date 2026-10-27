// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsRequest extends TeaModel {
    /**
     * <p>The cluster profile. Valid values:</p>
     * <ul>
     * <li>Default: managed cluster.</li>
     * <li>Serverless: Serverless cluster.</li>
     * <li>Edge: edge cluster.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("cluster_profile")
    public String clusterProfile;

    /**
     * <p>The cluster specifications. You can specify this parameter when you set cluster_type to ManagedKubernetes and configure profile. Valid values:</p>
     * <ul>
     * <li><p>ack.pro.small: ACK Pro.</p>
     * </li>
     * <li><p>ack.standard: ACK Basic. This is the default value if this parameter is left empty.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <ul>
     * <li><p>Kubernetes: ACK dedicated cluster.</p>
     * </li>
     * <li><p>ManagedKubernetes: ACK ACK clusters, including ACK ACK clusters (ACK Pro and ACK Basic), ACK Serverless clusters (Pro and Basic), ACK Edge clusters (Pro and Basic), and ACK Lingjun clusters (Pro).</p>
     * </li>
     * <li><p>ExternalKubernetes: registered cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ManagedKubernetes</p>
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
     * <p>The ID of the region where the cluster is deployed.</p>
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
