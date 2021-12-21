// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByClusterIdRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("IncludeInvalidHost")
    public Boolean includeInvalidHost;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Integer size;

    public static PageableQueryExperimentTaskByClusterIdRequest build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByClusterIdRequest self = new PageableQueryExperimentTaskByClusterIdRequest();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByClusterIdRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setIncludeInvalidHost(Boolean includeInvalidHost) {
        this.includeInvalidHost = includeInvalidHost;
        return this;
    }
    public Boolean getIncludeInvalidHost() {
        return this.includeInvalidHost;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PageableQueryExperimentTaskByClusterIdRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
