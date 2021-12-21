// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class PageableQueryExperimentTaskByExperimentIdRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Integer size;

    public static PageableQueryExperimentTaskByExperimentIdRequest build(java.util.Map<String, ?> map) throws Exception {
        PageableQueryExperimentTaskByExperimentIdRequest self = new PageableQueryExperimentTaskByExperimentIdRequest();
        return TeaModel.build(map, self);
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PageableQueryExperimentTaskByExperimentIdRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
