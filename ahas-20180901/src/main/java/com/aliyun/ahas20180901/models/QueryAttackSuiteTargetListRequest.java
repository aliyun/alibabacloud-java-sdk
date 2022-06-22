// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteTargetListRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ScenarioId")
    public String scenarioId;

    @NameInMap("SourceType")
    public Integer sourceType;

    public static QueryAttackSuiteTargetListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteTargetListRequest self = new QueryAttackSuiteTargetListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteTargetListRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryAttackSuiteTargetListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public QueryAttackSuiteTargetListRequest setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }
    public String getScenarioId() {
        return this.scenarioId;
    }

    public QueryAttackSuiteTargetListRequest setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public Integer getSourceType() {
        return this.sourceType;
    }

}
