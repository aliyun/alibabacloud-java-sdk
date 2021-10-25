// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByClusterIdRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("IncludeInvalidHost")
    public Boolean includeInvalidHost;

    public static PageableQueryExperimentTaskByClusterIdRequest build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByClusterIdRequest self = new PageableQueryExperimentTaskByClusterIdRequest();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByClusterIdRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setIncludeInvalidHost(Boolean includeInvalidHost) {
        this.includeInvalidHost = includeInvalidHost;
        return this;
    }
    public Boolean getIncludeInvalidHost() {
        return this.includeInvalidHost;
    }

}
