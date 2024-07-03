// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeSolutionRequest extends TeaModel {
    /**
     * <p>The database engine. Valid values:</p>
     * <ul>
     * <li><strong>MySQL</strong></li>
     * <li><strong>PolarDBMySQL</strong></li>
     * <li><strong>PostgreSQL</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp1o3z6beqpej****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The tag ID. For more information, see <a href="https://help.aliyun.com/document_detail/290038.html">Query governance</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LARGE_ROWS_EXAMINED</p>
     */
    @NameInMap("RuleIds")
    public String ruleIds;

    /**
     * <p>The SQL template ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the SQL template ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>05fecf7e7b3efd123c4d5197035f****</p>
     */
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
