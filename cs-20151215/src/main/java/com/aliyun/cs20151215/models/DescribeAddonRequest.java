// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonRequest extends TeaModel {
    /**
     * <p>The ID of the cluster. If you specify a cluster ID, only components used in the cluster are queried. Other parameters are ignored.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The specifications of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The version of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     */
    @NameInMap("cluster_version")
    public String clusterVersion;

    /**
     * <p>The subtype of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region ID. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     */
    @NameInMap("region_id")
    public String regionId;

    /**
     * <p>The version of the component. If you do not specify this parameter, the latest version of the component is queried.</p>
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
