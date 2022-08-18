// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRequest extends TeaModel {
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

    @NameInMap("SourceDnsServer")
    public java.util.List<UpdateDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    @NameInMap("SourceEdns")
    public String sourceEdns;

    @NameInMap("SourceProtocol")
    public String sourceProtocol;

    public static UpdateDnsCacheDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDnsCacheDomainRequest self = new UpdateDnsCacheDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDnsCacheDomainRequest setCacheTtlMax(Integer cacheTtlMax) {
        this.cacheTtlMax = cacheTtlMax;
        return this;
    }
    public Integer getCacheTtlMax() {
        return this.cacheTtlMax;
    }

    public UpdateDnsCacheDomainRequest setCacheTtlMin(Integer cacheTtlMin) {
        this.cacheTtlMin = cacheTtlMin;
        return this;
    }
    public Integer getCacheTtlMin() {
        return this.cacheTtlMin;
    }

    public UpdateDnsCacheDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDnsCacheDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateDnsCacheDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDnsCacheDomainRequest setSourceDnsServer(java.util.List<UpdateDnsCacheDomainRequestSourceDnsServer> sourceDnsServer) {
        this.sourceDnsServer = sourceDnsServer;
        return this;
    }
    public java.util.List<UpdateDnsCacheDomainRequestSourceDnsServer> getSourceDnsServer() {
        return this.sourceDnsServer;
    }

    public UpdateDnsCacheDomainRequest setSourceEdns(String sourceEdns) {
        this.sourceEdns = sourceEdns;
        return this;
    }
    public String getSourceEdns() {
        return this.sourceEdns;
    }

    public UpdateDnsCacheDomainRequest setSourceProtocol(String sourceProtocol) {
        this.sourceProtocol = sourceProtocol;
        return this;
    }
    public String getSourceProtocol() {
        return this.sourceProtocol;
    }

    public static class UpdateDnsCacheDomainRequestSourceDnsServer extends TeaModel {
        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public String port;

        public static UpdateDnsCacheDomainRequestSourceDnsServer build(java.util.Map<String, ?> map) throws Exception {
            UpdateDnsCacheDomainRequestSourceDnsServer self = new UpdateDnsCacheDomainRequestSourceDnsServer();
            return TeaModel.build(map, self);
        }

        public UpdateDnsCacheDomainRequestSourceDnsServer setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public UpdateDnsCacheDomainRequestSourceDnsServer setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
