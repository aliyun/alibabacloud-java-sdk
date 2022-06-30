// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeRequest extends TeaModel {
    @NameInMap("AccessMode")
    public Integer accessMode;

    @NameInMap("Domain")
    public String domain;

    public static ModifyWebAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAccessModeRequest self = new ModifyWebAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAccessModeRequest setAccessMode(Integer accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public Integer getAccessMode() {
        return this.accessMode;
    }

    public ModifyWebAccessModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
