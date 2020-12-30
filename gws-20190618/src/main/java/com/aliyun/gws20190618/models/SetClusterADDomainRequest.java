// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterADDomainRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("DomainDnsIp")
    public String domainDnsIp;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainPassword")
    public String domainPassword;

    @NameInMap("DomainAdmin")
    public String domainAdmin;

    @NameInMap("DomainDelete")
    public Boolean domainDelete;

    public static SetClusterADDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetClusterADDomainRequest self = new SetClusterADDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetClusterADDomainRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SetClusterADDomainRequest setDomainDnsIp(String domainDnsIp) {
        this.domainDnsIp = domainDnsIp;
        return this;
    }
    public String getDomainDnsIp() {
        return this.domainDnsIp;
    }

    public SetClusterADDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetClusterADDomainRequest setDomainPassword(String domainPassword) {
        this.domainPassword = domainPassword;
        return this;
    }
    public String getDomainPassword() {
        return this.domainPassword;
    }

    public SetClusterADDomainRequest setDomainAdmin(String domainAdmin) {
        this.domainAdmin = domainAdmin;
        return this;
    }
    public String getDomainAdmin() {
        return this.domainAdmin;
    }

    public SetClusterADDomainRequest setDomainDelete(Boolean domainDelete) {
        this.domainDelete = domainDelete;
        return this;
    }
    public Boolean getDomainDelete() {
        return this.domainDelete;
    }

}
