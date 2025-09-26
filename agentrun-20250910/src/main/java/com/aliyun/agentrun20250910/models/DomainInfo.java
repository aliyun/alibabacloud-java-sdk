// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DomainInfo extends TeaModel {
    @NameInMap("certIdentifier")
    public String certIdentifier;

    @NameInMap("domainId")
    public String domainId;

    @NameInMap("name")
    public String name;

    @NameInMap("protocol")
    public String protocol;

    public static DomainInfo build(java.util.Map<String, ?> map) throws Exception {
        DomainInfo self = new DomainInfo();
        return TeaModel.build(map, self);
    }

    public DomainInfo setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public DomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
