// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeSolutionRequest extends TeaModel {
    @NameInMap("Engine")
    public String engine;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RuleIds")
    public String ruleIds;

    @NameInMap("SqlId")
    public String sqlId;

    public static GetQueryOptimizeSolutionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeSolutionRequest self = new GetQueryOptimizeSolutionRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeSolutionRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public GetQueryOptimizeSolutionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetQueryOptimizeSolutionRequest setRuleIds(String ruleIds) {
        this.ruleIds = ruleIds;
        return this;
    }
    public String getRuleIds() {
        return this.ruleIds;
    }

    public GetQueryOptimizeSolutionRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

}
