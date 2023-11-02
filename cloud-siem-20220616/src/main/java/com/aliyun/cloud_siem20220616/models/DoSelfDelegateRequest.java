// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DoSelfDelegateRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("DelegateOrNot")
    public Integer delegateOrNot;

    @NameInMap("RegionId")
    public String regionId;

    public static DoSelfDelegateRequest build(java.util.Map<String, ?> map) throws Exception {
        DoSelfDelegateRequest self = new DoSelfDelegateRequest();
        return TeaModel.build(map, self);
    }

    public DoSelfDelegateRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DoSelfDelegateRequest setDelegateOrNot(Integer delegateOrNot) {
        this.delegateOrNot = delegateOrNot;
        return this;
    }
    public Integer getDelegateOrNot() {
        return this.delegateOrNot;
    }

    public DoSelfDelegateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
