// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class InspectProxyAccessSecretRequest extends TeaModel {
    @NameInMap("ProxyAccessId")
    public Long proxyAccessId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tid")
    public Long tid;

    public static InspectProxyAccessSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        InspectProxyAccessSecretRequest self = new InspectProxyAccessSecretRequest();
        return TeaModel.build(map, self);
    }

    public InspectProxyAccessSecretRequest setProxyAccessId(Long proxyAccessId) {
        this.proxyAccessId = proxyAccessId;
        return this;
    }
    public Long getProxyAccessId() {
        return this.proxyAccessId;
    }

    public InspectProxyAccessSecretRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InspectProxyAccessSecretRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
