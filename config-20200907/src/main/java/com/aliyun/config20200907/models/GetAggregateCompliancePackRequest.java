// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateCompliancePackRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the compliance package.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a compliance package, see [ListAggregateCompliancePacks](~~262059~~).</p>
     */
    @NameInMap("CompliancePackId")
    public String compliancePackId;

    public static GetAggregateCompliancePackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateCompliancePackRequest self = new GetAggregateCompliancePackRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateCompliancePackRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateCompliancePackRequest setCompliancePackId(String compliancePackId) {
        this.compliancePackId = compliancePackId;
        return this;
    }
    public String getCompliancePackId() {
        return this.compliancePackId;
    }

}
