// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAccessModeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("AccessMode")
    public Integer accessMode;

    public static ModifyWebAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAccessModeRequest self = new ModifyWebAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebAccessModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebAccessModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyWebAccessModeRequest setAccessMode(Integer accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public Integer getAccessMode() {
        return this.accessMode;
    }

}
