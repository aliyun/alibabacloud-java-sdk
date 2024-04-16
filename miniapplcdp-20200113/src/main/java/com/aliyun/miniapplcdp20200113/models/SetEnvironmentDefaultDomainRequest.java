// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class SetEnvironmentDefaultDomainRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Source")
    public String source;

    public static SetEnvironmentDefaultDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetEnvironmentDefaultDomainRequest self = new SetEnvironmentDefaultDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetEnvironmentDefaultDomainRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetEnvironmentDefaultDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public SetEnvironmentDefaultDomainRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public SetEnvironmentDefaultDomainRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SetEnvironmentDefaultDomainRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
