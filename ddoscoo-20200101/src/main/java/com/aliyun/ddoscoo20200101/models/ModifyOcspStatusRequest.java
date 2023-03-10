// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyOcspStatusRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Integer enable;

    public static ModifyOcspStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOcspStatusRequest self = new ModifyOcspStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOcspStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyOcspStatusRequest setEnable(Integer enable) {
        this.enable = enable;
        return this;
    }
    public Integer getEnable() {
        return this.enable;
    }

}
