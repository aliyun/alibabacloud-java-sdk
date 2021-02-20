// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackSurfacesFacetsResponseBody extends TeaModel {
    @NameInMap("WebPaths")
    public Integer webPaths;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebServers")
    public Integer webServers;

    @NameInMap("CrawlerRequests")
    public Integer crawlerRequests;

    @NameInMap("WebTechs")
    public Integer webTechs;

    public static DescribeDomainAttackSurfacesFacetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackSurfacesFacetsResponseBody self = new DescribeDomainAttackSurfacesFacetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackSurfacesFacetsResponseBody setWebPaths(Integer webPaths) {
        this.webPaths = webPaths;
        return this;
    }
    public Integer getWebPaths() {
        return this.webPaths;
    }

    public DescribeDomainAttackSurfacesFacetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainAttackSurfacesFacetsResponseBody setWebServers(Integer webServers) {
        this.webServers = webServers;
        return this;
    }
    public Integer getWebServers() {
        return this.webServers;
    }

    public DescribeDomainAttackSurfacesFacetsResponseBody setCrawlerRequests(Integer crawlerRequests) {
        this.crawlerRequests = crawlerRequests;
        return this;
    }
    public Integer getCrawlerRequests() {
        return this.crawlerRequests;
    }

    public DescribeDomainAttackSurfacesFacetsResponseBody setWebTechs(Integer webTechs) {
        this.webTechs = webTechs;
        return this;
    }
    public Integer getWebTechs() {
        return this.webTechs;
    }

}
