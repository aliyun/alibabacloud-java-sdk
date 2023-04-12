// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>You can call the [ListAggregators](~~255797~~) operation to obtain the account group ID.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the remediation setting. If you want to specify multiple IDs, separate them with commas (,).</p>
     * <br>
     * <p>You can call the [ListAggregateRemediations](~~270036~~) operation to obtain the remediation setting ID.</p>
     */
    @NameInMap("RemediationIds")
    public String remediationIds;

    public static DeleteAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsRequest self = new DeleteAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DeleteAggregateRemediationsRequest setRemediationIds(String remediationIds) {
        this.remediationIds = remediationIds;
        return this;
    }
    public String getRemediationIds() {
        return this.remediationIds;
    }

}
