// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ConfigDomainAccessModeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("AccessMode")
    @Validation(required = true)
    public Integer accessMode;

    public static ConfigDomainAccessModeRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigDomainAccessModeRequest self = new ConfigDomainAccessModeRequest();
        return TeaModel.build(map, self);
    }

    public ConfigDomainAccessModeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ConfigDomainAccessModeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConfigDomainAccessModeRequest setAccessMode(Integer accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public Integer getAccessMode() {
        return this.accessMode;
    }

}
