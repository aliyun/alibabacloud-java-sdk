// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpgradeClusterNodepoolRequest extends TeaModel {
    @NameInMap("image_id")
    public String imageId;

    @NameInMap("kubernetes_version")
    public String kubernetesVersion;

    @NameInMap("runtime_type")
    public String runtimeType;

    @NameInMap("runtime_version")
    public String runtimeVersion;

    public static UpgradeClusterNodepoolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeClusterNodepoolRequest self = new UpgradeClusterNodepoolRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeClusterNodepoolRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeClusterNodepoolRequest setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public UpgradeClusterNodepoolRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

    public UpgradeClusterNodepoolRequest setRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }

}
