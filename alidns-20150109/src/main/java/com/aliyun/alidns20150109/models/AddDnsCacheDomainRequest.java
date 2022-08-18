// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainRequest extends TeaModel {
    @NameInMap("CacheTtlMax")
    public Integer cacheTtlMax;

    @NameInMap("CacheTtlMin")
    public Integer cacheTtlMin;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SourceDnsServer")
    public java.util.List<AddDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    @NameInMap("SourceEdns")
    public String sourceEdns;

    @NameInMap("SourceProtocol")
    public String sourceProtocol;

    public static AddDnsCacheDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnsCacheDomainRequest self = new AddDnsCacheDomainRequest();
        return TeaModel.build(map, self);
    }

    public AddDnsCacheDomainRequest setCacheTtlMax(Integer cacheTtlMax) {
        this.cacheTtlMax = cacheTtlMax;
        return this;
    }
    public Integer getCacheTtlMax() {
        return this.cacheTtlMax;
    }

    public AddDnsCacheDomainRequest setCacheTtlMin(Integer cacheTtlMin) {
        this.cacheTtlMin = cacheTtlMin;
        return this;
    }
    public Integer getCacheTtlMin() {
        return this.cacheTtlMin;
    }

    public AddDnsCacheDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDnsCacheDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDnsCacheDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddDnsCacheDomainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddDnsCacheDomainRequest setSourceDnsServer(java.util.List<AddDnsCacheDomainRequestSourceDnsServer> sourceDnsServer) {
        this.sourceDnsServer = sourceDnsServer;
        return this;
    }
    public java.util.List<AddDnsCacheDomainRequestSourceDnsServer> getSourceDnsServer() {
        return this.sourceDnsServer;
    }

    public AddDnsCacheDomainRequest setSourceEdns(String sourceEdns) {
        this.sourceEdns = sourceEdns;
        return this;
    }
    public String getSourceEdns() {
        return this.sourceEdns;
    }

    public AddDnsCacheDomainRequest setSourceProtocol(String sourceProtocol) {
        this.sourceProtocol = sourceProtocol;
        return this;
    }
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    public static class AddDnsCacheDomainRequestSourceDnsServer extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public String port;

        public static AddDnsCacheDomainRequestSourceDnsServer build(java.util.Map<String, ?> map) throws Exception {
            AddDnsCacheDomainRequestSourceDnsServer self = new AddDnsCacheDomainRequestSourceDnsServer();
            return TeaModel.build(map, self);
        }

        public AddDnsCacheDomainRequestSourceDnsServer setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public AddDnsCacheDomainRequestSourceDnsServer setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
