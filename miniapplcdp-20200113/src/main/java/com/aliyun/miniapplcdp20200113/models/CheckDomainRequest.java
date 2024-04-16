// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CheckDomainRequest extends TeaModel {
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

    public static CheckDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainRequest self = new CheckDomainRequest();
        return TeaModel.build(map, self);
    }

    public CheckDomainRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CheckDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CheckDomainRequest setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public CheckDomainRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public CheckDomainRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
