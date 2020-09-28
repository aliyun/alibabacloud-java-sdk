// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeKubernetesVersionMetadataRequest extends TeaModel {
    // 地域ID。
    @NameInMap("Region")
    public String region;

    // 是否多可用区。
    @NameInMap("MultiAZ")
    public Boolean multiAZ;

    // 集群类型。
    @NameInMap("ClusterType")
    public String clusterType;

    // 要查询的版本，如果为空则查所有版本。
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    // 边缘集群标识，用于区分边缘集群，取值：Default或Edge。
    @NameInMap("Profile")
    public String profile;

    public static DescribeKubernetesVersionMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesVersionMetadataRequest self = new DescribeKubernetesVersionMetadataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesVersionMetadataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeKubernetesVersionMetadataRequest setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }
    public Boolean getMultiAZ() {
        return this.multiAZ;
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

    public DescribeKubernetesVersionMetadataRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
