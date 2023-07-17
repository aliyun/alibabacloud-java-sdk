// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ImportPrometheusRulesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Content")
    public String content;

    @NameInMap("Name")
    public String name;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("RegionId")
    public String regionId;

    public static ImportPrometheusRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportPrometheusRulesRequest self = new ImportPrometheusRulesRequest();
        return TeaModel.build(map, self);
    }

    public ImportPrometheusRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ImportPrometheusRulesRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ImportPrometheusRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ImportPrometheusRulesRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ImportPrometheusRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
