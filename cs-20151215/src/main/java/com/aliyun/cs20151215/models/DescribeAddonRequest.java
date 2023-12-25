// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonRequest extends TeaModel {
    @NameInMap("cluster_id")
    public String clusterId;

    @NameInMap("cluster_spec")
    public String clusterSpec;

    @NameInMap("cluster_type")
    public String clusterType;

    @NameInMap("cluster_version")
    public String clusterVersion;

    @NameInMap("profile")
    public String profile;

    @NameInMap("region_id")
    public String regionId;

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
