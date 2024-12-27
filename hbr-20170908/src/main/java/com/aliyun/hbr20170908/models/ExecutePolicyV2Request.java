// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class ExecutePolicyV2Request extends TeaModel {
    /**
     * <p>Data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1************dtv</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>Policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>po-000************hky</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>Rule ID, limited to executing rules of <strong>RuleType</strong> <strong>BACKUP</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rule-0002*****ux8</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>Data source type, with the value range as follows:</p>
     * <ul>
     * <li><strong>UDM_ECS</strong>: Represents ECS full machine backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UDM_ECS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ExecutePolicyV2Request build(java.util.Map<String, ?> map) throws Exception {
        ExecutePolicyV2Request self = new ExecutePolicyV2Request();
        return TeaModel.build(map, self);
    }

    public ExecutePolicyV2Request setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ExecutePolicyV2Request setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ExecutePolicyV2Request setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ExecutePolicyV2Request setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
