// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SubDomainInfo extends TeaModel {
    @NameInMap("domainId")
    public String domainId;

    @NameInMap("name")
    public String name;

    @NameInMap("networkType")
    public String networkType;

    @NameInMap("protocol")
    public String protocol;

    public static SubDomainInfo build(java.util.Map<String, ?> map) throws Exception {
        SubDomainInfo self = new SubDomainInfo();
        return TeaModel.build(map, self);
    }

    public SubDomainInfo setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public SubDomainInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubDomainInfo setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SubDomainInfo setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

}
