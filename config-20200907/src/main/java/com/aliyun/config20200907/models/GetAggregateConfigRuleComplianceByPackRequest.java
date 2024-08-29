// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleComplianceByPackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-04b3fd170e340007****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <p>For information about how to obtain the ID of a compliance package, see <a href="https://help.aliyun.com/document_detail/262059.html">ListAggregateCompliancePacks</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cp-541e626622af0087****</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetAggregateConfigRuleComplianceByPackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleComplianceByPackRequest self = new GetAggregateConfigRuleComplianceByPackRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleComplianceByPackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateConfigRuleComplianceByPackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
