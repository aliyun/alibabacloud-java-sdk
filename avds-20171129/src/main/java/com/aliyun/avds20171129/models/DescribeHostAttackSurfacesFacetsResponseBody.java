// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeHostAttackSurfacesFacetsResponseBody extends TeaModel {
    @NameInMap("Hosts")
    public Integer hosts;

    @NameInMap("WebPaths")
    public Integer webPaths;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ports")
    public Integer ports;

    @NameInMap("CrawlerRequests")
    public Integer crawlerRequests;

    @NameInMap("WebTechs")
    public Integer webTechs;

    public static DescribeHostAttackSurfacesFacetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAttackSurfacesFacetsResponseBody self = new DescribeHostAttackSurfacesFacetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setHosts(Integer hosts) {
        this.hosts = hosts;
        return this;
    }
    public Integer getHosts() {
        return this.hosts;
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setWebPaths(Integer webPaths) {
        this.webPaths = webPaths;
        return this;
    }
    public Integer getWebPaths() {
        return this.webPaths;
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setPorts(Integer ports) {
        this.ports = ports;
        return this;
    }
    public Integer getPorts() {
        return this.ports;
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setCrawlerRequests(Integer crawlerRequests) {
        this.crawlerRequests = crawlerRequests;
        return this;
    }
    public Integer getCrawlerRequests() {
        return this.crawlerRequests;
    }

    public DescribeHostAttackSurfacesFacetsResponseBody setWebTechs(Integer webTechs) {
        this.webTechs = webTechs;
        return this;
    }
    public Integer getWebTechs() {
        return this.webTechs;
    }

}
