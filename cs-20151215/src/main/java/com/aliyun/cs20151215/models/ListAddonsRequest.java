// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAddonsRequest extends TeaModel {
    /**
     * <p>The cluster ID. If you specify a cluster ID, only components used in the specified cluster are queried. Other parameters are ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>c02b3e03be10643e8a644a843ffcb****</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The specifications of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>ack.pro.small</p>
     */
    @NameInMap("cluster_spec")
    public String clusterSpec;

    /**
     * <p>The type of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>ManagedKubernetes</p>
     */
    @NameInMap("cluster_type")
    public String clusterType;

    /**
     * <p>The version of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>1.26.3-aliyun.1</p>
     */
    @NameInMap("cluster_version")
    public String clusterVersion;

    /**
     * <p>The subtype of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    /**
     * <p>The region of the cluster. If cluster_id is specified, this parameter is ignored. You must specify the region_id, cluster_type, profile, cluster_spec, and cluster_version parameters at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region_id")
    public String regionId;

    public static ListAddonsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsRequest self = new ListAddonsRequest();
        return TeaModel.build(map, self);
    }

    public ListAddonsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListAddonsRequest setClusterSpec(String clusterSpec) {
        this.clusterSpec = clusterSpec;
        return this;
    }
    public String getClusterSpec() {
        return this.clusterSpec;
    }

    public ListAddonsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ListAddonsRequest setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }

    public ListAddonsRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

    public ListAddonsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
