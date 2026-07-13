// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsCacheDomainRequest extends TeaModel {
    /**
     * <p>The maximum TTL for cached data from an origin fetch. The value must be an integer from 30 to 86400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("CacheTtlMax")
    public Integer cacheTtlMax;

    /**
     * <p>The minimum time-to-live (TTL) for cached data from an origin fetch. The value must be an integer from 30 to 86400.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CacheTtlMin")
    public Integer cacheTtlMin;

    /**
     * <p>The domain name.&lt;props=&quot;china&quot;&gt; Call the <a href="https://help.aliyun.com/en/dns/api-alidns-2015-01-09-describedomains">DescribeDomains</a> operation to query the domain name.
     * &lt;props=&quot;intl&quot;&gt;Call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describedomains">DescribeDomains</a> operation to query the domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the authoritative proxy instance.&lt;props=&quot;china&quot;&gt; Call the <a href="https://help.aliyun.com/en/dns/api-alidns-2015-01-09-listcloudgtminstances">ListCloudGtmInstances</a> operation to query the instance ID.
     * &lt;props=&quot;intl&quot;&gt;Call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-listcloudgtminstances">ListCloudGtmInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-cn-*****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the request and response. The default value is zh. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>A list of origin DNS servers. You can specify up to 10 servers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceDnsServer")
    public java.util.List<AddDnsCacheDomainRequestSourceDnsServer> sourceDnsServer;

    /**
     * <p>SUPPORT: The origin server supports EDNS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUPPORT</p>
     */
    @NameInMap("SourceEdns")
    public String sourceEdns;

    /**
     * <p>The protocol used for origin fetch. Valid values: TCP and UDP. The default value is UDP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UDP</p>
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
         * <p>The domain name or IP address of the origin server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The port of the origin DNS server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>53</p>
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
