// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRequest extends TeaModel {
    /**
     * <p>The maximum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
     */
    @NameInMap("CacheTtlMax")
    public Integer cacheTtlMax;

    /**
     * <p>The minimum time-to-live (TTL) period of the cached data retrieved from the origin Domain Name System (DNS) server. Unit: seconds. Valid values: 30 to 86400.</p>
     */
    @NameInMap("CacheTtlMin")
    public Integer cacheTtlMin;

    /**
     * <p>The domain name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The instance ID of the cache-accelerated domain name.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The origin DNS servers. A maximum of 10 origin DNS servers are supported.</p>
     */
    @NameInMap("SourceDnsServer")
    public java.util.List<UpdateDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    /**
     * <p>Specifies whether the origin DNS server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.</p>
     */
    @NameInMap("SourceEdns")
    public String sourceEdns;

    /**
     * <p>The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.</p>
     */
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
        /**
         * <p>The domain name or IP address of the origin DNS server.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the origin DNS server.</p>
         */
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
