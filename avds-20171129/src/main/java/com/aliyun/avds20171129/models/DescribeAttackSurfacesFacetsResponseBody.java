// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeAttackSurfacesFacetsResponseBody extends TeaModel {
    @NameInMap("Domains")
    public Integer domains;

    @NameInMap("Hosts")
    public Integer hosts;

    @NameInMap("WebPaths")
    public Integer webPaths;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DNSMap")
    public Integer DNSMap;

    @NameInMap("WebServers")
    public Integer webServers;

    @NameInMap("Ports")
    public Integer ports;

    @NameInMap("CrawlerRequests")
    public Integer crawlerRequests;

    @NameInMap("WebTechs")
    public Integer webTechs;

    @NameInMap("Subdomains")
    public Integer subdomains;

    public static DescribeAttackSurfacesFacetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackSurfacesFacetsResponseBody self = new DescribeAttackSurfacesFacetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackSurfacesFacetsResponseBody setDomains(Integer domains) {
        this.domains = domains;
        return this;
    }
    public Integer getDomains() {
        return this.domains;
    }

    public DescribeAttackSurfacesFacetsResponseBody setHosts(Integer hosts) {
        this.hosts = hosts;
        return this;
    }
    public Integer getHosts() {
        return this.hosts;
    }

    public DescribeAttackSurfacesFacetsResponseBody setWebPaths(Integer webPaths) {
        this.webPaths = webPaths;
        return this;
    }
    public Integer getWebPaths() {
        return this.webPaths;
    }

    public DescribeAttackSurfacesFacetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAttackSurfacesFacetsResponseBody setDNSMap(Integer DNSMap) {
        this.DNSMap = DNSMap;
        return this;
    }
    public Integer getDNSMap() {
        return this.DNSMap;
    }

    public DescribeAttackSurfacesFacetsResponseBody setWebServers(Integer webServers) {
        this.webServers = webServers;
        return this;
    }
    public Integer getWebServers() {
        return this.webServers;
    }

    public DescribeAttackSurfacesFacetsResponseBody setPorts(Integer ports) {
        this.ports = ports;
        return this;
    }
    public Integer getPorts() {
        return this.ports;
    }

    public DescribeAttackSurfacesFacetsResponseBody setCrawlerRequests(Integer crawlerRequests) {
        this.crawlerRequests = crawlerRequests;
        return this;
    }
    public Integer getCrawlerRequests() {
        return this.crawlerRequests;
    }

    public DescribeAttackSurfacesFacetsResponseBody setWebTechs(Integer webTechs) {
        this.webTechs = webTechs;
        return this;
    }
    public Integer getWebTechs() {
        return this.webTechs;
    }

    public DescribeAttackSurfacesFacetsResponseBody setSubdomains(Integer subdomains) {
        this.subdomains = subdomains;
        return this;
    }
    public Integer getSubdomains() {
        return this.subdomains;
    }

}
