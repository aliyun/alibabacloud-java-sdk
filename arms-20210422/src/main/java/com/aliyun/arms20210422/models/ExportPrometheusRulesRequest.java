// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ExportPrometheusRulesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Name")
    public String name;

    @NameInMap("NameSpace")
    public String nameSpace;

    @NameInMap("RegionId")
    public String regionId;

    public static ExportPrometheusRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportPrometheusRulesRequest self = new ExportPrometheusRulesRequest();
        return TeaModel.build(map, self);
    }

    public ExportPrometheusRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportPrometheusRulesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExportPrometheusRulesRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

    public ExportPrometheusRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
