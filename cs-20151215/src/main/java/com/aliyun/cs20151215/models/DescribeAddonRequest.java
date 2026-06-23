// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonRequest extends TeaModel {
    /**
     * <p>Cluster ID.
     * When a cluster ID is specified, the list of available components for the cluster is queried, and other parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>c02b3e03be10643e8a644a843ffcb****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>Cluster specification.
     * If cluster_id is specified, this parameter is ignored.
     * The five parameters region_id, cluster_type, profile, cluster_spec, and cluster_version must be specified together.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>Cluster type.
     * If cluster_id is specified, this parameter is ignored.
     * The five parameters region_id, cluster_type, profile, cluster_spec, and cluster_version must be specified together.</p>
     * 
     * <strong>example:</strong>
     * <p>ManagedKubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>Cluster version.
     * If cluster_id is specified, this parameter is ignored.
     * The five parameters region_id, cluster_type, profile, cluster_spec, and cluster_version must be specified together.</p>
     * 
     * <strong>example:</strong>
     * <p>1.26.3-aliyun.1</p>
     */
    @NameInMap("cluster_version")
    public String clusterVersion;

    /**
     * <p>Cluster subtype.
     * If cluster_id is specified, this parameter is ignored.
     * The five parameters region_id, cluster_type, profile, cluster_spec, and cluster_version must be specified together.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>Region.
     * If cluster_id is specified, this parameter is ignored.
     * The five parameters region_id, cluster_type, profile, cluster_spec, and cluster_version must be specified together.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>Component version. If not specified, the latest available version of the component is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.9.3.10-7dfca203-aliyun</p>
     */
    @NameInMap("version")
    public String version;

    public static DescribeAddonRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonRequest self = new DescribeAddonRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAddonRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public DescribeAddonRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeAddonRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public DescribeAddonRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public DescribeAddonRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAddonRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
