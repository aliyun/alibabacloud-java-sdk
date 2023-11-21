// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallPromClusterRequest extends TeaModel {
    /**
     * <p>语言环境, 默认为中文 zh | en</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UninstallPromClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallPromClusterRequest self = new UninstallPromClusterRequest();
        return TeaModel.build(map, self);
    }

    public UninstallPromClusterRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public UninstallPromClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UninstallPromClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
