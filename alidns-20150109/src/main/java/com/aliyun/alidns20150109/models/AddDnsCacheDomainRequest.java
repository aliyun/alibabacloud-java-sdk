// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainRequest extends TeaModel {
    /**
     * <p>The maximum TTL period of the cached data retrieved from the origin DNS server. Unit: seconds. Valid values: 30 to 86400.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CacheTtlMax")
    public Integer cacheTtlMax;

    /**
     * <p>The minimum time-to-live (TTL) period of the cached data retrieved from the origin Domain Name System (DNS) server. Unit: seconds. Valid values: 30 to 86400.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The origin DNS servers. A maximum of 10 origin DNS servers are supported.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDnsServer")
    public java.util.List<AddDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    /**
     * <p>Specifies whether the origin DNS server supports Extension Mechanisms for DNS (EDNS). Valid values: NOT_SUPPORT and SUPPORT.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceEdns")
    public String sourceEdns;

    /**
     * <p>The origin protocol policy. Valid values: TCP and UDP. Default value: UDP.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>The domain name or IP address of the origin DNS server.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the origin DNS server.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
