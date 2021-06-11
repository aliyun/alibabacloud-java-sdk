// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class InstallEventerRequest extends TeaModel {
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    public static InstallEventerRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallEventerRequest self = new InstallEventerRequest();
        return TeaModel.build(map, self);
    }

    public InstallEventerRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public InstallEventerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallEventerRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

}
