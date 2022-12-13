// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeAddonsRequest extends TeaModel {
    @NameInMap("cluster_profile")
    public String clusterProfile;

    @NameInMap("cluster_spec")
    public String clusterSpec;

    @NameInMap("cluster_type")
    public String clusterType;

    @NameInMap("cluster_version")
    public String clusterVersion;

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
