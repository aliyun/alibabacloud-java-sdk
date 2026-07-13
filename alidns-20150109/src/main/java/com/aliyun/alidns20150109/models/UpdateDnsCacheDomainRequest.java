// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDnsCacheDomainRequest extends TeaModel {
    /**
     * <p>The maximum TTL for cached data retrieved from the origin server. The value ranges from 30 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("CacheTtlMax")
    public Integer cacheTtlMax;

    /**
     * <p>The minimum time-to-live (TTL) for cached data retrieved from the origin server. The value ranges from 30 to 86400.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CacheTtlMin")
    public Integer cacheTtlMin;

    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt; To query the domain name, call <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a>.
     * &lt;props=&quot;intl&quot;&gt;To query the domain name, call <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the authoritative proxy domain name instance.&lt;props=&quot;china&quot;&gt; To query the instance ID, call <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-listcloudgtminstances?spm=a2c4g.11186623.help-menu-search-29697.d_0">ListCloudGtmInstances</a>.
     * &lt;props=&quot;intl&quot;&gt;To query the instance ID, call <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-listcloudgtminstances?spm=a2c63.p38356.help-menu-search-29697.d_0">ListCloudGtmInstances</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-sg-l*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * <p><strong>zh</strong></p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>A list of origin DNS servers. You can add up to 10 servers.</p>
     */
    @NameInMap("SourceDnsServer")
    public java.util.List<UpdateDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    /**
     * <p>Specifies whether the origin server supports Extension Mechanisms for DNS (EDNS).
     * SUPPORT: The origin server supports EDNS.
     * NOT_SUPPORT: The origin server does not support EDNS.</p>
     * 
     * <strong>example:</strong>
     * <p>SUPPORT</p>
     */
    @NameInMap("SourceEdns")
    public String sourceEdns;

    /**
     * <p>The origin protocol. Valid values: TCP and UDP. Default value: UDP.</p>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
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
         * <p>The domain name or IP address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the origin DNS server.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
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
